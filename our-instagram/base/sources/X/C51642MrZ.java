package X;

/* renamed from: X.MrZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51642MrZ extends C0T6 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C51642MrZ(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A04 = str;
        this.A06 = str2;
        this.A00 = i;
        this.A03 = str3;
        this.A05 = str4;
        this.A01 = str5;
        this.A02 = str6;
        this.A09 = z;
        this.A07 = z2;
        this.A0A = z3;
        this.A08 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51642MrZ) {
                C51642MrZ c51642MrZ = (C51642MrZ) obj;
                if (!C14360o3.A0K(this.A04, c51642MrZ.A04) || !C14360o3.A0K(this.A06, c51642MrZ.A06) || this.A00 != c51642MrZ.A00 || !C14360o3.A0K(this.A03, c51642MrZ.A03) || !C14360o3.A0K(this.A05, c51642MrZ.A05) || !C14360o3.A0K(this.A01, c51642MrZ.A01) || !C14360o3.A0K(this.A02, c51642MrZ.A02) || this.A09 != c51642MrZ.A09 || this.A07 != c51642MrZ.A07 || this.A0A != c51642MrZ.A0A || this.A08 != c51642MrZ.A08) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A08, (AbstractC167007dF.A0D(this.A0A, AbstractC167007dF.A0D(this.A07, AbstractC167007dF.A0D(this.A09, (((((((((AbstractC166997dE.A0K(this.A06, AbstractC166987dD.A0J(this.A04)) + this.A00) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02)) * 31))) + AbstractC53644Nnp.A00()) * 31);
    }
}
