package com.facebook.mediastreaming.opt.encoder.video;

import X.AbstractC166987dD;
import X.AbstractC31178DnM;
import X.AbstractC50524MSc;
import X.AbstractC53596Nn3;
import X.AbstractC53694Noj;
import X.AbstractC53695Nok;
import X.AbstractC53696Nol;
import X.AnonymousClass001;
import X.C05F;
import X.C09170dP;
import X.C0K8;
import X.C0fT;
import X.C14360o3;
import X.C51712Msh;
import X.C53693Noi;
import X.C54845OMq;
import X.C54959OSj;
import X.C55139Oc7;
import X.C55219Oei;
import X.EnumC53209Ng7;
import X.EnumC53218NgG;
import X.InterfaceC58101PpQ;
import X.InterfaceC58107PpW;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.jni.HybridData;
import com.facebook.mediastreaming.opt.common.StreamingHybridClassBase;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.nio.ByteBuffer;

/* loaded from: classes9.dex */
public final class AndroidPlatformVideoEncoderHybrid extends StreamingHybridClassBase {
    public static final C53693Noi Companion = new Object();
    public final C55139Oc7 impl;

    public native void onEncoded(ByteBuffer byteBuffer, int i, int i2, long j, long j2, int i3, MediaFormat mediaFormat, boolean z, int i4, int i5, int i6);

    public final void prepare(String str, int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8, boolean z2, boolean z3, boolean z4) {
        Object obj;
        float f2;
        C14360o3.A0B(str, 0);
        C55139Oc7 c55139Oc7 = this.impl;
        c55139Oc7.A0G = str;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("prepare ");
        A1C.append(str);
        A1C.append(" encoder:w=");
        A1C.append(i);
        A1C.append(",h=");
        A1C.append(i2);
        AbstractC50524MSc.A0M(A1C, i3, i4, i5, i6);
        A1C.append(f);
        A1C.append(",enforceColorInfo=");
        A1C.append(z4);
        C55219Oei.A03("mss:AndroidPlatformVideoEncoderImpl", A1C.toString(), new Object[0]);
        Integer num = c55139Oc7.A0F;
        if (num != C05F.A00) {
            C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0u("Calling prepare when ", c55139Oc7.A0G, " encoder is already initialized ", AbstractC53694Noj.A00(num)), new Object[0]);
            return;
        }
        c55139Oc7.A0H = z2;
        c55139Oc7.A0J = z3;
        c55139Oc7.A0I = z4;
        if (!z2) {
            obj = new Object();
        } else {
            obj = new Object();
        }
        c55139Oc7.A0B = (InterfaceC58101PpQ) obj;
        c55139Oc7.A0Q.set(0L);
        c55139Oc7.A07 = null;
        c55139Oc7.A01 = 0;
        c55139Oc7.A03 = 0;
        c55139Oc7.A02 = 0;
        if (c55139Oc7.A00 == 0.0f) {
            if (i2 == 0) {
                f2 = 1.0f;
            } else {
                f2 = i / i2;
            }
            c55139Oc7.A00 = f2;
        }
        c55139Oc7.A04(i, i2, i3, i4, i5, i6, f, z, i7, i8);
        c55139Oc7.A0F = C05F.A01;
        C54845OMq c54845OMq = AbstractC53596Nn3.A00;
        if (c54845OMq != null) {
            if (c54845OMq.A0L) {
                c55139Oc7.A0E = c54845OMq.A0E;
                InterfaceC58107PpW interfaceC58107PpW = (InterfaceC58107PpW) c55139Oc7.A0R.getValue();
                C14360o3.A0B(interfaceC58107PpW, 0);
                c54845OMq.A0E = interfaceC58107PpW;
                c54845OMq.A0B.Egr(interfaceC58107PpW);
            }
            c55139Oc7.A0D = c54845OMq;
        }
        c55139Oc7.A0P.set(false);
    }

    public native void requestRestartEncoder();

    public native void updateVideoEncoderConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8);

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.Noi] */
    static {
        C09170dP.A0C("mediastreaming");
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0176, code lost:
    
        if (r9.A0L != false) goto L92;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void drain() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid.drain():void");
    }

    public final String getEncoderBitrateMode() {
        return AbstractC31178DnM.A0f(String.valueOf(this.impl.A0O.A00));
    }

    public final String getEncoderProfile() {
        return AbstractC31178DnM.A0f(String.valueOf(this.impl.A0O.A01));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:3:0x0004, B:5:0x001c, B:8:0x002d, B:10:0x0031, B:11:0x0034, B:13:0x003a, B:15:0x0045, B:17:0x0057, B:18:0x0059, B:19:0x005b, B:21:0x005f, B:22:0x0061, B:28:0x0087, B:30:0x00ab, B:32:0x00c0, B:34:0x00c4, B:35:0x00ca, B:37:0x00ce, B:43:0x00eb, B:40:0x00d3, B:42:0x00e7, B:44:0x00d8, B:46:0x007b, B:49:0x0064, B:50:0x0067, B:52:0x006b, B:54:0x006f, B:55:0x00dd, B:57:0x00e2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8 A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:3:0x0004, B:5:0x001c, B:8:0x002d, B:10:0x0031, B:11:0x0034, B:13:0x003a, B:15:0x0045, B:17:0x0057, B:18:0x0059, B:19:0x005b, B:21:0x005f, B:22:0x0061, B:28:0x0087, B:30:0x00ab, B:32:0x00c0, B:34:0x00c4, B:35:0x00ca, B:37:0x00ce, B:43:0x00eb, B:40:0x00d3, B:42:0x00e7, B:44:0x00d8, B:46:0x007b, B:49:0x0064, B:50:0x0067, B:52:0x006b, B:54:0x006f, B:55:0x00dd, B:57:0x00e2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:3:0x0004, B:5:0x001c, B:8:0x002d, B:10:0x0031, B:11:0x0034, B:13:0x003a, B:15:0x0045, B:17:0x0057, B:18:0x0059, B:19:0x005b, B:21:0x005f, B:22:0x0061, B:28:0x0087, B:30:0x00ab, B:32:0x00c0, B:34:0x00c4, B:35:0x00ca, B:37:0x00ce, B:43:0x00eb, B:40:0x00d3, B:42:0x00e7, B:44:0x00d8, B:46:0x007b, B:49:0x0064, B:50:0x0067, B:52:0x006b, B:54:0x006f, B:55:0x00dd, B:57:0x00e2), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0064 A[Catch: Exception -> 0x00ec, TryCatch #0 {Exception -> 0x00ec, blocks: (B:3:0x0004, B:5:0x001c, B:8:0x002d, B:10:0x0031, B:11:0x0034, B:13:0x003a, B:15:0x0045, B:17:0x0057, B:18:0x0059, B:19:0x005b, B:21:0x005f, B:22:0x0061, B:28:0x0087, B:30:0x00ab, B:32:0x00c0, B:34:0x00c4, B:35:0x00ca, B:37:0x00ce, B:43:0x00eb, B:40:0x00d3, B:42:0x00e7, B:44:0x00d8, B:46:0x007b, B:49:0x0064, B:50:0x0067, B:52:0x006b, B:54:0x006f, B:55:0x00dd, B:57:0x00e2), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.mediastreaming.opt.common.SurfaceHolder prepareEncoder() {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid.prepareEncoder():com.facebook.mediastreaming.opt.common.SurfaceHolder");
    }

    public final void release() {
        C55139Oc7 c55139Oc7 = this.impl;
        C55219Oei.A03("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0R(c55139Oc7.A0G, " encoder release"), new Object[0]);
        c55139Oc7.A03();
        if (c55139Oc7.A0C != null) {
            c55139Oc7.A0C = null;
        }
        C54845OMq c54845OMq = c55139Oc7.A0D;
        if (c54845OMq != null) {
            InterfaceC58107PpW interfaceC58107PpW = c55139Oc7.A0E;
            if (interfaceC58107PpW != null) {
                c54845OMq.A0E = interfaceC58107PpW;
                c54845OMq.A0B.Egr(interfaceC58107PpW);
            }
            c55139Oc7.A0K = false;
            c55139Oc7.A0D = null;
        }
    }

    public final void setABRVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        EnumC53209Ng7 enumC53209Ng7;
        C55139Oc7 c55139Oc7 = this.impl;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c55139Oc7.A0G);
        A1C.append(" encoder setABRVideoConfig:w=");
        A1C.append(i);
        A1C.append(",h=");
        A1C.append(i2);
        AbstractC50524MSc.A0M(A1C, i3, i4, i5, i6);
        A1C.append(f);
        C55219Oei.A05("mss:AndroidPlatformVideoEncoderImpl", A1C.toString(), new Object[0]);
        InterfaceC58101PpQ interfaceC58101PpQ = c55139Oc7.A0B;
        if (interfaceC58101PpQ != null) {
            int BoL = interfaceC58101PpQ.BoL();
            if (i % BoL == 0 && i2 % BoL == 0 && c55139Oc7.A00 >= 0.0f) {
                VideoEncoderConfig videoEncoderConfig = c55139Oc7.A09;
                if (videoEncoderConfig != null) {
                    int i9 = videoEncoderConfig.width;
                    int i10 = videoEncoderConfig.height;
                    EnumC53218NgG A00 = AbstractC53696Nol.A00(i5);
                    if (i6 != 1) {
                        if (i6 != 2) {
                            enumC53209Ng7 = EnumC53209Ng7.A05;
                        } else {
                            enumC53209Ng7 = EnumC53209Ng7.A04;
                        }
                    } else {
                        enumC53209Ng7 = EnumC53209Ng7.A03;
                    }
                    c55139Oc7.A09 = new VideoEncoderConfig(i9, i10, i3, i4, A00, enumC53209Ng7, f, z, i7, i8);
                    Pair create = Pair.create(Integer.valueOf(i), Integer.valueOf(i2));
                    C14360o3.A07(create);
                    C55139Oc7.A00(create, c55139Oc7);
                    C54845OMq c54845OMq = c55139Oc7.A0D;
                    if (c54845OMq != null) {
                        c54845OMq.A0B.CJC(new C51712Msh(C54959OSj.A01.A06, i, i2, i4, (int) f, i3, 0), true);
                        return;
                    }
                    return;
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("Invalid size from ABR: w=");
            A1C2.append(i);
            A1C2.append(",h=");
            A1C2.append(i2);
            A1C2.append(",ar=");
            A1C2.append(c55139Oc7.A00);
            C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", A1C2.toString(), new Object[0]);
            return;
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public final void setAspectRatio(float f) {
        C55139Oc7 c55139Oc7 = this.impl;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(c55139Oc7.A0G);
        A1C.append(" encoder setAspectRatio: ");
        A1C.append(f);
        C55219Oei.A03("mss:AndroidPlatformVideoEncoderImpl", A1C.toString(), new Object[0]);
        Integer num = c55139Oc7.A0F;
        if (num != C05F.A0C && num != C05F.A0N) {
            float f2 = c55139Oc7.A00;
            if (f2 != 0.0f && f == f2) {
                return;
            }
            c55139Oc7.A00 = f;
            if (num == C05F.A00) {
                return;
            }
            VideoEncoderConfig videoEncoderConfig = c55139Oc7.A09;
            if (videoEncoderConfig != null) {
                if (c55139Oc7.A0A != null) {
                    int i = videoEncoderConfig.width;
                    int i2 = videoEncoderConfig.height;
                    InterfaceC58101PpQ interfaceC58101PpQ = c55139Oc7.A0B;
                    if (interfaceC58101PpQ != null) {
                        Pair A00 = AbstractC53695Nok.A00(f, i, i2, interfaceC58101PpQ.BoL(), !c55139Oc7.A0H);
                        if (c55139Oc7.A00 > 0.0f) {
                            float A0H = AbstractC166987dD.A0H(A00.first);
                            Object obj = A00.second;
                            C14360o3.A06(obj);
                            c55139Oc7.A00 = A0H / AbstractC166987dD.A09(obj);
                        }
                        C55139Oc7.A00(A00, c55139Oc7);
                        return;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                throw AbstractC166987dD.A14("Required value was null.");
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0u(c55139Oc7.A0G, " encoder setAspectRatio is not supported ", AbstractC53694Noj.A00(num), " once a stream has started "), new Object[0]);
    }

    public final void setBaseVideoConfig(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        this.impl.A04(i, i2, i3, i4, i5, i6, f, z, i7, i8);
    }

    public final void start() {
        ByteBuffer byteBuffer;
        C55139Oc7 c55139Oc7 = this.impl;
        C55219Oei.A03("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0R(c55139Oc7.A0G, " encoder start"), new Object[0]);
        Integer num = c55139Oc7.A0F;
        if (num != C05F.A01 && num != C05F.A0N) {
            C0K8.A0C("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0g(c55139Oc7.A0G, " encoder cannot be started when it's ", AbstractC53694Noj.A00(num)));
            return;
        }
        MediaCodec mediaCodec = c55139Oc7.A06;
        if (mediaCodec != null) {
            C0fT.A05(mediaCodec, 1634244797);
        }
        c55139Oc7.A0F = C05F.A0C;
        C54845OMq c54845OMq = c55139Oc7.A0D;
        if (c54845OMq == null || (byteBuffer = c54845OMq.A0I) == null) {
            return;
        }
        c54845OMq.A0E.D5h(byteBuffer);
    }

    public final void stop() {
        this.impl.A03();
    }

    public AndroidPlatformVideoEncoderHybrid(HybridData hybridData) {
        super(hybridData);
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C14360o3.A07(awakeTimeSinceBootClock);
        this.impl = new C55139Oc7(awakeTimeSinceBootClock, this);
    }
}
