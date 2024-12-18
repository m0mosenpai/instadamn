package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.40H, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40H extends C0T6 implements C40I {
    public final Boolean A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    @Override // X.C40I
    public final C40H F5p() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40H) {
                C40H c40h = (C40H) obj;
                if (!C14360o3.A0K(this.A01, c40h.A01) || !C14360o3.A0K(this.A05, c40h.A05) || !C14360o3.A0K(this.A06, c40h.A06) || !C14360o3.A0K(this.A07, c40h.A07) || !C14360o3.A0K(this.A02, c40h.A02) || !C14360o3.A0K(this.A00, c40h.A00) || !C14360o3.A0K(this.A08, c40h.A08) || !C14360o3.A0K(this.A09, c40h.A09) || !C14360o3.A0K(this.A0A, c40h.A0A) || !C14360o3.A0K(this.A03, c40h.A03) || !C14360o3.A0K(this.A04, c40h.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A01;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.A05;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A06;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A07;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.A02;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.A08;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A09;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0A;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.A03;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A04;
        return hashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    @Override // X.C40I
    public final Integer B21() {
        return this.A01;
    }

    @Override // X.C40I
    public final Long B7T() {
        return this.A05;
    }

    @Override // X.C40I
    public final String BEu() {
        return this.A06;
    }

    @Override // X.C40I
    public final String BEy() {
        return this.A07;
    }

    @Override // X.C40I
    public final Integer BGX() {
        return this.A02;
    }

    @Override // X.C40I
    public final String BKK() {
        return this.A08;
    }

    @Override // X.C40I
    public final String BgL() {
        return this.A09;
    }

    @Override // X.C40I
    public final Integer C4Y() {
        return this.A03;
    }

    @Override // X.C40I
    public final Integer C4Z() {
        return this.A04;
    }

    @Override // X.C40I
    public final Boolean CbA() {
        return this.A00;
    }

    @Override // X.C40I
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryEndSceneDict", I3C.A00(this));
    }

    @Override // X.C40I
    public final String getSubtitle() {
        return this.A0A;
    }

    public C40H(Boolean bool, Integer num, Integer num2, Integer num3, Integer num4, Long l, String str, String str2, String str3, String str4, String str5) {
        this.A01 = num;
        this.A05 = l;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = num2;
        this.A00 = bool;
        this.A08 = str3;
        this.A09 = str4;
        this.A0A = str5;
        this.A03 = num3;
        this.A04 = num4;
    }
}
