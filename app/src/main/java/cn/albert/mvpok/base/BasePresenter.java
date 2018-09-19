package cn.albert.mvpok.base;

/**
 * Presenter的基类
 */

public class BasePresenter<V> implements BaseContract.IPresenter<V> {
    public V mView;

    @Override
    public void setView(V v) {
        this.mView = v;
    }
}