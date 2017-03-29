package com.pattern.abstrfactory.shapes;

import com.pattern.abstrfactory.interfaces.Shape;


//Implements interfaces in different Shape classes
public class RectangleShape implements Shape {

	@Override
	public void drow() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
