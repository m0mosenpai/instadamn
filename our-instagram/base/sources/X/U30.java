package X;

/* loaded from: classes11.dex */
public final class U30 implements InterfaceC72022XFk {
    public final int A00;
    public final Object A01;

    public U30(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC72022XFk
    public final String E6d() {
        if (this.A00 != 0) {
            return ((AbstractC67878V0j) this.A01).A07().A03();
        }
        AbstractC65919TwQ abstractC65919TwQ = (AbstractC65919TwQ) this.A01;
        C65960TxC c65960TxC = abstractC65919TwQ.A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        return c65960TxC.A02(abstractC65919TwQ.A01);
    }

    @Override // X.InterfaceC72022XFk
    public final String E6e(UQE uqe) {
        if (this.A00 != 0) {
            return E6d();
        }
        C65960TxC c65960TxC = ((AbstractC65919TwQ) this.A01).A07;
        if (c65960TxC == null) {
            C14360o3.A0F("dataSource");
            throw C00O.createAndThrow();
        }
        return c65960TxC.A02(uqe);
    }
}
