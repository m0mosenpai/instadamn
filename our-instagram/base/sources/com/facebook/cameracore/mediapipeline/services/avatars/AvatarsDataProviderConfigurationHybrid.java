package com.facebook.cameracore.mediapipeline.services.avatars;

import X.C09170dP;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class AvatarsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AvatarsDataProviderConfigurationHybrid $redex_init_class = null;

    public static native HybridData initHybrid(String str, String str2, int i, AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge, AvatarsNativeInputDelegate avatarsNativeInputDelegate);

    static {
        C09170dP.A0C("avatarsdataprovider");
    }
}
