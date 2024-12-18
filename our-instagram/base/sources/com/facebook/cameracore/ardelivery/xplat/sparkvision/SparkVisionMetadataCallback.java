package com.facebook.cameracore.ardelivery.xplat.sparkvision;

import X.C09170dP;
import X.C224529vd;
import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class SparkVisionMetadataCallback {
    public static final C224529vd Companion = new Object();
    public final HybridData mHybridData;

    public final native void onFailure(String str);

    public final native void onSuccess(SparkVisionMetadataResponse sparkVisionMetadataResponse);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9vd] */
    static {
        C09170dP.A0C("ard-spark-vision-downloader");
    }

    public SparkVisionMetadataCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
