package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces;

/* loaded from: classes4.dex */
public class FaceTrackerDataProviderConfig {
    public final int executionMode;
    public final int frameProcessorDelayTolerance;
    public final int frameProcessorTimeToLive;
    public final int frameProcessorWaitTimeout;
    public final boolean useLazyFaceTracker;
    public final boolean useSynchronousFaceTracker;

    public FaceTrackerDataProviderConfig(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.frameProcessorDelayTolerance = 30000;
        this.frameProcessorWaitTimeout = i2;
        this.frameProcessorTimeToLive = 15000;
        this.useSynchronousFaceTracker = false;
        this.useLazyFaceTracker = false;
        this.executionMode = i4;
    }

    public int getExecutionMode() {
        return this.executionMode;
    }

    public boolean getUseLazyFaceTracker() {
        return this.useLazyFaceTracker;
    }

    public boolean getUseSynchronousFaceTracker() {
        return this.useSynchronousFaceTracker;
    }

    public FaceTrackerDataProviderConfig() {
        this(30000, 70000, 15000, false, false, 0);
    }
}
