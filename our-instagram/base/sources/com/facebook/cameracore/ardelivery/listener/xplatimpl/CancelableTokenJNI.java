package com.facebook.cameracore.ardelivery.listener.xplatimpl;

import X.C09170dP;
import X.C1822786p;
import X.InterfaceC150176pN;
import com.facebook.cameracore.ardelivery.listener.CancelableToken;
import com.facebook.jni.HybridData;

/* loaded from: classes4.dex */
public final class CancelableTokenJNI implements InterfaceC150176pN, CancelableToken {
    public static final C1822786p Companion = new Object();
    public static final String TAG = "CancelableTokenJNI";
    public final HybridData mHybridData;

    private final native void nativeCancel();

    public void setPrefetch(boolean z) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.86p, java.lang.Object] */
    static {
        C09170dP.A0C("ard-android-listener");
    }

    public CancelableTokenJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // X.InterfaceC150176pN
    public boolean cancel() {
        nativeCancel();
        return true;
    }
}
