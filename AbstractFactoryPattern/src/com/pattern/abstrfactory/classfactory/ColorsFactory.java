package com.pattern.abstrfactory.classfactory;

import com.pattern.abstrfactory.abstracts.AbstractFactory;
import com.pattern.abstrfactory.colors.BlueColor;
import com.pattern.abstrfactory.colors.GreenColor;
import com.pattern.abstrfactory.colors.RedColor;
import com.pattern.abstrfactory.interfaces.Colors;
import com.pattern.abstrfactory.interfaces.Shape;


//Create Factory classes extending AbstractFactory to generate object of 
//concrete (ColorsFactory) class based on given information.
public class ColorsFactory extends AbstractFactory {

	@Override
	public Colors getColor(String color) {
		if(color.equalsIgnoreCase(null)){
			return null;
		}
		if(color.equalsIgnoreCase("red")){
			return new RedColor();
		}
		if(color.equalsIgnoreCase("green")){
			return new GreenColor();
		}
		if(color.equalsIgnoreCase("blue")){
			return new BlueColor();
		}
		
		return null;
	}

	@Override
	public Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

}
