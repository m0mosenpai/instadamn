package com.facebook.cameracore.mediapipeline.services.camerashare;

import X.C224829w7;
import X.C9Y0;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class CameraShareServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224829w7 Companion = new Object();
    public final C9Y0 configuration;

    public static final native HybridData initHybrid(String str);

    public CameraShareServiceConfigurationHybrid(C9Y0 c9y0) {
        super(initHybrid(c9y0.A00));
        this.configuration = c9y0;
    }
}
