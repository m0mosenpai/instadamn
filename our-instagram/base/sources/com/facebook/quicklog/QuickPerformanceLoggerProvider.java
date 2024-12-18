package com.facebook.quicklog;

import X.C09500dz;
import X.C0K8;

/* loaded from: classes.dex */
public class QuickPerformanceLoggerProvider {
    public static QuickPerformanceLogger A00;
    public static final C09500dz A01 = new Object();

    public static QuickPerformanceLogger getQPLInstance() {
        QuickPerformanceLogger quickPerformanceLogger = A00;
        if (quickPerformanceLogger == null) {
            C0K8.A0F("QPLProvider", "QuickPerformanceLogger instance wasn't installed in provider, returning noop. Please call QuickPerformanceLoggerProvider.setQuickPerformanceLogger() before getting the instance.", new IllegalStateException("No QPL instance provided"));
            return null;
        }
        return quickPerformanceLogger;
    }
}
