package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.VuL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69726VuL {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final int A04;
    public final int A05;
    public final ImmutableList A06;
    public final ImmutableList A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    public C69726VuL(ImmutableList immutableList, ImmutableList immutableList2, String str, String str2, String str3, double d, double d2, double d3, double d4, int i, int i2, boolean z) {
        this.A00 = d;
        this.A01 = d2;
        this.A04 = i;
        AbstractC63311ShH.A04(str, "mapAddress");
        this.A08 = str;
        this.A0B = z;
        this.A02 = d3;
        this.A03 = d4;
        AbstractC63311ShH.A04(immutableList, "pointOfInterestViewModels");
        this.A06 = immutableList;
        this.A05 = i2;
        this.A09 = str2;
        AbstractC63311ShH.A04(immutableList2, "sharerViewModels");
        this.A07 = immutableList2;
        AbstractC63311ShH.A04(str3, "userId");
        this.A0A = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C69726VuL) {
                C69726VuL c69726VuL = (C69726VuL) obj;
                if (this.A00 != c69726VuL.A00 || this.A01 != c69726VuL.A01 || this.A04 != c69726VuL.A04 || !C14360o3.A0K(this.A08, c69726VuL.A08) || this.A0B != c69726VuL.A0B || this.A02 != c69726VuL.A02 || this.A03 != c69726VuL.A03 || !C14360o3.A0K(this.A06, c69726VuL.A06) || this.A05 != c69726VuL.A05 || !C14360o3.A0K(this.A09, c69726VuL.A09) || !C14360o3.A0K(this.A07, c69726VuL.A07) || !C14360o3.A0K(this.A0A, c69726VuL.A0A)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AbstractC63311ShH.A00(this.A03, AbstractC63311ShH.A00(this.A02, AbstractC63311ShH.A01((((AbstractC63311ShH.A00(this.A01, AbstractC63311ShH.A00(this.A00, 1)) * 31) + this.A04) * 31) + AbstractC25235BEs.A06(this.A08), this.A0B))) * 31) + AbstractC25235BEs.A06(this.A06)) * 31) + this.A05) * 31) + AbstractC25235BEs.A06(this.A09)) * 31) + AbstractC25235BEs.A06(this.A07)) * 31) + AbstractC25235BEs.A06(this.A0A);
    }
}
