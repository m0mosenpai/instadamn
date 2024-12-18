package com.facebook.cameracore.ardelivery.xplat.async;

import X.C09170dP;
import X.C61745Rt0;
import com.facebook.jni.HybridData;

/* loaded from: classes10.dex */
public final class XplatAsyncMetadataCompletionCallback {
    public static final C61745Rt0 Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(XplatAsyncMetadataResponse xplatAsyncMetadataResponse);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Rt0, java.lang.Object] */
    static {
        C09170dP.A0C("ard-async-downloader");
    }

    public XplatAsyncMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
