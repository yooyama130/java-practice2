package method;

import java.io.*;

//—ûK–â‘èêŠF https://kitako.tokyo/lib/JavaExercise.aspx?id=6

public class No6_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		System.out.println(bigger(a,bigger(b,c)));
	}
	
	public static int bigger(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
}
