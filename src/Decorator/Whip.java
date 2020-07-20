package Decorator;

import Component.Beverage;

public class Whip extends CondimentDecorator {
    // an instance to the beverage that it wraps
    Beverage beverage;

    // set the beverage instance at initialization
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    // add to the description of the wrapper this
    // decorator description
    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }


    // add to the cost of the wrapper this decorator cost
    @Override
    public double cost() {
        return .10 + this.beverage.cost();
    }
}
