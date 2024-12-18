package com.facebook.common.dextricks.classtracing.logger;

/* loaded from: classes.dex */
public class ClassTracingLoggerNativeHolder {
    public static native void classLoadCancelled();

    public static native void classLoadStarted(String str);

    public static native void classLoaded(long j);

    public static native void configureTracing(boolean z, boolean z2);

    public static native long[] loadedClassIds();
}
