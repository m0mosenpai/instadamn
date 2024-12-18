package X;

import androidx.compose.ui.unit.Constraints;

/* loaded from: classes5.dex */
public final class CUK {
    public static CUK A07;
    public float A00 = Float.NaN;
    public float A01 = Float.NaN;
    public final C118125Vw A02;
    public final C5DD A03;
    public final InterfaceC1128957x A04;
    public final AnonymousClass583 A05;
    public final C118125Vw A06;

    public final long A00(long j, int i) {
        int A02;
        float f = this.A01;
        float f2 = this.A00;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = CNI.A00;
            C118125Vw c118125Vw = this.A06;
            long A05 = C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
            InterfaceC1128957x interfaceC1128957x = this.A04;
            C5DD c5dd = this.A03;
            C16930sl c16930sl = C16930sl.A00;
            f = new C122815hH(new C122585gt(c118125Vw, c5dd, interfaceC1128957x, str, c16930sl, c16930sl), 1, A05, false).BDQ();
            f2 = new C122815hH(new C122585gt(c118125Vw, c5dd, interfaceC1128957x, CNI.A01, c16930sl, c16930sl), 2, C5AU.A05(0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE), false).BDQ() - f;
            this.A01 = f;
            this.A00 = f2;
        }
        if (i != 1) {
            int round = Math.round(f + (f2 * (i - 1)));
            A02 = AbstractC25230BEn.A06(round, round);
            int A00 = Constraints.A00(j);
            if (A02 > A00) {
                A02 = A00;
            }
        } else {
            A02 = Constraints.A02(j);
        }
        return C5AU.A04(Constraints.A03(j), Constraints.A01(j), A02, Constraints.A00(j));
    }

    public CUK(C118125Vw c118125Vw, C5DD c5dd, InterfaceC1128957x interfaceC1128957x, AnonymousClass583 anonymousClass583) {
        this.A05 = anonymousClass583;
        this.A02 = c118125Vw;
        this.A04 = interfaceC1128957x;
        this.A03 = c5dd;
        this.A06 = AbstractC122525gn.A00(c118125Vw, anonymousClass583);
    }
}
