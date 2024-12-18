package com.facebook.realtime.requeststream.streamref;

import X.C09170dP;
import X.C1UK;
import com.facebook.jni.HybridData;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes.dex */
public class NativeStream implements C1UK {
    public HybridData mHybridData;

    public native void nativeAmend(byte[] bArr);

    public native ListenableFuture nativeAmendWithAck(byte[] bArr, String str);

    public native void nativeCancel();

    static {
        C09170dP.A0C("rs-streamref-jni");
    }

    public NativeStream(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public ListenableFuture amendWithAck(byte[] bArr, String str) {
        return nativeAmendWithAck(bArr, str);
    }

    @Override // X.C1UK
    public void cancel() {
        nativeCancel();
    }

    public void amend(byte[] bArr) {
        nativeAmend(bArr);
    }
}
