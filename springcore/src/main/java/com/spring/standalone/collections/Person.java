package com.spring.standalone.collections;
import java.util.*;


public class Person {
	
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + "]";
	}
	
	
}
