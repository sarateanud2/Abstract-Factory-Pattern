package com.pattern.abstrfactory.main;

import com.pattern.abstrfactory.abstracts.AbstractFactory;
import com.pattern.abstrfactory.classfactory.FactoryProducer;
import com.pattern.abstrfactory.interfaces.Colors;
import com.pattern.abstrfactory.interfaces.Shape;

public class Main {

	public static void main(String[] args) {
		
		AbstractFactory shapeFactory;
/*===================================================================================*/	
		
		//Get Shape factory
		shapeFactory= FactoryProducer.getFactory("Shape");
		
		Shape shape;
		
		//get an object of Shape Circle
		shape = shapeFactory.getShape("Circle");
		shape.drow();
		
		//get an object of Shape Square
		shape = shapeFactory.getShape("sqaure");
		shape.drow();
		
		//get an object of Shape Rectangle
		shape = shapeFactory.getShape("rectangle");
		shape.drow();
		
/*===================================================================================*/
		
		//Get Colors factory
		shapeFactory = FactoryProducer.getFactory("Colors");
		
		//Colors reference 
		Colors color;
		
		//get an object of Color Red
		color = shapeFactory.getColor("Red");
		color.fill();
		
		//get an object of Color Green
		color = shapeFactory.getColor("Green");
		color.fill();
		
		//get an object of Color Blue
		color = shapeFactory.getColor("Blue");
		color.fill();
		
		
	}

}
