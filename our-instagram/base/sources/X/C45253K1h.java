package X;

/* renamed from: X.K1h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45253K1h extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final KT7 A00;
    public final C1585879t A01;
    public final C7SX A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45253K1h) {
                C45253K1h c45253K1h = (C45253K1h) obj;
                if (!C14360o3.A0K(this.A03, c45253K1h.A03) || !C14360o3.A0K(this.A02, c45253K1h.A02) || !C14360o3.A0K(this.A00, c45253K1h.A00) || !C14360o3.A0K(this.A01, c45253K1h.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A00;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A02;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public C45253K1h(KT7 kt7, C1585879t c1585879t, C7SX c7sx, String str) {
        AbstractC25234BEr.A1P(str, c7sx, c1585879t);
        this.A03 = str;
        this.A02 = c7sx;
        this.A00 = kt7;
        this.A01 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}