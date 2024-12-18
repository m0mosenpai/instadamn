package com.facebook.ffmpeg;

import X.AbstractC72906Xqm;
import X.C66014TyA;
import X.InterfaceC73600YNc;
import java.util.Map;

/* loaded from: classes11.dex */
public class FFMpegMediaMuxer {
    public Map A00;
    public boolean A01;
    public final int A02;
    public final C66014TyA A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final NativeWrapper mNativeWrapper;

    public FFMpegMediaMuxer(C66014TyA c66014TyA, String str, boolean z) {
        this(c66014TyA, str, z, null, -1, false, null, null);
    }

    /* loaded from: classes11.dex */
    public class NativeWrapper implements InterfaceC73600YNc {
        public volatile long mFragmentedFormatFlagsFix;
        public volatile long mNativeAudioCodec;
        public volatile long mNativeContext;
        public volatile long mNativeVideoCodec;

        private native void nativeFinalize();

        public native FFMpegAVStream nativeAddStream(FFMpegMediaFormat fFMpegMediaFormat, int i, int i2);

        public native void nativeInit(String str);

        public native void nativeStart(boolean z, String str, Map map, String str2);

        public native void nativeStop();

        public NativeWrapper(Object obj, long j) {
            this.mFragmentedFormatFlagsFix = j;
            AbstractC72906Xqm.A00(this, obj);
        }

        @Override // X.InterfaceC73600YNc
        public void targetDestructed() {
            nativeFinalize();
        }
    }

    public final void A00() {
        this.mNativeWrapper.nativeStart(this.A07, this.A04, this.A00, this.A05);
        this.A01 = true;
    }

    public final void A01() {
        if (this.A01) {
            this.mNativeWrapper.nativeStop();
            this.A01 = false;
        }
    }

    public FFMpegMediaMuxer initialize() {
        this.A03.A00();
        this.mNativeWrapper.nativeInit(this.A06);
        return this;
    }

    public FFMpegMediaMuxer(C66014TyA c66014TyA, String str, boolean z, String str2, int i, boolean z2, Map map) {
        this(c66014TyA, str, z, str2, i, z2, map, null);
    }

    public FFMpegMediaMuxer(C66014TyA c66014TyA, String str, boolean z, String str2, int i, boolean z2, Map map, String str3) {
        this.A03 = c66014TyA;
        this.A06 = str;
        this.A07 = z;
        this.A04 = str2;
        this.A02 = i;
        this.mNativeWrapper = new NativeWrapper(this, z2 ? 1L : 0L);
        this.A00 = map;
        this.A05 = str3;
    }
}
