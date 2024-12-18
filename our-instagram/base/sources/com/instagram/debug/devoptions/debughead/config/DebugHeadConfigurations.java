package com.instagram.debug.devoptions.debughead.config;

import X.C17280tP;

/* loaded from: classes.dex */
public final class DebugHeadConfigurations {
    public static final DebugHeadConfigurations INSTANCE = new Object();
    public static final boolean isDebugHeadEnabled;
    public static final boolean isMemoryLeakAnalysisEnabled = false;
    public static final boolean isMemoryLeakDetectionEnabled;
    public static final boolean isMemoryMetricsDebuggingEnabled;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.instagram.debug.devoptions.debughead.config.DebugHeadConfigurations, java.lang.Object] */
    static {
        boolean A0W = C17280tP.A4E.A00().A0W();
        isDebugHeadEnabled = A0W;
        isMemoryLeakDetectionEnabled = A0W;
        isMemoryMetricsDebuggingEnabled = A0W;
    }

    public static final boolean isDebugHeadEnabled() {
        return isDebugHeadEnabled;
    }

    public static final boolean isMemoryLeakAnalysisEnabled() {
        return isMemoryLeakAnalysisEnabled;
    }

    public static final boolean isMemoryLeakDetectionEnabled() {
        return isMemoryLeakDetectionEnabled;
    }

    public static final boolean isMemoryMetricsDebuggingEnabled() {
        return isMemoryMetricsDebuggingEnabled;
    }
}
