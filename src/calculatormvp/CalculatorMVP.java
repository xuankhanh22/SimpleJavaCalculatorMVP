
package calculatormvp;

import Models.MNumber;
import Presenters.Presenter;
import Views.IView;
import Views.View;
import javax.swing.SwingUtilities;


public class CalculatorMVP {

    
    public static void main(String[] args) {
        //show some comment on the platform
        SwingUtilities.invokeLater(()->{
            View view=new View();
            MNumber mn=new MNumber();            
           view.setPresenter(new Presenter(mn,view));
            view.setVisible(true);
            ;});
    }
    
}
