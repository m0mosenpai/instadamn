package com.facebook.cameracore.mediapipeline.services.networking.implementation;

import X.BBY;
import X.T8J;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.jni.HybridData;
import com.facebook.native_bridge.NativeDataPromise;

/* loaded from: classes4.dex */
public class NetworkClientImpl extends NetworkClient {
    public final BBY mWorker;

    private native HybridData initHybrid();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, org.apache.http.client.ResponseHandler] */
    @Override // com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient
    public void sendRequest(NativeDataPromise nativeDataPromise, String str, String str2, String str3, String[] strArr, String[] strArr2, boolean z) {
        try {
            this.mWorker.EOJ(new T8J(0, nativeDataPromise, this), str, str2, str3, new Object(), strArr, strArr2, z);
        } catch (Exception e) {
            nativeDataPromise.setException(e.toString());
        }
    }

    public NetworkClientImpl(BBY bby) {
        this.mWorker = bby;
        this.mHybridData = initHybrid();
    }
}
