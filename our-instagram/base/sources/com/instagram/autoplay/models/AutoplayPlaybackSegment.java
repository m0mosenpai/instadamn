package com.instagram.autoplay.models;

import X.C14360o3;

/* loaded from: classes11.dex */
public final class AutoplayPlaybackSegment {
    public final long duration;
    public final long startTime;
    public final AutoplayPlaybackState state;

    public AutoplayPlaybackSegment(AutoplayPlaybackState autoplayPlaybackState, long j, long j2) {
        C14360o3.A0B(autoplayPlaybackState, 1);
        this.state = autoplayPlaybackState;
        this.startTime = j;
        this.duration = j2;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final AutoplayPlaybackState getState() {
        return this.state;
    }
}
