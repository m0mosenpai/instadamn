package X;

/* renamed from: X.MrT, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51636MrT extends C0T6 {
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final Integer A09;

    public C51636MrT(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z) {
        AbstractC25229BEm.A1J(str3, 5, str5);
        this.A02 = num;
        this.A09 = num2;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A08 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A07 = str5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51636MrT) {
                C51636MrT c51636MrT = (C51636MrT) obj;
                if (!C14360o3.A0K(this.A02, c51636MrT.A02) || !C14360o3.A0K(this.A09, c51636MrT.A09) || !C14360o3.A0K(this.A03, c51636MrT.A03) || !C14360o3.A0K(this.A04, c51636MrT.A04) || !C14360o3.A0K(this.A05, c51636MrT.A05) || !C14360o3.A0K(this.A06, c51636MrT.A06) || this.A08 != c51636MrT.A08 || this.A00 != c51636MrT.A00 || this.A01 != c51636MrT.A01 || !C14360o3.A0K(this.A07, c51636MrT.A07)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A07, (((AbstractC167007dF.A0D(this.A08, (AbstractC166997dE.A0K(this.A05, ((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A09)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31);
    }
}
