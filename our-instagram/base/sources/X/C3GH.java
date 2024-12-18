package X;

/* renamed from: X.3GH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3GH {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C3GG A04;
    public boolean A05;
    public int[] A06;
    public int[] A07;
    public final String A08;
    public final /* synthetic */ C26361Pr A09;

    public C3GH(C26361Pr c26361Pr, String str) {
        this.A09 = c26361Pr;
        this.A08 = str;
    }

    public static void A01(C3GG c3gg, C3GH c3gh, long j) {
        int i;
        int[] iArr;
        if (c3gh.A05) {
            long j2 = j - c3gh.A02;
            C3GG c3gg2 = c3gh.A04;
            C3GG c3gg3 = C3GG.LoadingData;
            if (c3gg2 == c3gg3 || c3gg2 == C3GG.FailedToLoad || c3gg2 == C3GG.ContentIsNotAvailable) {
                c3gh.A03 += j2;
            }
            if (c3gg2 == c3gg3) {
                if (c3gg != C3GG.ShowingData) {
                    c3gh.A01++;
                    int i2 = c3gh.A00;
                    if (i2 > 0) {
                        if (i2 <= 10) {
                            iArr = c3gh.A06;
                            i = i2 - 1;
                        } else {
                            int[] iArr2 = c3gh.A06;
                            iArr2[9] = iArr2[9] + 1;
                        }
                    }
                    c3gh.A00 = 0;
                } else {
                    if (j2 > 10) {
                        double d = j2 / 10.0d;
                        i = 0;
                        while (d > 1.0d && i < 12) {
                            d /= 2.0d;
                            i++;
                        }
                    } else {
                        i = 0;
                    }
                    iArr = c3gh.A07;
                }
                iArr[i] = iArr[i] + 1;
                c3gh.A00 = 0;
            }
        }
        c3gh.A02 = j;
    }

    public static void A00(AnonymousClass182 anonymousClass182, C3GH c3gh) {
        anonymousClass182.A0d();
        anonymousClass182.A0S("category", c3gh.A08);
        anonymousClass182.A0R("wait_time_ms", c3gh.A03);
        int i = 0;
        do {
            int[] iArr = c3gh.A07;
            if (iArr[i] != 0) {
                anonymousClass182.A0Q(C26361Pr.A03[i], iArr[i]);
            }
            i++;
        } while (i < 13);
        int i2 = 0;
        do {
            int[] iArr2 = c3gh.A06;
            if (iArr2[i2] != 0) {
                anonymousClass182.A0Q(C26361Pr.A04[i2], iArr2[i2]);
            }
            i2++;
        } while (i2 < 10);
        int i3 = c3gh.A01;
        if (i3 > 0) {
            anonymousClass182.A0Q("not_loaded_count", i3);
        }
        anonymousClass182.A0a();
        c3gh.A03 = 0L;
        c3gh.A01 = 0;
        c3gh.A07 = new int[13];
        c3gh.A06 = new int[10];
    }
}
