package com.mycompany.section2;

import com.mycompany.section2.MyGenInterface;
import com.mycompany.section2.MyGenClass;
import com.mycompany.section2.MyRegularClass;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// initialize
		MyGenInterface<Integer,String> mgi1 = new MyGenClass<Integer,String>(1, "Andrew");
		MyGenInterface<Integer,Integer> mgi2 = new MyGenClass<Integer,Integer>(1,2017);
		
		// assignment
		Integer i1 = MyRegularClass.getSum(10,20);
		Float f1 = MyRegularClass.getSum(100f,200f);
	
		// output
		System.out.println("mgi1 key"+mgi1.getKey());
		System.out.println("mgi1 value"+mgi1.getValue());
		System.out.println("mgi2 key:" +mgi2.getKey());
		System.out.println("mgi2 value:" +mgi2.getValue());
		System.out.println("i1 "+ i1);
	    System.out.println("f1 " +f1);
		
	}

}
