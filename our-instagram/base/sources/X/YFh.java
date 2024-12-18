package X;

import com.facebook.proxygen.LigerSamplePolicy;

/* loaded from: classes12.dex */
public final class YFh implements MPN {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C72497XfA A02;
    public final /* synthetic */ YQT A03;
    public final /* synthetic */ C53h A04;

    public YFh(C72497XfA c72497XfA, YQT yqt, C53h c53h) {
        this.A03 = yqt;
        this.A02 = c72497XfA;
        this.A04 = c53h;
    }

    public final double A00() {
        double d;
        long AuM = this.A04.AuM();
        if (Long.valueOf(AuM) != null) {
            d = AuM;
        } else {
            d = 0.0d;
        }
        return d / 1000.0d;
    }

    @Override // X.MPN
    public final void DtA(long j) {
        double d;
        double d2;
        try {
            YQT yqt = this.A03;
            if (yqt != null) {
                C72497XfA c72497XfA = this.A02;
                C72690XlJ c72690XlJ = c72497XfA.A00;
                if (j >= 1000 && !this.A00) {
                    if (c72690XlJ != null) {
                        long currentPositionMs = c72690XlJ.A00.getCurrentPositionMs();
                        if (Long.valueOf(currentPositionMs) != null) {
                            d2 = currentPositionMs;
                        } else {
                            d2 = 0.0d;
                        }
                        yqt.Cja(d2 / 1000.0d, A00());
                    } else {
                        yqt.Cja((-2000.0d) / 1000.0d, A00());
                    }
                    this.A00 = true;
                    return;
                }
                if (j >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT && !this.A01) {
                    if (c72690XlJ != null) {
                        long currentPositionMs2 = c72690XlJ.A00.getCurrentPositionMs();
                        if (Long.valueOf(currentPositionMs2) != null) {
                            d = currentPositionMs2;
                        } else {
                            d = 0.0d;
                        }
                        yqt.Cjb(d / 1000.0d, A00());
                    } else {
                        yqt.Cjb((-2000.0d) / 1000.0d, A00());
                    }
                    this.A01 = true;
                    C43647JSf c43647JSf = c72497XfA.A01;
                    if (c43647JSf != null) {
                        c43647JSf.A00();
                    }
                    c72497XfA.A01 = null;
                    c72497XfA.A00 = null;
                }
            }
        } catch (NullPointerException e) {
            C0w9.A06("PlayerProgressTimer", "Can't log progress due to NPE", e);
        }
    }
}
