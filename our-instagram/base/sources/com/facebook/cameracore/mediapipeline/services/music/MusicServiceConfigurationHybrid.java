package com.facebook.cameracore.mediapipeline.services.music;

import X.C90W;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class MusicServiceConfigurationHybrid extends ServiceConfiguration {
    public final C90W mConfiguration;

    public static native HybridData initHybrid(MusicServiceDataSource musicServiceDataSource);

    public MusicServiceConfigurationHybrid(C90W c90w) {
        super(initHybrid(c90w.A00));
        this.mConfiguration = c90w;
    }
}
