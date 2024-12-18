package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.C09170dP;
import X.C14360o3;
import X.C224489vZ;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public abstract class OnAsyncAssetFetchCompletedListener {
    public static final C224489vZ Companion = new Object();
    public final HybridData mHybridData;

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.9vZ] */
    static {
        C09170dP.A0C("ard-android-async-asset-fetcher-listener");
    }
}
