package com.cn.biaozhun;

import java.util.Arrays;
import java.util.Scanner;

public class TestLiucheng {

	public static void main(String[] args) {

		// int a=10;

		 Scanner tt=new Scanner(System.in);
		// System.out.println("请猜想：");
		// int ee=tt.nextInt();
		// //if else
		// if (ee==10){
		// System.out.println("猜对了");
		// }else {
		// System.out.println("猜错了");
		// }
		// else if
		// if (ee<10&&ee>1){
		// System.out.println("猜小了");
		//
		// }else if(ee>10){
		// System.out.println("猜大了");
		//
		// }else if(ee==10){
		// System.out.println("恭喜你，猜对了");
		// }else if(ee<0) {
		// System.out.println("请输入正整数！");
		// }
		// for

		// for(int i=1;i<10;i++){
		// int a=+i;
		// System.out.println(a);
		// }
		// break
		// for(int i=1;i<10;i++){
		// int a=+i;
		// if(i==5){
		// break;
		// }
		// System.out.println(a);
		// }

		// continue
		// for(int i=1;i<10;i++){
		// int a=+i;
		// if(i==5){
		// continue;
		// }
		// System.out.println(a);
		// }
		//
		// 两层for循环
		// int score[][]={{23,41,1,78,14},{345,234,321,678,11,3}};
		//
		// for(int i=0;i<score.length;i++){
		// Arrays.sort(score[i]);
		// for(int j=0;j<score[i].length;j++){
		// System.out.print(score[i][j]+"\t");
		// }
		// System.out.println("");
		// }
		// foreach循环
		int score[] = { 23, 41, 1, 78, 14 };
		for (int t1:score) {
			System.out.print(t1 + "\t");
		}
		System.out.println("");
	}
}
