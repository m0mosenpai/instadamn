package X;

import java.io.IOException;

/* loaded from: classes11.dex */
public final class WYR implements XC7 {
    public final C4SS A00;
    public final C4BR A01;
    public final C4XU A02;
    public final boolean A03;
    public final C4X8 A04;
    public final /* synthetic */ WYP A05;

    public WYR(C4SS c4ss, C4X8 c4x8, C4BR c4br, WYP wyp, C4XU c4xu, boolean z) {
        this.A05 = wyp;
        this.A02 = c4xu;
        this.A04 = c4x8;
        this.A00 = c4ss;
        this.A03 = z;
        this.A01 = c4br;
    }

    @Override // X.XC7
    public final /* bridge */ /* synthetic */ void DmQ(Object obj) {
        C92124As c92124As = (C92124As) obj;
        WYP wyp = this.A05;
        C123195hu c123195hu = wyp.A03;
        if (c123195hu != null) {
            c123195hu.A01(this.A00.A0K.A0G, c92124As.A0P, c92124As.A02);
        }
        if (this.A03) {
            long A00 = WYP.A00(this.A00, this.A01, wyp);
            AbstractC459729h.A01("HeroExo2LiveInitHelper", "Inline manifest was null, setting live edge latency now to: %d", AbstractC58319PtB.A1Y(A00));
            this.A02.A04 = A00;
        }
        C4XU c4xu = this.A02;
        c4xu.A0C = c92124As;
        if (c4xu.A08 != null) {
            if (c4xu.A0N.A0U) {
                C4XU.A06(c4xu, false);
            } else {
                C4XU.A05(c4xu, false);
            }
        }
        wyp.A0A.DmQ(c92124As);
    }

    @Override // X.XC7
    public final void DmR(IOException iOException) {
        this.A04.A00(iOException);
        this.A05.A0A.DmR(iOException);
    }
}
