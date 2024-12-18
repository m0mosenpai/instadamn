package X;

/* renamed from: X.Mr5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51612Mr5 extends C0T6 {
    public final double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51612Mr5) {
                C51612Mr5 c51612Mr5 = (C51612Mr5) obj;
                if (!C14360o3.A0K(this.A04, c51612Mr5.A04) || !C14360o3.A0K(this.A03, c51612Mr5.A03) || Double.compare(this.A00, c51612Mr5.A00) != 0 || !C14360o3.A0K(this.A02, c51612Mr5.A02) || !C14360o3.A0K(this.A01, c51612Mr5.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0O(this.A04) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC28006CWd.A00(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public C51612Mr5(String str, String str2, String str3, String str4, double d) {
        this.A04 = str;
        this.A03 = str2;
        this.A00 = d;
        this.A02 = str3;
        this.A01 = str4;
    }
}
