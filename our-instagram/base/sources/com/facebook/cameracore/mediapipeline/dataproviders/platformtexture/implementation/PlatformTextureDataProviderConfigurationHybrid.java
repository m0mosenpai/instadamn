package com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation;

import X.C14360o3;
import X.C2040090p;
import X.C224759w0;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PlatformTextureDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final C224759w0 Companion = new Object();
    public final C2040090p configuration;
    public final PlatformTextureDataProviderObjectsWrapper objectsWrapper;

    public PlatformTextureDataProviderConfigurationHybrid(C2040090p c2040090p) {
        C14360o3.A0B(c2040090p, 1);
        this.configuration = c2040090p;
        PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper = new PlatformTextureDataProviderObjectsWrapper(c2040090p.A00);
        this.objectsWrapper = platformTextureDataProviderObjectsWrapper;
        this.mHybridData = initHybrid(platformTextureDataProviderObjectsWrapper);
    }

    public static final native HybridData initHybrid(PlatformTextureDataProviderObjectsWrapper platformTextureDataProviderObjectsWrapper);
}
