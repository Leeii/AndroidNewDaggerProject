package net.dgg.newdagger.ui.main;

import net.dgg.lib.base.mvp.BasePresenter;
import net.dgg.lib.base.mvp.BaseView;


/**
 * Created by liyi on 2018/4/27.
 */
public interface MainContract {
    interface IMainView extends BaseView {

    }

    interface IMainPresenter extends BasePresenter {

        void getString();
    }
}
