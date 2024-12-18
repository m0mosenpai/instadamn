package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H7s, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38824H7s extends C0T6 implements InterfaceC43548JLi {
    public final User A00;
    public final Long A01;
    public final String A02;

    @Override // X.InterfaceC43548JLi
    public final C38824H7s F6q(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38824H7s) {
                C38824H7s c38824H7s = (C38824H7s) obj;
                if (!C14360o3.A0K(this.A02, c38824H7s.A02) || !C14360o3.A0K(this.A01, c38824H7s.A01) || !C14360o3.A0K(this.A00, c38824H7s.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43548JLi
    public final Long C8e() {
        return this.A01;
    }

    @Override // X.InterfaceC43548JLi
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43548JLi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFundraiserDonation", I5D.A00(this));
    }

    @Override // X.InterfaceC43548JLi
    public final String getAmount() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public C38824H7s(User user, Long l, String str) {
        this.A02 = str;
        this.A01 = l;
        this.A00 = user;
    }

    @Override // X.InterfaceC43548JLi
    public final InterfaceC43548JLi EC1(C1DY c1dy) {
        return this;
    }
}
