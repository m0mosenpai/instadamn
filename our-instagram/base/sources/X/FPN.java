package X;

import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public final class FPN {
    public final /* synthetic */ EOE A00;

    public FPN(EOE eoe) {
        this.A00 = eoe;
    }

    public final void A00(UserSession userSession, User user) {
        EOE eoe = this.A00;
        EOE.A01(eoe, user, C05F.A00);
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, user.getId(), "user_list", EOE.A00(user));
        A01.A0C = EOE.A00(user);
        UserDetailLaunchConfig A03 = A01.A03();
        C140966Yy A0P = AbstractC31173DnH.A0P(eoe.requireActivity(), userSession);
        A0P.A0D(AbstractC31364DqT.A02().A02(userSession, A03));
        A0P.A04();
    }
}
