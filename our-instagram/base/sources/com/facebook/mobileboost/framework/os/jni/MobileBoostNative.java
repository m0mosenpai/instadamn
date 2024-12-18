package com.facebook.mobileboost.framework.os.jni;

import X.C09170dP;
import X.C0K8;

/* loaded from: classes.dex */
public class MobileBoostNative {
    public static boolean sNativeLibLoaded;

    public static native void disableSmartFsync();

    public static native boolean enableLicmFix(boolean z);

    public static native boolean enableSmartFsync(boolean z);

    static {
        try {
            sNativeLibLoaded = C09170dP.A0C("fb_mboost");
        } catch (UnsatisfiedLinkError e) {
            C0K8.A0H("MobileBoostJNI", "Failed to load MobileBoostNative lib.", e);
            sNativeLibLoaded = false;
        }
    }
}
