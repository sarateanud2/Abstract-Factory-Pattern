package com.pattern.abstrfactory.colors;

import com.pattern.abstrfactory.interfaces.Colors;

//Implements interfaces in different Color classes 
public class RedColor implements Colors {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");

	}

}
