package com.pattern.abstrfactory.classfactory;

import com.pattern.abstrfactory.abstracts.AbstractFactory;
import com.pattern.abstrfactory.interfaces.Colors;
import com.pattern.abstrfactory.interfaces.Shape;
import com.pattern.abstrfactory.shapes.CircleShape;
import com.pattern.abstrfactory.shapes.RectangleShape;
import com.pattern.abstrfactory.shapes.SquareShape;

//Create Factory classes extending AbstractFactory to generate object of 
//concrete (ShapeFactory) class based on given information.

public class ShapeFactory extends AbstractFactory{

	@Override
	public Colors getColor(String color) {
		
		return null;
	}
	
	

	@Override
	public Shape getShape(String shape) {
		if(shape.equalsIgnoreCase(null)){
			return null;
		}
		if(shape.equalsIgnoreCase("circle")){
			return new CircleShape();
		}
		if(shape.equalsIgnoreCase("sqaure")){
			return new SquareShape();
		}
		if(shape.equalsIgnoreCase("rectangle")){
			return new RectangleShape();
		}
		
		return null;
	}

}
