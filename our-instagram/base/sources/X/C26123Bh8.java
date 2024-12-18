package X;

import java.util.List;

/* renamed from: X.Bh8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26123Bh8 extends C0T6 implements JJL {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final String A04;
    public final String A05;

    @Override // X.JJL
    public final C26123Bh8 Era(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26123Bh8) {
                C26123Bh8 c26123Bh8 = (C26123Bh8) obj;
                if (!C14360o3.A0K(this.A00, c26123Bh8.A00) || !C14360o3.A0K(this.A04, c26123Bh8.A04) || !C14360o3.A0K(this.A05, c26123Bh8.A05) || !C14360o3.A0K(this.A02, c26123Bh8.A02) || !C14360o3.A0K(this.A03, c26123Bh8.A03) || !C14360o3.A0K(this.A01, c26123Bh8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, (((((AbstractC166997dE.A0K(this.A04, AbstractC166987dD.A0J(this.A00)) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03)) * 31);
    }

    public C26123Bh8(String str, String str2, String str3, String str4, List list, List list2) {
        AbstractC167017dG.A1P(str, str2);
        C14360o3.A0B(str4, 6);
        this.A00 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = list;
        this.A03 = list2;
        this.A01 = str4;
    }

    @Override // X.JJL
    public final JJL E8m(C1DY c1dy) {
        return this;
    }
}
