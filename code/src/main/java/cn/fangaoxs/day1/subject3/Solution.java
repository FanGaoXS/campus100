package cn.fangaoxs.day1.subject3;

import org.omg.CORBA.BAD_TYPECODE;

import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String s = "a1234588";
        System.out.println("s.charAt(0) = " + s.charAt(0));
        System.out.println("lengthOfLongestSubstring(s) = " + lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        byte[] bytes = s.getBytes();
        if (bytes.length<2) return bytes.length;
        int maxLength = 0;
        HashSet<Byte> set = new HashSet<>();
        set.add(bytes[0]);
        int leftIndex = 0;
        int rightIndex = 1;
        while (rightIndex<bytes.length){
            if (set.contains(bytes[rightIndex])){ //如果set中包含正在比较的元素
                set.remove(bytes[leftIndex]);
                leftIndex++;
            } else {
                set.add(bytes[rightIndex]);
                maxLength = Math.max(maxLength,set.size());
                rightIndex++;
            }
        }
        return maxLength;
    }
}
