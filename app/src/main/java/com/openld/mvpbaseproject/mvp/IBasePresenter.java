package com.openld.mvpbaseproject.mvp;

/**
 * author: lllddd
 * created on: 2020/6/5 9:21
 * description:
 */
public interface IBasePresenter<V extends IBaseView> {
    /**
     * 绑定Activity生命周期onCreate
     */
    void onCreate();

    /**
     * 绑定Activity生命周期onStart
     */
    void onStart();

    /**
     * 绑定Activity生命周期onResume
     */
    void onResume();

    /**
     * 绑定Activity生命周期onPause
     */
    void onPause();

    /**
     * 绑定Activity生命周期onStop
     */
    void onStop();

    /**
     * 绑定Activity生命周期onDestroy
     */
    void onDestroy();

    /**
     * 绑定Activity回调onActivityResult
     */
    void onActivityResult();

    /**
     * 绑定Activity生命周期onRestart
     */
    void onRestart();
}
