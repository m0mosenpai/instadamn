package X;

/* loaded from: classes8.dex */
public final class K19 extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final JUe A01;
    public final AnonymousClass781 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K19) {
                K19 k19 = (K19) obj;
                if (!C14360o3.A0K(this.A03, k19.A03) || !C14360o3.A0K(this.A01, k19.A01) || !C14360o3.A0K(this.A02, k19.A02) || !C14360o3.A0K(this.A00, k19.A00)) {
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

    public K19(C1585879t c1585879t, JUe jUe, AnonymousClass781 anonymousClass781, String str) {
        AbstractC25234BEr.A1P(str, jUe, c1585879t);
        this.A03 = str;
        this.A01 = jUe;
        this.A02 = anonymousClass781;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
