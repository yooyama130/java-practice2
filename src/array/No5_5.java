package array;

import java.io.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_5 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
		int value = Integer.parseInt( br.readLine() );
	
		int binary[] = new int[16];
	
		//������2�i���ɕϊ�����@���@�z�� binary��0��1��������B
		for (int i = 15 ; i >= 0 ; i-- ) {
			switch (value){
				case 0 :
					//�ŏI�I��value��0�ɂȂ�����A�c���0����
					binary[i] = 0;
				case 1 :
					//�ŏI�I��value��1�ɂȂ�����A1����
					binary[i] = 1;
				default :
					//���͂��ꂽ������2�Ŋ������A���̗]���binary�̌�납�������Ă����B
					binary[i] = value % 2;
					//���͂��ꂽ�����������āA���ɕύX��������B
					value /= 2;
			}
		}
	
		for( int i = 0 ; i < 16 ; i++ ) {
			System.out.print( binary[i] );	
		}

	}
}
