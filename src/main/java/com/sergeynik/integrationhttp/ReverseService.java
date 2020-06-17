package com.sergeynik.integrationhttp;

public class ReverseService {

	public void reverse(String message){
		System.out.println(new StringBuilder(message).reverse().toString());
	}
}
