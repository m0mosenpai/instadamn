package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.Fg6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35213Fg6 {
    public static final void A00(Context context, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f) {
        C14360o3.A0B(userSession, 1);
        int A06 = e70.A06();
        String A03 = E70.A03(e70);
        String str = e70.A0Q;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        User user = c32107E9f.A00;
        A0I.A05 = AbstractC167007dF.A0f(context, user.B8y(), 2131958797);
        AbstractC31177DnL.A0v(context, A0I, user.B8y(), 2131958796);
        A0I.A0L(new DialogInterfaceOnClickListenerC35378Fit(context, userSession, ena, c7mj, e70, c32107E9f, A03, str, A06, 0), 2131972171);
        A0I.A0D(new Og4(userSession, A03, str, A06, 0));
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static final void A01(Context context, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f) {
        C14360o3.A0B(userSession, 1);
        int A06 = e70.A06();
        String A03 = E70.A03(e70);
        String str = e70.A0Q;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        User user = c32107E9f.A00;
        A0I.A05 = AbstractC167007dF.A0f(context, user.B8y(), 2131958798);
        AbstractC31177DnL.A0v(context, A0I, user.B8y(), 2131958796);
        A0I.A0L(new DialogInterfaceOnClickListenerC35378Fit(context, userSession, ena, c7mj, e70, c32107E9f, A03, str, A06, 1), 2131972171);
        A0I.A0D(new Og4(userSession, A03, str, A06, 1));
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static final void A02(Context context, UserSession userSession, ENA ena, C7MJ c7mj, E70 e70, C32107E9f c32107E9f, int i) {
        int i2 = 2131959046;
        if (i == 6) {
            i2 = 2131959042;
        }
        AbstractC147806l5.A00(userSession);
        AbstractC34061F1o.A00(userSession);
        int A06 = e70.A06();
        String A03 = E70.A03(e70);
        String str = e70.A0Q;
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        AbstractC31172DnG.A1C(context, A0I, 2131959045);
        AbstractC31177DnL.A0v(context, A0I, c32107E9f.A00.B8y(), i2);
        A0I.A0L(new DialogInterfaceOnClickListenerC35380Fiv(context, userSession, ena, c7mj, e70, c32107E9f, A03, str, i, A06), 2131954754);
        A0I.A0I(new DialogInterfaceOnClickListenerC35355FiW(userSession, A03, str, i, A06), 2131959044);
        AbstractC31178DnM.A1R(A0I, true);
    }

    public static final void A03(UserSession userSession, String str, String str2, int i, int i2) {
        Integer num;
        Integer num2;
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        C36267FzK A002 = AbstractC34061F1o.A00(userSession);
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i == 7) {
                        num2 = C05F.A01;
                    } else {
                        throw AbstractC166987dD.A12("Unable to log unsupported action type");
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num2 = C05F.A00;
            }
            AbstractC34065F1s.A00(A002.A00, str, str2, "remove_moderator_attempt", "tap", "remove_moderator_dialog", "thread_details_people", AbstractC167017dG.A0r("invite_status", AbstractC31180DnO.A0j(num2)), i2);
            return;
        }
        num = C05F.A00;
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (!AbstractC25226BEj.A1Z(A0I)) {
            return;
        }
        AbstractC31175DnJ.A1B(A0I, A00);
        AbstractC31174DnI.A1I(A0I, "remove_collaborator_attempt");
        A0I.A0o("remove_collaborator_dialog");
        A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details_people", str, str2, i2));
        AbstractC31178DnM.A1G(A0I, "invite_status", AbstractC31180DnO.A0j(num));
    }

    public static final void A04(UserSession userSession, String str, String str2, int i, int i2) {
        Integer num;
        Integer num2;
        C142846ck A00 = AbstractC147806l5.A00(userSession);
        C36267FzK A002 = AbstractC34061F1o.A00(userSession);
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i == 7) {
                        num2 = C05F.A01;
                    } else {
                        throw AbstractC166987dD.A12("Unable to log unsupported action type");
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num2 = C05F.A00;
            }
            AbstractC34065F1s.A00(A002.A00, str, str2, "remove_moderator_cancel", "tap", "remove_moderator_dialog", "thread_details_people", AbstractC167017dG.A0r("invite_status", AbstractC31180DnO.A0j(num2)), i2);
            return;
        }
        num = C05F.A00;
        C25531Mh A0I = AbstractC31172DnG.A0I(A00);
        if (!AbstractC25226BEj.A1Z(A0I)) {
            return;
        }
        AbstractC31175DnJ.A1B(A0I, A00);
        AbstractC31174DnI.A1I(A0I, "remove_collaborator_cancel");
        A0I.A0o("remove_collaborator_dialog");
        A0I.A0h(AbstractC31179DnN.A0a(A0I, "thread_details_people", str, str2, i2));
        AbstractC31178DnM.A1G(A0I, "invite_status", AbstractC31180DnO.A0j(num));
    }
}
