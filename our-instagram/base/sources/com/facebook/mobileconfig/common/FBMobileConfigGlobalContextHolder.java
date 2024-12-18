package com.facebook.mobileconfig.common;

import X.C09270dc;
import com.facebook.jni.HybridData;
import java.util.Map;

/* loaded from: classes.dex */
public class FBMobileConfigGlobalContextHolder {
    public static FBMobileConfigGlobalContextHolder instance;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native void setContextTracker(MobileConfigContextTracker mobileConfigContextTracker);

    public native Map getContextData(int i, String str, long j);

    public native long getFirstAppInstallTime();

    public native String getFirstFullFetchCompleteTime(int i, String str);

    public native String getFirstFullFetchExtraInfo(int i, String str);

    public native String getFirstPartFetchCompleteTime(int i, String str);

    public native String getFirstPartFetchExtraInfo(int i, String str);

    public native String getFirstUserEnterSession();

    public native int getIsFirstUserEnterSession(String str);

    public native int getIsFullFetchComplete(int i, String str);

    public native int getIsPartFetchComplete(int i, String str);

    public native String getLastFullFetchCompVersion(int i, String str);

    public native String getLastPartFetchCompVersion(int i, String str);

    public native void onEnterSession(String str, int i);

    public native void onExitSession(String str);

    public native void onFirstAppInstall();

    public native void setCurrentVersion(String str);

    public native void setLastSavedVersion(String str);

    public static synchronized FBMobileConfigGlobalContextHolder getInstance(MobileConfigContextTracker mobileConfigContextTracker) {
        FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder;
        synchronized (FBMobileConfigGlobalContextHolder.class) {
            if (instance == null) {
                FBMobileConfigGlobalContextHolder fBMobileConfigGlobalContextHolder2 = new FBMobileConfigGlobalContextHolder();
                instance = fBMobileConfigGlobalContextHolder2;
                fBMobileConfigGlobalContextHolder2.setContextTracker(mobileConfigContextTracker);
            }
            fBMobileConfigGlobalContextHolder = instance;
        }
        return fBMobileConfigGlobalContextHolder;
    }

    static {
        C09270dc.A03("mobileconfig-jni");
    }
}
