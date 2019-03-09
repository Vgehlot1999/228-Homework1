package edu.iastate.cs228.hw01;

/**
 * 
 * @author Vismay
 *
 */

public class Triangle extends GeometricObject
{
	double side1;
	double side2;
	double side3;
	
	/**
	 * no-arg constructor sets a default of each side as having length 1.0
	 */
	public Triangle()
	{
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	/**
	 * constructor sets desired values of each side using specified values
	 * @param A specified length of side 1
	 * @param B specified length of side 2
	 * @param C specified length of side 3
	 */
	public Triangle(double A, double B, double C)
	{
		side1 = A;
		side2 = B;
		side3 = C;
	}
	
	/**
	 * accessor method for side 1
	 * @return side 1
	 */
	public double getSide1()
	{
		return side1;
	}
	
	/**
	 * accessor method for side 2
	 * @return side 2
	 */
	public double getSide2()
	{
		return side2;
	}
	
	/**
	 * accessor method for side 3
	 * @return side 3
	 */
	public double getSide3()
	{
		return side3;
	}

	/**
	 * public method that calculates and returns the area of 
	 * the triangle using Heron's formula
	 * @return area of the triangle
	 */
	public double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		double x = (s) * (s - side1) * (s - side2) * (s - side3);
		return Math.sqrt(x);
	}
	
	/**
	 * public method that calculates and returns the perimeter
	 * of the triangle
	 * @return
	 */
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	

	@Override
	public String toString()
	{
		return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	}
}
