package com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces;

import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;

/* loaded from: classes3.dex */
public abstract class AnalyticsLogger {
    public HybridData mHybridData;

    public abstract String getEffectStartIntentString();

    public abstract String getProductName();

    public abstract XAnalyticsHolder getXAnalytics();

    public abstract void logForBugReport(String str, String str2);

    public abstract void logRawEvent(String str, String str2);

    public abstract void logSessionEvent(boolean z);

    public abstract void setBreakpadData(String str, String str2);
}
