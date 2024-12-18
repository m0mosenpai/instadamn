package X;

/* renamed from: X.K0j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45229K0j extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final C1585879t A00;
    public final JVH A01;
    public final AnonymousClass781 A02;
    public final String A03;

    public C45229K0j(C1585879t c1585879t, JVH jvh, AnonymousClass781 anonymousClass781, String str) {
        AbstractC167027dH.A0a(1, str, anonymousClass781, jvh, c1585879t);
        this.A03 = str;
        this.A02 = anonymousClass781;
        this.A01 = jvh;
        this.A00 = c1585879t;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45229K0j) {
                C45229K0j c45229K0j = (C45229K0j) obj;
                if (!C14360o3.A0K(this.A03, c45229K0j.A03) || !C14360o3.A0K(this.A02, c45229K0j.A02) || !C14360o3.A0K(this.A01, c45229K0j.A01) || !C14360o3.A0K(this.A00, c45229K0j.A00)) {
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
