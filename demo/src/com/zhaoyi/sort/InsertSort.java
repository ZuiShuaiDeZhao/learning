package com.zhaoyi.sort;

import java.util.Arrays;

public class InsertSort {
	public static void insertSort(int[]a) {
		int temp;
		for(int i=1;i<a.length;i++) {
			temp=a[i];
			int j=i-1;
			while(j>=0&&temp<a[j]) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void main(String[] args){
        int[]aa=new int[] {2,3,1,5,6,1,76,6,-1,-9};
        insertSort(aa);
        for(int i=0;i<aa.length;i++) {
        	System.out.println(aa[i]);
        }
        System.out.println(Arrays.toString(aa));
            
    }
}
