package com.facebook.jni;

import X.C09270dc;

/* loaded from: classes.dex */
public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        C09270dc.A03("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
