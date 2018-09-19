package cn.albert.mvpok.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

public abstract class BaseActivity<P extends BasePresenter> extends Activity{
    public P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mPresenter = BaseUtil.getT(this, 0);
        mPresenter.setV(this);
    }
}
