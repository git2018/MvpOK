package cn.albert.mvpok.base;

import java.lang.ref.WeakReference;

/**
 * Presenter的基类
 */
public class BasePresenter<V> implements BaseContract.IPresenter<V> {

    private WeakReference<V> weakRefView;

    public void attachView(V view){
        weakRefView = new WeakReference<>(view);
    }

    public void detachView() {
        if(isAttach()) {
            weakRefView.clear();
            weakRefView = null;
        }
    }

    public V getView(){
        return isAttach()?weakRefView.get():null;
    }

     public boolean isAttach() {
        return weakRefView != null && weakRefView.get() != null;
    }
}