package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test베라의패션 {
/*
 * 문제
 * 베라는 상의 N 벌과 하의 N 벌이 있다. i 번째 상의와 i 번째 하의는 모두 색상 i를 가진다. 
 * N 개의 색상은 모두 서로 다르다.
 * 상의와 하의가 서로 다른 색상인 조합은 총 몇 가지일까?
 * 입력
 * 입력은 아래와 같이 주어진다.
 * N
 * 출력
 * 상의와 하의가 서로 다른 색상인 조합의 가짓수를 출력한다.
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int 상의 = Integer.parseInt(br.readLine());
     int 하의 = Integer.parseInt(br.readLine());
	 int 색상가짓수[] = null;
	 
     for(int i = 0; i < 하의; i++) {
    	 색상가짓수[i] = i+1;	 
     }
     
     
	}

}
