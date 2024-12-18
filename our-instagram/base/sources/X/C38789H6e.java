package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.User;

/* renamed from: X.H6e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38789H6e extends C0T6 implements InterfaceC43542JLc {
    public final TextAppMentionType A00;
    public final User A01;

    @Override // X.InterfaceC43542JLc
    public final C38789H6e F2v(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43542JLc
    public final C38789H6e F2w(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38789H6e) {
                C38789H6e c38789H6e = (C38789H6e) obj;
                if (this.A00 != c38789H6e.A00 || !C14360o3.A0K(this.A01, c38789H6e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43542JLc
    public final TextAppMentionType BSO() {
        return this.A00;
    }

    @Override // X.InterfaceC43542JLc
    public final User BSR() {
        return this.A01;
    }

    @Override // X.InterfaceC43542JLc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTextAppMentionTextFragment", AbstractC40392Hvf.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C38789H6e(TextAppMentionType textAppMentionType, User user) {
        this.A00 = textAppMentionType;
        this.A01 = user;
    }

    @Override // X.InterfaceC43542JLc
    public final InterfaceC43542JLc EB2(C1DY c1dy) {
        return this;
    }
}
