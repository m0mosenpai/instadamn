package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public class LocationData {
    public HybridData mHybridData;

    public LocationData(boolean z, double d, double d2, double d3) {
        this.mHybridData = initHybrid(false, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d);
    }

    private native HybridData initHybrid(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12);

    public LocationData(boolean z, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        this.mHybridData = initHybrid(true, d, d2, d3, d4, d5, d6, d7, 0.0d, d9, 0.0d, d11, d12);
    }
}
