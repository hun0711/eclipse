package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test펠린드롭 {

	/*
	 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
	 * 팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
	 * level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
	 */
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
     String word = br.readLine();
     StringBuffer sb = new StringBuffer();
     sb.append(word);

     int result;
     //System.out.println("결과 => " + sb.reverse().toString());
      if(word.equals(sb.reverse().toString())) {
    	  result = 1;
    	  System.out.println(result);
      }else {
    	  result = 0;
    	  System.out.println(result);
      }
     }
	}
