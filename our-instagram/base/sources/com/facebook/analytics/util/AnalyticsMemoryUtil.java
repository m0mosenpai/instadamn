package com.facebook.analytics.util;

import X.C09170dP;

/* loaded from: classes10.dex */
public final class AnalyticsMemoryUtil {
    public static native String[] getLoadedLibraries();

    public static native long getPeakRss();

    static {
        C09170dP.A0C("analyticsutil-jni");
    }
}
