package array;

// [문제]
// N번만큼 반복하며 소수만 배열에 저장하는 프로그램을 구현해봅시다.
// 이전에 사용했던 난수 생성을 지원하는 Random 클래스를 사용합니다.
// 소수는 1 또는 자기 자신으로만 나누어지는 값이므로 생성된 난수를 2부터 자기 자신 - 1까지 나누어 한 번이라도 0으로 떨어진다면 소수가 아닙니다.
// (랜덤한 숫자는 0이상 N미만의 정수이다.)

// [실행 결과]
// 난수를 사용하기 때문에 실행결과는 매번 달라질 수 있으므로 '2, 3, 5, 7' 과 같은 값만 포함되어야 합니다.

// [알고리즘]
// - int[] getPrimeNumbers(int n)
// 	1. 길이가 n인 int 배열(array)을 생성한다.
//	2. 소수를 저장할 위치를 나타내는 인덱스 변수(index)를 선언하고 0으로 초기화한다.
// 	3. 아래의 로직을 n회 반복한다(i).
//		1) 0이상 n미만의 랜덤한 숫자(randomValue)를 얻는다.
//		2) 해당 숫자가 소수인지 판별한다.
//			1> randomValue가 2인 경우 arr에 저장하고, index를 1만큼 증가하고, 2)의 로직을 종료한다.
//			2> randomValue를 2부터 (randomValue - 1)까지의 숫자로 나눈다(j).
//				1] 나누었을 때 나머지가 0인 경우가 존재하면 2>의 로직을 종료한다.
//				2] 나누는 숫자가 (randomValue - 1)가 될 경우 2부터 (randomValue - 1)까지의 숫자로 나누었을 때 나머지가 0 인 경우가 존재하지 않음을 뜻하므로 randomValue는 소수이다.
//				따라서 randomValue를 arr[index]에 저장하고, index를 1만큼 증가시킨다.
//	4. array에 담긴 소수의 개수와 동일한 길이의 int 배열(result)을 생성한다.
//	5. array에 담긴 소수를 result에 저장한다.
//	6. result를 리턴한다.

// [예외가 발생할 수 있는 상황]
// 1. randomValue가 0인 경우
// 	randomValue가 0인 경우는 2>의 로직에서 소수가 아님으로 처리된다.
// 2. randomValue가 1인 경우
//	randomValue가 1인 경우는 2>의 로직에서 소수가 아님으로 처리된다.
// 3. 배열의 길이가 양의 정수가 아닌 경우
// 	예외 처리를 한다. "배열의 길이로 음의 정수를 입력할 수 없습니다. 0 또는 양의 정수를 입력하세요."
// 4. 2는 소수인가?
//	2는 소수이다.

// [책의 답안 코드]
// 1. 크기가 n인 int 배열(arr)을 생성한다.
// 2. 배열을 순회한다(i).
//	1) 0이상 n미만의 랜덤한 숫자(randomValue)를 얻는다.
//	2) randomValue가 소수인지 여부를 저장할 변수(isPrimeNumber)를 선언하고, true로 초기화한다.
//	3) randomValue가 1인 경우 아래의 코드를 뛰어넘는다(continue).
//	4) randomValue가 2인 경우 2를 arr[i]에 저장하고, 아래의 코드를 뛰어넘는다(continue).
//	5) int 변수(j)를 선언하고 2부터 randomValue -1 까지 1씩 증가시키면서 순회한다.
//		1> randomValue를 j로 나누었을 때 나누어떨어지는 경우 isPrimeNumber에 false를 저장하고, 순회를 종료한다(break).
//	6) isPrimeNumber가 true인 경우 randomValue를 arr[j]에 저장한다.
// 3. arr을 순회한다(foreach).
//	1) 배열의 요소가 0보다 큰 경우 요소를 출력한다.

import java.util.Arrays;
import java.util.Random;

public class Loop4 {
	public static void main(String[] args) {
		try {
			int[] arr = getPrimeNumbers(10);
			System.out.println(Arrays.toString(arr));
		} catch (NegativeArraySizeException e) {
			System.out.println("배열의 길이로 음의 정수를 입력할 수 없습니다. 0 또는 양의 정수를 입력하세요.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int[] getPrimeNumbers(int n) throws Exception {
		final int ARRAY_LENGHT = n;

		int[] arr = new int[ARRAY_LENGHT];
		Random random = new Random();
		int index = 0;

		for(int i = 0; i < ARRAY_LENGHT; i++) {
			int randomValue = random.nextInt(ARRAY_LENGHT);

			if(randomValue == 2) {
				arr[index++] = randomValue;
				continue;
			}

			for(int j = 2; j < randomValue; j++) { //17
				if(randomValue % j == 0) { //
					break;
				}
				if(j == randomValue - 1) {
					arr[index++] = randomValue;
				}
			}
		}

		int[] result = new int[index];
		for(int i = 0; i < index; i++) {
			result[i] = arr[i];
		}

		return result;
	}

}