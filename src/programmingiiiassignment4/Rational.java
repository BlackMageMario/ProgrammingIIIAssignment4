/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingiiiassignment4;

import java.math.BigInteger;

/**
 *
 * @author Eamonn Hannon
 */
public class Rational {
    private int pNumber;
    private int qNumber;
    public Rational(int p, int q) throws RationalCreationException
    {
        if(q == 0)
        {
            throw new RationalCreationException("Erorr in creation: q cannot be 0");
        }
        //int gcd = BigInteger.valueOf(p).gcd(BigInteger.valueOf(q)).intValue();
        if(p % q == 0)
        {
            throw new RationalCreationException("Error in creation: "
                    + "p and q have a common divisor.");
        }
        pNumber = p;
        qNumber = q;
    }
    public Rational multiply(Rational other) throws RationalCreationException
    {
        return new Rational(pNumber * other.pNumber, qNumber * other.qNumber);
    }
    public Rational divide(Rational other) throws RationalCreationException
    {
        return new Rational(pNumber * other.qNumber, qNumber * other.pNumber);
    }
    public Rational plus(Rational other) throws RationalCreationException
    {
        //have to get the base number to be the same
        return new Rational (((pNumber * other.qNumber) + (qNumber * other.pNumber)),
                qNumber * other.qNumber);
    }
    public Rational minus(Rational other) throws RationalCreationException
    {
        return new Rational ((pNumber * other.qNumber - qNumber * other.pNumber),
                qNumber * other.qNumber);
    }
    public Rational simplify() throws RationalCreationException
    {
        int gcd = BigInteger.valueOf(pNumber).gcd(BigInteger.valueOf(qNumber)).intValue();
        if(gcd == 1)
        {
            return this; // already in simpliest form
        }
        else
        {
            return new Rational(pNumber / gcd, qNumber / gcd);
        }
    }
    @Override
    public String toString()
    {
        return pNumber + "/" + qNumber;
    }
    public double toDecimal()
    {
        double d1 = pNumber;
        double d2 = qNumber;
        return d1 / d2;
    }
}
