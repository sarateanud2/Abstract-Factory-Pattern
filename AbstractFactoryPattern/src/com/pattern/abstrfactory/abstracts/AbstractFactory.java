package com.pattern.abstrfactory.abstracts;

import com.pattern.abstrfactory.interfaces.Colors;
import com.pattern.abstrfactory.interfaces.Shape;


//Create Abstract Class to get factories for color and shape
public abstract class AbstractFactory {
 	public abstract Colors getColor(String color);
	public abstract Shape getShape(String shape);
}
