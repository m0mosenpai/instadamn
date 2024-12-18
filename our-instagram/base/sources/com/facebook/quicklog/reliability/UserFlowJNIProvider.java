package com.facebook.quicklog.reliability;

/* loaded from: classes.dex */
public class UserFlowJNIProvider {
    public static UserFlowLogger mUserFlowLogger;

    public static UserFlowLogger getUserFlowInstance() {
        return mUserFlowLogger;
    }

    public static synchronized boolean isInitialized() {
        boolean z;
        synchronized (UserFlowJNIProvider.class) {
            z = false;
            if (mUserFlowLogger != null) {
                z = true;
            }
        }
        return z;
    }

    public static synchronized void setUserFlowLogger(UserFlowLogger userFlowLogger) {
        synchronized (UserFlowJNIProvider.class) {
            mUserFlowLogger = userFlowLogger;
        }
    }
}
