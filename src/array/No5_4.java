package array;

import java.io.*;
import java.util.*;

//���K���ꏊ�F https://kitako.tokyo/lib/JavaExercise.aspx?id=5

public class No5_4 {
	public static void main(String[] args) throws IOException {
		
		//���͗p��BufferedReader���ȉ��̂悤�ɒ�`
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		//�z����`
		int array[] = new int[0];
		
		for( int i = 0 ; i < 10 ; i++ ) {
			//java�͈�x��`�����z��ɂ͗v�f��ǉ��ł��Ȃ�
			//���̂��߁A�z�񎩑̂��R�s�[���Ă�蒷���z��ɑ��
			
			//�܂��A�ŏ��ɒ�`�����z���蒷���z����`
			int new_array[] = new int[i + 1];
			//��`�����z��ɌÂ��z��̓��e���R�s�[���A�ǉ�����
			System.arraycopy(array, 0, new_array, 0, array.length);
			new_array[i] = Integer.parseInt(br.readLine());
			//��ʂ�ǉ�������A�Ō��array�i�ŏ��ɒ�`�����z��j��new_array�i���\�b�h���ŐV������`�����z��j�ŏ㏑������
			array = new_array;
			
			//�z����̍��v�����āA100�𒴂��Ă�����A�������I��������
			if (Arrays.stream(array).sum() > 100 ) {
				break;
			}
		}
		
		
		//�z����e�����ׂďo��
		for( int i = 0 ; i < array.length ; i++ ) {
		System.out.println( array[i] );
		}	
	}
}
