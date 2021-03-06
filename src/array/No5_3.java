package array;

import java.io.*;

public class No5_3 {

	public static void main(String[] args) throws IOException {
		//入力された数値を偶数と奇数に分類して表示する。
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int[] array = new int[10];
		
		for (int i = 0; i < array.length ; i++ ) {
			System.out.println((i+1) +"つ目の数字を入力して下さい");	 
			array[i] = Integer.parseInt(br.readLine()) ;
		}
		
		System.out.print("偶数: ");
		for(int n : array) {
			if (n % 2 == 0) {
				System.out.print(n +" ");
			}
		}
		System.out.println("");
		System.out.print("奇数: ");
		for(int n : array) {
			if (n % 2 != 0) {
				System.out.print(n +" ");
			}
		}
	}

}
