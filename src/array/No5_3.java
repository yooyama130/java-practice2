package array;

import java.io.*;

public class No5_3 {

	public static void main(String[] args) throws IOException {
		//“ü—Í‚³‚ê‚½”’l‚ğ‹ô”‚ÆŠï”‚É•ª—Ş‚µ‚Ä•\¦‚·‚éB
		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in) );
		int[] array = new int[10];
		
		for (int i = 0; i < array.length ; i++ ) {
			System.out.println((i+1) +"‚Â–Ú‚Ì”š‚ğ“ü—Í‚µ‚Ä‰º‚³‚¢");	 
			array[i] = Integer.parseInt(br.readLine()) ;
		}
		
		System.out.print("‹ô”: ");
		for(int n : array) {
			if (n % 2 == 0) {
				System.out.print(n +" ");
			}
		}
		System.out.println("");
		System.out.print("Šï”: ");
		for(int n : array) {
			if (n % 2 != 0) {
				System.out.print(n +" ");
			}
		}
	}

}
