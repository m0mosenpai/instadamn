package com.instagram.debug.devoptions.debughead.data.delegates;

import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;

/* loaded from: classes12.dex */
public interface VideoPerformanceDelegate {
    void calculateVideoQuality(String str, long j, long j2);

    void endStall(String str, VideoPerformanceProvider.Stalls stalls);

    void onError(String str, String str2, String str3, String str4);

    void onPrepare(String str, VideoPerformanceProvider.Stalls stalls);

    void pauseVideo(long j, String str);

    void startVideo(long j, String str);
}
