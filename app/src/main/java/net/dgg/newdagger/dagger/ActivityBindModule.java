package net.dgg.newdagger.dagger;

import net.dgg.lib.base.dagger.ActivityScope;
import net.dgg.newdagger.ui.main.MainActivity;
import net.dgg.newdagger.ui.main.MainModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by liyi on 2018/4/27.
 */

@Module
public abstract class ActivityBindModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivity();
}
