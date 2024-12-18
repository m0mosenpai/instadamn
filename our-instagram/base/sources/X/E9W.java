package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class E9W extends C0T6 implements InterfaceC37275GbS {
    public final FriendshipStatus A00;
    public final User A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;

    @Override // X.InterfaceC37275GbS
    public final E9W F6w(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9W) {
                E9W e9w = (E9W) obj;
                if (!C14360o3.A0K(this.A02, e9w.A02) || !C14360o3.A0K(this.A03, e9w.A03) || !C14360o3.A0K(this.A01, e9w.A01) || !C14360o3.A0K(this.A00, e9w.A00) || !C14360o3.A0K(this.A04, e9w.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37275GbS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryPollVoter", AbstractC34283FAd.A00(this));
    }

    public final int hashCode() {
        return (((((((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0M(this.A03)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A04);
    }

    public E9W(FriendshipStatus friendshipStatus, User user, Boolean bool, Integer num, Integer num2) {
        this.A02 = bool;
        this.A03 = num;
        this.A01 = user;
        this.A00 = friendshipStatus;
        this.A04 = num2;
    }

    @Override // X.InterfaceC37275GbS
    public final Boolean Bs7() {
        return this.A02;
    }

    @Override // X.InterfaceC37275GbS
    public final Integer CBD() {
        return this.A03;
    }

    @Override // X.InterfaceC37275GbS
    public final User CDj() {
        return this.A01;
    }

    @Override // X.InterfaceC37275GbS
    public final FriendshipStatus CGI() {
        return this.A00;
    }

    @Override // X.InterfaceC37275GbS
    public final Integer CH4() {
        return this.A04;
    }

    @Override // X.InterfaceC37275GbS
    public final InterfaceC37275GbS EC5(C1DY c1dy) {
        return this;
    }
}
