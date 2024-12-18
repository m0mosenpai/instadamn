package X;

/* renamed from: X.Ec8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32804Ec8 extends AbstractC33539EsD {
    public final C51729Mt8 A00;
    public final C32071E6x A01;
    public final C51740MtP A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32804Ec8) {
                C32804Ec8 c32804Ec8 = (C32804Ec8) obj;
                if (!C14360o3.A0K(this.A02, c32804Ec8.A02) || !C14360o3.A0K(this.A03, c32804Ec8.A03) || !C14360o3.A0K(this.A04, c32804Ec8.A04) || !C14360o3.A0K(this.A05, c32804Ec8.A05) || !C14360o3.A0K(this.A01, c32804Ec8.A01) || this.A06 != c32804Ec8.A06 || !C14360o3.A0K(this.A00, c32804Ec8.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A06, (((AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0G(this.A02))) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C32804Ec8(C51729Mt8 c51729Mt8, C32071E6x c32071E6x, C51740MtP c51740MtP, String str, String str2, String str3, boolean z) {
        this.A02 = c51740MtP;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = c32071E6x;
        this.A06 = z;
        this.A00 = c51729Mt8;
    }
}
