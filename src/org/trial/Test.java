package org.trial;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	private void map() {

		Map<String, Integer> pro = new TreeMap<>();
		pro.put("Vk", 100);
		pro.put("Vith", 200);
		pro.put("vivek", 300);

		Collection<Integer> values = pro.values();
		System.out.println(values);

	}
	
	private void index() {
		List<Integer> var = new LinkedList<>();
				
				var.add(10);
				var.add(20);
				var.add(30);
				var.add(90);
				System.out.println(var);
			}

	public static void main(String[] args) {
		Test fn = new Test();
		fn.map();
		fn.index();
	}
}
