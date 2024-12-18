package com.facebook.hermes.reactexecutor;

import X.C09170dP;
import com.facebook.hermes.instrumentation.HermesMemoryDumper;
import com.facebook.hermes.instrumentation.HermesSynthTraceSupport;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.xanalytics.XAnalyticsHolder;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes10.dex */
public class HermesExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(ScheduledExecutorService scheduledExecutorService, double d, long j, boolean z, boolean z2, boolean z3, int i, boolean z4, HermesSynthTraceSupport hermesSynthTraceSupport, long j2, boolean z5, HermesMemoryDumper hermesMemoryDumper, long j3, XAnalyticsHolder xAnalyticsHolder, boolean z6);

    public static native HybridData initHybridDefaultConfig(ScheduledExecutorService scheduledExecutorService, double d);

    static {
        C09170dP.A0C("hermes-executor");
    }
}
