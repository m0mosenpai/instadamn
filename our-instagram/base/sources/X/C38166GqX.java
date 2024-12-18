package X;

import com.facebook.R;

/* renamed from: X.GqX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38166GqX extends C0T6 {
    public static final C38165GqW A08 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C56302iJ A04;
    public final C56302iJ A05;
    public final C56302iJ A06;
    public final C56302iJ A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38166GqX) {
                C38166GqX c38166GqX = (C38166GqX) obj;
                if (this.A02 != c38166GqX.A02 || this.A01 != c38166GqX.A01 || this.A00 != c38166GqX.A00 || this.A03 != c38166GqX.A03 || !C14360o3.A0K(this.A04, c38166GqX.A04) || !C14360o3.A0K(this.A05, c38166GqX.A05) || !C14360o3.A0K(this.A07, c38166GqX.A07) || !C14360o3.A0K(this.A06, c38166GqX.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A06, AbstractC166997dE.A0J(this.A07, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0J(this.A04, ((((((this.A02 * 31) + this.A01) * 31) + this.A00) * 31) + this.A03) * 31))));
    }

    public C38166GqX(C56302iJ c56302iJ, C56302iJ c56302iJ2, C56302iJ c56302iJ3, C56302iJ c56302iJ4, int i, int i2, int i3, int i4) {
        AbstractC167017dG.A1T(c56302iJ, c56302iJ2);
        AbstractC167007dF.A1I(c56302iJ3, 7, c56302iJ4);
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A03 = i4;
        this.A04 = c56302iJ;
        this.A05 = c56302iJ2;
        this.A07 = c56302iJ3;
        this.A06 = c56302iJ4;
    }

    public C38166GqX() {
        this(new C56302iJ(-2, -2), new C56302iJ(-2, -2), new C56302iJ(-2, -2), new C56302iJ(-2, -2), 0, 0, R.drawable.instagram_reels_pano_filled_24, R.style.igds_emphasized_title);
    }
}
