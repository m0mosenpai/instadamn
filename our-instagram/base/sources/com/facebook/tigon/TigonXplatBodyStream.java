package com.facebook.tigon;

import X.C09170dP;
import X.C1SJ;
import X.C1SL;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class TigonXplatBodyStream implements TigonBodyStream {
    public final HybridData mHybridData;

    private native void reportBodyLengthNative(int i);

    private native void reportErrorNativeByteBuffer(byte[] bArr, int i);

    private native int transferBytesArrayNative(byte[] bArr, int i);

    private native int transferBytesNative(ByteBuffer byteBuffer, int i);

    private native void writeEOMNative();

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportError(TigonError tigonError) {
        C1SJ c1sj = new C1SJ();
        C1SL.A00(c1sj, tigonError);
        reportErrorNativeByteBuffer(c1sj.A01, c1sj.A00);
    }

    static {
        C09170dP.A0C("tigonjni");
    }

    public TigonXplatBodyStream(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public int transferBytes(byte[] bArr, int i) {
        return transferBytesArrayNative(bArr, i);
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void writeEOM() {
        writeEOMNative();
    }

    @Override // com.facebook.tigon.TigonBodyStream
    public void reportBodyLength(int i) {
        reportBodyLengthNative(i);
    }
}
