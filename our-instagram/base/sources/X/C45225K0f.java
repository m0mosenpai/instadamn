package X;

/* renamed from: X.K0f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45225K0f extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final JVH A01;
    public final C163167Sb A02;
    public final String A03;

    public C45225K0f(C1585879t c1585879t, JVH jvh, C163167Sb c163167Sb, String str) {
        AbstractC167027dH.A0a(1, str, c163167Sb, jvh, c1585879t);
        this.A03 = str;
        this.A02 = c163167Sb;
        this.A01 = jvh;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45225K0f) {
                C45225K0f c45225K0f = (C45225K0f) obj;
                if (!C14360o3.A0K(this.A03, c45225K0f.A03) || !C14360o3.A0K(this.A02, c45225K0f.A02) || !C14360o3.A0K(this.A01, c45225K0f.A01) || !C14360o3.A0K(this.A00, c45225K0f.A00)) {
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
