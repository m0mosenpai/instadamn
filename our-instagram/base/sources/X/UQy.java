package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UQy extends C0T6 implements XG3 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.XG3
    public final UQy EvN() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQy) {
                UQy uQy = (UQy) obj;
                if (!C14360o3.A0K(this.A01, uQy.A01) || !C14360o3.A0K(this.A02, uQy.A02) || !C14360o3.A0K(this.A00, uQy.A00) || !C14360o3.A0K(this.A03, uQy.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.XG3
    public final String AxR() {
        return this.A01;
    }

    @Override // X.XG3
    public final String BkT() {
        return this.A02;
    }

    @Override // X.XG3
    public final Integer BqF() {
        return this.A00;
    }

    @Override // X.XG3
    public final String BqG() {
        return this.A03;
    }

    @Override // X.XG3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsDimensionalInfoDict", VOV.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A03;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UQy(Integer num, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = num;
        this.A03 = str3;
    }
}
