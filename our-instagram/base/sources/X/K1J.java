package X;

/* loaded from: classes8.dex */
public final class K1J extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final KT9 A01;
    public final AnonymousClass781 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K1J) {
                K1J k1j = (K1J) obj;
                if (!C14360o3.A0K(this.A03, k1j.A03) || !C14360o3.A0K(this.A01, k1j.A01) || !C14360o3.A0K(this.A02, k1j.A02) || !C14360o3.A0K(this.A00, k1j.A00)) {
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

    public K1J(C1585879t c1585879t, KT9 kt9, AnonymousClass781 anonymousClass781, String str) {
        AbstractC25234BEr.A1P(str, kt9, c1585879t);
        this.A03 = str;
        this.A01 = kt9;
        this.A02 = anonymousClass781;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
