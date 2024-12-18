package com.facebook.cameracore.mediapipeline.sessionrecording.interfaces;

/* loaded from: classes4.dex */
public abstract class SessionRecordingConfig {
    public abstract String getBuildNumber();

    public abstract String getDeviceType();

    public abstract String getSessionName();

    public abstract String getStorageDirPath();

    public abstract String getTrackerType();

    public abstract boolean isRecordImageDataEnabled();

    public abstract boolean isRecordSnapshotEnabled();

    public abstract boolean isRecordingEnabled();

    public abstract boolean isRenderingEnabled();

    public abstract boolean isTrackingEnabled();

    public abstract boolean isVideoCompressionEnabled();
}
