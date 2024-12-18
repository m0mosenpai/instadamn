package com.facebook.cameracore.mediapipeline.dataproviders.platformtexture.implementation;

import X.C200478tq;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class PlatformTextureDataProviderObjectsWrapper {
    public final C200478tq input;
    public final HybridData mHybridData;

    private final native void announceContentNative();

    private final native HybridData initHybrid();

    private final native void queueContentNative(String str, byte[] bArr, float f);

    public PlatformTextureDataProviderObjectsWrapper(C200478tq c200478tq) {
        this.input = c200478tq;
        if (c200478tq != null) {
            c200478tq.A00 = this;
        }
        this.mHybridData = initHybrid();
    }
}
