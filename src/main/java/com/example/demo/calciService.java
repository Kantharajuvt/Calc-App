package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class calciService {
	public String ADD(int a, int b) {
		return String.valueOf(a+b);
	}
	public String SUB(int a, int b) {
		return String.valueOf(a-b);
	}
	public String MUL(int a, int b) {
		return String.valueOf(a*b);
	}
	public String DIV(int a, int b) {
		return String.valueOf(a/b);
	}
	
	
	public String MOD(int n1, int n2) {
		return String.valueOf(n1 % n2);
	}
	
	
}
