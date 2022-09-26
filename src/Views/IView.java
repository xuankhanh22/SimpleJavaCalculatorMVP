
package Views;

import Presenters.IPresenter;


public interface IView {
    int getA();
    int getB();
    void setResult(String result);
    void setPresenter(IPresenter iPresenter);
    IPresenter getPresenter();
}
