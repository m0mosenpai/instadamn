package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.BDC;
import X.C14360o3;
import X.C224969wL;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.jni.HybridData;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

/* loaded from: classes4.dex */
public final class PlatformAlgorithmDataSourceHybrid implements BDC {
    public static final C224969wL Companion = new Object();
    public final PlatformAlgorithmDataSource dataSource;
    public final HybridData mHybridData;

    public PlatformAlgorithmDataSourceHybrid(PlatformAlgorithmDataSource platformAlgorithmDataSource) {
        C14360o3.A0B(platformAlgorithmDataSource, 1);
        this.mHybridData = initHybrid();
        this.dataSource = platformAlgorithmDataSource;
        platformAlgorithmDataSource.registerListener(this);
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    private final native void nativeCloseSession();

    public final native void nativeUpdateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    public final native void nativeUpdateFrameInReplay(PlatformAlgorithmAlwaysOnDataSourceHybrid platformAlgorithmAlwaysOnDataSourceHybrid);

    @Override // X.BDC
    public void onFrameUpdate(PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        C14360o3.A0B(platformAlgorithmAlwaysOnDataSource, 0);
        nativeUpdateFrameInReplay((PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }

    @Override // X.BDC
    public void onCloseSession() {
        nativeCloseSession();
    }

    @Override // X.BDC
    public void onFrameUpdate(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        nativeUpdateFrame(j, j2, (PlatformAlgorithmAlwaysOnDataSourceHybrid) platformAlgorithmAlwaysOnDataSource);
    }
}
