package com.mycompany.section2;
import com.mycompany.section2.MyGenInterface;

public class MyGenClass<K,V> implements MyGenInterface<K,V> {
	private K key;
	private V value;
	public MyGenClass(K _key, V _value)
	{
		key = _key;
		value = _value;
	}


	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}


	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return value;
	}}