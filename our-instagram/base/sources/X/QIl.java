package X;

import java.util.Map;

/* loaded from: classes10.dex */
public final class QIl extends C0T6 {
    public String A00;
    public String A01;
    public Map A02;
    public java.util.Set A03;
    public java.util.Set A04;
    public java.util.Set A05;
    public java.util.Set A06;
    public java.util.Set A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIl) {
                QIl qIl = (QIl) obj;
                if (!C14360o3.A0K(this.A03, qIl.A03) || !C14360o3.A0K(this.A06, qIl.A06) || !C14360o3.A0K(this.A05, qIl.A05) || !C14360o3.A0K(this.A00, qIl.A00) || !C14360o3.A0K(this.A07, qIl.A07) || !C14360o3.A0K(this.A04, qIl.A04) || !C14360o3.A0K(this.A02, qIl.A02) || !C14360o3.A0K(this.A01, qIl.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public QIl() {
        C16910sj c16910sj = C16910sj.A00;
        AbstractC167027dH.A13(c16910sj, c16910sj, c16910sj);
        this.A03 = c16910sj;
        this.A06 = c16910sj;
        this.A05 = c16910sj;
        this.A00 = null;
        this.A07 = null;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A06, AbstractC166987dD.A0G(this.A03))) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }
}
