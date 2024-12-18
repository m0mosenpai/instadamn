package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.ObY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55114ObY {
    public static final void A02(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, User user, boolean z) {
        HashMap A0e;
        InterfaceC02590Ai A0f;
        String str;
        AbstractC167017dG.A1R(userSession, user);
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        C18920wW A01 = AbstractC12220kQ.A01(abstractC59962oe, userSession);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        if (!AbstractC43594JPz.A1Z(A0Y, user) && A0Y.A0M() == C05F.A0C && !user.A27()) {
            A03(fragmentActivity, abstractC59962oe, userSession, z);
        } else {
            if (user.CQf()) {
                C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
                A0H.A0A(2131975194);
                AbstractC31177DnL.A0v(fragmentActivity, A0H, user.getUsername(), 2131975192);
                A0H.A07();
                A0H.A0H(new DialogInterfaceOnClickListenerC35455FkC(69, fragmentActivity, userSession), 2131973586);
                AbstractC166987dD.A1W(A0H);
                String str2 = userSession.userId;
                A0e = AbstractC31179DnN.A0e();
                A0f = AbstractC166987dD.A0f(A01, "ig_wellbeing_tag_controls_action");
                A0f.A9K("actor_ig_userid", AbstractC25228BEl.A13(str2));
                AbstractC31171DnF.A1C(A0f, "impression");
                str = "cant_tag_alert_blocked";
            } else {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                if (interfaceC19630xq.getInt("cannot_tag_error_nux_shown_count", 0) < 1) {
                    C193328hC A0H2 = AbstractC31171DnF.A0H(fragmentActivity);
                    A0H2.A0A(2131975194);
                    AbstractC31177DnL.A0v(fragmentActivity, A0H2, user.getUsername(), 2131975193);
                    A0H2.A07();
                    A0H2.A0H(new DialogInterfaceOnClickListenerC35450Fk7(30, fragmentActivity, userSession, A01), 2131973587);
                    AbstractC166987dD.A1W(A0H2);
                    AbstractC50522MSa.A1T(interfaceC19630xq, "cannot_tag_error_nux_shown_count", 0);
                    String str3 = userSession.userId;
                    A0e = AbstractC31179DnN.A0e();
                    A0f = AbstractC166987dD.A0f(A01, "ig_wellbeing_tag_controls_action");
                    A0f.A9K("actor_ig_userid", AbstractC25228BEl.A13(str3));
                    AbstractC31171DnF.A1C(A0f, "impression");
                    str = "cant_tag_alert_nux";
                } else {
                    C193328hC A0H3 = AbstractC31171DnF.A0H(fragmentActivity);
                    A0H3.A05 = AbstractC31178DnM.A0c(fragmentActivity, user, 2131975196);
                    AbstractC31176DnK.A1W(A0H3);
                }
            }
            AbstractC50523MSb.A12(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, A0e);
        }
        String str4 = userSession.userId;
        A0e = AbstractC31179DnN.A0e();
        A0f = AbstractC166987dD.A0f(A01, "ig_wellbeing_tag_controls_action");
        A0f.A9K("actor_ig_userid", AbstractC25228BEl.A13(str4));
        AbstractC31171DnF.A1C(A0f, "impression");
        str = "cant_tag_alert";
        AbstractC50523MSb.A12(A0f, OptSvcAnalyticsStore.LOGGING_KEY_STEP, str, A0e);
    }

    public static final void A03(FragmentActivity fragmentActivity, AbstractC59962oe abstractC59962oe, UserSession userSession, boolean z) {
        C14360o3.A0B(userSession, 2);
        int i = 2131969942;
        int i2 = 2131969943;
        if (z) {
            i = 2131969944;
            i2 = 2131969945;
        }
        C193328hC A0H = AbstractC31171DnF.A0H(fragmentActivity);
        A0H.A0A(i);
        AbstractC31173DnH.A16(fragmentActivity, A0H, i2);
        A0H.A07();
        A0H.A0H(new DialogInterfaceOnClickListenerC35455FkC(68, abstractC59962oe, userSession), 2131975195);
        AbstractC166987dD.A1W(A0H);
    }

    public static final void A00(Activity activity) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131966061);
        AbstractC31177DnL.A0v(activity, A0H, 20, 2131966060);
        AbstractC31176DnK.A1W(A0H);
    }

    public static final void A01(Activity activity, int i) {
        C193328hC A0H = AbstractC31171DnF.A0H(activity);
        A0H.A0A(2131966055);
        AbstractC31177DnL.A0v(activity, A0H, Integer.valueOf(i), 2131966054);
        AbstractC31176DnK.A1W(A0H);
    }
}
