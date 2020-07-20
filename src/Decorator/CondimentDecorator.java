package Decorator;

import Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}