package com.facebook.msys.mci;

import X.C0K8;
import X.C2NJ;

/* loaded from: classes.dex */
public class Log {
    public static boolean sRegistered;

    public static native void registerLoggerNative(long j, int i, boolean z, int i2);

    public static native void setLogLevel(int i);

    static {
        C2NJ.A00();
    }

    public static void log(int i, String str) {
        C0K8.A01(i, "msys", str);
    }
}
