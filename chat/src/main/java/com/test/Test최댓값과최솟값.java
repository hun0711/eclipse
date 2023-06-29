package com.test;

public class Test최댓값과최솟값 {

	class Solution {
	    public String solution(String s) {
	        String[] numbers = s.split(" "); // 문자열을 공백으로 분리하여 배열로 저장
	        int min = Integer.MAX_VALUE; // 최소값을 저장할 변수를 최대값으로 초기화
	        int max = Integer.MIN_VALUE; // 최대값을 저장할 변수를 최소값으로 초기화
	        
	        // 배열을 순회하면서 최소값과 최대값을 찾음
	        for (String number : numbers) {
	            int n = Integer.parseInt(number); // 문자열을 정수로 변환
	            min = Math.min(min, n); // 현재 숫자와 최소값 중 작은 값을 최소값으로 업데이트
	            max = Math.max(max, n); // 현재 숫자와 최대값 중 큰 값을 최대값으로 업데이트
	        }
	        
	        return min + " " + max; // 최소값과 최대값을 문자열로 변환하여 반환
	    }
	    public void main(String args[]) {
	    	Solution solution = new Solution();
	    }
	}