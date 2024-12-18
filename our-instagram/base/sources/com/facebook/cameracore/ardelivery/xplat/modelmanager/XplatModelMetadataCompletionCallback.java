package com.facebook.cameracore.ardelivery.xplat.modelmanager;

import X.C09170dP;
import X.VMB;
import com.facebook.jni.HybridData;
import java.util.List;

/* loaded from: classes11.dex */
public final class XplatModelMetadataCompletionCallback {
    public static final VMB Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(List list);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VMB] */
    static {
        C09170dP.A0C("ard-android-model-metadata-manager");
    }

    public XplatModelMetadataCompletionCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
