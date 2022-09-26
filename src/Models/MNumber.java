
package Models;

public class MNumber implements IMNumber{

    public MNumber() {
        this.a = 2;
        this.b = 2;
    }
    private int a ;
    private int b ;

    @Override
    public int Add() {
       return a+b;
    }

    @Override
    public int Minus() {
        return a-b;        
    }

    @Override
    public int Multiply() {
        return a*b;
    }

    @Override
    public double Divide() {
        return a/b;
    }

    @Override
    public void setA(int a) {
        this.a=a;
    }

    @Override
    public void setB(int b) {
        this.b=b;
    }

}
