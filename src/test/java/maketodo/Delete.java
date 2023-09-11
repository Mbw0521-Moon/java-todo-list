package maketodo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Delete {
	public static void delete() {
		Map<Integer, String> saveMap = new HashMap<>();

		while (true) {
			System.out.println("삭제하려는 ID 값을 입력하세요.");
			Scanner sc = new Scanner(System.in);
			int deletedata = sc.nextInt();
			
			if (saveMap.containsKey(deletedata)==true) {
				System.out.println("할일이 삭제되었습니다. ID: + " + deletedata);
			} else {
				System.out.println("해당 ID의 할 일이 없습니다.");
			}
			return;
		}
	}

}
