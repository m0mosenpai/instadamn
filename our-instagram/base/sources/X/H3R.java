package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class H3R extends C0T6 implements C67Z {
    public final User A00;
    public final Integer A01;
    public final List A02;

    public H3R(User user, Integer num, List list) {
        C14360o3.A0B(user, 2);
        this.A02 = list;
        this.A00 = user;
        this.A01 = num;
    }

    @Override // X.C67Z
    public final H3R Etx(C1DY c1dy) {
        return this;
    }

    @Override // X.C67Z
    public final H3R Ety(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3R) {
                H3R h3r = (H3R) obj;
                if (!C14360o3.A0K(this.A02, h3r.A02) || !C14360o3.A0K(this.A00, h3r.A00) || !C14360o3.A0K(this.A01, h3r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C67Z
    public final List B5S() {
        return this.A02;
    }

    @Override // X.C67Z
    public final User BAR() {
        return this.A00;
    }

    @Override // X.C67Z
    public final Integer BY5() {
        return this.A01;
    }

    @Override // X.C67Z
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGroupNoteResponseInfo", AbstractC39946Hnb.A00(this));
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A00, AbstractC167017dG.A0M(this.A02) * 31) + AbstractC166997dE.A0I(this.A01);
    }
}
