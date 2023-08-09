# java-todo-list
##네
## 공통 프로그래밍 요구사항
1. 코드의 가독성과 유지보수성을 높이기 위해 클래스와 메소드를 분리하여 개발합니다.
2. 예외 처리를 통해 오류를 방지합니다.
3. 변수, 메소드, 클래스 등 작절한 네이밍을 통해 코드의 목적을 명확히 전달합니다.
4. JUnit을 이용하여 적절한 단위 테스트를 작성해보세요.

## 1주차
**기본적인 할 일 목록 애플리케이션 개발**

- 요구사항
1. 사용자로부터 할 일의 내용을 입력 받아 Map에 저장하는 기능을 만듭니다.
   - 이때 할 일의 내용은 공백을 포함한 문자열로 가정합니다.
   - 할 일의 ID는 숫자로, 1부터 시작하여 할 일이 추가될 때마다 1씩 증가합니다.
   - 사용자가 할 일을 추가하면, "할 일이 추가되었습니다. ID: X" 메시지를 출력해줍니다. (X는 할 일의 ID)
   

2. 사용자로부터 삭제할 할 일의 ID를 입력 받아 Map에서 해당 할 일을 삭제하는 기능을 만듭니다.
   - 삭제하려는 ID의 할 일이 존재한다면, "할 일이 삭제되었습니다. ID: X" 메시지를 출력합니다. (X는 삭제된 할 일의 ID)
   - 삭제하려는 ID의 할 일이 없다면, "해당 ID의 할 일이 없습니다." 메시지를 출력합니다.


3. 사용자로부터 조회할 할 일의 ID를 입력 받아 Map에서 해당 할 일의 정보를 출력하는 기능을 만듭니다.
   - 조회하려는 ID의 할 일이 존재한다면, "할 일 ID: X 내용: Y" 메시지를 출력합니다. (X는 조회된 할 일의 ID, Y는 할 일의 내용)
   - 조회하려는 ID의 할 일이 없다면, "해당 ID의 할 일이 없습니다." 메시지를 출력합니다.


4. 사용자는 프로그램을 계속해서 실행할 수 있으며, 언제든지 종료할 수 있어야 합니다.
   - 프로그램이 시작되면 "옵션을 선택하세요: 1. 추가, 2. 삭제, 3. 조회, 4. 종료" 메시지를 출력합니다.
   - 사용자가 옵션을 입력하면 해당하는 기능을 수행합니다. 이때, 옵션은 1, 2, 3, 4 중 하나입니다.
   - 사용자가 4를 입력하면 "프로그램을 종료합니다." 메시지를 출력하고 프로그램이 종료됩니다.
   - 사용자가 1, 2, 3, 4 이외의 값을 입력하면 "잘못된 입력입니다." 메시지를 출력하고, 다시 옵션 선택을 받습니다.
