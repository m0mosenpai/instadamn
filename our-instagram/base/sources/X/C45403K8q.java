package X;

/* renamed from: X.K8q, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45403K8q extends AbstractC46606Kjj {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45403K8q) {
                C45403K8q c45403K8q = (C45403K8q) obj;
                if (!"gifting failure".equals("gifting failure") || !C14360o3.A0K(this.A02, c45403K8q.A02) || !C14360o3.A0K(this.A06, c45403K8q.A06) || !C14360o3.A0K(this.A01, c45403K8q.A01) || !C14360o3.A0K(this.A07, c45403K8q.A07) || !C14360o3.A0K(this.A04, c45403K8q.A04) || !C14360o3.A0K(this.A05, c45403K8q.A05) || !C14360o3.A0K(this.A03, c45403K8q.A03) || this.A00 != c45403K8q.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public C45403K8q(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        AbstractC25234BEr.A1R(str, str2, str3, str4, str5);
        AbstractC167007dF.A1I(str6, 7, str7);
        this.A02 = str;
        this.A06 = str2;
        this.A01 = str3;
        this.A07 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A03 = str7;
        this.A00 = i;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A02, -890099868))))))) + this.A00;
    }
}
