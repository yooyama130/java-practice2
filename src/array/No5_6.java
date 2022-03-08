package array;

import java.io.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];
		
		//配列 kuku に値を代入する
		for( int i = 0 ; i < 9 ; i++) {
			for( int j = 0 ; j < 9 ; j++) {
				kuku[i][j] = (i+1)*(j+1) ;
			}
		}
		
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				// %xdのxは文字を揃えるためのスペースの広さを表す
				System.out.printf( " %2d", kuku[i][j] );
			}
		
			System.out.println();
		}
	}
}
