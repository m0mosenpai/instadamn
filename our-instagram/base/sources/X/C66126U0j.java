package X;

/* renamed from: X.U0j, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66126U0j extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final int A05;
    public final int A06;

    public C66126U0j(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 7);
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A05 = i3;
        this.A06 = i4;
        this.A02 = i5;
        this.A04 = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66126U0j) {
                C66126U0j c66126U0j = (C66126U0j) obj;
                if (!C14360o3.A0K(this.A03, c66126U0j.A03) || this.A00 != c66126U0j.A00 || this.A01 != c66126U0j.A01 || this.A05 != c66126U0j.A05 || this.A06 != c66126U0j.A06 || this.A02 != c66126U0j.A02 || !C14360o3.A0K(this.A04, c66126U0j.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((this.A03.hashCode() * 31) + this.A00) * 31) + this.A01) * 31) + this.A05) * 31) + this.A06) * 31) + this.A02) * 31) + this.A04.hashCode();
    }
}
