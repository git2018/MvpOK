package cn.albert.mvpok.base;

public abstract class BasePresenter<V> {
    public V mView;

    public void setV(V v) {
        this.mView = v;
    }
}