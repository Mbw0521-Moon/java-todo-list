package maketodo;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Todo {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("옵션을 선택하세요");
			System.out.print("1.추가 ");
			System.out.print("2.삭제 ");
			System.out.print("3.조회 ");
			System.out.println("4.종료 ");

			int select = sc.nextInt();

			switch (select) {
			case 1:
				Input.input();
				break;
			case 2:
				Delete.delete();
				break;
			case 3:
				Check.check();
				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				return;
			}
		}
	}
}
