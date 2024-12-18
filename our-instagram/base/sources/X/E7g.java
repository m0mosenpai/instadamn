package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgram;

/* loaded from: classes6.dex */
public final class E7g extends C0T6 implements InterfaceC37237Gam {
    public final String A00;
    public final String A01;
    public final String A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final IGCreatorIncentiveProgram A06;
    public final Gb0 A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;

    public E7g(IGCreatorIncentiveProgram iGCreatorIncentiveProgram, Gb0 gb0, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, boolean z, boolean z2) {
        C14360o3.A0B(str, 3);
        AbstractC25234BEr.A0k(4, str2, str3, str4, iGCreatorIncentiveProgram);
        C14360o3.A0B(str5, 8);
        this.A03 = i;
        this.A04 = i2;
        this.A00 = str;
        this.A08 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A06 = iGCreatorIncentiveProgram;
        this.A09 = str5;
        this.A0A = z;
        this.A0B = z2;
        this.A07 = gb0;
        this.A05 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7g) {
                E7g e7g = (E7g) obj;
                if (this.A03 != e7g.A03 || this.A04 != e7g.A04 || !C14360o3.A0K(this.A00, e7g.A00) || !C14360o3.A0K(this.A08, e7g.A08) || !C14360o3.A0K(this.A01, e7g.A01) || !C14360o3.A0K(this.A02, e7g.A02) || this.A06 != e7g.A06 || !C14360o3.A0K(this.A09, e7g.A09) || this.A0A != e7g.A0A || this.A0B != e7g.A0B || !C14360o3.A0K(this.A07, e7g.A07) || this.A05 != e7g.A05) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0K(this.A09, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0K(this.A08, AbstractC166997dE.A0K(this.A00, ((this.A03 * 31) + this.A04) * 31)))))))) + AbstractC167017dG.A0M(this.A07)) * 31) + this.A05;
    }
}
