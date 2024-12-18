package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class C0Z extends C17T implements InterfaceC31133DmG {
    public User A00;

    @Override // X.InterfaceC31133DmG
    public final C26126BhC Es3(C1DV c1dv) {
        C14360o3.A0B(c1dv, 0);
        return Es2(new C1DY(c1dv, 6, false));
    }

    @Override // X.InterfaceC31133DmG
    public final InterfaceC31133DmG E8s(C1DY c1dy) {
        User user;
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-309425751, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            user = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
        } else {
            user = null;
        }
        this.A00 = user;
        return this;
    }

    @Override // X.InterfaceC31133DmG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, CDC.A00(this));
    }

    @Override // X.InterfaceC31133DmG
    public final ImageUrl AxF() {
        return A0A(-64851058);
    }

    @Override // X.InterfaceC31133DmG
    public final User BhV() {
        return this.A00;
    }

    @Override // X.InterfaceC31133DmG
    public final C26126BhC Es2(C1DY c1dy) {
        User user;
        String A0i = A0i(-388807511);
        ImageUrl A0A = A0A(-64851058);
        String A0i2 = A0i(-9393932);
        ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) A05(-309425751, ImmutablePandoUserDict.class);
        if (immutablePandoUserDict != null) {
            Parcelable.Creator creator = User.CREATOR;
            User A01 = AbstractC38851rI.A01(c1dy, immutablePandoUserDict);
            if (A01 != null) {
                user = (User) c1dy.A00(A01);
                return new C26126BhC(A0A, user, A0i, A0i2);
            }
        }
        user = null;
        return new C26126BhC(A0A, user, A0i, A0i2);
    }

    @Override // X.InterfaceC31133DmG
    public final String getContentUrl() {
        return A0i(-388807511);
    }

    @Override // X.InterfaceC31133DmG
    public final String getMediaCount() {
        return A0i(-9393932);
    }
}
