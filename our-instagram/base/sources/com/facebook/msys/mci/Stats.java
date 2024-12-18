package com.facebook.msys.mci;

import X.C53882dS;
import java.util.HashMap;

/* loaded from: classes.dex */
public class Stats {
    public static native void decrement(int i);

    public static native void enableFunctionProfile(boolean z);

    public static native void enter(int i, boolean z);

    public static native HashMap getPerformanceData();

    public static native HashMap getPerformanceDataWithStatIdAsKey(int[] iArr);

    public static native void increment(int i);

    public static native void leave(int i, boolean z);

    public static native void setUInt64(int i, long j);

    static {
        C53882dS.A00();
    }
}
