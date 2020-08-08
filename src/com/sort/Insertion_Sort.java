package com.sort;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @author niu
 * @version 1.0
 * @className Insertion_Sort
 * @description 插入排序
 * @date 2020/8/8 12:46 下午
 */
public class Insertion_Sort {

    public static void sort(int[] arrays) {
        for (int j = 1; j < arrays.length; j++) {
            int key = arrays[j];
            int i = j - 1;
            while (i >= 0 && key < arrays[i]) {
                arrays[i + 1] = arrays[i];
                i--;
            }
            arrays[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arrays = new int[]{1, 3, 66, 9, 88, 22};
        sort(arrays);
        for (int i : arrays) {
            System.out.println(i);
        }
    }
}
