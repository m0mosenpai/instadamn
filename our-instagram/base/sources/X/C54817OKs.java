package X;

import android.util.Pair;
import com.facebook.video.common.livestreaming.protocol.VideoBroadcastVideoStreamingConfig;

/* renamed from: X.OKs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54817OKs {
    public final C05A A00;
    public final C0UO A01;
    public final C0UO A02;
    public final C05A A03;

    public final void A01(Pair pair, Pair pair2, Integer num) {
        A00(pair, pair2, null, null, num, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [X.OW7, java.lang.Object] */
    public final void A00(Pair pair, Pair pair2, VideoBroadcastVideoStreamingConfig videoBroadcastVideoStreamingConfig, Double d, Integer num, Integer num2, Long l, String str) {
        double d2;
        long j;
        int i;
        String str2 = str;
        Integer num3 = num;
        Pair pair3 = pair2;
        Pair pair4 = pair;
        C05A c05a = this.A03;
        OW7 ow7 = (OW7) c05a.getValue();
        if (pair == null) {
            pair4 = ow7.A04;
        }
        if (pair2 == null) {
            pair3 = ow7.A06;
        }
        Pair pair5 = ow7.A07;
        Pair pair6 = ow7.A05;
        double d3 = ow7.A01;
        if (d != null) {
            d2 = d.doubleValue();
        } else {
            d2 = ow7.A00;
        }
        if (num == null) {
            num3 = ow7.A0A;
        }
        Integer num4 = ow7.A09;
        Integer num5 = ow7.A08;
        if (str == null) {
            str2 = ow7.A0B;
        }
        String str3 = ow7.A0E;
        if (l != null) {
            j = l.longValue();
        } else {
            j = ow7.A03;
        }
        String str4 = ow7.A0D;
        String str5 = ow7.A0C;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = ow7.A02;
        }
        String str6 = ow7.A0F;
        String str7 = ow7.A0G;
        ?? obj = new Object();
        obj.A04 = pair4;
        obj.A06 = pair3;
        obj.A07 = pair5;
        obj.A05 = pair6;
        obj.A01 = d3;
        obj.A00 = d2;
        obj.A0A = num3;
        obj.A09 = num4;
        obj.A08 = num5;
        obj.A0B = str2;
        obj.A0E = str3;
        obj.A03 = j;
        obj.A0D = str4;
        obj.A0C = str5;
        obj.A02 = i;
        obj.A0F = str6;
        obj.A0G = str7;
        if (videoBroadcastVideoStreamingConfig != null) {
            obj.A07 = MSY.A0D(Integer.valueOf(videoBroadcastVideoStreamingConfig.width), videoBroadcastVideoStreamingConfig.height);
            obj.A09 = Integer.valueOf(videoBroadcastVideoStreamingConfig.frameRate);
            obj.A01 = videoBroadcastVideoStreamingConfig.bitRate / 1000.0d;
        }
        c05a.Egh(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.OW7, java.lang.Object] */
    public C54817OKs() {
        C008002u A0y = MSZ.A0y();
        this.A00 = A0y;
        this.A02 = AbstractC208910l.A02(A0y);
        ?? obj = new Object();
        obj.A04 = null;
        obj.A06 = null;
        obj.A07 = null;
        obj.A05 = null;
        obj.A01 = -1.0d;
        obj.A00 = -1.0d;
        obj.A0A = null;
        obj.A09 = null;
        obj.A08 = null;
        obj.A0B = null;
        obj.A0E = null;
        obj.A03 = 0L;
        obj.A0D = null;
        obj.A0C = null;
        obj.A02 = -1;
        obj.A0F = null;
        obj.A0G = null;
        C008002u A1H = AbstractC25225BEi.A1H(obj);
        this.A03 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
    }
}
