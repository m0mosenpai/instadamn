package com.facebook.mobileconfig;

import X.C09270dc;
import com.facebook.jni.HybridData;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Map;

/* loaded from: classes.dex */
public class MobileConfigCrashReportUtils {
    public static MobileConfigCrashReportUtils sInstance;
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public native void addCanaryData(String str, String str2);

    public native void clear();

    public native long count();

    public native Map getAllCanaryData();

    public native Map getAllLastFetchTimestamps();

    public native void setUpdateListener(MobileConfigCanaryChangeListener mobileConfigCanaryChangeListener);

    public static synchronized MobileConfigCrashReportUtils getInstance() {
        MobileConfigCrashReportUtils mobileConfigCrashReportUtils;
        synchronized (MobileConfigCrashReportUtils.class) {
            mobileConfigCrashReportUtils = sInstance;
            if (mobileConfigCrashReportUtils == null) {
                mobileConfigCrashReportUtils = new MobileConfigCrashReportUtils();
                sInstance = mobileConfigCrashReportUtils;
            }
        }
        return mobileConfigCrashReportUtils;
    }

    static {
        C09270dc.A03("mobileconfig-jni");
    }

    public String getSerializedCanaryData() {
        Map allCanaryData = getAllCanaryData();
        StringBuilder sb = new StringBuilder((allCanaryData.size() * 100) + 50);
        sb.append("[");
        boolean z = true;
        for (Map.Entry entry : allCanaryData.entrySet()) {
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            z = false;
            sb.append("\"");
            sb.append((String) entry.getKey());
            sb.append("\"");
        }
        sb.append("]");
        return sb.toString();
    }
}
