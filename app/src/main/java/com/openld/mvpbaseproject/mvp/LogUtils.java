package com.openld.mvpbaseproject.mvp;

import android.util.Log;

/**
 * author: lllddd
 * created on: 2020/6/5 10:56
 * description:
 */
public class LogUtils {
    private volatile static LogUtils mInstance;
    // 日志是否开启
    private boolean tap = true;

    public void setTap(boolean tap) {
        this.tap = tap;
    }

    public static LogUtils getInstance() {
        if (mInstance == null) {
            synchronized (LogUtils.class) {
                if (mInstance == null) {
                    mInstance = new LogUtils();
                }
            }
        }
        return mInstance;
    }

    /**
     * debug日志
     *
     * @param tag
     * @param content
     */
    public void logDebug(String tag, String content) {
        if (tap) {
            Log.d(tag, " >>> " + content);
        }
    }

    /**
     * error日志
     *
     * @param tag
     * @param content
     */
    public void logError(String tag, String content) {
        if (tap) {
            Log.e(tag, " >>> " + content);
        }
    }

    /**
     * warn日志
     *
     * @param tag
     * @param content
     */
    public void logWarn(String tag, String content) {
        if (tap) {
            Log.w(tag, " >>> " + content);
        }
    }

    /**
     * info日志
     *
     * @param tag
     * @param content
     */
    public void logInfo(String tag, String content) {
        if (tap) {
            Log.i(tag, " >>> " + content);
        }
    }
}
