package X;

import com.facebook.R;

/* renamed from: X.Mri, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51651Mri extends C0T6 {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C5QE A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51651Mri) {
                C51651Mri c51651Mri = (C51651Mri) obj;
                if (this.A08 != c51651Mri.A08 || this.A07 != c51651Mri.A07 || this.A0E != c51651Mri.A0E || this.A0G != c51651Mri.A0G || !C14360o3.A0K(this.A04, c51651Mri.A04) || this.A0A != c51651Mri.A0A || this.A09 != c51651Mri.A09 || this.A0D != c51651Mri.A0D || this.A0F != c51651Mri.A0F || this.A0B != c51651Mri.A0B || this.A0H != c51651Mri.A0H || this.A0C != c51651Mri.A0C || this.A03 != c51651Mri.A03 || this.A02 != c51651Mri.A02 || !C14360o3.A0K(this.A05, c51651Mri.A05) || this.A01 != c51651Mri.A01 || Float.compare(this.A00, c51651Mri.A00) != 0 || !C14360o3.A0K(this.A06, c51651Mri.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A06, AbstractC166997dE.A00((((((((AbstractC167007dF.A0D(this.A0C, AbstractC167007dF.A0D(this.A0H, AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0F, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A09, AbstractC167007dF.A0D(this.A0A, AbstractC166997dE.A0J(this.A04, AbstractC167007dF.A0D(this.A0G, AbstractC167007dF.A0D(this.A0E, AbstractC167007dF.A0D(this.A07, AbstractC25225BEi.A08(this.A08)))))))))))) + this.A03) * 31) + this.A02) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + this.A01) * 31, this.A00));
    }

    public C51651Mri(C5QE c5qe, String str, String str2, float f, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        C14360o3.A0B(str2, 18);
        this.A08 = z;
        this.A07 = z2;
        this.A0E = z3;
        this.A0G = z4;
        this.A04 = c5qe;
        this.A0A = z5;
        this.A09 = z6;
        this.A0D = z7;
        this.A0F = z8;
        this.A0B = z9;
        this.A0H = z10;
        this.A0C = z11;
        this.A03 = R.drawable.iglive_comment_composer_outline;
        this.A02 = i;
        this.A05 = str;
        this.A01 = i2;
        this.A00 = f;
        this.A06 = str2;
    }
}
