package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H5f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38765H5f extends C0T6 implements JMA {
    public final C38825H7t A00;
    public final User A01;
    public final String A02;
    public final String A03;

    @Override // X.JMA
    public final C38765H5f F0a(C1DY c1dy) {
        return this;
    }

    @Override // X.JMA
    public final C38765H5f F0b(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38765H5f) {
                C38765H5f c38765H5f = (C38765H5f) obj;
                if (!C14360o3.A0K(this.A02, c38765H5f.A02) || !C14360o3.A0K(this.A01, c38765H5f.A01) || !C14360o3.A0K(this.A00, c38765H5f.A00) || !C14360o3.A0K(this.A03, c38765H5f.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMA
    public final String AbX() {
        return this.A02;
    }

    @Override // X.JMA
    public final User AnB() {
        return this.A01;
    }

    @Override // X.JMA
    public final /* bridge */ /* synthetic */ InterfaceC43549JLj Ayv() {
        return this.A00;
    }

    @Override // X.JMA
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFundraiserDonationsResponse", AbstractC40287Htr.A00(this));
    }

    @Override // X.JMA
    public final String getFundraiserId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38765H5f(C38825H7t c38825H7t, User user, String str, String str2) {
        this.A02 = str;
        this.A01 = user;
        this.A00 = c38825H7t;
        this.A03 = str2;
    }

    @Override // X.JMA
    public final JMA EAD(C1DY c1dy) {
        return this;
    }
}
