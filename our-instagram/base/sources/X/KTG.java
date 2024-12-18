package X;

/* loaded from: classes8.dex */
public final class KTG extends AbstractC129515tG implements InterfaceC129555tK {
    public final C7QL A00;
    public final C7QX A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof KTG) {
                KTG ktg = (KTG) obj;
                if (!C14360o3.A0K(this.A00, ktg.A00) || !C14360o3.A0K(this.A01, ktg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public KTG(C7QX c7qx, C7QL c7ql) {
        super(c7qx);
        this.A00 = c7ql;
        this.A01 = c7qx;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return AbstractC31180DnO.A1X(obj, this);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VotingContentViewModel(themeModel=");
        A1C.append(this.A00);
        A1C.append(", gestureDetectionModel=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
