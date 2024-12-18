package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.G4z, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36424G4z implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C7U0 A03;
    public final Capabilities A04;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        UserSession userSession = this.A02;
        C7U0 c7u0 = this.A03;
        if (AbstractC35172FfP.A03(userSession, C35252Fgl.A00(null, userSession, c7u0), EnumC31337Dq2.A05) && AbstractC159887Fa.A01(userSession, c7u0.C7r().CCa())) {
            return true;
        }
        return false;
    }

    public C36424G4z(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7U0 c7u0) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = c7u0;
        this.A04 = capabilities;
        this.A01 = interfaceC11380iw;
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        return C32073E6z.A00(this, 24, R.drawable.instagram_user_follow_pano_outline_24, 2131968879);
    }
}
