package X;

/* renamed from: X.BkS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26321BkS extends AbstractC51572Yf {
    public final AbstractC50812Vc A00;
    public final AbstractC50812Vc A01;

    @Override // X.AbstractC51572Yf
    public final AbstractC50812Vc A0Y(C76223bS c76223bS) {
        C14360o3.A0B(c76223bS, 0);
        C0eB c0eB = C0eB.A00;
        Object A00 = AbstractC77183d4.A00(c76223bS, C29890DGe.A00(c76223bS, 4), new Object[]{c0eB});
        Object A002 = AbstractC77183d4.A00(c76223bS, new C29895DGj(46, c76223bS, this), new Object[]{c0eB});
        C2XE c2xe = c76223bS.A05;
        Object A06 = c2xe.A06(CWZ.class);
        if (A06 != null) {
            Object A062 = c2xe.A06(CVA.class);
            if (A062 != null) {
                AbstractC77313dH.A00(c76223bS, C29901DGp.A00(A06, A00, A062, A002, 35), new Object[]{c0eB});
                AbstractC50812Vc abstractC50812Vc = this.A00;
                AbstractC77313dH.A00(c76223bS, new C29895DGj(45, A002, this), new Object[]{abstractC50812Vc});
                C2Z0 A0P = AbstractC167007dF.A0P(c2xe);
                AbstractC25227BEk.A1H(AbstractC25232BEp.A11(abstractC50812Vc, A0P.A00), A0P, AbstractC171007jr.A00(C51722Yv.A02, 0.0f));
                A0P.A00(this.A01);
                return new C2WF(null, null, null, A0P.A01, false);
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    public C26321BkS(AbstractC50812Vc abstractC50812Vc, AbstractC50812Vc abstractC50812Vc2) {
        this.A01 = abstractC50812Vc;
        this.A00 = abstractC50812Vc2;
    }
}
