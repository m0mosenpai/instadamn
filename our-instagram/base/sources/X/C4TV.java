package X;

import android.text.TextUtils;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.4TV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4TV implements C4TW, C4TX, C4TY {
    public static final AtomicInteger A0A = new AtomicInteger(0);
    public C4SS A00;
    public WcE A01;
    public IOException A02;
    public IOException A03;
    public final C95794Sn A05;
    public final C123185ht A06;
    public final C123195hu A07;
    public final HeroPlayerSetting A08;
    public String A04 = "";
    public final boolean A09 = C2C5.A02(C2C1.A0l);

    public final void A01(IOException iOException, String str, String str2) {
        String str3;
        try {
            C95794Sn c95794Sn = this.A05;
            C117275Sm A0L = c95794Sn.A0L(EnumC117265Sl.A0E, C4Y3.A00(iOException, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS));
            c95794Sn.A0v.DEQ(A0L.A01.A00, A0L.A00.name(), A0L.A02, A0L.A03, str, str2, "");
        } catch (Exception e) {
            C95794Sn c95794Sn2 = this.A05;
            if (iOException != null) {
                str3 = iOException.getMessage();
            } else {
                str3 = "null IOException";
            }
            C2QC.A01(c95794Sn2, "onErrorRecoveryAttempt: caught exception, reason=%s, errorMsg=%s, url=%s", e, str2, str3, str);
        }
    }

    @Override // X.C4TW
    public final void DPa(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i) {
    }

    @Override // X.C4TW
    public final void DxV(C98534bW c98534bW, C4WX c4wx, int i) {
    }

    public static C98704bq A00(C4B6 c4b6) {
        if (c4b6 == null) {
            return null;
        }
        String str = c4b6.A0T;
        String str2 = c4b6.A0W;
        int i = c4b6.A0L;
        int i2 = c4b6.A0A;
        int i3 = c4b6.A06;
        int i4 = c4b6.A0G;
        int i5 = c4b6.A05;
        String str3 = c4b6.A0R;
        C4B5 c4b5 = c4b6.A0N;
        return new C98704bq(str, str2, str3, c4b5.A07, c4b5.A05, c4b5.A06, c4b5.A04, c4b5.A08, c4b5.A02, i, i2, i3, i4, i5, c4b5.A01, c4b5.A0H, c4b5.A0I, c4b5.A0E, c4b5.A0D, c4b5.A0C, c4b5.A0B, c4b5.A0A, c4b5.A09);
    }

    @Override // X.C4TW
    public final void DBr(C98534bW c98534bW, C4WX c4wx, int i) {
        String str;
        ArrayList arrayList;
        String str2;
        android.net.Uri uri;
        C4B6 c4b6 = c98534bW.A05;
        C98704bq A00 = A00(c4b6);
        C4SS c4ss = this.A00;
        if (c4ss != null && (uri = c4ss.A0K.A05) != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        C95794Sn c95794Sn = this.A05;
        C2BE AvX = c95794Sn.A19.A07.AvX();
        if (AvX != null) {
            arrayList = AvX.A03();
        } else {
            arrayList = new ArrayList();
        }
        if (c4b6 != null && (str2 = c4b6.A0W) != null && str2.contains("video/")) {
            if (!TextUtils.isEmpty(this.A04) && !this.A04.equals(str2)) {
                c95794Sn.A1H = true;
            }
            this.A04 = str2;
        }
        C95794Sn.A0E(c95794Sn, "onDownstreamFormatChange", new Object[0]);
        C95794Sn.A07(c95794Sn.A0G.obtainMessage(39, c4b6), c95794Sn);
        c95794Sn.A0v.DBp(A00, str, arrayList, c95794Sn.A1H);
    }

    @Override // X.C4TW
    public final void DPe(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, Object obj, Object obj2, int i) {
        WcE wcE;
        if (c98534bW.A00 == 4 && (wcE = this.A01) != null) {
            if (obj instanceof C92124As) {
                C92124As c92124As = (C92124As) obj;
                long[] A03 = AbstractC92114Ar.A03(c92124As);
                WcE wcE2 = this.A01;
                long j = A03[0];
                long j2 = A03[1];
                long j3 = A03[2];
                boolean z = c92124As.A0V;
                boolean z2 = c92124As.A0R;
                boolean z3 = c92124As.A0U;
                boolean z4 = c92124As.A0W;
                C92414Bw c92414Bw = wcE2.A01;
                c92414Bw.A0I = j;
                c92414Bw.A0J = j2;
                c92414Bw.A0K = j3;
                c92414Bw.A0w = z;
                c92414Bw.A0z = z2;
                c92414Bw.A15 = z3;
                c92414Bw.A0x = z4;
                long j4 = wcE2.A00;
                if (c92414Bw.A0X == null) {
                    C92414Bw.A01(c92414Bw, j4, false);
                }
                C92414Bw.A02(c92414Bw, C92414Bw.A00(c92414Bw));
                C123195hu c123195hu = this.A07;
                if (c123195hu != null) {
                    c123195hu.A01(this.A00.A0K.A0G, c92124As.A0P, c92124As.A02);
                    return;
                }
                return;
            }
            C92414Bw c92414Bw2 = wcE.A01;
            long j5 = wcE.A00;
            if (c92414Bw2.A0X == null) {
                C92414Bw.A01(c92414Bw2, j5, false);
            }
            C92414Bw.A02(c92414Bw2, C92414Bw.A00(c92414Bw2));
        }
    }

    @Override // X.C4TW
    public final void DPg(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, IOException iOException, int i, boolean z) {
        if (c98534bW.A00 == 4) {
            this.A03 = iOException;
            WcE wcE = this.A01;
            if (wcE != null) {
                wcE.A01.DvA(iOException);
                return;
            }
            return;
        }
        this.A02 = iOException;
    }

    @Override // X.C4TW
    public final void DPw(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i) {
        WcE wcE;
        if (c98534bW.A00 == 4 && (wcE = this.A01) != null) {
            wcE.A00(c98264b5.A01);
        }
    }

    @Override // X.C4TW
    public final void DPx(C98264b5 c98264b5, C98534bW c98534bW, C4WX c4wx, int i, int i2) {
        WcE wcE;
        if (this.A09 && i2 == 0 && c98534bW.A00 == 4 && (wcE = this.A01) != null) {
            wcE.A00(c98264b5.A01);
        }
    }

    public C4TV(C95794Sn c95794Sn, C123185ht c123185ht, C123195hu c123195hu, HeroPlayerSetting heroPlayerSetting) {
        this.A05 = c95794Sn;
        this.A07 = c123195hu;
        this.A06 = c123185ht;
        this.A08 = heroPlayerSetting;
    }
}
