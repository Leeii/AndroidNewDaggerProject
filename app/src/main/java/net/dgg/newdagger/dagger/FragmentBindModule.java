package net.dgg.newdagger.dagger;

import net.dgg.lib.base.dagger.FragmentScope;
import net.dgg.newdagger.ui.login.LoginFragment;
import net.dgg.newdagger.ui.login.LoginModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by liyi on 2018/4/27.
 */
@Module
public abstract class FragmentBindModule {
    @ContributesAndroidInjector(modules = LoginModule.class)
    @FragmentScope
    abstract LoginFragment loginFragment();
}
