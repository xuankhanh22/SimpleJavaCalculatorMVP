
package Presenters;

import Models.IMNumber;
import Views.IView;
import java.util.HashSet;
import java.util.Set;


public class Presenter implements IPresenter{

    public Presenter(IMNumber iMNumber, IView iView) {
        this.iMNumber = iMNumber;
        this.iView = iView;
        this.iView.setPresenter(this);   
//        this.iMNumber.setA(this.iView.getA());
//        this.iMNumber.setB(this.iView.getB());        
    }
    private IMNumber iMNumber;  
    private IView iView;
        
    @Override
    public void  CalAdd() {
        this.iMNumber.setA(this.iView.getA());
        this.iMNumber.setB(this.iView.getB());  
       this.iView.setResult(String.valueOf(this.iMNumber.Add()));
    }

    @Override
    public void CalMinus() {
         this.iMNumber.setA(this.iView.getA());
        this.iMNumber.setB(this.iView.getB()); 
        this.iView.setResult(String.valueOf(this.iMNumber.Minus()));
    }

    @Override
    public void CalMultiply() {
         this.iMNumber.setA(this.iView.getA());
        this.iMNumber.setB(this.iView.getB()); 
       this.iView.setResult(String.valueOf(this.iMNumber.Multiply()));
    }

    @Override
    public void CalDivide() {
         this.iMNumber.setA(this.iView.getA());
        this.iMNumber.setB(this.iView.getB()); 
        this.iView.setResult(String.valueOf(this.iMNumber.Divide()));
    }

  
}
