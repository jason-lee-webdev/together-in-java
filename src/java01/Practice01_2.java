package java01;

// [문제]
// 중복을 포함한 다섯 개의 값 중에서 최댓값을 구하는 메서드를 작성해 보세요.
// (배열 자료구조를 사용하지 않습니다.)
//
// [출력 결과]
// 최댓값: ?
//
// [알고리즘]
// 1. max 변수에 숫자를 할당한다.
// 2. max 값과 다른 숫자를 비교하여 다른 숫자가 클 경우 max 변수에 해당 숫자를 할당한다.
// 3. 모든 숫자를 순회하며 2번의 과정을 실행한다.
// 4. max 값을 출력한다.
public class Practice01_2 {
	public static void main(String[] args) {
		System.out.println("최댓값: " + maxValue(20, 31, 15, 31, 7));
	}

	public static int maxValue(int num1, int num2, int num3, int num4, int num5) {
		int max = num1;

		if(max < num2) { max = num2; }
		if(max < num3) { max = num3; }
		if(max < num4) { max = num4; }
		if(max < num5) { max = num5; }

		return max;
	}
}
