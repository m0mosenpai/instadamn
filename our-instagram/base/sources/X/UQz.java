package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UQz extends C0T6 implements InterfaceC72030XFs {
    public final String A00;
    public final String A01;

    @Override // X.InterfaceC72030XFs
    public final UQz EvO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQz) {
                UQz uQz = (UQz) obj;
                if (!C14360o3.A0K(this.A00, uQz.A00) || !C14360o3.A0K(this.A01, uQz.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72030XFs
    public final String BkQ() {
        return this.A00;
    }

    @Override // X.InterfaceC72030XFs
    public final String BpD() {
        return this.A01;
    }

    @Override // X.InterfaceC72030XFs
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsRatingOnlyInfoDict", VOX.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = AbstractC167017dG.A0O(this.A00) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UQz(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
