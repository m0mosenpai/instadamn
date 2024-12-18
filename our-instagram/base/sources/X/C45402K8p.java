package X;

/* renamed from: X.K8p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45402K8p extends AbstractC46606Kjj {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C45402K8p(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        AbstractC25234BEr.A0j(2, str, str2, str3, str4);
        C14360o3.A0B(str5, 7);
        this.A07 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A02 = str5;
        this.A01 = str6;
        this.A03 = str7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45402K8p) {
                C45402K8p c45402K8p = (C45402K8p) obj;
                if (!"funding failure".equals("funding failure") || !C14360o3.A0K(this.A07, c45402K8p.A07) || !C14360o3.A0K(this.A04, c45402K8p.A04) || !C14360o3.A0K(this.A06, c45402K8p.A06) || !C14360o3.A0K(this.A05, c45402K8p.A05) || this.A00 != c45402K8p.A00 || !C14360o3.A0K(this.A02, c45402K8p.A02) || !C14360o3.A0K(this.A01, c45402K8p.A01) || !C14360o3.A0K(this.A03, c45402K8p.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A02, (AbstractC166997dE.A0K(this.A05, AbstractC166997dE.A0K(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, 1181165945)))) + this.A00) * 31)));
    }
}
