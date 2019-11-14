package com.collections.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapTest {

	public static void main(String[] args) {

		
		TreeSet<String> set=new TreeSet<>(new Customized());
		set.add("A");
		set.add("BBBB");
		set.add("CCC");
		set.add("DD");
		set.add("AA");
		set.add("EEEEE");
		set.add("FFFFFF");
		System.out.println(set);
		


	}

}
