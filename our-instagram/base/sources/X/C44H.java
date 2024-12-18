package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.44H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C44H extends C0T6 implements C44I {
    public final C44G A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    @Override // X.C44I
    public final C44H F55() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44H) {
                C44H c44h = (C44H) obj;
                if (!C14360o3.A0K(this.A01, c44h.A01) || !C14360o3.A0K(this.A03, c44h.A03) || !C14360o3.A0K(this.A00, c44h.A00) || !C14360o3.A0K(this.A04, c44h.A04) || !C14360o3.A0K(this.A05, c44h.A05) || !C14360o3.A0K(this.A02, c44h.A02) || !C14360o3.A0K(this.A06, c44h.A06) || !C14360o3.A0K(this.A07, c44h.A07) || !C14360o3.A0K(this.A08, c44h.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        C44G c44g = this.A00;
        int hashCode3 = (hashCode2 + (c44g == null ? 0 : c44g.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A08;
        return hashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    @Override // X.C44I
    public final Boolean AlC() {
        return this.A01;
    }

    @Override // X.C44I
    public final C44G Ayr() {
        return this.A00;
    }

    @Override // X.C44I
    public final String Ayt() {
        return this.A04;
    }

    @Override // X.C44I
    public final String Ayu() {
        return this.A05;
    }

    @Override // X.C44I
    public final Boolean BCy() {
        return this.A02;
    }

    @Override // X.C44I
    public final String BgZ() {
        return this.A06;
    }

    @Override // X.C44I
    public final String Bhk() {
        return this.A07;
    }

    @Override // X.C44I
    public final String CIf() {
        return this.A08;
    }

    @Override // X.C44I
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTConsumptionSheetConfig", AbstractC65930Twb.A00(this));
    }

    @Override // X.C44I
    public final String getCurrency() {
        return this.A03;
    }

    public C44H(C44G c44g, Boolean bool, Boolean bool2, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A01 = bool;
        this.A03 = str;
        this.A00 = c44g;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool2;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = str6;
    }
}
