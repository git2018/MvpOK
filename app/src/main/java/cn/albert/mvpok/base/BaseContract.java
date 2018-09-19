package cn.albert.mvpok.base;

/**
 * 基础Contract契约类，纯接口定义
 */
public interface BaseContract {

    interface IModel {
    }

    interface IView<P> {
        P getPresenter();
    }

    interface IPresenter<V>{
        V getView();
        void attachView(V view);
        void detachView();
        boolean isAttach();
    }
}