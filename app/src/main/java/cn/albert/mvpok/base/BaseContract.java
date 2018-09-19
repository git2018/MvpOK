package cn.albert.mvpok.base;

/**
 * 基础契约类，纯接口定义
 */
public interface BaseContract {

    interface IModel {
    }

    interface IView {
    }

    interface IPresenter<V>{
        void setView(V v);
    }
}