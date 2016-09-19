package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入數字 a，程式 計算 a 平方根並輸出 (請使用 Math.sqrt(a) 工具)
 * Date: 2016/09/19
 * Author: 102002017 邱泓偉
 */
import java.util.Scanner;
public class ex04_102002017 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		float a = scn.nextFloat();
		
		System.out.println(Math.sqrt(a));

	}

}
