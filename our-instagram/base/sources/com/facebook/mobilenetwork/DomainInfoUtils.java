package com.facebook.mobilenetwork;

import X.C09170dP;

/* loaded from: classes.dex */
public class DomainInfoUtils {
    public static native boolean isDevserverOrOnDemandServerDomainNative(String str);

    public static native boolean isFacebookDomainNative(String str);

    public static native boolean isFbInfraDomainNative(String str);

    public static native boolean isIgCdnOrFnaDomainNative(String str);

    public static native boolean isIgDynamicDomainNative(String str);

    static {
        C09170dP.A0C("domaininfoutils_jni");
    }
}
