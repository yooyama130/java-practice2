package array;

import java.io.*;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int[] array = new int[10];
		
		//入力を10回繰り返す
		for(int i = 0 ;  i < 10 ; i++ ) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for( int i = 0 ; i < 10 ; i++ ){
		    for( int j = i + 1 ; j < 10 ; j++ ){
		    	//array[j]と比較し、array[i]のほうが大きければ、順番を入れ替える
		        if( array[i] > array[j] ){
		        	//一旦、array[i]の要素を別の変数の中に避難させておく
		            int n = array[i];
		            //array[j]をarray[i]に上書きする（array[i]　→　array[j] にする）
		            array[i] = array[j];
		            //変数nとして、避難させておいたarray[i]をarray[j]に上書きする（array[j]　→　array[i] にする）
		            array[j] = n;
		        }
		    }
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(array[i]);
		}

	}
}
