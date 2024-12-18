package X;

import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* renamed from: X.FrN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35785FrN implements CallerContextable {
    public static final String __redex_internal_original_name = "FindPeopleButtonsRowViewBinder";

    public static final void A00(UserSession userSession, FindPeopleButton findPeopleButton, FO6 fo6, C34686FPx c34686FPx) {
        findPeopleButton.setVisibility(8);
        fo6.A00.setVisibility((fo6.A05.getVisibility() == 8 && fo6.A03.getVisibility() == 8) ? 8 : 0);
        if (c34686FPx.A02 == C05F.A00) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            long currentTimeMillis = System.currentTimeMillis();
            if (findPeopleButton.equals(fo6.A03)) {
                InterfaceC19630xq interfaceC19630xq = A00.A01;
                AbstractC167017dG.A0g(interfaceC19630xq, "num_times_dismissed_ci_find_people_button_follow_list").apply();
                InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                ARD.E7G("last_time_dismissed_ci_find_people_button_follow_list", currentTimeMillis);
                ARD.apply();
            }
        }
    }
}
