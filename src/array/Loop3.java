package array;

// [문제]
// 다음으로 100개의 랜덤한 값을 저장한 배열에서 최솟값과 최댓값을 구하는 코드를 구현해봅시다.
// 100개의 데이터를 일일이 입력하는 것은 비효율적이기 때문에 난수 생성을 지원하는 Random 클래스를 사용합니다.
// 오름차순으로 정렬이 된 상태라면 처음과 마지막 값만 가져오면 쉽게 해결되지만 우리는 아직 정렬을 배우지 않았으므로 모두 순회를 해야 합니다.
// (랜덤한 수는 0부터 99사이의 정수입니다.)

// [출력 결과]
// 최솟값: 0
// 최댓값: 99

// [알고리즘]
// 1. 100개의 정수를 저장할 배열을 생성한다.
// 2. 배열의 각 요소를 순회하며 0 ~ 99 사이의 랜덤한 정수를 저장한다.
// 3. 배열의 최솟값과 최대값을 구한다.
//		1) 최솟값과 최댓값을 저장할 변수를 선언하고 인덱스가 0 인 요소를 저장한다.
//		2) 인덱스가 1 인 요소부터 인덱스가 배열의 길이 - 1 인 요소까지 순회하며 최솟값, 최댓값과 대소 비교를 하고
//		만약(if) 해당 요소가 최솟값보다 작을 경우 최솟값 변수에 해당 요소의 값을 저장하고
//		만약(else if) 해당 요소가 최댓값보다 클 경우 최댓값 변수에 해당 요소의 값을 저장한다.

// [예외가 발생할 수 있는 상황]
// 1. 배열의 모든 요소가 같은 값이라면?
// 		[1, 1, 1] 최솟값: 1 최댓값: 1
// 2. 어떤 숫자가 최솟값이면서 최댓값이 될 수 있나?
//		배열의 모든 요소가 같은 값인 경우를 제외하면 어떤 숫자가 최솟값이면서 동시에 최댓값일 수는 없다.

import java.util.Arrays;
import java.util.Random;

public class Loop3 {
	public static void main(String[] args) {
		Random random = new Random();
		// 나:
		// int[] randomNumbers = new int[100];
		final int ARRAY_LENGTH = 100;

		int[] arr = new int[ARRAY_LENGTH];
		for(int i = 0; i < ARRAY_LENGTH; i++) {
			arr[i] = random.nextInt(100);
		}

		int min = arr[0];
		int max = arr[0];

		// 나:
		// for(int i = 1; i < ARRAY_LENGTH; i++) {
		// 	if(arr[i] < min) {
		// 		min = arr[i];
		// 	} else if(arr[i] > max) {
		// 		max = arr[i];
		// 	}
		// }
		for(int k : arr) {
			if(min > k) {
				min = k;
			} else if(max < k) {
				max = k;
			}
		}

		System.out.println("최솟값: " + min);
		System.out.println("최댓값: " + max);
	}
}
