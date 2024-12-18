package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FQS {
    public User A00;
    public Boolean A01;
    public final Fragment A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;
    public final WD9 A05;
    public final C7T3 A06;

    public final void A00(User user) {
        WD9 wd9 = this.A05;
        if (wd9.A02) {
            C0K8.A0E("DirectVideoCallLauncherImpl", "Attempt to create thread and launch video call while launching another.");
            return;
        }
        this.A00 = user;
        this.A01 = false;
        wd9.A02(AbstractC166987dD.A1J(user.getId()));
    }

    public FQS(Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C7T3 c7t3) {
        this.A04 = userSession;
        this.A02 = fragment;
        this.A06 = c7t3;
        this.A03 = interfaceC11380iw;
        this.A05 = new WD9(fragment, userSession, new C36474G6y(this));
    }
}
