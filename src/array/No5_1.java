package array;

import java.io.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_1 {
	public static void main(String[] args) throws IOException {
		//『Scanner』と『BufferedReader』の入力を比べたときに、BufferedReaderの方が処理速度が早い
		
		//入力用のBufferedReaderを以下のように定義
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//配列を定義
		int array[] = new int[10];
		
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println((i+1) +"つ目の数字を入力して下さい");	
		array[i] = Integer.parseInt( br.readLine() );
		}
		
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println( array[i] * 2 );
		}	
	}
}
