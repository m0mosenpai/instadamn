package com.facebook.quicklog;

/* loaded from: classes.dex */
public class QuickPerformanceLoggerNativeProvider {
    public static long getAppStartTimeMs() {
        return 0L;
    }

    public static QuickPerformanceLogger getQPLInstance() {
        return QuickPerformanceLoggerProvider.getQPLInstance();
    }
}
