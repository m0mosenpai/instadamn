package X;

/* loaded from: classes8.dex */
public final class K15 extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C163167Sb A01;
    public final C7SX A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K15) {
                K15 k15 = (K15) obj;
                if (!C14360o3.A0K(this.A03, k15.A03) || !C14360o3.A0K(this.A01, k15.A01) || !C14360o3.A0K(this.A02, k15.A02) || !C14360o3.A0K(this.A00, k15.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A02;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A00;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A01;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, (AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A02)) * 31);
    }

    public K15(C1585879t c1585879t, C163167Sb c163167Sb, C7SX c7sx, String str) {
        AbstractC25234BEr.A1P(str, c163167Sb, c1585879t);
        this.A03 = str;
        this.A01 = c163167Sb;
        this.A02 = c7sx;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
