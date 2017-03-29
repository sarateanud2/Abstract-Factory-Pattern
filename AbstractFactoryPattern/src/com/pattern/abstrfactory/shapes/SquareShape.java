package com.pattern.abstrfactory.shapes;

import com.pattern.abstrfactory.interfaces.Shape;

//Implements interfaces in different Shape classes
public class SquareShape implements Shape {

	@Override
	public void drow() {
		System.out.println("Inside Square::draw() method.");

	}

}
