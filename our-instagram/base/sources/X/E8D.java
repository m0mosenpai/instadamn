package X;

/* loaded from: classes6.dex */
public final class E8D extends C0T6 implements InterfaceC37253Gb6 {
    public final int A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Boolean A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8D) {
                E8D e8d = (E8D) obj;
                if (!C14360o3.A0K(this.A0A, e8d.A0A) || !C14360o3.A0K(this.A0B, e8d.A0B) || !C14360o3.A0K(this.A03, e8d.A03) || !C14360o3.A0K(this.A04, e8d.A04) || !C14360o3.A0K(this.A01, e8d.A01) || !C14360o3.A0K(this.A02, e8d.A02) || !C14360o3.A0K(this.A08, e8d.A08) || this.A00 != e8d.A00 || !C14360o3.A0K(this.A05, e8d.A05) || !C14360o3.A0K(this.A06, e8d.A06) || !C14360o3.A0K(this.A09, e8d.A09) || !C14360o3.A0K(this.A07, e8d.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public E8D(Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        AbstractC25229BEm.A1L(str6, 10, str7);
        this.A0A = str;
        this.A0B = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A01 = bool;
        this.A02 = bool2;
        this.A08 = bool3;
        this.A00 = i;
        this.A05 = str5;
        this.A06 = str6;
        this.A09 = num;
        this.A07 = str7;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A07, (AbstractC166997dE.A0K(this.A06, ((((((((((((((((AbstractC167017dG.A0O(this.A0A) * 31) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + this.A00) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A09)) * 31);
    }
}
