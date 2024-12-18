package X;

/* renamed from: X.K0l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45231K0l extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final C7QY A01;
    public final KT5 A02;
    public final String A03;

    public C45231K0l(C1585879t c1585879t, C7QY c7qy, KT5 kt5, String str) {
        AbstractC167027dH.A0a(1, str, kt5, c7qy, c1585879t);
        this.A03 = str;
        this.A02 = kt5;
        this.A01 = c7qy;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45231K0l) {
                C45231K0l c45231K0l = (C45231K0l) obj;
                if (!C14360o3.A0K(this.A03, c45231K0l.A03) || !C14360o3.A0K(this.A02, c45231K0l.A02) || !C14360o3.A0K(this.A01, c45231K0l.A01) || !C14360o3.A0K(this.A00, c45231K0l.A00)) {
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
        return AbstractC166987dD.A0I(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0J(this.A03))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
