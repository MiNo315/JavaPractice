/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 * 	 |_ OracleDB
 *
 * 1. 개요 : 실습과제13 - DB가 바뀌었어요
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 * 
 * @author		: HD152637
 * @version		: 1.0
**/

public class OracleDB implements IDBManager{

	@Override
	public void insert() {
		System.out.println("Oracle DB 저장");
	}

	@Override
	public void search() {
		System.out.println("Oracle DB 조회");
	}

	@Override
	public void update() {
		System.out.println("Oracle DB 변경");
	}

	@Override
	public void delete() {
		System.out.println("Oracle DB 삭제");
	}

}
