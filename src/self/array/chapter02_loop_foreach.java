package self.array;

/*학생 수 10명인 어느 반에 학생 번호가 오름차순으로 정렬된 출석부가 있습니다.
수업을 시작하기 전에 출석 확인을 위해 처음부터 끝까지 학생 명단을 부릅니다.
foreach 를 사용하여 이전에 봤던 출석 명단을 부르는 코드에서 for 문을 foreach 문으로 바꿉니다.*/


public class chapter02_loop_foreach {
	public static void main(String[] args) {
		int[] students = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for(int studentNumber : students) {
			System.out.println("학생 번호 : " + studentNumber);
		}
	}
}
