package com.nit;

import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("java","oracle","bigdata");
		list.forEach(p->System.out.println(p));
	}

}
