package net.dgg.newdagger.ui.main;

import net.dgg.lib.base.dagger.ActivityScope;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by liyi on 2018/4/27.
 */
@Module
public abstract class MainModule {

    @Binds
    @ActivityScope
    abstract MainContract.IMainPresenter mainPresenter(MainPresenter presenter);


    @Binds
    @ActivityScope
    abstract MainContract.IMainView mainView(MainActivity activity);
}
