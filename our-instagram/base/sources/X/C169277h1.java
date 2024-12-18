package X;

/* renamed from: X.7h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169277h1 extends C0T6 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C169277h1) {
                C169277h1 c169277h1 = (C169277h1) obj;
                if (!C14360o3.A0K(this.A02, c169277h1.A02) || this.A01 != c169277h1.A01 || this.A00 != c169277h1.A00 || !C14360o3.A0K(this.A03, c169277h1.A03) || !C14360o3.A0K(this.A05, c169277h1.A05) || this.A06 != c169277h1.A06 || !C14360o3.A0K(this.A04, c169277h1.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00) * 31) + this.A03.hashCode()) * 31;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        int i3 = 1237;
        if (this.A06) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i4 + i;
    }

    public C169277h1(String str, String str2, String str3, String str4, int i, int i2, boolean z) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str2;
        this.A05 = str3;
        this.A06 = z;
        this.A04 = str4;
    }
}
