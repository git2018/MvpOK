package cn.albert.mvpok.login;

public class LoginPresenter extends LoginContract.Presenter{

    @Override
    public void setData() {
        mView.showData("LoginPresenter DATA");
    }
}