package X;

/* renamed from: X.K1v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45267K1v extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C7QY A01;
    public final AnonymousClass781 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45267K1v) {
                C45267K1v c45267K1v = (C45267K1v) obj;
                if (!C14360o3.A0K(this.A03, c45267K1v.A03) || !C14360o3.A0K(this.A02, c45267K1v.A02) || !C14360o3.A0K(this.A01, c45267K1v.A01) || !C14360o3.A0K(this.A00, c45267K1v.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK ArH() {
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC162787Qp ArQ() {
        return this.A00;
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
        return AbstractC166987dD.A0I(this.A00, (AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0M(this.A01)) * 31);
    }

    public C45267K1v(C1585879t c1585879t, C7QY c7qy, AnonymousClass781 anonymousClass781, String str) {
        AbstractC25234BEr.A1P(str, anonymousClass781, c1585879t);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = c7qy;
        this.A00 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TextReplyToLayeredXmaViewModel(id=");
        JQ0.A1V(A1C, this.A03);
        JQ0.A1T(A1C, this.A02);
        JQ0.A1R(A1C, this.A01);
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
