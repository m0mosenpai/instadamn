package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FQ9 {
    public final FOg A00;
    public final G1e A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC08830cm A04;

    public FQ9(InterfaceC11380iw interfaceC11380iw, UserSession userSession, FOg fOg, G1e g1e, InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = interfaceC08830cm;
        this.A02 = interfaceC11380iw;
        this.A01 = g1e;
        this.A00 = fOg;
    }

    public final void A00(User user) {
        F3L.A00((FragmentActivity) AbstractC31172DnG.A0y(this.A04), this.A02, this.A03, MessagingUser.A00(user), "direct_prompt_viewer", null, false, false);
    }
}
