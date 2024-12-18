package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Pair;
import android.view.Surface;
import com.facebook.mediastreaming.opt.encoder.video.AndroidPlatformVideoEncoderHybrid;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Oc7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55139Oc7 {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public MediaCodec.BufferInfo A05;
    public MediaCodec A06;
    public MediaFormat A07;
    public C55687OoD A08;
    public VideoEncoderConfig A09;
    public VideoEncoderConfig A0A;
    public InterfaceC58101PpQ A0B;
    public C176537tB A0C;
    public C54845OMq A0D;
    public InterfaceC58107PpW A0E;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final C0JO A0M;
    public final AndroidPlatformVideoEncoderHybrid A0N;
    public final AtomicLong A0Q = new AtomicLong(0);
    public final OU2 A0O = new Object();
    public Integer A0F = C05F.A00;
    public String A0G = "UNKNOWN";
    public final AtomicBoolean A0P = AbstractC166997dE.A17();
    public final InterfaceC09390do A0R = AbstractC09440dt.A01(new C57243PbR(this, 40));

    public static final boolean A02(C55139Oc7 c55139Oc7, Exception exc) {
        C55219Oei.A01("mss:AndroidPlatformVideoEncoderImpl", "handleException/original", exc, new Object[0]);
        if ((exc instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) exc).isTransient()) {
            if (c55139Oc7.A03 <= 100) {
                C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", "video_enc_exception_transient", new Object[0]);
                c55139Oc7.A03++;
                return true;
            }
        } else {
            int i = c55139Oc7.A02 + 1;
            c55139Oc7.A02 = i;
            C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0O("video_enc_exception_restart_count=", i), new Object[0]);
            if (c55139Oc7.A02 <= 5) {
                try {
                    c55139Oc7.A0N.requestRestartEncoder();
                    C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", "video_enc_exception_restart", new Object[0]);
                    return true;
                } catch (Exception e) {
                    C55219Oei.A01("mss:AndroidPlatformVideoEncoderImpl", "restartVideoEncoder", e, new Object[0]);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.util.Pair r23, X.C55139Oc7 r24) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55139Oc7.A00(android.util.Pair, X.Oc7):void");
    }

    public static final void A01(C55139Oc7 c55139Oc7) {
        MediaCodec mediaCodec = c55139Oc7.A06;
        if (mediaCodec != null) {
            C55219Oei.A08("Start flushing video encoder", new Object[0]);
            int i = 0;
            try {
                do {
                    try {
                        mediaCodec.flush();
                    } catch (IllegalStateException e) {
                        C55219Oei.A01("mss:VideoEncoderSetup", "failed to flush encoder, attmpts %d", e, AbstractC25228BEl.A1Y(i));
                        i++;
                    }
                    break;
                } while (i < 4);
                break;
                C55219Oei.A08("Stopping video encoder", new Object[0]);
                C0fT.A06(mediaCodec, -1202842253);
            } catch (Exception e2) {
                C55219Oei.A01("mss:VideoEncoderSetup", "Failed to stop encoder", e2, new Object[0]);
            }
            try {
                C55219Oei.A08("Releasing video encoder", new Object[0]);
                C0fT.A03(mediaCodec, -992587840);
            } catch (Exception e3) {
                C55219Oei.A01("mss:VideoEncoderSetup", "Failed to release encoder", e3, new Object[0]);
            }
            C55219Oei.A08("Releasing video encoder finished.", new Object[0]);
        }
        c55139Oc7.A06 = null;
        c55139Oc7.A0L = false;
    }

    public final void A03() {
        Surface surface;
        C55219Oei.A03("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0R(this.A0G, " encoder stop"), new Object[0]);
        Integer num = this.A0F;
        Integer num2 = C05F.A0N;
        if (num == num2) {
            C55219Oei.A04("mss:AndroidPlatformVideoEncoderImpl", AnonymousClass001.A0R(this.A0G, " encoder already stopped"), new Object[0]);
            return;
        }
        this.A04 = 0L;
        C55687OoD c55687OoD = this.A08;
        if (c55687OoD != null && (surface = c55687OoD.getSurface()) != null) {
            surface.release();
        }
        this.A08 = null;
        A01(this);
        this.A01 = 0;
        this.A03 = 0;
        this.A02 = 0;
        this.A0F = num2;
        this.A0P.set(false);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.OU2, java.lang.Object] */
    public C55139Oc7(C0JO c0jo, AndroidPlatformVideoEncoderHybrid androidPlatformVideoEncoderHybrid) {
        this.A0M = c0jo;
        this.A0N = androidPlatformVideoEncoderHybrid;
    }

    public final void A04(int i, int i2, int i3, int i4, int i5, int i6, float f, boolean z, int i7, int i8) {
        EnumC53209Ng7 enumC53209Ng7;
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A0G);
        A1C.append(" encoder setVideoConfig:w=");
        A1C.append(i);
        A1C.append(",h=");
        A1C.append(i2);
        AbstractC50524MSc.A0M(A1C, i3, i4, i5, i6);
        A1C.append(f);
        C55219Oei.A05("mss:AndroidPlatformVideoEncoderImpl", A1C.toString(), new Object[0]);
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
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig(i, i2, i3, i4, A00, enumC53209Ng7, f, z, i7, i8);
        this.A09 = videoEncoderConfig;
        int i9 = videoEncoderConfig.width;
        int i10 = videoEncoderConfig.height;
        float f2 = this.A00;
        InterfaceC58101PpQ interfaceC58101PpQ = this.A0B;
        if (interfaceC58101PpQ != null) {
            Pair A002 = AbstractC53695Nok.A00(f2, i9, i10, interfaceC58101PpQ.BoL(), !this.A0H);
            if (this.A00 > 0.0f) {
                float A0H = AbstractC166987dD.A0H(A002.first);
                Object obj = A002.second;
                C14360o3.A06(obj);
                this.A00 = A0H / AbstractC166987dD.A09(obj);
            }
            StringBuilder A1C2 = AbstractC166987dD.A1C();
            A1C2.append("Adjusted ");
            A1C2.append(this.A0G);
            A1C2.append(" base encoder size: ");
            A1C2.append(A002.first);
            A1C2.append('x');
            C55219Oei.A05("mss:AndroidPlatformVideoEncoderImpl", AbstractC166997dE.A0v(A002.second, A1C2), new Object[0]);
            A00(A002, this);
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
