package X;

/* renamed from: X.K8s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45405K8s extends AbstractC46606Kjj {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45405K8s) {
                C45405K8s c45405K8s = (C45405K8s) obj;
                if (!C14360o3.A0K(this.A02, c45405K8s.A02) || !C14360o3.A0K(this.A03, c45405K8s.A03) || !C14360o3.A0K(this.A01, c45405K8s.A01) || this.A0A != c45405K8s.A0A || !C14360o3.A0K(this.A05, c45405K8s.A05) || this.A09 != c45405K8s.A09 || !C14360o3.A0K(this.A04, c45405K8s.A04) || this.A07 != c45405K8s.A07 || !C14360o3.A0K(this.A00, c45405K8s.A00) || this.A08 != c45405K8s.A08 || this.A06 != c45405K8s.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A06, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0K(this.A00, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0K(this.A04, AbstractC167007dF.A0D(this.A09, AbstractC166997dE.A0K(this.A05, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A03, AbstractC166987dD.A0J(this.A02)))))))))));
    }

    public C45405K8s(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A0A = z;
        this.A05 = str4;
        this.A09 = z2;
        this.A04 = str5;
        this.A07 = z3;
        this.A00 = str6;
        this.A08 = z4;
        this.A06 = z5;
    }
}
