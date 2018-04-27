package net.dgg.newdagger.ui.login;

import net.dgg.lib.base.mvp.BasePresenter;
import net.dgg.lib.base.mvp.BaseView;


/**
 * Created by liyi on 2018/4/27.
 */
public interface LoginContract {
    interface ILoginView extends BaseView {

    }

    interface ILoginPresenter extends BasePresenter {

        void login(String string, String string1);
    }
}
