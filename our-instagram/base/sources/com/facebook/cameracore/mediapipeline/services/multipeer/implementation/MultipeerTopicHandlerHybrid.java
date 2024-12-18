package com.facebook.cameracore.mediapipeline.services.multipeer.implementation;

import com.facebook.jni.HybridData;

/* loaded from: classes9.dex */
public final class MultipeerTopicHandlerHybrid {
    public final HybridData mHybridData;

    public final native void onMessageNative(String str);

    public MultipeerTopicHandlerHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
