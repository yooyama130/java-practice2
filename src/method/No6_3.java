package method;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=6

public class No6_3 {
	public static void main(String[] args) {
		int a = 9;
		int b = 10;
		
		System.out.println(a+"と"+b+"の平均は"+average(a,b));
	}
	
	public static int average(int a, int b) {
		return (a + b) / 2;
	}
}
