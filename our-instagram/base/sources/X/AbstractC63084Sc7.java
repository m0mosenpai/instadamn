package X;

import java.util.ArrayList;

/* renamed from: X.Sc7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63084Sc7 {
    public static final C63136Sdh A00 = C63136Sdh.A01("k", "x", "y");

    public static C63682Srp A00(SQ2 sq2, THX thx) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (thx.A0E() == C05F.A00) {
            thx.A0I();
            while (thx.A0Q()) {
                boolean A1X = AbstractC167007dF.A1X(thx.A0E(), C05F.A0C);
                A1E.add(new C58811QAu(sq2, AbstractC63110SdE.A01(sq2, C63696SsA.A00, thx, AbstractC63359SiH.A00(), A1X, false)));
            }
            thx.A0K();
            AbstractC63085Sc8.A01(A1E);
        } else {
            A1E.add(new C63366SiP(AbstractC63319ShS.A02(thx, AbstractC63359SiH.A00())));
        }
        return new C63682Srp(A1E);
    }

    public static InterfaceC65535Tm7 A01(SQ2 sq2, THX thx) {
        thx.A0J();
        C63682Srp c63682Srp = null;
        C58799QAg c58799QAg = null;
        C58799QAg c58799QAg2 = null;
        boolean z = false;
        while (thx.A0E() != C05F.A0N) {
            int A0D = thx.A0D(A00);
            if (A0D != 0) {
                if (A0D != 1) {
                    if (A0D != 2) {
                        thx.A0M();
                        thx.A0N();
                    } else if (thx.A0E() != C05F.A0j) {
                        c58799QAg2 = AbstractC63310ShG.A01(sq2, thx, true);
                    } else {
                        thx.A0N();
                        z = true;
                    }
                } else if (thx.A0E() != C05F.A0j) {
                    c58799QAg = AbstractC63310ShG.A01(sq2, thx, true);
                } else {
                    thx.A0N();
                    z = true;
                }
            } else {
                c63682Srp = A00(sq2, thx);
            }
        }
        thx.A0L();
        if (z) {
            sq2.A03("Lottie doesn't support expressions.");
        }
        if (c63682Srp == null) {
            return new C63683Srq(c58799QAg, c58799QAg2);
        }
        return c63682Srp;
    }
}
