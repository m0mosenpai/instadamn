package X;

import java.util.List;

/* renamed from: X.Jx3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45074Jx3 extends C0T6 {
    public final C50679MYx A00;
    public final C38634Gyb A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final C51749MtY A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45074Jx3) {
                C45074Jx3 c45074Jx3 = (C45074Jx3) obj;
                if (!C14360o3.A0K(this.A09, c45074Jx3.A09) || !C14360o3.A0K(this.A01, c45074Jx3.A01) || this.A06 != c45074Jx3.A06 || this.A0C != c45074Jx3.A0C || this.A07 != c45074Jx3.A07 || !C14360o3.A0K(this.A00, c45074Jx3.A00) || !C14360o3.A0K(this.A05, c45074Jx3.A05) || this.A08 != c45074Jx3.A08 || !C14360o3.A0K(this.A0B, c45074Jx3.A0B) || !C14360o3.A0K(this.A0A, c45074Jx3.A0A) || !C14360o3.A0K(this.A02, c45074Jx3.A02) || !C14360o3.A0K(this.A03, c45074Jx3.A03) || !C14360o3.A0K(this.A04, c45074Jx3.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AbstractC166997dE.A0J(this.A0B, AbstractC167007dF.A0D(this.A08, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A06, ((AbstractC167017dG.A0M(this.A09) * 31) + AbstractC167017dG.A0M(this.A01)) * 31))))))) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A04);
    }

    public C45074Jx3(C51749MtY c51749MtY, C50679MYx c50679MYx, C38634Gyb c38634Gyb, String str, String str2, String str3, String str4, List list, List list2, boolean z, boolean z2, boolean z3, boolean z4) {
        AbstractC167017dG.A1U(c50679MYx, list);
        C14360o3.A0B(list2, 9);
        this.A09 = c51749MtY;
        this.A01 = c38634Gyb;
        this.A06 = z;
        this.A0C = z2;
        this.A07 = z3;
        this.A00 = c50679MYx;
        this.A05 = list;
        this.A08 = z4;
        this.A0B = list2;
        this.A0A = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
    }
}
