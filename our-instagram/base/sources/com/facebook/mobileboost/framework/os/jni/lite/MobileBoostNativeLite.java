package com.facebook.mobileboost.framework.os.jni.lite;

import X.C09170dP;

/* loaded from: classes.dex */
public class MobileBoostNativeLite {
    public static boolean sNativeLibLoaded;

    public static native void clearMlockCache();

    public static native void mlockPages(String str, int i, int i2, int i3, boolean z);

    static {
        try {
            sNativeLibLoaded = C09170dP.A0C("fb_mboost-lite");
        } catch (UnsatisfiedLinkError unused) {
            sNativeLibLoaded = false;
        }
    }
}
