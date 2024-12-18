package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class GLK implements Runnable {
    public final /* synthetic */ ENB A00;

    public GLK(ENB enb) {
        this.A00 = enb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ENB enb = this.A00;
        E70 e70 = enb.A03;
        if (e70 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            A1E.add(enb.A08.getValue());
            GRK grk = GRK.A00;
            ArrayList A1E2 = AbstractC166987dD.A1E();
            C32107E9f A07 = e70.A07();
            if (A07 != null && !A07.A0D) {
                A1E2.add(A07);
            }
            List<C32107E9f> A0n = AbstractC31171DnF.A0n(e70.A0a);
            AbstractC001800i.A0g(A0n, grk);
            ArrayList A0q = AbstractC167017dG.A0q(A0n);
            for (C32107E9f c32107E9f : A0n) {
                A0q.add(Boolean.valueOf(A1E2.add(new C32107E9f(c32107E9f.A00, c32107E9f.A01, c32107E9f.A07, c32107E9f.A08, c32107E9f.A0A, c32107E9f.A04, c32107E9f.A09, c32107E9f.A0D, c32107E9f.A0C, c32107E9f.A0B, c32107E9f.A05, false, false, c32107E9f.A06))));
            }
            A1E.addAll(A1E2);
            EQN eqn = enb.A02;
            if (eqn != null) {
                eqn.A00(A1E);
            }
        }
    }
}
