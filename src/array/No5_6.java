package array;

import java.io.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];
		
		//�z�� kuku �ɒl��������
		for( int i = 0 ; i < 9 ; i++) {
			for( int j = 0 ; j < 9 ; j++) {
				kuku[i][j] = (i+1)*(j+1) ;
			}
		}
		
		for( int i = 0 ; i < 9 ; i++ ){
			for( int j = 0 ; j < 9 ; j++ ) {
				// %xd��x�͕����𑵂��邽�߂̃X�y�[�X�̍L����\��
				System.out.printf( " %2d", kuku[i][j] );
			}
		
			System.out.println();
		}
	}
}
