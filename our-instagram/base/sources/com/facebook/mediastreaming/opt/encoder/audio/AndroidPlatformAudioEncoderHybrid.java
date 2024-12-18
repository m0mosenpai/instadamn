package com.facebook.mediastreaming.opt.encoder.audio;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC195978lm;
import X.AbstractC53596Nn3;
import X.AbstractC53692Noh;
import X.C05F;
import X.C09170dP;
import X.C0fT;
import X.C14360o3;
import X.C51664Mrv;
import X.C53691Nog;
import X.C54845OMq;
import X.C55073OaT;
import X.C55219Oei;
import X.C55791Oq0;
import X.EnumC53196Nfs;
import X.InterfaceC58107PpW;
import X.InterfaceC58276PsU;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class AndroidPlatformAudioEncoderHybrid extends StreamingHybridClassBase {
    public static final C53691Nog Companion = new Object();
    public final C55073OaT impl;

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ef, code lost:
    
        if (r1.B1U() != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drain(java.nio.ByteBuffer r29, int r30, boolean r31, long r32) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.audio.AndroidPlatformAudioEncoderHybrid.drain(java.nio.ByteBuffer, int, boolean, long):void");
    }

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat, ByteBuffer byteBuffer2);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Nog] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    public final void prepare(int i, int i2, int i3, int i4, boolean z) {
        EnumC53196Nfs enumC53196Nfs;
        String str;
        Integer num;
        C55073OaT c55073OaT = this.impl;
        if (i4 == 5) {
            enumC53196Nfs = EnumC53196Nfs.A03;
        } else {
            enumC53196Nfs = EnumC53196Nfs.A04;
        }
        c55073OaT.A06 = new AudioEncoderConfig(i, i2, i3, enumC53196Nfs, z);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("AudioEncoderConfig: sampleRate:");
        A1C.append(i);
        A1C.append(", bitRate:");
        A1C.append(i2);
        A1C.append(", channels:");
        A1C.append(i3);
        A1C.append(", profile:");
        A1C.append(enumC53196Nfs);
        A1C.append(", useASC:");
        A1C.append(z);
        C55219Oei.A03("mss:AndroidPlatformAudioEncoderImpl", A1C.toString(), new Object[0]);
        c55073OaT.A05 = null;
        c55073OaT.A00 = 0;
        c55073OaT.A02 = 0;
        c55073OaT.A01 = 0;
        C54845OMq c54845OMq = AbstractC53596Nn3.A00;
        if (c54845OMq != null && c54845OMq.A0K) {
            c55073OaT.A08 = c54845OMq.A0C;
            InterfaceC58107PpW interfaceC58107PpW = (InterfaceC58107PpW) c55073OaT.A0C.getValue();
            C14360o3.A0B(interfaceC58107PpW, 0);
            c54845OMq.A0D = interfaceC58107PpW;
            c54845OMq.A0C = interfaceC58107PpW;
            InterfaceC58276PsU interfaceC58276PsU = c54845OMq.A0B;
            interfaceC58276PsU.EPz(new C55791Oq0(c54845OMq, interfaceC58107PpW));
            if (enumC53196Nfs.ordinal() != 0) {
                str = "AAC_HE";
            } else {
                str = "AAC_LC";
            }
            if (str.equals("AAC_LC")) {
                num = C05F.A00;
            } else if (str.equals("AAC_HE")) {
                num = C05F.A01;
            } else {
                AbstractC195978lm.A02.A04("sup:LiveMediaStreamController", "handleAudioConfigUpdate invalid AudioCodecProfile", null);
                c55073OaT.A07 = c54845OMq;
            }
            interfaceC58276PsU.CJL(new C51664Mrv(C05F.A00, num, i, i2, i3));
            c55073OaT.A07 = c54845OMq;
        }
    }

    public final void release() {
        C55073OaT c55073OaT = this.impl;
        C55219Oei.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.release", new Object[0]);
        c55073OaT.A02();
        C54845OMq c54845OMq = c55073OaT.A07;
        if (c54845OMq != null) {
            InterfaceC58107PpW interfaceC58107PpW = c55073OaT.A08;
            if (interfaceC58107PpW != null) {
                c54845OMq.A0D = interfaceC58107PpW;
                c54845OMq.A0C = interfaceC58107PpW;
                c54845OMq.A0B.EPz(new C55791Oq0(c54845OMq, interfaceC58107PpW));
            }
            c55073OaT.A09 = false;
            c55073OaT.A07 = null;
        }
    }

    public final void start() {
        ByteBuffer byteBuffer;
        C55073OaT c55073OaT = this.impl;
        C55219Oei.A03("mss:AndroidPlatformAudioEncoderImpl", "AndroidPlatformAudioEncoderImpl.start", new Object[0]);
        c55073OaT.A03 = new MediaCodec.BufferInfo();
        AudioEncoderConfig audioEncoderConfig = c55073OaT.A06;
        if (audioEncoderConfig != null) {
            MediaCodec A00 = AbstractC53692Noh.A00(audioEncoderConfig);
            c55073OaT.A04 = A00;
            C0fT.A05(A00, 300646517);
            C54845OMq c54845OMq = c55073OaT.A07;
            if (c54845OMq != null && (byteBuffer = c54845OMq.A0H) != null) {
                c54845OMq.A0C.D5h(byteBuffer);
                return;
            }
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public final void stop() {
        this.impl.A02();
    }

    public AndroidPlatformAudioEncoderHybrid(HybridData hybridData) {
        super(hybridData);
        this.impl = new C55073OaT(this);
    }
}
