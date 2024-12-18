package X;

import com.instagram.api.schemas.GraphGuardianContent;

/* renamed from: X.Bfa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26047Bfa extends C0T6 {
    public final int A00;
    public final C38688GzT A01;
    public final GraphGuardianContent A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final C5Hc A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26047Bfa) {
                C26047Bfa c26047Bfa = (C26047Bfa) obj;
                if (this.A0A != c26047Bfa.A0A || this.A09 != c26047Bfa.A09 || !C14360o3.A0K(this.A01, c26047Bfa.A01) || !C14360o3.A0K(this.A08, c26047Bfa.A08) || this.A00 != c26047Bfa.A00 || this.A0B != c26047Bfa.A0B || !C14360o3.A0K(this.A07, c26047Bfa.A07) || !C14360o3.A0K(this.A03, c26047Bfa.A03) || !C14360o3.A0K(this.A06, c26047Bfa.A06) || !C14360o3.A0K(this.A04, c26047Bfa.A04) || !C14360o3.A0K(this.A02, c26047Bfa.A02) || !C14360o3.A0K(this.A05, c26047Bfa.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((AbstractC166997dE.A0K(this.A07, AbstractC167007dF.A0D(this.A0B, (((((AbstractC167007dF.A0D(this.A09, AbstractC25225BEi.A08(this.A0A)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A08)) * 31) + this.A00) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A05);
    }

    public C26047Bfa(C38688GzT c38688GzT, GraphGuardianContent graphGuardianContent, Integer num, Integer num2, Integer num3, String str, String str2, C5Hc c5Hc, int i, boolean z, boolean z2, boolean z3) {
        this.A0A = z;
        this.A09 = z2;
        this.A01 = c38688GzT;
        this.A08 = c5Hc;
        this.A00 = i;
        this.A0B = z3;
        this.A07 = str;
        this.A03 = num;
        this.A06 = str2;
        this.A04 = num2;
        this.A02 = graphGuardianContent;
        this.A05 = num3;
    }

    public C26047Bfa() {
        this(null, null, null, null, null, "", null, null, 0, true, false, false);
    }
}
