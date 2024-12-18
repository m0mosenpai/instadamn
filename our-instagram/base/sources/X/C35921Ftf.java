package X;

/* renamed from: X.Ftf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35921Ftf implements XA8 {
    public final int A00;
    public final Object A01;

    public C35921Ftf(ELG elg, int i) {
        this.A00 = i;
        this.A01 = elg;
    }

    @Override // X.XA8
    public final void CuW() {
        int i = this.A00;
        ELG elg = (ELG) this.A01;
        if (i != 0) {
            ELG.A02(elg);
            W65 w65 = elg.A04;
            if (w65 == null) {
                C14360o3.A0F("actionButtonHolder");
                throw C00O.createAndThrow();
            }
            w65.A05(false);
            return;
        }
        ELG.A03(elg);
    }
}
