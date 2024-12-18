package X;

/* loaded from: classes8.dex */
public final class K1F extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C7SY A01;
    public final C129565tL A02;
    public final String A03;

    public K1F(C1585879t c1585879t, C7SY c7sy, C129565tL c129565tL, String str) {
        C14360o3.A0B(c7sy, 2);
        this.A03 = str;
        this.A01 = c7sy;
        this.A02 = c129565tL;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K1F) {
                K1F k1f = (K1F) obj;
                if (!C14360o3.A0K(this.A03, k1f.A03) || !C14360o3.A0K(this.A01, k1f.A01) || !C14360o3.A0K(this.A02, k1f.A02) || !C14360o3.A0K(this.A00, k1f.A00)) {
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
