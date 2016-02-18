package com.javafxandjpa.models;

import java.util.ArrayList;
import java.util.List;

public class StaticUserList {
	private static List<User> list;
	
	static {
		list = new ArrayList<User>();
	}
	
	public static List<User> load() {		
		list.add(new User(1, "John", "Mackwell"));
		list.add(new User(2, "David", "Owen"));
		list.add(new User(3, "Maxwell", "Macherat"));
		list.add(new User(4, "Lumus", "Childrenberg"));
		list.add(new User(5, "Rafe", "Aldert"));
		list.add(new User(6, "Elis", "Meioso"));
		
		return list;
	}
	
	public static void addUser(User user) {
		list.add(user);
	}
}
