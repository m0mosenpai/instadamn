package com.facebook.traffic.nts;

/* loaded from: classes.dex */
public interface TrafficNTSNetSeerV1ConfigInterface {
    boolean getEnableLogging();

    boolean getEnableLoggingOnInit();

    boolean getEnableProbeCancellation();

    boolean getEnableThriftSerializedLogs();

    String getLogVersionString();

    String getLowerHttpStackProbingTargets();

    int getMaxBackgroundTaskDurationSeconds();

    String getNativeStackProbingTargets();

    String getProbingCommonHeadersString();

    int getProbingIntervalSeconds();

    String getProbingResponseHeadersToLogString();

    String getTigonProbingTargets();
}
