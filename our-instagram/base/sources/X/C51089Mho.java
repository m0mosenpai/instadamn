package X;

/* renamed from: X.Mho, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51089Mho extends AbstractC66542zW {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ InterfaceC58162PqR A02;
    public final /* synthetic */ InterfaceC58162PqR A03;
    public final /* synthetic */ AbstractC65412xd A04;

    public C51089Mho(InterfaceC58162PqR interfaceC58162PqR, InterfaceC58162PqR interfaceC58162PqR2, AbstractC65412xd abstractC65412xd, int i, int i2) {
        this.A03 = interfaceC58162PqR;
        this.A02 = interfaceC58162PqR2;
        this.A04 = abstractC65412xd;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // X.AbstractC66542zW
    public final Object A01(int i, int i2) {
        if (this.A03.B8p(i) == this.A02.B8p(i2)) {
            return AbstractC166997dE.A0b();
        }
        return null;
    }

    @Override // X.AbstractC66542zW
    public final int A02() {
        return this.A00;
    }

    @Override // X.AbstractC66542zW
    public final int A03() {
        return this.A01;
    }

    @Override // X.AbstractC66542zW
    public final boolean A04(int i, int i2) {
        Object B8p = this.A03.B8p(i);
        Object B8p2 = this.A02.B8p(i2);
        if (B8p == B8p2) {
            return true;
        }
        return this.A04.areContentsTheSame(B8p, B8p2);
    }

    @Override // X.AbstractC66542zW
    public final boolean A05(int i, int i2) {
        Object B8p = this.A03.B8p(i);
        Object B8p2 = this.A02.B8p(i2);
        if (B8p == B8p2) {
            return true;
        }
        return this.A04.areItemsTheSame(B8p, B8p2);
    }
}
