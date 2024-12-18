package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C203888zz;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C203888zz mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);

    public CameraControlServiceConfigurationHybrid(C203888zz c203888zz) {
        super(initHybrid(c203888zz.A00));
        this.mConfiguration = c203888zz;
    }
}
