package cn.kgc.tangcco.dao.impl;

import cn.kgc.tangcco.dao.TestDao;

public class TestDaoImpl implements TestDao{

	@Override
	public void testMethod() {
		System.out.println("张丽霞呵呵呵");
		System.out.println("嘿嘿张丽霞");
		System.out.println("niezhong say hello");
		
		String str ="hello";
		System.out.println("str="+str);
		

		int a = 5;
		int b = 6;
		int c = 8;
		
		
		str = str.toLowerCase();
		System.out.println("转成小写后，str="+str);
	}

}
