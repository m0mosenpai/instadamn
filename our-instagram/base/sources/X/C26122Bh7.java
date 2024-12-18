package X;

/* renamed from: X.Bh7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26122Bh7 extends C0T6 implements InterfaceC31104Dlm {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.InterfaceC31104Dlm
    public final C26122Bh7 Eqy() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26122Bh7) {
                C26122Bh7 c26122Bh7 = (C26122Bh7) obj;
                if (!C14360o3.A0K(this.A01, c26122Bh7.A01) || !C14360o3.A0K(this.A02, c26122Bh7.A02) || !C14360o3.A0K(this.A03, c26122Bh7.A03) || !C14360o3.A0K(this.A04, c26122Bh7.A04) || !C14360o3.A0K(this.A05, c26122Bh7.A05) || !C14360o3.A0K(this.A06, c26122Bh7.A06) || !C14360o3.A0K(this.A07, c26122Bh7.A07) || !C14360o3.A0K(this.A00, c26122Bh7.A00) || !C14360o3.A0K(this.A08, c26122Bh7.A08) || !C14360o3.A0K(this.A09, c26122Bh7.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public C26122Bh7(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A07 = str7;
        this.A00 = l;
        this.A08 = str8;
        this.A09 = str9;
    }
}
