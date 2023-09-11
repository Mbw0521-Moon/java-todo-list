package maketodo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Input {
	public static void input() {
		Map<Integer, String> Input_save = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("할 일의 내용을 작성하세요");
		String inputdate = sc.next();

		int i = 0;
		
		while (true) {
			i ++;
			Input_save.put(i, inputdate);
			System.out.println("할 일이 추가 되었습니다. ID: " + i);
			break;
		}
		return;
	}
}
