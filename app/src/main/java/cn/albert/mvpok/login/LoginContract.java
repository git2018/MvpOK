package cn.albert.mvpok.login;


import cn.albert.mvpok.base.BaseContract;


public interface LoginContract {

    interface IModel extends BaseContract.IModel {
    }

    interface IView extends BaseContract.IView {
        void showData(String s);
    }

    interface IPresenter extends BaseContract.IPresenter<IView> {
        void setData();
    }
}