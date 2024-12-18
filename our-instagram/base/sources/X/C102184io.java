package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.4io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102184io extends C0T6 implements InterfaceC102194ip {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;

    public C102184io(User user, Boolean bool, Boolean bool2, String str, String str2) {
        C14360o3.A0B(user, 3);
        this.A01 = bool;
        this.A02 = bool2;
        this.A00 = user;
        this.A03 = str;
        this.A04 = str2;
    }

    @Override // X.InterfaceC102194ip
    public final InterfaceC102194ip E9u(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC102194ip
    public final C102184io Ezk(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC102194ip
    public final C102184io Ezl(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102184io) {
                C102184io c102184io = (C102184io) obj;
                if (!C14360o3.A0K(this.A01, c102184io.A01) || !C14360o3.A0K(this.A02, c102184io.A02) || !C14360o3.A0K(this.A00, c102184io.A00) || !C14360o3.A0K(this.A03, c102184io.A03) || !C14360o3.A0K(this.A04, c102184io.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A01;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.A02;
        int hashCode2 = (((hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.A00.hashCode()) * 31;
        String str = this.A03;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // X.InterfaceC102194ip
    public final Boolean BcT() {
        return this.A02;
    }

    @Override // X.InterfaceC102194ip
    public final User BzF() {
        return this.A00;
    }

    @Override // X.InterfaceC102194ip
    public final String BzG() {
        return this.A03;
    }

    @Override // X.InterfaceC102194ip
    public final Boolean Ca9() {
        return this.A01;
    }

    @Override // X.InterfaceC102194ip
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSponsorTag", AbstractC40255HtL.A00(this));
    }

    @Override // X.InterfaceC102194ip
    public final String getUsername() {
        return this.A04;
    }
}
