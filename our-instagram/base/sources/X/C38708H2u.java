package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H2u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38708H2u extends C0T6 implements InterfaceC43555JLp {
    public final User A00;
    public final String A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC43555JLp
    public final C38708H2u EsT(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38708H2u) {
                C38708H2u c38708H2u = (C38708H2u) obj;
                if (!C14360o3.A0K(this.A00, c38708H2u.A00) || !C14360o3.A0K(this.A01, c38708H2u.A01) || !C14360o3.A0K(this.A02, c38708H2u.A02) || !C14360o3.A0K(this.A03, c38708H2u.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43555JLp
    public final User BZm() {
        return this.A00;
    }

    @Override // X.InterfaceC43555JLp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCommentStickerData", AbstractC39845Hlt.A00(this));
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalCommentId() {
        return this.A01;
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalCommentText() {
        return this.A02;
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalMediaId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public C38708H2u(User user, String str, String str2, String str3) {
        this.A00 = user;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.InterfaceC43555JLp
    public final InterfaceC43555JLp E8t(C1DY c1dy) {
        return this;
    }
}
