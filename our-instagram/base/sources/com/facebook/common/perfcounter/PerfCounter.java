package com.facebook.common.perfcounter;

/* loaded from: classes.dex */
public final class PerfCounter {
    public static volatile int A00 = -1;
    public static int A01;
    public static final Object A02 = new Object();
    public static volatile boolean A03;

    public static final native boolean nativeBegin();

    public static final native void nativeEnd();

    public static final native void nativeReport(Object obj);
}
