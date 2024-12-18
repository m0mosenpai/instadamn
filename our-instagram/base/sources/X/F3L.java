package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.sponsored.analytics.SourceModelInfoParams;

/* loaded from: classes6.dex */
public abstract class F3L {
    public static final void A00(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MessagingUser messagingUser, String str, String str2, boolean z, boolean z2) {
        if (messagingUser.A00 == AbstractC167007dF.A1R(0, fragmentActivity, userSession)) {
            AbstractC35105Fe7.A00(fragmentActivity, interfaceC11380iw, userSession, messagingUser.A02, "ig_direct");
            return;
        }
        C31368DqX A01 = AbstractC31402Dr6.A01(userSession, messagingUser.A03, str, interfaceC11380iw.getModuleName());
        if (str2 != null && z2 && AbstractC25225BEi.A07(C06090Tz.A05, userSession, 36605800105514329L) == 2) {
            A01.A04 = new SourceModelInfoParams(str2, 0, 0);
            A01.A0Z = z2;
        }
        Fragment A012 = AbstractC31364DqT.A01(userSession, A01);
        if (z) {
            AbstractC31177DnL.A0o(fragmentActivity, A012.mArguments, userSession, "profile");
            return;
        }
        C140966Yy A0N = AbstractC31174DnI.A0N(A012, fragmentActivity, userSession);
        A0N.A0F = true;
        A0N.A07();
    }
}
