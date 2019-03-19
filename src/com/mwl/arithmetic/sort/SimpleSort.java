package com.mwl.arithmetic.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SimpleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = new int[] { 9, 8 };
		
		List<int[]> list = new ArrayList<int[]>(10000);
		
		for(int i = 0;i<10000;i++){
			int[] aa = new int[1000];
			for(int j = 0;j<1000;j++){
				aa[j] = new Random().nextInt(100000);
				
			}
			list.add(aa);
		}
		
		List<int[]> list2 = new ArrayList<int[]>(10000); 
		
		
		list2.addAll(list);
	
		long start1 = System.currentTimeMillis();
		for(int[] array :list){
		
		insertSort(array);
		}
		long end1 = System.currentTimeMillis();
		
		System.out.println(start1-end1);
		
		
		long start2 = System.currentTimeMillis();
		for(int[] array :list2){
		
			bubbleSort(array);
		}
		long end2 = System.currentTimeMillis();
		
		System.out.println(start2-end2);
		
		
		System.out.println(list);
		
		
		
		
		

	}

	public static void insertSort(int[] a) {
		if (a.length <= 1) {
			return;
		}
		for (int i = 1; i < a.length; i++) {
			int j = i - 1;
			int value = a[i];
			for (; j >= 0; j--) {
				if (a[j] > value) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = value;
		}
	}

	public static void bubbleSort(int[] a) {

		if (a.length <= 1) {
			return;
		}
		for (int i = a.length - 1; i > 0; i--) {
			int temp = 0;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

}
