package com.facebook.ale.p000native;

import X.C14360o3;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class ResponseCallback {
    public HybridData mHybridData;

    public ResponseCallback(HybridData hybridData) {
        C14360o3.A0B(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public final native void onFailure(String str);

    public final native void onSuccess(String str);

    public final native void onSuccessfullCdnDownload(ByteBuffer byteBuffer);
}
