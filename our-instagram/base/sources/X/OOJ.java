package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public abstract class OOJ {
    public static final void A00(UserSession userSession, C84923qg c84923qg, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "igwb_manually_hidden_comments_action_falco_event");
        AbstractC31171DnF.A1C(A0f, "ig_wellbeing_hidden_comments_adoption");
        AbstractC31171DnF.A1A(A0f, str);
        A0f.A9K("thread_fbid", null);
        if (c84923qg != null) {
            String str2 = c84923qg.A0E;
            if (str2 != null) {
                MSW.A1S(A0f, str2);
            }
            String str3 = c84923qg.A0G;
            if (str3 != null) {
                A0f.A9K("comment_id", AbstractC166997dE.A0j(str3));
            }
            String str4 = c84923qg.A0F;
            if (str4 != null) {
                A0f.A9K("parent_comment_id", AbstractC166997dE.A0j(str4));
            }
            User user = c84923qg.A08;
            if (user != null) {
                AbstractC31178DnM.A18(A0f, user.getId());
            }
        }
        A0f.Cht();
    }

    public static final void A01(UserSession userSession, C84923qg c84923qg, String str) {
        C14360o3.A0B(userSession, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(userSession), "igwb_manually_hidden_comments_action_falco_event");
        AbstractC31171DnF.A1C(A0f, "ig_wellbeing_hidden_comments_impression");
        AbstractC31171DnF.A1A(A0f, str);
        A0f.A9K("thread_fbid", null);
        if (c84923qg != null) {
            String str2 = c84923qg.A0E;
            if (str2 != null) {
                MSW.A1S(A0f, str2);
            }
            String str3 = c84923qg.A0G;
            if (str3 != null) {
                A0f.A9K("comment_id", AbstractC166997dE.A0j(str3));
            }
            String str4 = c84923qg.A0F;
            if (str4 != null) {
                A0f.A9K("parent_comment_id", AbstractC166997dE.A0j(str4));
            }
            User user = c84923qg.A08;
            if (user != null) {
                AbstractC31178DnM.A18(A0f, user.getId());
            }
        }
        A0f.Cht();
    }
}
