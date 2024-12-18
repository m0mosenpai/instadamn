package X;

import android.view.Surface;

/* renamed from: X.OrN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55873OrN implements BDp {
    public final /* synthetic */ C174757qB A00;
    public final /* synthetic */ C52154N6e A01;

    public C55873OrN(C174757qB c174757qB, C52154N6e c52154N6e) {
        this.A01 = c52154N6e;
        this.A00 = c174757qB;
    }

    @Override // X.BDp
    public final int BI0() {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            return c54845OMq.A04;
        }
        return 0;
    }

    @Override // X.BDp
    public final int BIB() {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            return c54845OMq.A05;
        }
        return 0;
    }

    @Override // X.BDp
    public final void D73() {
        C54845OMq c54845OMq;
        C52154N6e c52154N6e = this.A01;
        if (AbstractC23021Ah.A00(AbstractC166987dD.A0r(c52154N6e.A0E)).A1r() && (c54845OMq = c52154N6e.A00) != null) {
            c54845OMq.A0B.connect();
        }
    }

    @Override // X.BDp
    public final void DM2(Surface surface) {
        AbstractC55106ObM A00;
        C52154N6e c52154N6e = this.A01;
        C54845OMq c54845OMq = c52154N6e.A00;
        if (c54845OMq != null) {
            c54845OMq.A01();
        }
        C54845OMq c54845OMq2 = c52154N6e.A00;
        if (c54845OMq2 != null) {
            c54845OMq2.A03(surface);
        }
        C54845OMq c54845OMq3 = c52154N6e.A00;
        if (c54845OMq3 != null) {
            c54845OMq3.A0B.EZx(C57541PgF.A01(this.A00, 8));
        }
        if (c54845OMq3 != null) {
            c54845OMq3.A06(C52154N6e.__redex_internal_original_name);
        }
        C54845OMq c54845OMq4 = c52154N6e.A00;
        if (c54845OMq4 != null) {
            c54845OMq4.A06(C1813982r.__redex_internal_original_name);
        }
        C54845OMq c54845OMq5 = c52154N6e.A00;
        if (c54845OMq5 != null) {
            c54845OMq5.A04(new N1O(3, this.A00, c52154N6e), C52154N6e.__redex_internal_original_name);
        }
        C190298bn A01 = C190298bn.A03.A01(AbstractC166987dD.A0r(c52154N6e.A0E));
        if (A01 != null && (A00 = A01.A00()) != null && A00.A0J()) {
            C54845OMq c54845OMq6 = c52154N6e.A00;
            if (c54845OMq6 != null && c54845OMq6.A0B.isStreaming()) {
                C174757qB c174757qB = this.A00;
                EnumC222819sM enumC222819sM = EnumC222819sM.A04;
                if (!C174757qB.A05(enumC222819sM, c174757qB)) {
                    c174757qB.EJk(true);
                    C174757qB.A05(enumC222819sM, c174757qB);
                    return;
                }
                return;
            }
            PJC pjc = c52154N6e.A04;
            if (pjc == null) {
                return;
            }
            pjc.A0X.A0N(true, false);
        }
    }

    @Override // X.BDp
    public final void DeW() {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            c54845OMq.A0B.release();
        }
    }

    @Override // X.BDp
    public final void Drd() {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            c54845OMq.A0B.stop(false);
            c54845OMq.A01 = 0;
            c54845OMq.A03 = 0;
            c54845OMq.A02 = 0;
        }
    }

    @Override // X.BDp
    public final void Dre() {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            c54845OMq.A0B.Emd(c54845OMq.A06);
        }
    }

    @Override // X.BDp
    public final void EbR(Surface surface) {
        C54845OMq c54845OMq = this.A01.A00;
        if (c54845OMq != null) {
            c54845OMq.A03(surface);
        }
    }
}
