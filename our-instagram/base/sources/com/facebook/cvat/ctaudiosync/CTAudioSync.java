package com.facebook.cvat.ctaudiosync;

import X.AbstractC25229BEm;
import X.C09170dP;
import X.C17s;
import X.C53679NoU;
import X.MSW;
import X.OXg;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class CTAudioSync {
    public static final C53679NoU Companion = new Object();
    public static boolean isNativeLibLoaded;
    public final HybridData mHybridData;
    public double refSampleRate = -1.0d;

    private final native HybridData initHybrid();

    private final native int nativeGetOffsetSamples();

    private final native double nativeGetProcessingTime();

    private final native void nativeInit(int i, int i2, double d, int i3, int i4, double d2);

    private final native double nativeMaxCrestFactor();

    private final native void nativePrepareBaseBuffer(ByteBuffer byteBuffer);

    private final native void nativeProcess(ByteBuffer byteBuffer, ByteBuffer byteBuffer2);

    private final native void nativeProcessWithPreparedBase(ByteBuffer byteBuffer);

    private final native boolean nativeWasConfident();

    public final int getAssetOffsetInMs(String str, String str2, long j, long j2, long j3, long j4) {
        boolean A1Y = AbstractC25229BEm.A1Y(str2);
        ByteBuffer A02 = OXg.A02(str, j, C17s.A06(j2, j, j + 10000000));
        ByteBuffer A022 = OXg.A02(str2, 0L, 0L);
        if (A02.capacity() != 0 && A022.capacity() != 0) {
            int capacity = A02.capacity() / 2;
            int capacity2 = A022.capacity() / 2;
            double A00 = OXg.A00(str);
            this.refSampleRate = OXg.A00(str2);
            int A01 = OXg.A01(str);
            int A012 = OXg.A01(str2);
            Double valueOf = Double.valueOf(A00);
            Integer valueOf2 = Integer.valueOf(A1Y ? 1 : 0);
            if (!valueOf.equals(valueOf2) && !Double.valueOf(this.refSampleRate).equals(valueOf2)) {
                if (capacity >= 3.0d * A00 && capacity2 >= 3.0d * this.refSampleRate) {
                    if (!Integer.valueOf(A01).equals(valueOf2) && !Integer.valueOf(A012).equals(valueOf2)) {
                        int capacity3 = A02.capacity() / A01;
                        int capacity4 = A022.capacity() / A012;
                        double d = this.refSampleRate;
                        if (capacity3 < capacity4) {
                            nativeInit(capacity, A01, A00, capacity2, A012, d);
                            nativeProcess(A02, A022);
                            return (int) Math.floor((nativeGetOffsetSamples() / A00) * 1000.0d);
                        }
                        nativeInit(capacity2, A012, d, capacity, A01, A00);
                        nativeProcess(A022, A02);
                        return -((int) Math.floor((nativeGetOffsetSamples() / this.refSampleRate) * 1000.0d));
                    }
                    throw MSW.A0y("Received zero-channel audio");
                }
                throw MSW.A0y("Received insufficient data");
            }
            throw MSW.A0y("Received zero as sample rate");
        }
        throw MSW.A0y("Received zero length data");
    }

    public CTAudioSync() {
        synchronized (Companion) {
            if (!isNativeLibLoaded) {
                C09170dP.A0C("ctaudiosync-native");
                isNativeLibLoaded = true;
            }
        }
        this.mHybridData = initHybrid();
    }

    public final double getMaxCrestFactor() {
        return nativeMaxCrestFactor();
    }

    public final double getProcessingTime() {
        return nativeGetProcessingTime();
    }

    public final boolean getWasConfident() {
        return nativeWasConfident();
    }
}
