package com.facebook.smartcapture.logging;

import java.util.Map;

/* loaded from: classes10.dex */
public interface SmartCaptureLogger {
    CommonLoggingFields getCommonFields();

    void logError(String str, String str2, Throwable th);

    void logError(String str, Throwable th);

    void logEvent(String str);

    void logEvent(String str, Map map);

    void logFederatedAnalyticsCardData(FederatedAnalyticsCardData federatedAnalyticsCardData);

    void qplMarkerAnnotate(int i, String str, long j);

    void qplMarkerAnnotate(int i, String str, String str2);

    void qplMarkerEnd(int i, boolean z);

    void qplMarkerStart(int i);

    void setCommonFields(CommonLoggingFields commonLoggingFields);

    void setCurrentScreen(String str);
}
