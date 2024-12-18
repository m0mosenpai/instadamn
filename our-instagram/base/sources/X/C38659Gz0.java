package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Gz0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38659Gz0 extends C0T6 {
    public final MUG A00;
    public final CharSequence A01;
    public final CharSequence A02;
    public final CharSequence A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final CharSequence A06;
    public final CharSequence A07;
    public final CharSequence A08;
    public final CharSequence A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final ImageUrl A0E;
    public final String A0F;

    public C38659Gz0(MUG mug, ImageUrl imageUrl, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, CharSequence charSequence6, CharSequence charSequence7, CharSequence charSequence8, CharSequence charSequence9, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        C14360o3.A0B(charSequence, 2);
        this.A0A = z;
        this.A03 = charSequence;
        this.A01 = charSequence2;
        this.A08 = charSequence3;
        this.A05 = charSequence4;
        this.A09 = charSequence5;
        this.A02 = charSequence6;
        this.A04 = charSequence7;
        this.A00 = mug;
        this.A0F = str;
        this.A0E = imageUrl;
        this.A0C = z2;
        this.A0D = z3;
        this.A0B = z4;
        this.A07 = charSequence8;
        this.A06 = charSequence9;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38659Gz0) {
                C38659Gz0 c38659Gz0 = (C38659Gz0) obj;
                if (this.A0A != c38659Gz0.A0A || !C14360o3.A0K(this.A03, c38659Gz0.A03) || !C14360o3.A0K(this.A01, c38659Gz0.A01) || !C14360o3.A0K(this.A08, c38659Gz0.A08) || !C14360o3.A0K(this.A05, c38659Gz0.A05) || !C14360o3.A0K(this.A09, c38659Gz0.A09) || !C14360o3.A0K(this.A02, c38659Gz0.A02) || !C14360o3.A0K(this.A04, c38659Gz0.A04) || !C14360o3.A0K(this.A00, c38659Gz0.A00) || !C14360o3.A0K(this.A0F, c38659Gz0.A0F) || !C14360o3.A0K(this.A0E, c38659Gz0.A0E) || this.A0C != c38659Gz0.A0C || this.A0D != c38659Gz0.A0D || this.A0B != c38659Gz0.A0B || !C14360o3.A0K(this.A07, c38659Gz0.A07) || !C14360o3.A0K(this.A06, c38659Gz0.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A0B, AbstractC167007dF.A0D(this.A0D, AbstractC167007dF.A0D(this.A0C, (AbstractC166997dE.A0K(this.A0F, (((((AbstractC166997dE.A0J(this.A09, (AbstractC166997dE.A0J(this.A08, (AbstractC166997dE.A0J(this.A03, AbstractC25225BEi.A08(this.A0A)) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A05)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC167017dG.A0M(this.A04)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0M(this.A0E)) * 31))) + AbstractC167017dG.A0M(this.A07)) * 31) + AbstractC166997dE.A0I(this.A06);
    }
}
