package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.5FI, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5FI extends C0T6 implements C5FJ {
    public final Float A00;
    public final Float A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final String A05;
    public final String A06;

    @Override // X.C5FJ
    public final C5FI F5j() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5FI) {
                C5FI c5fi = (C5FI) obj;
                if (!C14360o3.A0K(this.A05, c5fi.A05) || !C14360o3.A0K(this.A00, c5fi.A00) || !C14360o3.A0K(this.A01, c5fi.A01) || !C14360o3.A0K(this.A02, c5fi.A02) || !C14360o3.A0K(this.A06, c5fi.A06) || !C14360o3.A0K(this.A04, c5fi.A04) || !C14360o3.A0K(this.A03, c5fi.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A05;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.A00;
        int hashCode2 = (hashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A01;
        int hashCode3 = (hashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.A02;
        int hashCode4 = (hashCode3 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.A04;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Float f4 = this.A03;
        return hashCode6 + (f4 != null ? f4.hashCode() : 0);
    }

    @Override // X.C5FJ
    public final Float BDW() {
        return this.A00;
    }

    @Override // X.C5FJ
    public final Float Bzu() {
        return this.A01;
    }

    @Override // X.C5FJ
    public final Float Bzw() {
        return this.A02;
    }

    @Override // X.C5FJ
    public final Integer C6j() {
        return this.A04;
    }

    @Override // X.C5FJ
    public final Float CHj() {
        return this.A03;
    }

    @Override // X.C5FJ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdAutoCropCaptionInfoDict", I35.A00(this));
    }

    @Override // X.C5FJ
    public final String getBackgroundColor() {
        return this.A05;
    }

    @Override // X.C5FJ
    public final String getTextColor() {
        return this.A06;
    }

    public C5FI(Float f, Float f2, Float f3, Float f4, Integer num, String str, String str2) {
        this.A05 = str;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A06 = str2;
        this.A04 = num;
        this.A03 = f4;
    }
}
