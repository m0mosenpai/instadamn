package X;

/* loaded from: classes8.dex */
public final class K1G extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C7SY A01;
    public final JVI A02;
    public final String A03;

    public K1G(C1585879t c1585879t, C7SY c7sy, JVI jvi, String str) {
        C14360o3.A0B(c7sy, 2);
        this.A03 = str;
        this.A01 = c7sy;
        this.A02 = jvi;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K1G) {
                K1G k1g = (K1G) obj;
                if (!C14360o3.A0K(this.A03, k1g.A03) || !C14360o3.A0K(this.A01, k1g.A01) || !C14360o3.A0K(this.A02, k1g.A02) || !C14360o3.A0K(this.A00, k1g.A00)) {
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

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
