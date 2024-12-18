package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.MrX, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51640MrX extends C0T6 {
    public final int A00;
    public final ImageUrl A01;
    public final C84923qg A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C51640MrX(ImageUrl imageUrl, C84923qg c84923qg, Long l, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(str, 1);
        this.A06 = str;
        this.A01 = imageUrl;
        this.A04 = str2;
        this.A03 = l;
        this.A05 = str3;
        this.A07 = z;
        this.A08 = z2;
        this.A00 = i;
        this.A09 = z3;
        this.A02 = c84923qg;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51640MrX) {
                C51640MrX c51640MrX = (C51640MrX) obj;
                if (!C14360o3.A0K(this.A06, c51640MrX.A06) || !C14360o3.A0K(this.A01, c51640MrX.A01) || !C14360o3.A0K(this.A04, c51640MrX.A04) || !C14360o3.A0K(this.A03, c51640MrX.A03) || !C14360o3.A0K(this.A05, c51640MrX.A05) || this.A07 != c51640MrX.A07 || this.A08 != c51640MrX.A08 || this.A00 != c51640MrX.A00 || this.A09 != c51640MrX.A09 || !C14360o3.A0K(this.A02, c51640MrX.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A09, (AbstractC167007dF.A0D(this.A08, AbstractC167007dF.A0D(this.A07, (((((((AbstractC166987dD.A0J(this.A06) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31)) + this.A00) * 31) + AbstractC166997dE.A0I(this.A02);
    }
}
