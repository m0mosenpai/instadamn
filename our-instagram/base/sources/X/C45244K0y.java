package X;

/* renamed from: X.K0y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45244K0y extends C0T6 implements InterfaceC66482zP, InterfaceC1584279c {
    public final KT7 A00;
    public final C1585879t A01;
    public final C163167Sb A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45244K0y) {
                C45244K0y c45244K0y = (C45244K0y) obj;
                if (!C14360o3.A0K(this.A03, c45244K0y.A03) || !C14360o3.A0K(this.A02, c45244K0y.A02) || !C14360o3.A0K(this.A00, c45244K0y.A00) || !C14360o3.A0K(this.A01, c45244K0y.A01)) {
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

    public C45244K0y(KT7 kt7, C1585879t c1585879t, C163167Sb c163167Sb, String str) {
        AbstractC25234BEr.A1P(str, c163167Sb, c1585879t);
        this.A03 = str;
        this.A02 = c163167Sb;
        this.A00 = kt7;
        this.A01 = c1585879t;
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
