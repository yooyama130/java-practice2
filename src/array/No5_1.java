package array;

import java.io.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_1 {
	public static void main(String[] args) throws IOException {
		//�wScanner�x�ƁwBufferedReader�x�̓��͂��ׂ��Ƃ��ɁABufferedReader�̕����������x������
		
		//���͗p��BufferedReader���ȉ��̂悤�ɒ�`
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		//�z����`
		int array[] = new int[10];
		
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println((i+1) +"�ڂ̐�������͂��ĉ�����");	
		array[i] = Integer.parseInt( br.readLine() );
		}
		
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println( array[i] * 2 );
		}	
	}
}
