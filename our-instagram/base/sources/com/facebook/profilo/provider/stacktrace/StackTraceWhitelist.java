package com.facebook.profilo.provider.stacktrace;

import X.C09170dP;

/* loaded from: classes.dex */
public class StackTraceWhitelist {
    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    static {
        C09170dP.A0C("profilo_stacktrace");
    }
}
