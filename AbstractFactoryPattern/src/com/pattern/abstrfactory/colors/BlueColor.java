package com.pattern.abstrfactory.colors;

import com.pattern.abstrfactory.interfaces.Colors;

//Implements interfaces in different Color classes 
public class BlueColor implements Colors {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");

	}

}
