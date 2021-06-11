package com.shuo.leetcode.array;

public class ArrayLeetCode {


    /**
     * 【题号】 035
     * 【题目】给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 【关键点】 已排序
     *
     * @param nums   排序数组
     * @param target 目标值
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            // 是否为目标值
            boolean isTarget = nums[i] == target;
            // 返回索引值
            if (isTarget) {
                return i;
            }
        }
        // [a,b,c,d,f]  x
        // 中间
        int middleIndex = nums.length / 2;

        int resultIndex = -1;

        // 起始区间
        int startIndex = 0;
        int endIndex = nums.length;


        while () {
            // 获取中间索引
            middleIndex = (endIndex - startIndex) / 2;
            // 中间的元素
            int middleEle = nums[middleIndex];
            // 目标值小于中间值
            boolean lessThan = middleEle > target;
            //
            boolean moreThan = middleEle < target;
            boolean equals = middleEle == target;

            endIndex = lessThan ? middleIndex : endIndex;
            startIndex = moreThan ? middleEle : startIndex;


        }

    }
}
