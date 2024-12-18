package com.facebook.cameracore.mediapipeline.services.platformalgorithmdata.implementation;

import X.C14360o3;
import X.C2039290e;
import X.C224959wK;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PlatformAlgorithmDataServiceConfigurationHybrid extends ServiceConfiguration {
    public static final C224959wK Companion = new Object();
    public final C2039290e configuration;
    public final PlatformAlgorithmDataSourceHybrid dataSource;

    public PlatformAlgorithmDataServiceConfigurationHybrid(C2039290e c2039290e) {
        C14360o3.A0B(c2039290e, 1);
        this.configuration = c2039290e;
        PlatformAlgorithmDataSourceHybrid platformAlgorithmDataSourceHybrid = new PlatformAlgorithmDataSourceHybrid(c2039290e.A00);
        this.dataSource = platformAlgorithmDataSourceHybrid;
        this.mHybridData = initHybrid(platformAlgorithmDataSourceHybrid);
    }

    public static final native HybridData initHybrid(PlatformAlgorithmDataSourceHybrid platformAlgorithmDataSourceHybrid);

    public final PlatformAlgorithmDataSourceHybrid getDataSource() {
        return this.dataSource;
    }
}
