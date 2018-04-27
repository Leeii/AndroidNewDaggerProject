package net.dgg.newdagger.dagger;

import net.dgg.newdagger.domain.DataRepository;
import net.dgg.newdagger.domain.LoginUseCase;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

/**
 * Created by liyi on 2018/4/27.
 */
@Module
public abstract class UseCaseModule {
    @Singleton
    LoginUseCase loginUseCase(DataRepository repository) {
        return new LoginUseCase(repository);
    }
}
