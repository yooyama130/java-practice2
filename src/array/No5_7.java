package array;

import java.io.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int kuku[][] = new int[9][9];
		
		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++) {
			for( int j = 0 ; j < 9 ; j++) {
				kuku[i][j] = (i+1)*(j+1) ;
			}
		}
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		//入力された数値2つが、1~9のとき
		if ((1 <= num1 && num1 <= 9) && ((1 <= num2 && num2 <= 9)) ) {
			System.out.println(kuku[num1 -1][num2 -1]);			
		}

	}
}
