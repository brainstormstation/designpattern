package com.designpattern.strategy;

import java.util.Comparator;

public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int len = arr.length;

        for (int i=0; i<len; i++) {
            int minPos = i;
            for (int j = i+1; j<len; j++) {
                minPos = comparator.compare(arr[j], arr[minPos]) == -1? j: minPos;
            }
            swap(arr, i, minPos);
        }
    }

    private void swap(T[] arr, int i, int j) {
        T tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
