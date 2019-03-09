package edu.iastate.cs228.hw01;

import java.math.BigInteger;


/**
 * @author Vismay
 * 
 * Changes applied for cs228.hw01:
 * => The original equals method implementation is changed.
 * => Removed one of the methods.
 * => Check:
 *    https://www.mathsisfun.com/algebra/Rational2-numbers-operations.html
 *    https://www.mathsisfun.com/greatest-common-factor.html  
 */

/*
 * Rational2.java: Define a Rational2 number and its associated operations such as
 * add, subtract, multiply, and divide.
 */

@SuppressWarnings("serial")
public class Rational2 extends Number implements Comparable<Rational2>
{
	// Data fields for numerator and denominator
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");

	/** Default constructor */
	public Rational2()
	{
		this(new BigInteger("0"), new BigInteger("1"));
	}

	/** Construct a Rational2 with specified numerator and denominator */
	public Rational2(BigInteger numerator, BigInteger denominator)
	{
		BigInteger gcd = gcd(numerator, denominator);
		this.numerator = (denominator.divide(denominator.abs())).multiply(numerator).divide(gcd);
		this.denominator = denominator.abs().divide(gcd);
	}

	/** Find GCD of two numbers */
	private BigInteger gcd(BigInteger n, BigInteger d)
	{
		BigInteger n1 = n.abs();
		BigInteger n2 = d.abs();

		BigInteger gcd = new BigInteger("1");
		for (int k = 1; k <= n1.longValue() && k <= n2.longValue(); k++)
		{
			if (n1.longValue() % k == 0 && n2.longValue() % k == 0)
				gcd = new BigInteger(Integer.toString(k));
		}
		return gcd;
	}

	/** Return numerator */
	public BigInteger getNumerator()
	{
		return numerator;
	}

	/** Return denominator */
	public BigInteger getDenominator()
	{
		return denominator;
	}

	/** Add a Rational2 number to this Rational2 */
	public Rational2 add(Rational2 secondRational2)
	{
		BigInteger n = numerator.multiply(secondRational2.getDenominator()).add(denominator.multiply(secondRational2.getNumerator()));
		BigInteger d = denominator.multiply(secondRational2.getDenominator());
		return new Rational2(n, d);
	}

	/** Subtract a Rational2 number from this Rational2 */
	public Rational2 subtract(Rational2 secondRational2)
	{
		BigInteger n = numerator.multiply(secondRational2.getDenominator()).subtract(denominator.multiply(secondRational2.getNumerator()));
		BigInteger d = denominator.multiply(secondRational2.getDenominator());
		return new Rational2(n, d);
	}

	/** Multiply a Rational2 number to this Rational2 */
	public Rational2 multiply(Rational2 secondRational2)
	{
		BigInteger n = numerator.multiply(secondRational2.getNumerator());
		BigInteger d = denominator.multiply(secondRational2.getDenominator());
		return new Rational2(n, d);
	}

	/** Divide a Rational2 number from this Rational2 */
	public Rational2 divide(Rational2 secondRational2)
	{
		BigInteger n = numerator.multiply(secondRational2.getDenominator());
		BigInteger d = denominator.multiply(secondRational2.numerator);
		return new Rational2(n, d);
	}

	@Override
	public String toString()
	{
		if (denominator.longValue() == 1)
			return numerator + "";
		else
			return numerator + "/" + denominator;
	}

	/** Override the equals method in the Object class */
	public boolean equals(Object parm1)
	{
		if(this == parm1) return true;
		if((parm1 == null) || (parm1.getClass()!=this.getClass())) return false;
			
		if ((this.subtract((Rational2) (parm1))).getNumerator().longValue() == 0)
			return true;
		else
			return false;
	}

	/** Override the abstract intValue method in java.lang.Number */
	public int intValue()
	{
		return (int) doubleValue();
	}

	/** Override the abstract floatValue method in java.lang.Number */
	public float floatValue()
	{
		return (float) doubleValue();
	}

	/** Override the doubleValue method in java.lang.Number */
	public double doubleValue()
	{
		return numerator.doubleValue() / denominator.doubleValue();
	}

	/** Override the abstract BigIntegerValue method in java.lang.Number */
	public long longValue()
	{
		return (long) doubleValue();
	}

	@Override
	public int compareTo(Rational2 o)
	{
		if (this.subtract(o).getNumerator().longValue() > 0)
			return 1;
		else if (this.subtract(o).getNumerator().longValue() < 0)
			return -1;
		else
			return 0;
	}
}
