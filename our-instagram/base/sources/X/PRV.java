package X;

import android.widget.ImageView;

/* loaded from: classes9.dex */
public final class PRV implements Runnable {
    public final /* synthetic */ NTX A00;
    public final /* synthetic */ boolean A01;

    public PRV(NTX ntx, boolean z) {
        this.A00 = ntx;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnonymousClass693 anonymousClass693;
        NTX ntx = this.A00;
        boolean z = this.A01;
        if (ntx.A03 == null) {
            PCP pcp = ntx.A0G;
            pcp.A09.getValue();
            ntx.A04 = new C50641MXd(ntx.A0A, MSW.A0B(pcp.A0B), ntx.A0B, false);
        }
        C50641MXd c50641MXd = ntx.A04;
        if (c50641MXd != null) {
            C55177Odh.A02(ntx.A0D, false);
            PCP pcp2 = ntx.A0G;
            AbstractC43593JPy.A1W(pcp2.A09, 0);
            MSZ.A1U(pcp2.A0D, 0);
            int A00 = NTX.A00(ntx, ntx.A05.A00);
            ImageView A0C = MSW.A0C(ntx.A0H);
            AnonymousClass693 anonymousClass6932 = (AnonymousClass693) ntx.A0J.getValue();
            C56252Oxz c56252Oxz = new C56252Oxz(ntx, z);
            if (anonymousClass6932 != null) {
                anonymousClass693 = anonymousClass6932;
            } else {
                int i = c50641MXd.A00;
                if (i != 3000) {
                    if (i != 10000) {
                        anonymousClass693 = null;
                    } else {
                        anonymousClass693 = c50641MXd.A0B;
                    }
                } else {
                    anonymousClass693 = c50641MXd.A0C;
                }
            }
            c50641MXd.A04 = anonymousClass6932;
            C50641MXd.A00(A0C, anonymousClass693, c56252Oxz, c50641MXd, C05F.A00, Integer.valueOf(A00), c50641MXd.A00, true, true);
        }
    }
}
