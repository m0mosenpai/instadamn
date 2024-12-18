package com.facebook.msys.mci;

import X.C53882dS;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class TraceLogger {
    public static native int addConfig(int i, int i2, int i3, int i4);

    public static native int broadcastEvent(int i, int i2, List list);

    public static native void createBootstrapTrace(boolean z);

    public static native String createTraceIdForType(int i);

    public static native void endBootstrapTrace();

    public static native String getTraceIdForAliasId(int i, String str);

    public static native int log(PrivacyContext privacyContext, int i, String str, int i2, String str2, String str3, int i3, List list);

    public static native int logCrucialCheckpoint(PrivacyContext privacyContext, int i, String str, int i2, String str2, int i3, List list);

    public static native int logWithLabeledTags(PrivacyContext privacyContext, int i, String str, int i2, String str2, String str3, int i3, List list, Map map, Map map2);

    public static native void processPendingTraces();

    public static native int removeConfig(int i);

    public static native void setMCITraceIdNonNullEnforcement(boolean z);

    public static native void setThrottlingStringConfig(String str);

    static {
        C53882dS.A00();
    }
}
