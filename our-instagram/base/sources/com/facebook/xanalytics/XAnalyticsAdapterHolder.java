package com.facebook.xanalytics;

import X.C09270dc;
import com.facebook.jni.HybridData;

/* loaded from: classes.dex */
public class XAnalyticsAdapterHolder extends XAnalyticsHolder {
    public static final XAnalyticsAdapterHolder $redex_init_class = null;
    public final XAnalyticsAdapter mAdapter;

    public static native HybridData initHybrid(XAnalyticsAdapter xAnalyticsAdapter);

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logEvent(String str, String str2) {
        logEvent(str, str2, null);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void cleanup() {
        this.mAdapter.cleanup();
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void flush() {
        this.mAdapter.flush();
    }

    public String getStructureSamplingConfig(String str) {
        return this.mAdapter.getStructureSamplingConfig(str);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logCounter(String str, long j) {
        this.mAdapter.logCounter(str, j, "counters");
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logRealtimeEvent(String str, String str2) {
        this.mAdapter.logEvent(str, str2, null, true, -1.0d);
    }

    static {
        C09270dc.A03("xanalyticsadapter-jni");
    }

    public XAnalyticsAdapterHolder(XAnalyticsAdapter xAnalyticsAdapter) {
        super(initHybrid(xAnalyticsAdapter));
        this.mAdapter = xAnalyticsAdapter;
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logCounter(String str, long j, String str2) {
        this.mAdapter.logCounter(str, j, str2);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, false, -1.0d);
    }

    @Override // com.facebook.xanalytics.XAnalyticsHolder
    public void logRealtimeEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, true, -1.0d);
    }
}
