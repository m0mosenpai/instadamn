package X;

/* loaded from: classes8.dex */
public final class KTD extends AbstractC129515tG implements InterfaceC129555tK {
    public final C206409Bx A00;
    public final C7QX A01;
    public final C7QL A02;
    public final AbstractC46448Kh8 A03;
    public final AbstractC46449Kh9 A04;
    public final InterfaceC09390do A05;
    public final InterfaceC38401qU A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTD) {
                KTD ktd = (KTD) obj;
                if (!C14360o3.A0K(this.A00, ktd.A00) || !C14360o3.A0K(this.A06, ktd.A06) || !C14360o3.A0K(this.A03, ktd.A03) || !C14360o3.A0K(this.A04, ktd.A04) || !C14360o3.A0K(this.A02, ktd.A02) || !C14360o3.A0K(this.A01, ktd.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, (AbstractC166997dE.A0J(this.A03, ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + AbstractC166997dE.A0I(this.A04)) * 31));
    }

    public KTD(C206409Bx c206409Bx, InterfaceC38401qU interfaceC38401qU, C7QX c7qx, C7QL c7ql, AbstractC46448Kh8 abstractC46448Kh8, AbstractC46449Kh9 abstractC46449Kh9) {
        super(c7qx);
        this.A00 = c206409Bx;
        this.A06 = interfaceC38401qU;
        this.A03 = abstractC46448Kh8;
        this.A04 = abstractC46449Kh9;
        this.A02 = c7ql;
        this.A01 = c7qx;
        this.A05 = C37059GUt.A01(this, 26);
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
