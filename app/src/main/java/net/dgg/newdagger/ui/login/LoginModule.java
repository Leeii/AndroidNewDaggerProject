package net.dgg.newdagger.ui.login;

import net.dgg.lib.base.dagger.FragmentScope;

import dagger.Binds;
import dagger.Module;

/**
 * Created by liyi on 2018/4/27.
 */

@Module
public abstract class LoginModule {

    @Binds
    @FragmentScope
    abstract LoginContract.ILoginPresenter loginPresenter(LoginPresenter loginPresenter);


    @Binds
    @FragmentScope
    abstract LoginContract.ILoginView loginView(LoginFragment fragment);
}
