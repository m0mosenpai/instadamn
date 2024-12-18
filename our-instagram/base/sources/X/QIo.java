package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class QIo extends C0T6 {
    public C50679MYx A00;
    public Integer A01;
    public String A02;
    public String A03;
    public String A04;
    public final EnumC53199Nfv A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final Map A09;

    public QIo(C50679MYx c50679MYx, EnumC53199Nfv enumC53199Nfv, String str, String str2, String str3, String str4, Map map) {
        AbstractC167017dG.A1P(str, enumC53199Nfv);
        this.A03 = str;
        this.A05 = enumC53199Nfv;
        this.A06 = str2;
        this.A07 = str3;
        this.A09 = map;
        this.A08 = str4;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = c50679MYx;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIo) {
                QIo qIo = (QIo) obj;
                if (!C14360o3.A0K(this.A03, qIo.A03) || this.A05 != qIo.A05 || !C14360o3.A0K(this.A06, qIo.A06) || !C14360o3.A0K(this.A07, qIo.A07) || !C14360o3.A0K(this.A09, qIo.A09) || !C14360o3.A0K(this.A08, qIo.A08) || !C14360o3.A0K(this.A04, qIo.A04) || !C14360o3.A0K(this.A02, qIo.A02) || !C14360o3.A0K(this.A01, qIo.A01) || !C14360o3.A0K(this.A00, qIo.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0J = (AbstractC166997dE.A0J(this.A05, AbstractC166987dD.A0J(this.A03)) + AbstractC167017dG.A0O(this.A06)) * 31;
        int A00 = AbstractC53644Nnp.A00();
        return AbstractC25225BEi.A05((((((((((((((A0J + A00) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + A00) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31, AbstractC167017dG.A0M(this.A01)) + AbstractC166997dE.A0I(this.A00);
    }
}
