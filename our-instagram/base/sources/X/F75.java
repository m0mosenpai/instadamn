package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class F75 {
    public static final void A00(FragmentActivity fragmentActivity, UserSession userSession, FFZ ffz, C2EC c2ec, MessageIdentifier messageIdentifier, User user, String str, String str2) {
        AbstractC167017dG.A1N(fragmentActivity, userSession);
        F7C.A00(fragmentActivity, null, fragmentActivity, userSession, null, null, null, user, new C35199Ffr(null, null, null, null, str2, "direct_thread", user.B7L().name(), str, "DEFAULT", "DEFAULT", AbstractC166997dE.A0n(), user.BJ8()), new C36758GIg(fragmentActivity, userSession, ffz, c2ec, messageIdentifier), null);
    }
}
