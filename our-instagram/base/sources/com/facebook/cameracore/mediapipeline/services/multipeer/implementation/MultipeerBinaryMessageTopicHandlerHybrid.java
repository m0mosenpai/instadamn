package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class MultipeerBinaryMessageTopicHandlerHybrid {
    public final HybridData mHybridData;

    public final native void onMessageNative(byte[] bArr);

    public MultipeerBinaryMessageTopicHandlerHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
