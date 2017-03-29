package com.pattern.abstrfactory.colors;

import com.pattern.abstrfactory.interfaces.Colors;


//Implements interfaces in different Color classes 
public class GreenColor implements Colors {

	@Override
	public void fill() {
		System.out.println("Inside Green::fill() method.");

	}

}
