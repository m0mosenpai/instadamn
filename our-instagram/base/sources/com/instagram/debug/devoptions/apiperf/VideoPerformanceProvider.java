package com.instagram.debug.devoptions.apiperf;

/* loaded from: classes12.dex */
public interface VideoPerformanceProvider {

    /* loaded from: classes12.dex */
    public enum Stalls {
        INIT,
        BUFFERING
    }

    void calculateVideoQuality(String str, long j, long j2);

    void endStall(String str, Stalls stalls);

    String generateDebugHeadSessionId();

    void onError(String str, String str2, String str3, String str4);

    void onPrepare(String str, Stalls stalls);

    void onVideoPaused(long j, String str);

    void onVideoStarted(long j, String str);

    void resetStallTracker();
}
