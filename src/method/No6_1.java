package method;

//練習問題場所： https://kitako.tokyo/lib/JavaExercise.aspx?id=6

public class No6_1 {
	public static void main(String[] args) {
		int number = squared(3);
		System.out.println(number);
	}
	
	//引数を2乗する
	public static int squared(int num) {
		return num*num;
	}
}
