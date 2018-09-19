package cn.albert.mvpok.base;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * Activity的基类，泛型实例化Presenter
 */
public abstract class BaseActivity<P extends BasePresenter> extends Activity implements BaseContract.IView{
    public P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
        mPresenter = BaseUtil.getT(this, 0);
        mPresenter.setView(this);
    }
}
