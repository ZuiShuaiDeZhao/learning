package com.zhaoyi.richang;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Point[]point=new Point[n];
		for(int i=0;i<n;i++) {
			point[i]=new Point(sc.nextInt(),sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(point,(a,b)->(a.geta1()-b.geta1()));
		int count=0;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				if((point[i].geta1()>point[j].geta1())&&(point[i].geta2()>point[j].geta2())&&(point[i].geta3()>point[j].geta3())) {
					count++;
				}
			}
		}
		System.out.println(count);
		for(int i=0;i<n;i++) {
			System.out.print(point[i].geta1());
			System.out.print(point[i].geta2());
			System.out.print(point[i].geta3());
			System.out.println();
		}
	}
	
}
class Point{
	int a1;
	int a2;
	int a3;
	public Point(int a1,int a2,int a3) {
		this.a1=a1;
		this.a2=a2;
		this.a3=a3;
	}
	public int geta1() { 
		return a1;
	}
	public int geta2() {
		return a2;
	}
	public int geta3() {
		return a3;
	}
}
