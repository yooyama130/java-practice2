package array;

import java.io.*;

public class No5_3 {

	public static void main(String[] args) throws IOException {
		//���͂��ꂽ���l�������Ɗ�ɕ��ނ��ĕ\������B
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int[] array = new int[10];
		
		for (int i = 0; i < array.length ; i++ ) {
			System.out.println((i+1) +"�ڂ̐�������͂��ĉ�����");	 
			array[i] = Integer.parseInt(br.readLine()) ;
		}
		
		System.out.print("����: ");
		for(int n : array) {
			if (n % 2 == 0) {
				System.out.print(n +" ");
			}
		}
		System.out.println("");
		System.out.print("�: ");
		for(int n : array) {
			if (n % 2 != 0) {
				System.out.print(n +" ");
			}
		}
	}

}
