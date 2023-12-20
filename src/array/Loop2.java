package array;

// [문제]
// 학생 출석부가 오름차순으로 정렬된 상태에서 내림차순으로 된 새 출석부를 만들어봅시다.
// 우리는 아직 정렬을 배우지 않았기 때문에 이미 정렬이 된 배열을 사용한다고 가정합니다.

// [출력 결과]
// 변경 전: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
// 변경 후: [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

// [알고리즘]
// 1. 내림차순으로 정렬된 출석부를 저장할 배열을 생성한다.
// 2. 기존 배열의 인덱스가 i인 요소를 새로운 배열의 인덱스가 (새로운 배열의 크기 - 1 - i)인 요소에 저장한다.
// 3. 기존 배열의 모든 요소를 순회하며 2의 과정을 반복한다.

import java.util.Arrays;

public class Loop2 {
	public static void main(String[] args) {
		int[] students = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("변경 전: "+ Arrays.toString(students));

		// 나 : int[] students2 = new int[10];
		int[] students2 = new int[students.length];

		// 나 :
		// for(int i = 0; i < students.length; i++) {
		// 	students2[students2.length - 1 - i] = students[i];
		// }
		for(int i = 0; i < students.length; i++) {
			students2[students.length - 1 - i] = students[i];
		}

		System.out.println("변경 후: "+ Arrays.toString(students2));
	}
}
