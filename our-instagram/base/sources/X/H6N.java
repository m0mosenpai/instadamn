package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H6N extends C0T6 implements JK0 {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;

    @Override // X.JK0
    public final H6N F2Z(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H6N) {
                H6N h6n = (H6N) obj;
                if (!C14360o3.A0K(this.A00, h6n.A00) || !C14360o3.A0K(this.A02, h6n.A02) || !C14360o3.A0K(this.A03, h6n.A03) || !C14360o3.A0K(this.A04, h6n.A04) || !C14360o3.A0K(this.A01, h6n.A01) || !C14360o3.A0K(this.A07, h6n.A07) || !C14360o3.A0K(this.A05, h6n.A05) || !C14360o3.A0K(this.A06, h6n.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JK0
    public final List C3x() {
        return this.A07;
    }

    public final int hashCode() {
        return (((((((((((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC25227BEk.A07(this.A06);
    }

    public H6N(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, List list) {
        this.A00 = bool;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = bool2;
        this.A07 = list;
        this.A05 = str4;
        this.A06 = str5;
    }

    @Override // X.JK0
    public final JK0 EAv(C1DY c1dy) {
        return this;
    }
}
