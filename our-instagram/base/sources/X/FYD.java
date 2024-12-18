package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* loaded from: classes6.dex */
public abstract class FYD {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A07(AbstractC31175DnJ.A0g(user));
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), AbstractC111324zv.A00(881));
        AbstractC31171DnF.A1G(A0f, interfaceC11380iw.getModuleName());
        AbstractC31171DnF.A1H(A0f, null);
        AbstractC31171DnF.A1F(A0f, null);
        A0f.Cht();
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str) {
        String str2;
        C14360o3.A0B(userSession, 0);
        FollowStatus B7L = user.B7L();
        if (user.CQf()) {
            str2 = "unblock";
        } else {
            int ordinal = B7L.ordinal();
            if (ordinal != 4 && ordinal != 5) {
                if (ordinal != 3) {
                    str2 = "";
                } else {
                    str2 = "unfollow";
                }
            } else {
                str2 = "follow";
            }
        }
        if (str2.length() > 0) {
            C1571673v.A06(interfaceC11380iw, userSession, C1571673v.A01(user.A0F()), str2, user.getId(), str);
        }
    }
}
