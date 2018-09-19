package cn.albert.mvpok.base;


public interface BaseContract {

    interface BaseModel {
    }

    interface BaseView {
    }

    interface BasePresenter<V>{
        V getPresenter();
    }
}