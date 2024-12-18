package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3NK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NK extends C0T6 implements C3NM {
    public final Boolean A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final Integer A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;

    @Override // X.C3NM
    public final C3NK Exv() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3NK) {
                C3NK c3nk = (C3NK) obj;
                if (!C14360o3.A0K(this.A03, c3nk.A03) || !C14360o3.A0K(this.A04, c3nk.A04) || !C14360o3.A0K(this.A00, c3nk.A00) || !C14360o3.A0K(this.A01, c3nk.A01) || !C14360o3.A0K(this.A02, c3nk.A02) || !C14360o3.A0K(this.A05, c3nk.A05) || !C14360o3.A0K(this.A06, c3nk.A06) || !C14360o3.A0K(this.A07, c3nk.A07) || !C14360o3.A0K(this.A08, c3nk.A08) || !C14360o3.A0K(this.A09, c3nk.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A03;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Integer num = this.A04;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A02;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.A05;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.A06;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A07;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.A08;
        int hashCode9 = (hashCode8 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.A09;
        return hashCode9 + (num6 != null ? num6.hashCode() : 0);
    }

    @Override // X.C3NM
    public final Float Aeo() {
        return this.A03;
    }

    @Override // X.C3NM
    public final Integer B7I() {
        return this.A04;
    }

    @Override // X.C3NM
    public final Integer BO7() {
        return this.A05;
    }

    @Override // X.C3NM
    public final Integer C10() {
        return this.A06;
    }

    @Override // X.C3NM
    public final Integer CGL() {
        return this.A07;
    }

    @Override // X.C3NM
    public final Integer CGM() {
        return this.A08;
    }

    @Override // X.C3NM
    public final Integer CHC() {
        return this.A09;
    }

    @Override // X.C3NM
    public final Boolean CVp() {
        return this.A00;
    }

    @Override // X.C3NM
    public final Boolean CVr() {
        return this.A01;
    }

    @Override // X.C3NM
    public final Boolean CeH() {
        return this.A02;
    }

    @Override // X.C3NM
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPersonalizationFeatures", AbstractC62244S3p.A00(this));
    }

    public C3NK(Boolean bool, Boolean bool2, Boolean bool3, Float f, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.A03 = f;
        this.A04 = num;
        this.A00 = bool;
        this.A01 = bool2;
        this.A02 = bool3;
        this.A05 = num2;
        this.A06 = num3;
        this.A07 = num4;
        this.A08 = num5;
        this.A09 = num6;
    }
}
