package net.dgg.newdagger.dagger;

import net.dgg.newdagger.data.DataRepositoryImpl;
import net.dgg.newdagger.domain.DataRepository;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by liyi on 2018/4/27.
 */

@Module
public class DataModule {

    @Singleton
    @Provides
    DataRepository repository() {
        return new DataRepositoryImpl();
    }
}
