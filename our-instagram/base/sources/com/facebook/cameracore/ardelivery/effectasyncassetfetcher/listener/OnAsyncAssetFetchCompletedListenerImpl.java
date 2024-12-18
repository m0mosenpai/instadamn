package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.C09170dP;
import X.C224499va;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class OnAsyncAssetFetchCompletedListenerImpl extends OnAsyncAssetFetchCompletedListener {
    public static final C224499va Companion = new Object();

    @Override // com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener.OnAsyncAssetFetchCompletedListener
    public native void onAsyncAssetFetchCompleted(String str, String str2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9va, java.lang.Object] */
    static {
        C09170dP.A0C("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListenerImpl(HybridData hybridData) {
        super(hybridData);
    }
}
