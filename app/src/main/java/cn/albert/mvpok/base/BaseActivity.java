package cn.albert.mvpok.base;

import android.app.Activity;
import android.os.Bundle;

/**
 * Activity的基类，泛型实例化Presenter
 */
public abstract class BaseActivity<P extends BasePresenter> extends Activity implements BaseContract.IView{
    private P mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = BaseUtil.getT(this, 0);
        mPresenter.attachView(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.detachView();
    }

    @Override
    public P getPresenter() {
        return mPresenter;
    }
}
