package array;

import java.io.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int[] array = new int[10];
		
		//���͂�10��J��Ԃ�
		for(int i = 0 ;  i < 10 ; i++ ) {
			array[i] = Integer.parseInt(br.readLine());
		}
		
		for( int i = 0 ; i < 10 ; i++ ){
		    for( int j = i + 1 ; j < 10 ; j++ ){
		    	//array[j]�Ɣ�r���Aarray[i]�̂ق����傫����΁A���Ԃ����ւ���
		        if( array[i] > array[j] ){
		        	//��U�Aarray[i]�̗v�f��ʂ̕ϐ��̒��ɔ����Ă���
		            int n = array[i];
		            //array[j]��array[i]�ɏ㏑������iarray[i]�@���@array[j] �ɂ���j
		            array[i] = array[j];
		            //�ϐ�n�Ƃ��āA�����Ă�����array[i]��array[j]�ɏ㏑������iarray[j]�@���@array[i] �ɂ���j
		            array[j] = n;
		        }
		    }
		}
		
		for (int i = 0 ; i < 10 ; i++) {
			System.out.println(array[i]);
		}

	}
}
