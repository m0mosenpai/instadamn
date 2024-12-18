package com.facebook.tigon;

import X.C14360o3;
import X.C1S2;
import X.C1SL;
import X.C1SX;
import X.C1SY;
import X.C1SZ;
import X.C26861Rw;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.iface.TigonServiceHolder;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class TigonXplatService extends TigonServiceHolder {
    private native TigonXplatRequestToken sendRequestBodyBufferIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, TigonBodyProvider tigonBodyProvider, byte[] bArr2, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    private native TigonXplatRequestToken sendRequestIntegerBuffer(TigonRequest tigonRequest, byte[] bArr, int i, ByteBuffer[] byteBufferArr, int i2, TigonCallbacks tigonCallbacks, Executor executor);

    public native boolean isObservable();

    public native void releaseBodyBuffer(ByteBuffer byteBuffer);

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.1SJ] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.1SJ] */
    public TigonRequestToken sendRequest(TigonRequest tigonRequest, TigonBodyProvider tigonBodyProvider, TigonCallbacks tigonCallbacks, Executor executor) {
        C26861Rw c26861Rw = (C26861Rw) tigonRequest.getLayerInformation(C1S2.A05);
        if (c26861Rw != null) {
            c26861Rw.A00("IGTigonService");
        }
        ?? obj = new Object();
        obj.A01 = new byte[1024];
        C1SL.A01(obj, tigonRequest);
        ?? obj2 = new Object();
        obj2.A01 = new byte[1024];
        C1SX c1sx = tigonBodyProvider.mInfo;
        if (c1sx == null) {
            c1sx = new C1SX();
            tigonBodyProvider.mInfo = c1sx;
        }
        C1SZ c1sz = C1SY.A00;
        C14360o3.A0B(c1sz, 0);
        c1sx.A00.get(c1sz);
        obj2.A00((byte) 0);
        return sendRequestBodyBufferIntegerBuffer(tigonRequest, obj.A01, obj.A00, tigonBodyProvider, obj2.A01, obj2.A00, tigonCallbacks, executor);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, X.1SJ] */
    public TigonRequestToken sendRequest(TigonRequest tigonRequest, ByteBuffer[] byteBufferArr, int i, TigonCallbacks tigonCallbacks, Executor executor) {
        C26861Rw c26861Rw = (C26861Rw) tigonRequest.getLayerInformation(C1S2.A05);
        if (c26861Rw != null) {
            c26861Rw.A00("IGTigonService");
        }
        ?? obj = new Object();
        obj.A01 = new byte[1024];
        C1SL.A01(obj, tigonRequest);
        return sendRequestIntegerBuffer(tigonRequest, obj.A01, obj.A00, byteBufferArr, i, tigonCallbacks, executor);
    }
}
