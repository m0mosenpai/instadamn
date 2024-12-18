package com.facebook.wearable.airshield.securer;

import X.AbstractC166987dD;
import X.AbstractC72049XLp;
import X.C09170dP;
import X.C14360o3;
import X.C72570Xgy;
import X.EnumC72373Xc9;
import X.EnumC72374XcA;
import X.InterfaceC16620sF;
import X.InterfaceC16660sJ;
import X.InterfaceC73590YMq;
import X.Xh0;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes12.dex */
public final class StreamSecurerImpl {
    public static final Xh0 Companion = new Object();
    public final HybridData mHybridData = initHybrid(this);
    public InterfaceC16660sJ onPreambleReady;
    public InterfaceC16660sJ onSend;
    public InterfaceC16620sF onStreamClosed;
    public InterfaceC16620sF onStreamReady;

    private final native void closeStreamNative(int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid(StreamSecurerImpl streamSecurerImpl);

    private final native long openRelayedStreamNative();

    private final native int receiveDataNative(ByteBuffer byteBuffer, int i, int i2);

    private final native boolean relayEnabledNative();

    private final native void startNative();

    private final native void stopNative();

    public void closeStream(int i, EnumC72373Xc9 enumC72373Xc9) {
        C14360o3.A0B(enumC72373Xc9, 1);
        closeStreamNative(i, enumC72373Xc9.A00);
    }

    public EnumC72374XcA receiveData(ByteBuffer byteBuffer) {
        Object obj;
        C14360o3.A0B(byteBuffer, 0);
        int position = byteBuffer.position();
        int remaining = byteBuffer.remaining();
        byteBuffer.position(byteBuffer.limit());
        int receiveDataNative = receiveDataNative(byteBuffer, position, remaining);
        EnumC72374XcA enumC72374XcA = EnumC72374XcA.A09;
        AbstractC72049XLp.A0D(receiveDataNative);
        Iterator<E> it = EnumC72374XcA.A01.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EnumC72374XcA) obj).A00 == receiveDataNative) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [X.Xh0, java.lang.Object] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    private final void handlePreambleReady(Preamble preamble) {
        InterfaceC16660sJ interfaceC16660sJ = this.onPreambleReady;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(preamble);
            return;
        }
        throw AbstractC166987dD.A14("onPreambleReady callback is not set");
    }

    private final int handleSend(ByteBuffer byteBuffer) {
        InterfaceC16660sJ interfaceC16660sJ = this.onSend;
        if (interfaceC16660sJ != null) {
            return AbstractC166987dD.A0H(interfaceC16660sJ.invoke(byteBuffer));
        }
        throw AbstractC166987dD.A14("onSend callback is not set");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void handleStreamClosed(int r7, int r8) {
        /*
            r6 = this;
            X.0sF r5 = r6.onStreamClosed
            if (r5 == 0) goto L2b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            X.Xc9 r3 = X.EnumC72373Xc9.A09
            X.AbstractC72049XLp.A0D(r8)
            kotlin.enums.EnumEntries r0 = X.EnumC72373Xc9.A01
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L26
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Xc9 r0 = (X.EnumC72373Xc9) r0
            int r0 = r0.A00
            if (r0 != r8) goto L13
            if (r1 != 0) goto L27
        L26:
            r1 = r3
        L27:
            r5.invoke(r4, r1)
            return
        L2b:
            java.lang.String r0 = "onError callback is not set"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.wearable.airshield.securer.StreamSecurerImpl.handleStreamClosed(int, int):void");
    }

    private final void handleStreamReady(long j, byte[] bArr) {
        Stream stream = new Stream(j);
        InterfaceC16620sF interfaceC16620sF = this.onStreamReady;
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(stream, bArr);
            return;
        }
        throw AbstractC166987dD.A14("onStreamReady callback is not set");
    }

    public InterfaceC16660sJ getOnPreambleReady() {
        return this.onPreambleReady;
    }

    public InterfaceC16660sJ getOnSend() {
        return this.onSend;
    }

    public InterfaceC16620sF getOnStreamClosed() {
        return this.onStreamClosed;
    }

    public InterfaceC16620sF getOnStreamReady() {
        return this.onStreamReady;
    }

    public boolean isRelayEnabled() {
        return relayEnabledNative();
    }

    public InterfaceC73590YMq openRelayStream() {
        if (!relayEnabledNative()) {
            return null;
        }
        C72570Xgy c72570Xgy = RelayStreamImpl.Companion;
        return new RelayStreamImpl(openRelayedStreamNative());
    }

    public void start() {
        startNative();
    }

    public void stop() {
        stopNative();
    }

    public void setOnPreambleReady(InterfaceC16660sJ interfaceC16660sJ) {
        this.onPreambleReady = interfaceC16660sJ;
    }

    public void setOnSend(InterfaceC16660sJ interfaceC16660sJ) {
        this.onSend = interfaceC16660sJ;
    }

    public void setOnStreamClosed(InterfaceC16620sF interfaceC16620sF) {
        this.onStreamClosed = interfaceC16620sF;
    }

    public void setOnStreamReady(InterfaceC16620sF interfaceC16620sF) {
        this.onStreamReady = interfaceC16620sF;
    }
}
