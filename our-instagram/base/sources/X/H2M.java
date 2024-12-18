package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AutoDubStatus;

/* loaded from: classes7.dex */
public final class H2M extends C0T6 implements JK9 {
    public final AutoDubStatus A00;
    public final String A01;

    @Override // X.JK9
    public final H2M Er7() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2M) {
                H2M h2m = (H2M) obj;
                if (!C14360o3.A0K(this.A01, h2m.A01) || this.A00 != h2m.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JK9
    public final String BL7() {
        return this.A01;
    }

    @Override // X.JK9
    public final AutoDubStatus C0G() {
        return this.A00;
    }

    @Override // X.JK9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTAutodubLanguageToStatusMap", AbstractC39761HkX.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A01) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public H2M(AutoDubStatus autoDubStatus, String str) {
        this.A01 = str;
        this.A00 = autoDubStatus;
    }
}
