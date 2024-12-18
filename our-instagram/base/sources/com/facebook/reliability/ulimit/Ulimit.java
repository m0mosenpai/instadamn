package com.facebook.reliability.ulimit;

import X.C09170dP;

/* loaded from: classes4.dex */
public class Ulimit {
    public static final boolean sNativeLibLoaded;

    public static native void setNativeMaxUlimit();

    static {
        boolean z;
        try {
            C09170dP.A0C("reliability");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sNativeLibLoaded = z;
    }
}
