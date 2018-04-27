package net.dgg.newdagger.dagger;

import android.app.Application;

import net.dgg.newdagger.App;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by liyi on 2018/4/27.
 */
@Singleton
@Component(modules = {
        ActivityBindModule.class,
        ApplicationModule.class,
        AndroidSupportInjectionModule.class,
        FragmentBindModule.class,
        DataModule.class,
        UseCaseModule.class})
public interface AppComponent extends AndroidInjector<App> {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }
}
