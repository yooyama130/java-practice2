package method;

//—ûK–â‘èêŠF https://kitako.tokyo/lib/JavaExercise.aspx?id=6

public class No6_4 {
	public static void main(String[] args) {
		makeTriangle(3);
		System.out.println("");
		makeTriangle(4);
		System.out.println("");
		makeTriangle(5);
		System.out.println("");
	}
	
	
	public static void makeTriangle(int size) {
		for(int i = 1; i <= size ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("$");				
			}
			System.out.println("");
		}
	}
}
