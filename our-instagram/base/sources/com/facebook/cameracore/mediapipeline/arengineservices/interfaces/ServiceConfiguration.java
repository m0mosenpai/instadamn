package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class ServiceConfiguration {
    public HybridData mHybridData;

    public void destroy() {
        HybridData hybridData = this.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
            this.mHybridData = null;
        }
    }

    public ServiceConfiguration(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ServiceConfiguration() {
    }
}
