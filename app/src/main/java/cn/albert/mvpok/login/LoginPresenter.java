package cn.albert.mvpok.login;

import cn.albert.mvpok.base.BasePresenter;

public class LoginPresenter extends BasePresenter<LoginContract.IView> implements LoginContract.IPresenter {

    @Override
    public void setData() {
        getView().showData("LoginPresenter DATA");
    }
}