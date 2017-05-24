/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	 |_ IPhone
 *
 * 1. 개요 : 실습과제11 - 스마트폰 경쟁
 * 2. 작성일 : 2017. 5. 24.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class IPhone extends SmartPhone{

	public IPhone() {
		super();
	}

	public IPhone(String model, String company, int price) {
		super(model, company, price);
	}
	
	public void pay(){
		System.out.println("애플 페이로 결제합니다.");
	}
	
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}