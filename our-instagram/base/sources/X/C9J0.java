package X;

/* renamed from: X.9J0, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9J0 extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final C9JS A03;
    public final C5JK A04;
    public final C115525Km A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C9J0(C9JS c9js, C5JK c5jk, C115525Km c115525Km, Long l, String str, String str2, String str3, String str4, String str5, String str6, int i, long j, long j2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A09 = str;
        this.A04 = c5jk;
        this.A02 = j;
        this.A0C = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A0A = str5;
        this.A05 = c115525Km;
        this.A00 = i;
        this.A03 = c9js;
        this.A0E = z;
        this.A01 = j2;
        this.A0B = str6;
        this.A06 = l;
        this.A0G = z2;
        this.A0F = z3;
        if (str4 == null) {
            if (c115525Km != null) {
                str4 = c115525Km.A0E;
            } else {
                str4 = null;
            }
        }
        this.A0D = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9J0) {
                C9J0 c9j0 = (C9J0) obj;
                if (!C14360o3.A0K(this.A09, c9j0.A09) || this.A04 != c9j0.A04 || this.A02 != c9j0.A02 || !C14360o3.A0K(this.A0C, c9j0.A0C) || !C14360o3.A0K(this.A07, c9j0.A07) || !C14360o3.A0K(this.A08, c9j0.A08) || !C14360o3.A0K(this.A0A, c9j0.A0A) || !C14360o3.A0K(this.A05, c9j0.A05) || this.A00 != c9j0.A00 || !C14360o3.A0K(this.A03, c9j0.A03) || this.A0E != c9j0.A0E || this.A01 != c9j0.A01 || !C14360o3.A0K(this.A0B, c9j0.A0B) || !C14360o3.A0K(this.A06, c9j0.A06) || this.A0G != c9j0.A0G || this.A0F != c9j0.A0F) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        C5JK c5jk = this.A04;
        if (c5jk != C5JK.A06 && c5jk != C5JK.A05) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0F, AbstractC167007dF.A0D(this.A0G, (((AbstractC167007dF.A07(this.A01, AbstractC167007dF.A0D(this.A0E, (((((((((((((AbstractC167007dF.A07(this.A02, AbstractC166997dE.A0J(this.A04, AbstractC166987dD.A0J(this.A09))) + AbstractC167017dG.A0O(this.A0C)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + this.A00) * 31) + AbstractC167017dG.A0M(this.A03)) * 31)) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC166997dE.A0I(this.A06)) * 31));
    }
}
