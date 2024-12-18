package com.facebook.backtrace;

import X.C09170dP;

/* loaded from: classes.dex */
public final class NativeBacktrace {
    public static final NativeBacktrace INSTANCE = new Object();

    public static final native String getBacktraceNative(long j, int i, boolean z, boolean z2);

    public static final native boolean getElfCachingEnabled();

    public static final native void setElfCachingEnabled(boolean z);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.backtrace.NativeBacktrace] */
    static {
        C09170dP.A0C("backtrace-jni");
    }
}
