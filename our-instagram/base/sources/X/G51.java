package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;

/* loaded from: classes6.dex */
public final class G51 implements InterfaceC37161GYy {
    public final FragmentActivity A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C32056E6i A03;
    public final Capabilities A04;

    @Override // X.InterfaceC37161GYy
    public final boolean isEnabled() {
        UserSession userSession = this.A02;
        Capabilities capabilities = this.A04;
        C32056E6i c32056E6i = this.A03;
        return AbstractC160827Iq.A03(userSession, capabilities, c32056E6i.A06, c32056E6i.A01, c32056E6i.A0F, c32056E6i.A0O);
    }

    public G51(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Capabilities capabilities, C7U0 c7u0) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = capabilities;
        this.A01 = interfaceC11380iw;
        this.A03 = C35252Fgl.A00(null, userSession, c7u0);
    }

    @Override // X.InterfaceC37161GYy
    public final C32073E6z BXV() {
        FragmentActivity fragmentActivity = this.A00;
        ThemeViewModelDelegate themeViewModelDelegate = this.A03.A03;
        return new C32073E6z(AbstractC160827Iq.A00(fragmentActivity, themeViewModelDelegate), new ViewOnClickListenerC35666Fp0(this, 29), AbstractC160827Iq.A01(fragmentActivity, themeViewModelDelegate), -1, 2131968883, 2);
    }
}
