package X;

/* renamed from: X.Jwt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45064Jwt extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Integer A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public C45064Jwt(Integer num, String str, String str2, int i, int i2, int i3, int i4, int i5, boolean z) {
        C14360o3.A0B(str, 1);
        this.A07 = str;
        this.A06 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A02 = i5;
        this.A08 = z;
        this.A05 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45064Jwt) {
                C45064Jwt c45064Jwt = (C45064Jwt) obj;
                if (!C14360o3.A0K(this.A07, c45064Jwt.A07) || !C14360o3.A0K(this.A06, c45064Jwt.A06) || this.A01 != c45064Jwt.A01 || this.A00 != c45064Jwt.A00 || this.A04 != c45064Jwt.A04 || this.A03 != c45064Jwt.A03 || this.A02 != c45064Jwt.A02 || this.A08 != c45064Jwt.A08 || !C14360o3.A0K(this.A05, c45064Jwt.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A08, (((AbstractC25225BEi.A05((((AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A07)) + this.A01) * 31) + this.A00) * 31, this.A04) + this.A03) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A05);
    }
}
