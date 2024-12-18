package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.C90B;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C90B mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }

    public MotionDataProviderConfigurationHybrid(C90B c90b) {
        this.mConfiguration = c90b;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(c90b.A00);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }
}
