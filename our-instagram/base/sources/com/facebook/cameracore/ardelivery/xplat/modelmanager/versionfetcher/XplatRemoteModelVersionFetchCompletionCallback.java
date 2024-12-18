package com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher;

import X.C09170dP;
import X.C1825888e;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class XplatRemoteModelVersionFetchCompletionCallback {
    public static final C1825888e Companion = new Object();
    public HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(XplatModelVersionResponse xplatModelVersionResponse);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.88e, java.lang.Object] */
    static {
        C09170dP.A0C("ard-remote-model-fetch-callback");
    }

    public XplatRemoteModelVersionFetchCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
