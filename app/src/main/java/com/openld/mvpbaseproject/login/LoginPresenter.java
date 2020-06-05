package com.openld.mvpbaseproject.login;

import com.openld.mvpbaseproject.mvp.MVPBasePresenter;

/**
 * author: lllddd
 * created on: 2020/6/5 9:49
 * description:
 */
public class LoginPresenter extends MVPBasePresenter<LoginContract.View> implements LoginContract.Presenter {
    public LoginPresenter(LoginContract.View view) {
        super(view);
    }

    /**
     * 提交信息
     *
     * @param username
     * @param password
     */
    @Override
    public void commit(String username, String password) {
        if ("leidong".equals(username) && "123456".equals(password)) {
            mView.showResult("提交成功");
        } else {
            mView.showResult("提交失败");
        }
    }
}
