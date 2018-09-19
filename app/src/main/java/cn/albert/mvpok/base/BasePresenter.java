package cn.albert.mvpok.base;

import java.lang.ref.WeakReference;

/**
 * Presenter的基类
 */

public class BasePresenter<V> implements BaseContract.IPresenter<V> {
    private WeakReference<V> viewRef;
    protected V mView;

    @Override
    public void attachView(V view) {
        viewRef= new WeakReference<V>(view);
        mView = viewRef.get();
    }

    @Override
    public void detachView() {
        if(viewRef !=null){
            viewRef.clear();
            viewRef=null;
        }
    }
}