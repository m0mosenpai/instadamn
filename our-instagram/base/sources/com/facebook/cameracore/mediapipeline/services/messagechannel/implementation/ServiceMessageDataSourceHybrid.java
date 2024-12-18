package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import X.ABJ;
import X.BBX;
import X.BCU;
import X.C14360o3;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ServiceMessageDataSourceHybrid implements BCU {
    public final ABJ dataSource;
    public final HybridData mHybridData;

    public ServiceMessageDataSourceHybrid(ABJ abj) {
        C14360o3.A0B(abj, 1);
        this.dataSource = abj;
        this.mHybridData = initHybrid();
    }

    private final native HybridData initHybrid();

    @Override // X.BCU
    public native void didReceiveMessageFromPlatform(int i, ByteBuffer byteBuffer, int i2);

    @Override // X.BCU
    public native void setConfiguration(int i, ByteBuffer byteBuffer, int i2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.AG3] */
    public final void didReceiveFromXplat(int i, byte[] bArr) {
        ABJ abj = this.dataSource;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        ?? obj = new Object();
        obj.A00 = i;
        obj.A01 = wrap;
        BBX bbx = abj.A02;
        if (bbx != 0) {
            bbx.APH(obj);
        }
    }
}
