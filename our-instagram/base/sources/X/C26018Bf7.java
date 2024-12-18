package X;

/* renamed from: X.Bf7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26018Bf7 extends C0T6 {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final long A03;
    public final long A04;
    public final Number A05;
    public final Number A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26018Bf7) {
                C26018Bf7 c26018Bf7 = (C26018Bf7) obj;
                if (!C14360o3.A0K(this.A01, c26018Bf7.A01) || !C14360o3.A0K(this.A07, c26018Bf7.A07) || !C14360o3.A0K(this.A0A, c26018Bf7.A0A) || !C14360o3.A0K(this.A08, c26018Bf7.A08) || !C14360o3.A0K(this.A05, c26018Bf7.A05) || !C14360o3.A0K(this.A06, c26018Bf7.A06) || this.A03 != c26018Bf7.A03 || this.A04 != c26018Bf7.A04 || !C14360o3.A0K(this.A00, c26018Bf7.A00) || !C14360o3.A0K(this.A0B, c26018Bf7.A0B) || !C14360o3.A0K(this.A09, c26018Bf7.A09) || this.A02 != c26018Bf7.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, (((AbstractC166997dE.A0K(this.A00, AbstractC167007dF.A07(this.A04, AbstractC167007dF.A07(this.A03, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, (((AbstractC166997dE.A0K(this.A07, AbstractC166987dD.A0J(this.A01)) + AbstractC167017dG.A0O(this.A0A)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31))))) + AbstractC167017dG.A0O(this.A0B)) * 31) + AbstractC25227BEk.A07(this.A09)) * 31);
    }

    public C26018Bf7(Number number, Number number2, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, long j2, boolean z) {
        AbstractC167017dG.A1P(str, str2);
        AbstractC167017dG.A1T(number, number2);
        C14360o3.A0B(str5, 9);
        this.A01 = str;
        this.A07 = str2;
        this.A0A = str3;
        this.A08 = str4;
        this.A05 = number;
        this.A06 = number2;
        this.A03 = j;
        this.A04 = j2;
        this.A00 = str5;
        this.A0B = str6;
        this.A09 = str7;
        this.A02 = z;
    }
}
