package X;

import java.util.Map;

/* renamed from: X.OIe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54767OIe {
    public final OCA A00;
    public final OWf A01;
    public final Map A02;

    public /* synthetic */ C54767OIe(OWf oWf) {
        OCA oca = new OCA(oWf);
        this.A01 = oWf;
        this.A00 = oca;
        this.A02 = AbstractC166987dD.A1I();
    }

    public final void A00(int i) {
        OCA oca = this.A00;
        int i2 = (i / 5) * 5;
        if (i2 != oca.A00) {
            AbstractRunnableC14200nk abstractRunnableC14200nk = oca.A01;
            if (abstractRunnableC14200nk != null) {
                oca.A02.A02(abstractRunnableC14200nk);
            }
            oca.A01 = null;
            NGX ngx = new NGX(oca, i2);
            oca.A01 = ngx;
            oca.A02.A01(ngx, 3000L);
            oca.A00 = i2;
        }
    }
}
