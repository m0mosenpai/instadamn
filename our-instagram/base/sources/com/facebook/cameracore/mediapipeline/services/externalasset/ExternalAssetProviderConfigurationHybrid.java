package com.facebook.cameracore.mediapipeline.services.externalasset;

import X.C90L;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final C90L mConfiguration;

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    public ExternalAssetProviderConfigurationHybrid(C90L c90l) {
        this.mConfiguration = c90l;
        this.mHybridData = initHybrid(c90l.A00);
    }

    @Override // com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration
    public void destroy() {
        super.destroy();
    }
}
