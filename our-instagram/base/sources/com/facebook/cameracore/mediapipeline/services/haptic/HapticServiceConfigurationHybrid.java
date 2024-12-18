package com.facebook.cameracore.mediapipeline.services.haptic;

import X.C90X;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class HapticServiceConfigurationHybrid extends ServiceConfiguration {
    public final HapticServiceDelegateWrapper mDelegateWrapper;

    public static native HybridData initHybrid(HapticServiceDelegateWrapper hapticServiceDelegateWrapper);

    public HapticServiceConfigurationHybrid(C90X c90x) {
        HapticServiceDelegateWrapper hapticServiceDelegateWrapper = new HapticServiceDelegateWrapper(c90x.A00);
        this.mDelegateWrapper = hapticServiceDelegateWrapper;
        this.mHybridData = initHybrid(hapticServiceDelegateWrapper);
    }
}
