package X;

import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;

/* renamed from: X.90f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2039390f implements PlatformAlgorithmDataSource {
    public BDC A00;

    @Override // com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource
    public final synchronized void closeSession() {
        BDC bdc = this.A00;
        if (bdc != null) {
            bdc.onCloseSession();
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource
    public final synchronized void registerListener(BDC bdc) {
        C14360o3.A0B(bdc, 0);
        this.A00 = bdc;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataSource
    public final synchronized void updateFrame(long j, long j2, PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource) {
        BDC bdc = this.A00;
        if (bdc != null) {
            bdc.onFrameUpdate(j, j2, platformAlgorithmAlwaysOnDataSource);
        }
    }
}
