package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H2y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38712H2y extends C0T6 implements JM3 {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.JM3
    public final C38712H2y Esc(C1DY c1dy) {
        return this;
    }

    @Override // X.JM3
    public final C38712H2y Esd(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38712H2y) {
                C38712H2y c38712H2y = (C38712H2y) obj;
                if (!C14360o3.A0K(this.A01, c38712H2y.A01) || !C14360o3.A0K(this.A02, c38712H2y.A02) || !C14360o3.A0K(this.A00, c38712H2y.A00) || !C14360o3.A0K(this.A03, c38712H2y.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM3
    public final String AdD() {
        return this.A01;
    }

    @Override // X.JM3
    public final String AdI() {
        return this.A02;
    }

    @Override // X.JM3
    public final User AdJ() {
        return this.A00;
    }

    @Override // X.JM3
    public final String AdL() {
        return this.A03;
    }

    @Override // X.JM3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCopyrightAttributionInfo", AbstractC39856Hm4.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38712H2y(User user, String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = user;
        this.A03 = str3;
    }

    @Override // X.JM3
    public final JM3 E8v(C1DY c1dy) {
        return this;
    }
}
