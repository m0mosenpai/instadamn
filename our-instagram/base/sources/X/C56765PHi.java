package X;

/* renamed from: X.PHi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56765PHi implements InterfaceC1119153d {
    public C189478aR A00;
    public boolean A01;
    public AbstractC151906sa A02;

    @Override // X.InterfaceC1119153d
    public final void D00() {
    }

    public final void A00(AbstractC151906sa abstractC151906sa) {
        this.A02 = abstractC151906sa;
        C189478aR c189478aR = this.A00;
        if (c189478aR != null) {
            c189478aR.A0L(null);
        } else {
            C14360o3.A0F("bottomSheet");
            throw C00O.createAndThrow();
        }
    }

    @Override // X.InterfaceC1119153d
    public final void Czx() {
        boolean z = this.A01;
        AbstractC151906sa abstractC151906sa = this.A02;
        if (z) {
            if (abstractC151906sa != null) {
                AbstractC151906sa.A00(abstractC151906sa);
                abstractC151906sa.A03();
            }
        } else if (abstractC151906sa != null) {
            AbstractC151906sa.A00(abstractC151906sa);
            abstractC151906sa.A02();
        }
        this.A01 = false;
        this.A02 = null;
    }
}
