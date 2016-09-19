package ex;
/*
 * Topic: 請寫一個程式讓使用者輸入「華氏」溫度，輸出「攝氏」溫度 (華氏 = 攝氏*(9/5)+32)
 * Date: 2016/09/19
 * Author: 102002017 邱泓偉
 */
import java.util.Scanner;

public class ex01_102002017 {

	public static void main(String[] args) {
		
        Scanner scn = new Scanner(System.in);
	    
	    float a = scn.nextInt();
	    
	    System.out.println((a-32)*5/9);

	}

}
