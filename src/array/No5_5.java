package array;

import java.io.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int value = Integer.parseInt( br.readLine() );
	
		int binary[] = new int[16];
	
		//数字を2進数に変換する　→　配列 binaryに0か1を代入する。
		for (int i = 15 ; i >= 0 ; i-- ) {
			switch (value){
				case 0 :
					//最終的にvalueが0になったら、残りは0を代入
					binary[i] = 0;
				case 1 :
					//最終的にvalueが1になったら、1を代入
					binary[i] = 1;
				default :
					//入力された数字を2で割った、その余りをbinaryの後ろから代入していく。
					binary[i] = value % 2;
					//入力された数字を割って、数に変更を加える。
					value /= 2;
			}
		}
	
		for( int i = 0 ; i < 16 ; i++ ) {
			System.out.print( binary[i] );	
		}

	}
}
