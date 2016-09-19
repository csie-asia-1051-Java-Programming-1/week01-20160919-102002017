package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a 與 b，程式 計算 a 的 b 次方後輸出結果 (請使用 Math.pow(a,b) 工具)
 * Date: 2016/09/19
 * Author: 102002017 邱泓偉
 */
import java.util.Scanner;
public class ex03_102002017 {

	public static void main(String[] args) {
		Scanner scnA = new Scanner(System.in);
		float a = scnA.nextFloat();
		
		Scanner scnB = new Scanner(System.in);
		float b = scnB.nextFloat();
		
		System.out.println(Math.pow(a, b));
	}

}
