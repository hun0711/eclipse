package com.test;

import java.util.Arrays;
public class Test완주하지못한선수 {

	    public String solution(String[] participant, String[] completion) {
	        Arrays.sort(participant); // 참여자 배열 정렬
	        Arrays.sort(completion); // 완주자 배열 정렬

	        int i;
	        for (i = 0; i < completion.length; i++) {
	            if (!participant[i].equals(completion[i])) {
	                return participant[i]; // 완주하지 못한 선수의 이름 반환
	            }
	        }

	        return participant[i]; // 마지막 선수는 완주하지 못한 선수입니다.
	    }
	}

