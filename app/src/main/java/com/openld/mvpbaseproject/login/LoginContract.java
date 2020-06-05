package com.openld.mvpbaseproject.login;

import com.openld.mvpbaseproject.mvp.IBasePresenter;
import com.openld.mvpbaseproject.mvp.IBaseView;

/**
 * author: lllddd
 * created on: 2020/6/5 9:37
 * description:
 */
public class LoginContract {
    public interface View extends IBaseView {
        /**
         * 清除用户名
         */
        void clearUsername();

        /**
         * 清除密码
         */
        void clearPassword();

        /**
         * 获取用户名
         *
         * @return
         */
        String obtainUsername();

        /**
         * 获取密码
         *
         * @return
         */
        String obtainPassword();

        /**
         * 展示结果
         *
         * @param result
         */
        void showResult(String result);
    }

    public interface Presenter extends IBasePresenter<View> {
        /**
         * 提交用户名+密码
         *
         * @param username
         * @param password
         */
        void commit(String username, String password);
    }
}
