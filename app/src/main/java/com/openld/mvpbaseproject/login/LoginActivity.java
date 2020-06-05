package com.openld.mvpbaseproject.login;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.openld.mvpbaseproject.R;
import com.openld.mvpbaseproject.mvp.MVPBaseActivity;

/**
 * author: lllddd
 * created on: 2020/6/5 9:49
 * description:
 */
public class LoginActivity extends MVPBaseActivity<LoginContract.View, LoginContract.Presenter> implements LoginContract.View {
    private static final String TAG = "LoginActivity";

    private EditText mEdtUsername;

    private EditText mEdtPassword;

    private Button mBtnCommit;

    @Override
    public LoginContract.Presenter bindPresenter() {
        return new LoginPresenter(LoginActivity.this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mEdtUsername = findViewById(R.id.edt_username);
        mEdtPassword = findViewById(R.id.edt_password);
        mBtnCommit = findViewById(R.id.btn_commit);

    }

    /**
     * 点击提交按钮
     *
     * @param view
     */
    public void onClickBtnCommit(View view) {
        mPresenter.commit(obtainUsername(), obtainPassword());
    }

    /**
     * 清除用户名
     */
    @Override
    public void clearUsername() {
        mEdtUsername.setText("");
    }

    /**
     * 清除密码
     */
    @Override
    public void clearPassword() {
        mEdtPassword.setText("");
    }

    /**
     * 获取用户名
     *
     * @return
     */
    @Override
    public String obtainUsername() {
        return mEdtUsername.getText().toString().trim();
    }

    /**
     * 获取密码
     *
     * @return
     */
    @Override
    public String obtainPassword() {
        return mEdtPassword.getText().toString().trim();
    }

    /**
     * 展示结果
     *
     * @param result
     */
    @Override
    public void showResult(String result) {
        Toast.makeText(this, result, Toast.LENGTH_SHORT).show();
    }
}