package X;

/* renamed from: X.K0d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45223K0d extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final KT7 A00;
    public final C1585879t A01;
    public final JVH A02;
    public final String A03;

    public C45223K0d(KT7 kt7, C1585879t c1585879t, JVH jvh, String str) {
        AbstractC167027dH.A0a(1, str, kt7, jvh, c1585879t);
        this.A03 = str;
        this.A00 = kt7;
        this.A02 = jvh;
        this.A01 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45223K0d) {
                C45223K0d c45223K0d = (C45223K0d) obj;
                if (!C14360o3.A0K(this.A03, c45223K0d.A03) || !C14360o3.A0K(this.A00, c45223K0d.A00) || !C14360o3.A0K(this.A02, c45223K0d.A02) || !C14360o3.A0K(this.A01, c45223K0d.A01)) {
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
        return this.A01;
    }

    @Override // X.InterfaceC1584279c
    public final /* bridge */ /* synthetic */ InterfaceC129555tK Bn9() {
        return this.A00;
    }

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A03;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0J(this.A03))));
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
