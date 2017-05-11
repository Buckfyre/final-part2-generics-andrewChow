package com.mycompany.section2;

import com.mycompany.section2.MyGenInterface;
import com.mycompany.section2.MyGenClass;
import com.mycompany.section2.MyRegularClass;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// initialize
		MyGenInterface<Integer,String> mgi1 = new MyGenClass<Integer,String>(1, "yourName");
		MyGenInterface<Integer,Integer> mgi2 = new MyGenClass<Integer,Integer>(1,2017);
		
		// assignment
		Integer i1 = MyRegularClass.getSum(10,20);
		Float f1 = MyRegularClass.getSum(100f,200f);
	
		// output
		System.out.println(mgi1);
		System.out.println(mgi2);
		System.out.println(i1);
	    System.out.println(f1);
		
	}

}
