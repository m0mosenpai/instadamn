package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes10.dex */
public final class SX8 {
    public static final Integer A07 = C05F.A01;
    public SKH A00;
    public SJE A01;
    public C108414uS A02;
    public C62675SLn A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public SX8(SKH skh, SJE sje, C108414uS c108414uS, C62675SLn c62675SLn, String str, boolean z, boolean z2) {
        SKH skh2 = skh;
        C108414uS c108414uS2 = c108414uS;
        C62675SLn c62675SLn2 = c62675SLn;
        this.A01 = sje == null ? new SJE(null, A07, 30000L, 100.0f, 0.6666667f, LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT, 120000L, 500L, 10000L) : sje;
        this.A03 = c62675SLn == null ? new C62675SLn(10000L, 30000L) : c62675SLn2;
        this.A02 = c108414uS == null ? C108414uS.A00() : c108414uS2;
        this.A05 = z;
        this.A00 = skh == null ? new SKH(50) : skh2;
        this.A06 = z2;
        this.A04 = str;
    }
}
