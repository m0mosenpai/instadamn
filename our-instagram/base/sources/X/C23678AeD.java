package X;

import android.os.Handler;

/* renamed from: X.AeD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23678AeD implements InterfaceC25177BCa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C216239hg A01;
    public final /* synthetic */ C187198Rm A02;
    public final /* synthetic */ C198308pf A03;
    public final /* synthetic */ C187318Ry A04;
    public final /* synthetic */ C38321qM A05;

    @Override // X.InterfaceC25177BCa
    public final void DQ0() {
        final C8FC A01;
        C187198Rm c187198Rm = this.A02;
        C22P c22p = c187198Rm.A0N.A0r;
        if (c22p != C22P.A2Y && c22p != C22P.A0Z) {
            A01 = AMV.A04(c187198Rm.A0P);
        } else {
            A01 = AMV.A01();
        }
        final C216239hg c216239hg = this.A01;
        final C198308pf c198308pf = this.A03;
        final C38321qM c38321qM = this.A05;
        final int i = this.A00;
        final C187318Ry c187318Ry = this.A04;
        Runnable runnable = new Runnable() { // from class: X.Azs
            @Override // java.lang.Runnable
            public final void run() {
                final C23678AeD c23678AeD = this;
                C216239hg c216239hg2 = c216239hg;
                C8FC c8fc = A01;
                C198308pf c198308pf2 = c198308pf;
                C38321qM c38321qM2 = c38321qM;
                int i2 = i;
                final C187318Ry c187318Ry2 = c187318Ry;
                C187198Rm c187198Rm2 = c23678AeD.A02;
                C183688Ct c183688Ct = c187198Rm2.A0N;
                c183688Ct.A0i(c216239hg2, c8fc);
                if (c183688Ct.A0r == C22P.A0Z) {
                    C183978Ee A00 = C218079kf.A00(c187198Rm2.A0A, c216239hg2.A01.A01, c187198Rm2.A0P);
                    if (A00 != null) {
                        c198308pf2.A02 = A00;
                    }
                    C187198Rm.A05(c187198Rm2, c38321qM2);
                    if (i2 >= 0) {
                        c187198Rm2.DNp(null, i2);
                        new Handler().postDelayed(new Runnable() { // from class: X.Aus
                            @Override // java.lang.Runnable
                            public final void run() {
                                C23678AeD c23678AeD2 = C23678AeD.this;
                                c23678AeD2.A02.A07(c187318Ry2);
                            }
                        }, 150L);
                    }
                }
                c187198Rm2.A07(c187318Ry2);
            }
        };
        c187198Rm.A06 = runnable;
        if (c187198Rm.A0K.A03) {
            runnable.run();
            c187198Rm.A06 = null;
        }
    }

    @Override // X.InterfaceC25177BCa
    public final void DZL() {
    }

    public C23678AeD(C216239hg c216239hg, C187198Rm c187198Rm, C198308pf c198308pf, C187318Ry c187318Ry, C38321qM c38321qM, int i) {
        this.A02 = c187198Rm;
        this.A01 = c216239hg;
        this.A03 = c198308pf;
        this.A05 = c38321qM;
        this.A00 = i;
        this.A04 = c187318Ry;
    }
}
