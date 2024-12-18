package com.facebook.wearable.airshield.securer;

import X.AbstractC167017dG;
import X.C09170dP;
import X.C14360o3;
import X.C63206SfA;
import X.C72570Xgy;
import X.EnumC53211Ng9;
import X.InterfaceC16620sF;
import X.InterfaceC73590YMq;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public final class RelayStreamImpl implements InterfaceC73590YMq {
    public static final C72570Xgy Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native, reason: not valid java name */
    public final long f0native;
    public InterfaceC16620sF onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(RelayStreamImpl relayStreamImpl, long j);

    private final native int sendCommandNative(int i);

    private final native int sendSpanNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    public boolean flush(C63206SfA c63206SfA) {
        C14360o3.A0B(c63206SfA, 0);
        return flushWithErrorNative(c63206SfA.A00);
    }

    public int send(ByteBuffer byteBuffer) {
        C14360o3.A0B(byteBuffer, 0);
        byteBuffer.put(0, streamHeader(byteBuffer.get(0)));
        return sendSpanNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    public int sendCommand(EnumC53211Ng9 enumC53211Ng9) {
        C14360o3.A0B(enumC53211Ng9, 0);
        return sendCommandNative(enumC53211Ng9.A00);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xgy] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    private final void handleReceived(boolean z, ByteBuffer byteBuffer) {
        InterfaceC16620sF interfaceC16620sF = this.onReceived;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(Boolean.valueOf(z), byteBuffer);
        }
    }

    private final byte streamHeader(byte b) {
        return (byte) (((byte) (b & (-64))) | ((byte) streamIdNative()));
    }

    public RelayStreamImpl(long j) {
        this.f0native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public InterfaceC16620sF getOnReceived() {
        return this.onReceived;
    }

    public int getStreamId() {
        return streamIdNative();
    }

    public void sendFromPeer(InterfaceC73590YMq interfaceC73590YMq, ByteBuffer byteBuffer) {
        AbstractC167017dG.A1N(interfaceC73590YMq, byteBuffer);
        if (!interfaceC73590YMq.equals(this)) {
            send(byteBuffer);
        }
    }

    public void setOnReceived(InterfaceC16620sF interfaceC16620sF) {
        this.onReceived = interfaceC16620sF;
    }
}
