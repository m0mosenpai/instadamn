package com.instagram.autoplay.models;

import X.C8S8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class AutoplayGlobalConfig {
    public final int androidMemoryGreenMaxConcurrentVideos;
    public final int androidMemoryOrangeMaxConcurrentVideos;
    public final int androidMemoryRedMaxConcurrentVideos;
    public final int bufferingLatencyNormativeMaximumThresholdMs;
    public final int bufferingLatencyNormativeMinimumThresholdMs;
    public final int bufferingLatencyRecencyThresholdMs;
    public final int minimumTimeOnScreen;
    public final boolean respectNativeAutoplayLimitations;

    public final int getAndroidMemoryGreenMaxConcurrentVideos() {
        return this.androidMemoryGreenMaxConcurrentVideos;
    }

    public final int getAndroidMemoryOrangeMaxConcurrentVideos() {
        return this.androidMemoryOrangeMaxConcurrentVideos;
    }

    public final int getAndroidMemoryRedMaxConcurrentVideos() {
        return this.androidMemoryRedMaxConcurrentVideos;
    }

    public final int getBufferingLatencyNormativeMaximumThresholdMs() {
        return this.bufferingLatencyNormativeMaximumThresholdMs;
    }

    public final int getBufferingLatencyNormativeMinimumThresholdMs() {
        return this.bufferingLatencyNormativeMinimumThresholdMs;
    }

    public final int getBufferingLatencyRecencyThresholdMs() {
        return this.bufferingLatencyRecencyThresholdMs;
    }

    public final int getMinimumTimeOnScreen() {
        return this.minimumTimeOnScreen;
    }

    public final boolean getRespectNativeAutoplayLimitations() {
        return this.respectNativeAutoplayLimitations;
    }

    public AutoplayGlobalConfig(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7) {
        this.androidMemoryRedMaxConcurrentVideos = i;
        this.androidMemoryOrangeMaxConcurrentVideos = i2;
        this.androidMemoryGreenMaxConcurrentVideos = i3;
        this.respectNativeAutoplayLimitations = z;
        this.bufferingLatencyNormativeMinimumThresholdMs = i4;
        this.bufferingLatencyNormativeMaximumThresholdMs = i5;
        this.bufferingLatencyRecencyThresholdMs = i6;
        this.minimumTimeOnScreen = i7;
    }

    public /* synthetic */ AutoplayGlobalConfig(int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i8 & 8) != 0 ? true : z, (i8 & 16) != 0 ? 100 : i4, (i8 & 32) != 0 ? C8S8.DEFAULT_SWIPE_ANIMATION_DURATION : i5, (i8 & 64) != 0 ? 15000 : i6, (i8 & 128) != 0 ? C8S8.DEFAULT_SWIPE_ANIMATION_DURATION : i7);
    }
}
