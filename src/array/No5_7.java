package array;

import java.io.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_7 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		int kuku[][] = new int[9][9];
		
		//�z�� kuku �ɒl��������
		for( int i = 0 ; i < 9 ; i++) {
			for( int j = 0 ; j < 9 ; j++) {
				kuku[i][j] = (i+1)*(j+1) ;
			}
		}
		
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		//���͂��ꂽ���l2���A1~9�̂Ƃ�
		if ((1 <= num1 && num1 <= 9) && ((1 <= num2 && num2 <= 9)) ) {
			System.out.println(kuku[num1 -1][num2 -1]);			
		}

	}
}
