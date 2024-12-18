package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes11.dex */
public final class UR0 extends C0T6 implements InterfaceC72035XFx {
    public final String A00;
    public final String A01;
    public final List A02;

    @Override // X.InterfaceC72035XFx
    public final UR0 EvP() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR0) {
                UR0 ur0 = (UR0) obj;
                if (!C14360o3.A0K(this.A00, ur0.A00) || !C14360o3.A0K(this.A01, ur0.A01) || !C14360o3.A0K(this.A02, ur0.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72035XFx
    public final String BkT() {
        return this.A00;
    }

    @Override // X.InterfaceC72035XFx
    public final String C9f() {
        return this.A01;
    }

    @Override // X.InterfaceC72035XFx
    public final List C9g() {
        return this.A02;
    }

    @Override // X.InterfaceC72035XFx
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGProfileCardRatingsAndReviewsTopicsInfoDict", VOZ.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        List list = this.A02;
        if (list != null) {
            i = list.hashCode();
        }
        return A0O + i;
    }

    public UR0(String str, String str2, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
    }
}
