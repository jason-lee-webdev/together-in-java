package java01;

// [문제]
// 네 개의 값 중에서 최솟값을 구하는 메서드를 작성해 보세요.
// (배열 자료구조를 사용하지 않습니다.)
//
// [출력 결과]
// 최솟값: ?
public class Practice01_1 {
	public static void main(String[] args) {
		System.out.println("최솟값: " + minValue(5, 9, 2, 13));
	}

	public static int minValue(int num1, int num2, int num3, int num4) {
		int min = num1;

		if(min > num2) { min = num2; }
		if(min > num3) { min = num3; }
		if(min > num4) { min = num4; }

		return min;
	}
}
