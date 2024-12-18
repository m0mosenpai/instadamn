package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.AnonymousClass904;
import X.AnonymousClass906;
import X.C09170dP;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class AudioServiceModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        C09170dP.A0C("audiographservice");
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule
    public ServiceConfiguration createConfiguration(AnonymousClass904 anonymousClass904) {
        AnonymousClass906 anonymousClass906;
        if (anonymousClass904 != null && (anonymousClass906 = anonymousClass904.A06) != null) {
            return new AudioServiceConfigurationHybrid(anonymousClass906);
        }
        return null;
    }

    public AudioServiceModule() {
        this.mHybridData = initHybrid();
    }
}
