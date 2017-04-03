/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	 |_ Question
 *
 * 1. 개요 : 실습 과제5 - My Favorite
 * 2. 작성일 : 2017. 4. 3.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String [] questions = {"1. 가장 좋아하는 가수는? ","2. 가장 좋아하는 배우는? ","3. 가장 좋아하는 과목은? "};
		String [] answers = {"다현","송혜교","프로그래밍"};
		
		for (int i=0;i<3;i++){
			System.out.println(questions[i]);
			String answer = scanner.next();
			System.out.println(answer.equals(answers[i]) ? "정답입니다!":"틀렸습니다!" );
		}
		
		System.out.println("<< 결과 출력 >>");
		for (int i=0;i<3;i++){
			StringBuilder s = new StringBuilder();
			System.out.println(s.append(questions[i]).append(answers[i]).append("입니다."));
		}
	}

}
