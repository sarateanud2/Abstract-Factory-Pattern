package com.pattern.abstrfactory.classfactory;

import com.pattern.abstrfactory.abstracts.AbstractFactory;


//Create a Factory generator/producer class to get factories 
//by passing an information such as Shape or Color
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice){
		if(choice.equalsIgnoreCase("Shape")){
			return new ShapeFactory();
		}else if(choice.equalsIgnoreCase("Colors")){
			return new ColorsFactory();
		}
		
		return null;
	}

}
