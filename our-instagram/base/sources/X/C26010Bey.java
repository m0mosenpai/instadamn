package X;

/* renamed from: X.Bey, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26010Bey extends C0T6 {
    public final EnumC40111tc A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26010Bey) {
                C26010Bey c26010Bey = (C26010Bey) obj;
                if (!C14360o3.A0K(this.A03, c26010Bey.A03) || !C14360o3.A0K(this.A04, c26010Bey.A04) || this.A06 != c26010Bey.A06 || this.A00 != c26010Bey.A00 || this.A07 != c26010Bey.A07 || this.A08 != c26010Bey.A08 || !C14360o3.A0K(this.A01, c26010Bey.A01) || !C14360o3.A0K(this.A02, c26010Bey.A02) || !C14360o3.A0K(this.A05, c26010Bey.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A05, (((AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, AbstractC166997dE.A0J(this.A00, AbstractC167007dF.A0D(this.A06, AbstractC166997dE.A0K(this.A04, AbstractC167017dG.A0O(this.A03) * 31))))) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31);
    }

    public C26010Bey(EnumC40111tc enumC40111tc, Integer num, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.A03 = str;
        this.A04 = str2;
        this.A06 = z;
        this.A00 = enumC40111tc;
        this.A07 = z2;
        this.A08 = z3;
        this.A01 = num;
        this.A02 = str3;
        this.A05 = str4;
    }
}
