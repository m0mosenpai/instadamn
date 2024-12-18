package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces;

import X.BDC;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

/* loaded from: classes4.dex */
public interface PlatformAlgorithmDataSource {
    void closeSession();

    void registerListener(BDC bdc);

    void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource);
}
