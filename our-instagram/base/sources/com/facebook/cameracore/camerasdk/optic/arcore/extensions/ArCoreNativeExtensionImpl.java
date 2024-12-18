package com.facebook.cameracore.camerasdk.optic.arcore.extensions;

import X.C72533Xfm;
import X.C72670Xkl;
import X.C72747XmO;
import X.MSX;
import X.XkV;
import X.YOi;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation.PlatformAlgorithmAlwaysOnDataSourceHybrid;
import com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.interfaces.PlatformAlgorithmDataNativeFrame;
import com.facebook.onecamera.components.arcore.alwayson.recording.interfaces.PlatformAlgorithmAlwaysOnDataSource;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import java.util.HashMap;

/* loaded from: classes12.dex */
public final class ArCoreNativeExtensionImpl implements YOi {
    public PlatformAlgorithmAlwaysOnDataSource A00;
    public final boolean A01;

    @Override // X.YOi
    public void run(Session session, Frame frame, C72670Xkl c72670Xkl, C72747XmO c72747XmO) {
        if (session != null && frame != null) {
            long nativeGetSessionNativeHandle = session.nativeGetSessionNativeHandle(session.nativeWrapperHandle);
            long j = frame.A00;
            PlatformAlgorithmDataNativeFrame platformAlgorithmDataNativeFrame = new PlatformAlgorithmDataNativeFrame(nativeGetSessionNativeHandle, j);
            C72533Xfm c72533Xfm = XkV.A02;
            HashMap hashMap = c72670Xkl.A00;
            hashMap.put(c72533Xfm, platformAlgorithmDataNativeFrame);
            if (this.A01) {
                PlatformAlgorithmAlwaysOnDataSource platformAlgorithmAlwaysOnDataSource = this.A00;
                if (platformAlgorithmAlwaysOnDataSource == null) {
                    platformAlgorithmAlwaysOnDataSource = new PlatformAlgorithmAlwaysOnDataSourceHybrid(true, c72747XmO.A02, c72747XmO.A01, c72747XmO.A00);
                    this.A00 = platformAlgorithmAlwaysOnDataSource;
                }
                platformAlgorithmAlwaysOnDataSource.updateFrame(nativeGetSessionNativeHandle, j);
                hashMap.put(XkV.A00, this.A00);
                MSX.A1N(XkV.A01, hashMap, frame.A00());
            }
        }
    }

    public ArCoreNativeExtensionImpl(boolean z) {
        this.A01 = z;
    }

    @Override // X.YOi
    public final PlatformAlgorithmAlwaysOnDataSource AbV() {
        return this.A00;
    }
}
