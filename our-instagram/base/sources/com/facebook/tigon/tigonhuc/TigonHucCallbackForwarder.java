package com.facebook.tigon.tigonhuc;

import X.AbstractC167017dG;
import X.C09170dP;
import X.C14360o3;
import X.C1SL;
import X.S1T;
import com.facebook.jni.HybridData;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Map;

/* loaded from: classes10.dex */
public final class TigonHucCallbackForwarder {
    public static final S1T Companion = new Object();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native void onBodyNative(byte[] bArr, int i);

    private final native void onEOMNative();

    private final native void onErrorNative(byte[] bArr, int i);

    private final native void onResponseNative(int i, byte[] bArr, int i2);

    private final native void onStartedNative(byte[] bArr, int i);

    private final native void onUploadProgressNative(long j, long j2);

    public final synchronized void onBody(byte[] bArr, int i) {
        C14360o3.A0B(bArr, 0);
        onBodyNative(bArr, i);
    }

    public final synchronized void onEOM() {
        onEOMNative();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1SJ] */
    public final synchronized void onError(int i, String str, int i2, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        TigonError tigonError = new TigonError(TigonErrorCode.Companion.fromValue(i), str, i2, str2);
        ?? obj = new Object();
        obj.A01 = new byte[1024];
        C1SL.A00(obj, tigonError);
        onErrorNative(obj.A01, obj.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1SJ] */
    public final synchronized void onResponse(int i, Map map) {
        C14360o3.A0B(map, 1);
        ?? obj = new Object();
        obj.A01 = new byte[1024];
        C1SL.A00.A03(obj, map);
        onResponseNative(i, obj.A01, obj.A00);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.1SJ] */
    public final synchronized void onStarted(TigonRequest tigonRequest) {
        C14360o3.A0B(tigonRequest, 0);
        ?? obj = new Object();
        obj.A01 = new byte[1024];
        C1SL.A01(obj, tigonRequest);
        onStartedNative(obj.A01, obj.A00);
    }

    public final synchronized void onUploadProgress(long j, long j2) {
        onUploadProgressNative(j, j2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.S1T] */
    static {
        C09170dP.A0C("tigonhuc");
    }

    public TigonHucCallbackForwarder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
