package ru.ssau.tk._viktor_._lab3_.functions;

public class CompositeFunction implements MathFunction{
    private final MathFunction firstFunction;
    private final MathFunction secondFunction;

    public CompositeFunction(MathFunction firstFunc, MathFunction secondFunc){
        this.firstFunction = firstFunc;
        this.secondFunction = secondFunc;
    }
    @Override
    public double apply(double x){
        return secondFunction.apply(firstFunction.apply(x));
    }
}
