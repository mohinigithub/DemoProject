package com.mohini.gitdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ram");
		list.add("Shyam");
		list.add("Seeta");
		list.add("Geeta");
		
		for(String str : list) {
			System.out.println(str);
		}

	}

}
