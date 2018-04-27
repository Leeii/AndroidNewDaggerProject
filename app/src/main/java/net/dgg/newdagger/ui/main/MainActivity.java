package net.dgg.newdagger.ui.main;

import android.os.Bundle;

import net.dgg.kernel.common.DaggerActivity;
import net.dgg.lib.base.dagger.ActivityScope;
import net.dgg.newdagger.R;
import net.dgg.newdagger.ui.login.LoginFragment;

import javax.inject.Inject;



/**
 * Created by liyi on 2018/4/27.
 */
@ActivityScope
public class MainActivity extends DaggerActivity implements MainContract.IMainView {
    @Inject
    MainContract.IMainPresenter mPresenter;

    @Override
    protected void trySetupData(Bundle savedInstanceState) {
        mPresenter.getString();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.content, new LoginFragment())
                .commit();
    }

    @Override
    protected int getLayoutResources() {
        return R.layout.activity_main;
    }
}
