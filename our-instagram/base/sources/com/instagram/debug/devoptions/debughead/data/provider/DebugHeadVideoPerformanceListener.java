package com.instagram.debug.devoptions.debughead.data.provider;

import android.os.SystemClock;
import com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider;
import com.instagram.debug.devoptions.debughead.data.delegates.VideoPerformanceDelegate;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes12.dex */
public class DebugHeadVideoPerformanceListener implements VideoPerformanceProvider {
    public static AtomicLong sSessionIdGenerator = new AtomicLong(SystemClock.elapsedRealtime());
    public VideoPerformanceDelegate mDelegate;
    public DebugHeadStallTracker mStallTracker = new DebugHeadStallTracker();

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void calculateVideoQuality(String str, long j, long j2) {
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.calculateVideoQuality(str, j, j2);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void endStall(String str, VideoPerformanceProvider.Stalls stalls) {
        this.mStallTracker.endStall(stalls);
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.endStall(str, stalls);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public String generateDebugHeadSessionId() {
        return String.valueOf(sSessionIdGenerator.addAndGet(1L));
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void onError(String str, String str2, String str3, String str4) {
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.onError(str, str2, str3, str4);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void onPrepare(String str, VideoPerformanceProvider.Stalls stalls) {
        this.mStallTracker.startStall(stalls);
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.onPrepare(str, stalls);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void onVideoPaused(long j, String str) {
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.pauseVideo(j, str);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void onVideoStarted(long j, String str) {
        VideoPerformanceDelegate videoPerformanceDelegate = this.mDelegate;
        if (videoPerformanceDelegate != null) {
            videoPerformanceDelegate.startVideo(j, str);
        }
    }

    @Override // com.instagram.debug.devoptions.apiperf.VideoPerformanceProvider
    public void resetStallTracker() {
        this.mStallTracker.reset();
    }

    public DebugHeadStallTracker getStallTracker() {
        return this.mStallTracker;
    }

    public void setDelegate(VideoPerformanceDelegate videoPerformanceDelegate) {
        this.mDelegate = videoPerformanceDelegate;
    }
}
