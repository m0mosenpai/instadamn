package com.facebook.wearable.airshield.stream;

import X.AbstractC167017dG;
import X.AbstractC58319PtB;
import X.C09170dP;
import X.EnumC68148VDr;
import X.MSV;
import X.VNA;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class Framing {
    public static final VNA Companion = new Object();
    public final HybridData mHybridData;

    private final native int cipherPayloadSizeNative(ByteBuffer byteBuffer, int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native int lastErrorNative();

    /* JADX INFO: Access modifiers changed from: private */
    public final native int outerFrameSizeNative(int i);

    private final native int packNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private final native int unpackNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public final EnumC68148VDr pack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        AbstractC167017dG.A1N(byteBuffer, byteBuffer2);
        int outerFrameSizeNative = outerFrameSizeNative(byteBuffer.remaining());
        if (byteBuffer2.remaining() < outerFrameSizeNative) {
            return EnumC68148VDr.A03;
        }
        int packNative = packNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        if (packNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (EnumC68148VDr enumC68148VDr : EnumC68148VDr.values()) {
                if (enumC68148VDr.A00 == lastErrorNative) {
                    return enumC68148VDr;
                }
            }
            throw new NoSuchElementException(MSV.A00(6));
        }
        AbstractC58319PtB.A1L(byteBuffer, packNative);
        AbstractC58319PtB.A1L(byteBuffer2, outerFrameSizeNative);
        return EnumC68148VDr.A08;
    }

    public final EnumC68148VDr unpack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        AbstractC167017dG.A1N(byteBuffer, byteBuffer2);
        if (byteBuffer2.remaining() < cipherPayloadSizeNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            return EnumC68148VDr.A03;
        }
        int unpackNative = unpackNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        if (unpackNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (EnumC68148VDr enumC68148VDr : EnumC68148VDr.values()) {
                if (enumC68148VDr.A00 == lastErrorNative) {
                    return enumC68148VDr;
                }
            }
            throw new NoSuchElementException(MSV.A00(6));
        }
        byteBuffer.position(byteBuffer.position() + outerFrameSizeNative(unpackNative));
        AbstractC58319PtB.A1L(byteBuffer2, unpackNative);
        return EnumC68148VDr.A08;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.VNA] */
    static {
        C09170dP.A0C("airshield_light_mbed_jni");
    }

    public /* synthetic */ Framing(HybridData hybridData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public Framing(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
