package com.facebook.onecamera.components.arcore.alwayson.recording.interfaces;

/* loaded from: classes12.dex */
public interface PlatformAlgorithmAlwaysOnDataSource {
    void closeSession();

    boolean isRecording();

    void updateFrame(long j, long j2);
}
