package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.Gdp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37409Gdp extends C0T6 implements C5FU {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    @Override // X.C5FU
    public final C37409Gdp Eqo() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37409Gdp) {
                C37409Gdp c37409Gdp = (C37409Gdp) obj;
                if (!C14360o3.A0K(this.A00, c37409Gdp.A00) || !C14360o3.A0K(this.A01, c37409Gdp.A01) || !C14360o3.A0K(this.A02, c37409Gdp.A02) || !C14360o3.A0K(this.A03, c37409Gdp.A03) || !C14360o3.A0K(this.A04, c37409Gdp.A04) || !C14360o3.A0K(this.A05, c37409Gdp.A05) || !C14360o3.A0K(this.A06, c37409Gdp.A06) || !C14360o3.A0K(this.A07, c37409Gdp.A07) || !C14360o3.A0K(this.A08, c37409Gdp.A08) || !C14360o3.A0K(this.A09, c37409Gdp.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5FU
    public final String Bro() {
        return this.A00;
    }

    @Override // X.C5FU
    public final String Brp() {
        return this.A01;
    }

    @Override // X.C5FU
    public final String Brq() {
        return this.A02;
    }

    @Override // X.C5FU
    public final String Brr() {
        return this.A03;
    }

    @Override // X.C5FU
    public final String Brs() {
        return this.A04;
    }

    @Override // X.C5FU
    public final String Brt() {
        return this.A05;
    }

    @Override // X.C5FU
    public final String Bru() {
        return this.A06;
    }

    @Override // X.C5FU
    public final String Brv() {
        return this.A07;
    }

    @Override // X.C5FU
    public final String CCT() {
        return this.A08;
    }

    @Override // X.C5FU
    public final String CCU() {
        return this.A09;
    }

    @Override // X.C5FU
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAfiStoryDwellIniInfo", AbstractC39741HkD.A00(this));
    }

    public final int hashCode() {
        return (((((((((((((((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC167017dG.A0O(this.A06)) * 31) + AbstractC167017dG.A0O(this.A07)) * 31) + AbstractC167017dG.A0O(this.A08)) * 31) + AbstractC25227BEk.A07(this.A09);
    }

    public C37409Gdp(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A07 = str8;
        this.A08 = str9;
        this.A09 = str10;
    }
}
