package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.FriendshipStatus;
import com.instagram.user.model.FriendshipStatusImpl;
import com.instagram.user.model.ImmutablePandoFriendshipStatus;
import com.instagram.user.model.User;

/* renamed from: X.Ehu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33047Ehu extends C17T implements InterfaceC37275GbS {
    public User A00;

    @Override // X.InterfaceC37275GbS
    public final Integer CBD() {
        return getOptionalIntValueByHashCode(3711);
    }

    @Override // X.InterfaceC37275GbS
    public final FriendshipStatus CGI() {
        return (FriendshipStatus) A05(-558283416, ImmutablePandoFriendshipStatus.class);
    }

    @Override // X.InterfaceC37275GbS
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC34283FAd.A00(this));
    }

    @Override // X.InterfaceC37275GbS
    public final Boolean Bs7() {
        return getOptionalBooleanValueByHashCode(3526267);
    }

    @Override // X.InterfaceC37275GbS
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC37275GbS
    public final Integer CH4() {
        return getOptionalIntValueByHashCode(3625706);
    }

    @Override // X.InterfaceC37275GbS
    public final InterfaceC37275GbS EC5(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC37275GbS
    public final E9W F6w(C1DY c1dy) {
        User user;
        Boolean optionalBooleanValueByHashCode = getOptionalBooleanValueByHashCode(3526267);
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(3711);
        User A0T = AbstractC31179DnN.A0T(c1dy, this);
        FriendshipStatusImpl friendshipStatusImpl = null;
        if (A0T != null) {
            user = (User) c1dy.A00(A0T);
        } else {
            user = null;
        }
        FriendshipStatus CGI = CGI();
        if (CGI != null) {
            friendshipStatusImpl = CGI.F7P();
        }
        return new E9W(friendshipStatusImpl, user, optionalBooleanValueByHashCode, optionalIntValueByHashCode, getOptionalIntValueByHashCode(3625706));
    }
}
