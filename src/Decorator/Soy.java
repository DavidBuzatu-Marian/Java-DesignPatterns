package Decorator;

import Component.Beverage;

public class Soy extends CondimentDecorator {
    // an instance to the beverage that it wraps
    Beverage beverage;

    // set the beverage instance at initialization
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    // add to the description of the wrapper this
    // decorator description
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }


    // add to the cost of the wrapper this decorator cost
    @Override
    public double cost() {
        return .15 + this.beverage.cost();
    }
}
