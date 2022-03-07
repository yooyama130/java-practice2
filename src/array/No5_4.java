package array;

import java.io.*;
import java.util.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_4 {
	public static void main(String[] args) throws IOException {
		
		//入力用のBufferedReaderを以下のように定義
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		//配列を定義
		int array[] = new int[0];
		
		for( int i = 0 ; i < 10 ; i++ ) {
			//javaは一度定義した配列には要素を追加できない
			//そのため、配列自体をコピーしてより長い配列に代入
			
			//まず、最初に定義した配列より長い配列を定義
			int new_array[] = new int[i + 1];
			//定義した配列に古い配列の内容をコピーし、追加する
			System.arraycopy(array, 0, new_array, 0, array.length);
			new_array[i] = Integer.parseInt(br.readLine());
			//一通り追加したら、最後にarray（最初に定義した配列）をnew_array（メソッド内で新しく定義した配列）で上書きする
			array = new_array;
			
			//配列内の合計を見て、100を超えていたら、処理を終了させる
			if (Arrays.stream(array).sum() > 100 ) {
				break;
			}
		}
		
		
		//配列内容をすべて出力
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println( array[i] );
		}	
	}
}
