package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mrf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51648Mrf extends C0T6 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C5QE A03;
    public final ImageUrl A04;
    public final ImageUrl A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final C3PO A0F;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51648Mrf) {
                C51648Mrf c51648Mrf = (C51648Mrf) obj;
                if (this.A0E != c51648Mrf.A0E || !C14360o3.A0K(this.A04, c51648Mrf.A04) || this.A0A != c51648Mrf.A0A || !C14360o3.A0K(this.A08, c51648Mrf.A08) || !C14360o3.A0K(this.A03, c51648Mrf.A03) || this.A09 != c51648Mrf.A09 || !C14360o3.A0K(this.A06, c51648Mrf.A06) || this.A00 != c51648Mrf.A00 || this.A01 != c51648Mrf.A01 || this.A0F != c51648Mrf.A0F || this.A02 != c51648Mrf.A02 || !C14360o3.A0K(this.A05, c51648Mrf.A05) || this.A0D != c51648Mrf.A0D || !C14360o3.A0K(this.A07, c51648Mrf.A07) || this.A0B != c51648Mrf.A0B || this.A0C != c51648Mrf.A0C) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A0C, AbstractC167007dF.A0D(this.A0B, (AbstractC167007dF.A0D(this.A0D, (((AbstractC166997dE.A0J(this.A0F, (((((AbstractC167007dF.A0D(this.A09, (AbstractC166997dE.A0K(this.A08, AbstractC167007dF.A0D(this.A0A, (AbstractC25225BEi.A08(this.A0E) + AbstractC167017dG.A0M(this.A04)) * 31)) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A06)) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC166997dE.A0I(this.A07)) * 31));
    }

    public C51648Mrf(C5QE c5qe, ImageUrl imageUrl, ImageUrl imageUrl2, C3PO c3po, Integer num, Integer num2, String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0E = z;
        this.A04 = imageUrl;
        this.A0A = z2;
        this.A08 = str;
        this.A03 = c5qe;
        this.A09 = z3;
        this.A06 = num;
        this.A00 = i;
        this.A01 = i2;
        this.A0F = c3po;
        this.A02 = i3;
        this.A05 = imageUrl2;
        this.A0D = z4;
        this.A07 = num2;
        this.A0B = z5;
        this.A0C = z6;
    }
}
