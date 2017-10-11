/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingiiiassignment4;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Eamonn Hannon
 */
public class ProgrammingIIIAssignment4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       testBall();
       testRationals();
    }
    public static void testBall()
    {
         DecimalFormat allBalls = new DecimalFormat("#");
        allBalls.setRoundingMode(RoundingMode.FLOOR);
        DecimalFormat specificBalls = new DecimalFormat("#.##");
        specificBalls.setRoundingMode(RoundingMode.FLOOR);
        for(Ball ball : Ball.values())
        {
            System.out.println(ball.name() + "\t " + 
                    allBalls.format(ball.getWeight()) +" g " + allBalls.format(ball.getCircumference()) + " mm");
        }
        System.out.println("The circumforance of a golf ball = " + 
                specificBalls.format(Ball.GOLF.getCircumference()) + " mm");
        System.out.println("The volume of a baseball = "
                + specificBalls.format(Ball.BASEBALL.getVolume()) + " mm^3");
    }
    public static void testRationals()
    {
        DecimalFormat df = new DecimalFormat("#.##");
        Rational r1 = null;
        Rational r2 = null;
        Rational r3 = null;
        Rational r4 = null;
        Rational r5 = null;
        try
        {
            r1=(new Rational((int)Ball.BASEBALL.getWeight(), 
                    (int)Ball.BASKETBALL.getWeight()));
        }
        catch(RationalCreationException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            r2=(new Rational((int)Ball.FOOTBALL.getWeight(), 
                    (int)Ball.GOLF.getWeight()));
        }
        catch(RationalCreationException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            r3=(new Rational((int)Ball.POOL.getDiameter(), 
                    (int)Ball.SOFTBALL.getDiameter()));
        }
        catch(RationalCreationException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
            r4=(new Rational((int)Ball.TENNIS.getDiameter(), 
                    (int)Ball.VOLLEYBALL.getDiameter()));
        }
        catch(RationalCreationException ex)
        {
            System.out.println(ex.getMessage());
        }
        try
        {
           r5 = new Rational(15, 40);
           System.out.println(r5.toString() + "=" + r5.simplify().toString() + "=" + df.format(r5.toDecimal()));
           System.out.println("(" + r1.toString() + ") + (" + r2.toString() + ") = "
           + r1.plus(r2).simplify().toString() + " = " + df.format(r1.plus(r2).toDecimal()));
           System.out.println("(" + r2.toString() + ") - (" + r3.toString() + ") = "
           + r2.minus(r3).simplify().toString() + " = " + df.format(r2.minus(r3).toDecimal()));
           System.out.println("(" + r3.toString() + ") * (" + r4.toString() + ") = "
           + r3.multiply(r4).simplify().toString() + " = " + df.format(r3.multiply(r4).toDecimal()));
           System.out.println("(" + r4.toString() + ") / (" + r1.toString() + ") = "
           + r4.divide(r1).simplify().toString() + " = " + df.format(r4.divide(r1).toDecimal()));
        }
        catch(RationalCreationException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
