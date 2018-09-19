package cn.albert.mvpok.login;


import cn.albert.mvpok.base.BaseModel;
import cn.albert.mvpok.base.BasePresenter;
import cn.albert.mvpok.base.BaseView;


public interface LoginContract {

    interface Model extends BaseModel {
    }

    interface View extends BaseView {
        void showData(String s);
    }

    abstract class Presenter extends BasePresenter<View> {
        public abstract void setData();
    }
}