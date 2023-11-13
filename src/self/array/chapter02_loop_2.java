package self.array;

/*학생 출석부가 오름차순으로 정렬된 상태에서 내림차순으로 된 새로운 출석부를 만들어봅시다.
우리는 아직 정렬을 배우지 않았기 때문에 이미 정렬이 된 배열을 사용한다고 가정합니다.

[실행결과]
변경 전: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
변경 후: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]*/

import java.util.Arrays;

public class chapter03_loop_2 {
	public static void main(String[] args) {
		int[] students = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		int[] studentsDesc = new int[students.length];
		for(int i = 0; i < students.length; i++) {
			studentsDesc[studentsDesc.length - 1 - i] =students[i];
		}

		System.out.println("변경 전:" + Arrays.toString(students));
		System.out.println("변경 후:" + Arrays.toString(studentsDesc));
	}
}
