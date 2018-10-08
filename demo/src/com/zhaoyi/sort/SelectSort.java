package com.zhaoyi.sort;

import java.util.Arrays;

public class SelectSort {
	public static void selectSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int index=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[index]) {
					index=j;
				}
			}
			if(index!=i) {
				swap(a,i,index);
			}
		}
	}
	public static void swap(int[]a,int low,int high) {
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
	}
	public static void main(String[] args){
        int[]aa=new int[] {2,3,1,5,6,1,76,6,-1,-9};
        selectSort(aa);
        for(int i=0;i<aa.length;i++) {
        	System.out.println(aa[i]);
        }
        System.out.println(Arrays.toString(aa));
            
    }
}
