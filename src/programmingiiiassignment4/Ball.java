/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingiiiassignment4;

/**
 *
 * @author Eamonn Hannon
 */
public enum Ball {
    BASEBALL(149, 73),
    BASKETBALL(624, 239),
    FOOTBALL(450, 216),
    GOLF(46, 43),
    POOL(156, 60),
    SOFTBALL(180, 97),
    TENNIS(59, 64),
    VOLLEYBALL(260, 218);
    
    private float weight;
    private float diameter;
    Ball(float weight, float diameter)
    {
        this.weight = weight;
        this.diameter = diameter;
    }
    public float getWeight()
    {
        return weight;
    }
    public float getDiameter()
    {
        return diameter;
    }    
    public double getCircumference()
    {
        return  Math.PI * diameter;
    }
    public double getVolume()
    {
        float radius = diameter / 2;
        return (4/3) * Math.PI * radius * radius * radius;
    }
}
