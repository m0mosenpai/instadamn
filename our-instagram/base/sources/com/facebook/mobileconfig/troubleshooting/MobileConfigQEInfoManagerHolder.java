package com.facebook.mobileconfig.troubleshooting;

import X.C09170dP;
import com.facebook.jni.HybridData;
import com.facebook.mobileconfig.MobileConfigManagerHolderImpl;

/* loaded from: classes11.dex */
public abstract class MobileConfigQEInfoManagerHolder {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(MobileConfigManagerHolderImpl mobileConfigManagerHolderImpl);

    public native boolean getQEInfo(MobileConfigQEInfoQueryParamsHolder mobileConfigQEInfoQueryParamsHolder, MobileConfigResponseCallback mobileConfigResponseCallback, String str, String str2);

    public native String getRNQEInfo();

    public native boolean hasRefreshedQEInfo();

    static {
        C09170dP.A0C("mobileconfigtroubleshooting-jni");
    }
}
