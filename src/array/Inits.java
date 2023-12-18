package array;

// [문제]
// 크기가 1인 모든 자료형의 배열을 생성하고 인덱스로 배열 요소를 가져와서 초깃값을 확인해봅시다.
// char 배열의 초기값은 출력할 수 없어서 제외시켰습니다.

// [출력 결과]
// 참조 타입의 초기 값:
// byte 타입의 초기 값:
// short 타입의 초기 값:
// int 타입의 초기 값:
// float 타입의 초기 값:
// long 타입의 초기 값:
// double 타입의 초기 값:
// boolean 타입의 초기 값:

// [알고리즘]
public class Inits {
	public static void main(String[] args) {
		String[] stringArr = new String[1];
		byte[] byteArr = new byte[1];
		short[] shortArr = new short[1];
		int[] intArr = new int[1];
		float[] floatArr = new float[1];
		long[] longArr = new long[1];
		double[] doubleArr = new double[1];
		boolean[] booleanArr = new boolean[1];

		System.out.println("참조 타입의 초기 값: " + stringArr[0]);
		System.out.println("byte 타입의 초기 값: " + byteArr[0]);
		System.out.println("short 타입의 초기 값: " + shortArr[0]);
		System.out.println("int 타입의 초기 값: " + intArr[0]);
		System.out.println("float 타입의 초기 값: " + floatArr[0]);
		System.out.println("long 타입의 초기 값: " + longArr[0]);
		System.out.println("double 타입의 초기 값: " + doubleArr[0]);
		System.out.println("boolean 타입의 초기 값: " + booleanArr[0]);
	}
}
