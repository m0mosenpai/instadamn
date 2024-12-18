package X;

/* renamed from: X.K1g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45252K1g extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C129565tL A01;
    public final C7SX A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45252K1g) {
                C45252K1g c45252K1g = (C45252K1g) obj;
                if (!C14360o3.A0K(this.A03, c45252K1g.A03) || !C14360o3.A0K(this.A01, c45252K1g.A01) || !C14360o3.A0K(this.A02, c45252K1g.A02) || !C14360o3.A0K(this.A00, c45252K1g.A00)) {
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

    public C45252K1g(C1585879t c1585879t, C129565tL c129565tL, C7SX c7sx, String str) {
        AbstractC25234BEr.A1P(str, c129565tL, c1585879t);
        this.A03 = str;
        this.A01 = c129565tL;
        this.A02 = c7sx;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
