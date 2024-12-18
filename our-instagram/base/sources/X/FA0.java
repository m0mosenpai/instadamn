package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FA0 {
    public static final void A00(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, MessagingUser messagingUser, long j) {
        String str;
        User A02 = AnonymousClass189.A00(userSession).A02(messagingUser.A03);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        if (A02 != null) {
            str = A02.B8y();
        } else {
            str = "";
        }
        A0I.A05 = AbstractC167007dF.A0f(context, str, 2131969449);
        A0I.A09(2131969448);
        A0I.A0K(new DialogInterfaceOnClickListenerC35349FiQ(context, interfaceC11380iw, userSession, j), 2131969450);
        A0I.A0E(DialogInterfaceOnClickListenerC35430Fjn.A00);
        A0I.A0s(true);
        AbstractC166987dD.A1W(A0I);
    }
}
