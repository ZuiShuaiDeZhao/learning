package com.zhaoyi.sort;

import java.util.Arrays;

public class ShellSort {
	public static void shellSort(int[] a) {
		int temp;
		for(int d=a.length;d>0;d/=2) {
			for(int i=d;i<a.length;i++) {
				temp=a[i];
				int j=i-d;
				while(j>=0&&temp<a[j]) {
					a[j+d]=a[j];
					j-=d;
				}
				a[j+d]=temp;
			}
		}
	}
	public static void main(String[] args){
        int[]aa=new int[] {2,3,1,5,6,1,76,6,-1,-9};
        shellSort(aa);
        for(int i=0;i<aa.length;i++) {
        	System.out.println(aa[i]);
        }
        System.out.println(Arrays.toString(aa));
        System.out.println(0.06+0.05);
            
    }
}
