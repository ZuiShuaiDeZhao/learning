package com.zhaoyi.sort;

import java.util.Arrays;

public class QuickSort {
	public static void quickSort(int[]a,int low,int high) {
		if(low<high) {
			int part=partition(a,low,high);
			quickSort(a,low,part-1);
			quickSort(a,part+1,high);
		}
	}
	public static int partition(int[]a ,int low,int high) {
		int temp=a[low];
		while(low<high) {
			while(low<high&&a[high]>=temp) {
				--high;
			}
			swap(a,low,high);
			while(low<high&&a[low]<=temp) {
				++low;
			}
			swap(a,low,high);
		}
		return low;
	}
	public static void swap(int[]a,int low,int high) {
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}
    public static void main(String[] args){
        int[]aa=new int[] {2,3,1,5,6,1,76,6,-1,-9};
        quickSort(aa,0,9);
        for(int i=0;i<aa.length;i++) {
        	System.out.println(aa[i]);
        }
        System.out.println(Arrays.toString(aa));
            
    }
}