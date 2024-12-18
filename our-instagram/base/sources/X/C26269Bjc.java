package X;

/* renamed from: X.Bjc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26269Bjc extends C0T6 implements InterfaceC30896Di9 {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final C5Hc A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26269Bjc) {
                C26269Bjc c26269Bjc = (C26269Bjc) obj;
                if (!C14360o3.A0K(this.A02, c26269Bjc.A02) || !C14360o3.A0K(this.A06, c26269Bjc.A06) || !C14360o3.A0K(this.A03, c26269Bjc.A03) || !C14360o3.A0K(this.A05, c26269Bjc.A05) || !C14360o3.A0K(this.A07, c26269Bjc.A07) || !C14360o3.A0K(this.A04, c26269Bjc.A04) || this.A01 != c26269Bjc.A01 || !C14360o3.A0K(this.A08, c26269Bjc.A08) || this.A00 != c26269Bjc.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A08, (AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A07, ((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC25227BEk.A07(this.A05)) * 31)) + this.A01) * 31) + this.A00;
    }

    public C26269Bjc(String str, String str2, String str3, String str4, String str5, String str6, C5Hc c5Hc, int i, int i2) {
        AbstractC167017dG.A1T(str5, str6);
        C14360o3.A0B(c5Hc, 8);
        this.A02 = str;
        this.A06 = str2;
        this.A03 = str3;
        this.A05 = str4;
        this.A07 = str5;
        this.A04 = str6;
        this.A01 = i;
        this.A08 = c5Hc;
        this.A00 = i2;
    }
}
