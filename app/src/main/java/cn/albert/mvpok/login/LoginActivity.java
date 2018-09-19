package cn.albert.mvpok.login;

import android.os.Bundle;
import android.widget.TextView;

import cn.albert.mvpok.R;
import cn.albert.mvpok.base.BaseActivity;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.IView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPresenter.setData();
    }

    @Override
    public void showData(String s) {
        TextView tv = findViewById(R.id.txt);
        tv.setText(s);
    }
}
