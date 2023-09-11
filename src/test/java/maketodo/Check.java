package maketodo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Check {
	public static void check() {
		Map<Integer, String> saveMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할 일의 ID 값을 입력하세요 ");
			int check_id = sc.nextInt();
			
			if(saveMap.containsKey(check_id)) {
			String saveMap_value = saveMap.get(check_id);
			
			System.out.println("할 일 ID: " + check_id + "내용" + saveMap_value);
			} else {
				System.out.println("해당 ID의 할 일이 없습니다.");
			}
			return;
		}
	}
}
