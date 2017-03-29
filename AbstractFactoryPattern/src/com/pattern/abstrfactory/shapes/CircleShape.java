package com.pattern.abstrfactory.shapes;

import com.pattern.abstrfactory.interfaces.Shape;


//Implements interfaces in different Shape classes
public class CircleShape implements Shape {

	@Override
	public void drow() {
		System.out.println("Inside Circle::draw() method.");

	}

}
