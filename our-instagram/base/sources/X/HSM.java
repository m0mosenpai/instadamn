package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;
import com.instagram.model.androidlink.ImmutablePandoAndroidLink;

/* loaded from: classes7.dex */
public final class HSM extends C17T implements C47W {
    @Override // X.C47W
    public final AndroidLink Abl() {
        return (AndroidLink) A05(-991895606, ImmutablePandoAndroidLink.class);
    }

    @Override // X.C47W
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, Hs9.A00(this));
    }

    @Override // X.C47W
    public final Integer BrW() {
        return getOptionalIntValueByHashCode(34466708);
    }

    @Override // X.C47W
    public final String BrX() {
        return A0i(1399909611);
    }

    @Override // X.C47W
    public final String BrZ() {
        return A0i(-1200003490);
    }

    @Override // X.C47W
    public final C104014mN Eyi() {
        AndroidLinkImpl androidLinkImpl;
        AndroidLink Abl = Abl();
        if (Abl != null) {
            androidLinkImpl = Abl.F53();
        } else {
            androidLinkImpl = null;
        }
        return new C104014mN(androidLinkImpl, getOptionalIntValueByHashCode(34466708), A0i(1399909611), A0i(-1200003490));
    }
}
