package com.facebook.wearable.airshield.securer;

import X.AbstractC72049XLp;
import X.C09170dP;
import X.C14360o3;
import X.C63206SfA;
import X.C72571Xgz;
import X.EnumC72374XcA;
import X.InterfaceC16660sJ;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes12.dex */
public final class Stream {
    public static final C72571Xgz Companion = new Object();
    public final HybridData mHybridData;

    /* renamed from: native, reason: not valid java name */
    public final long f1native;
    public InterfaceC16660sJ onReceived;

    private final native boolean flushWithErrorNative(int i);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(Stream stream, long j);

    private final native byte[] rxUUIDNative();

    private final native int sendNative(ByteBuffer byteBuffer, int i, int i2);

    private final native int streamIdNative();

    private final native byte[] txUUIDNative();

    public final boolean flush(C63206SfA c63206SfA) {
        C14360o3.A0B(c63206SfA, 0);
        return flushWithErrorNative(c63206SfA.A00);
    }

    public final EnumC72374XcA send(ByteBuffer byteBuffer) {
        Object obj;
        C14360o3.A0B(byteBuffer, 0);
        int sendNative = sendNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
        EnumC72374XcA enumC72374XcA = EnumC72374XcA.A09;
        AbstractC72049XLp.A0D(sendNative);
        Iterator<E> it = EnumC72374XcA.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EnumC72374XcA) obj).A00 == sendNative) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EnumC72374XcA enumC72374XcA2 = (EnumC72374XcA) obj;
        if (enumC72374XcA2 == null) {
            return enumC72374XcA;
        }
        return enumC72374XcA2;
    }

    public final UUID toUUID(byte[] bArr) {
        C14360o3.A0B(bArr, 0);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        return new UUID(wrap.getLong(), wrap.getLong());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Xgz] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    private final void handleReceived(ByteBuffer byteBuffer) {
        InterfaceC16660sJ interfaceC16660sJ = this.onReceived;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(byteBuffer);
        }
    }

    public Stream(long j) {
        this.f1native = j;
        this.mHybridData = initHybrid(this, j);
    }

    public final InterfaceC16660sJ getOnReceived() {
        return this.onReceived;
    }

    public final UUID getRxUUID() {
        return toUUID(rxUUIDNative());
    }

    public final int getStreamId() {
        return streamIdNative();
    }

    public final UUID getTxUUID() {
        return toUUID(txUUIDNative());
    }

    public final void setOnReceived(InterfaceC16660sJ interfaceC16660sJ) {
        this.onReceived = interfaceC16660sJ;
    }
}
