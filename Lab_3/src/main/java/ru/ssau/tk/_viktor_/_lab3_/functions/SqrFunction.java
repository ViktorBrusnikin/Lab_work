package ru.ssau.tk._viktor_._lab3_.functions;

public class SqrFunction implements MathFunction{
    @Override
    public double apply(double x){
        return Math.pow(x,2);
    }
}
