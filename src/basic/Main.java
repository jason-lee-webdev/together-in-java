package basic;

// [문제]
// [3, 1, 9, 5, 10] 나열된 서로 다른 숫자가 있습니다.
// 이 중 가장 작은 값을 찾습니다.
// (배열 자료구조를 사용하지 않습니다.)
//
// [출력 결과]
// 최솟값: 1

public class Main {
	public static void main(String[] args) {
		int data1 = 3;
		int data2 = 1;
		int data3 = 9;
		int data4 = 5;
		int data5 = 10;

		int smallestNumber = data1;

		if(smallestNumber > data2) { smallestNumber = data2; }
		if(smallestNumber > data3) { smallestNumber = data3; }
		if(smallestNumber > data4) { smallestNumber = data4; }
		if(smallestNumber > data5) { smallestNumber = data5; }

		System.out.println("최솟값: " + smallestNumber);
	}
}
