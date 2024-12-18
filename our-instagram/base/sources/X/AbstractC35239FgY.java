package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FgY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35239FgY {
    public static final C193328hC A00(Context context, FragmentActivity fragmentActivity, UserSession userSession, List list, boolean z) {
        String str;
        AbstractC167007dF.A1F(context, 0, userSession);
        User user = (User) AbstractC001800i.A0O(list, 0);
        if (z) {
            C193328hC A0I = AbstractC31171DnF.A0I(context);
            A0I.A0A(2131966319);
            if (user != null) {
                str = user.getUsername();
            } else {
                str = "";
            }
            AbstractC31177DnL.A0v(context, A0I, str, 2131966314);
            DialogInterfaceOnClickListenerC35455FkC.A02(A0I, fragmentActivity, userSession, 67, 2131973586);
            return A0I;
        }
        return A01(context, user, false);
    }

    public static final void A02(Activity activity, Context context, UserSession userSession, User user, InterfaceC168627fw interfaceC168627fw, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C193328hC A0I;
        C18920wW A01;
        String str2;
        String str3;
        int i;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (interfaceC168627fw != null && user.CQf() && interfaceC168627fw.Ei4()) {
            C193328hC A0I2 = AbstractC31171DnF.A0I(context);
            A0I2.A0A(2131966319);
            AbstractC31177DnL.A0v(context, A0I2, user.getUsername(), 2131966314);
            A0I2.A0H(new AOD(interfaceC168627fw, 15), 2131973586);
            AbstractC31176DnK.A1W(A0I2);
            A01 = AbstractC12220kQ.A01(null, userSession);
            str2 = "impression";
            str3 = "cant_mention_alert_blocked";
        } else {
            InterfaceC19630xq interfaceC19630xq = A00.A01;
            if (interfaceC19630xq.getInt("cannot_mention_error_nux_shown_count", 0) < 1) {
                C193328hC A012 = A01(context, user, true);
                A012.A07();
                DialogInterfaceOnDismissListenerC35463FkK.A00(A012, interfaceC16820sZ2, 10);
                A012.A0h(new AP9(interfaceC16820sZ, 7));
                if (interfaceC168627fw != null && interfaceC168627fw.Ei5()) {
                    A012.A0H(new AOD(interfaceC168627fw, 16), 2131973587);
                }
                AbstractC166987dD.A1W(A012);
                AbstractC167007dF.A18(interfaceC19630xq, "cannot_mention_error_nux_shown_count", interfaceC19630xq.getInt("cannot_mention_error_nux_shown_count", 0) + 1);
                A01 = AbstractC12220kQ.A01(null, userSession);
                str2 = "impression";
                str3 = "cant_mention_alert_nux";
            } else {
                if (C14360o3.A0K(str, "notes")) {
                    i = 2131966320;
                } else if (C18U.A06(C06090Tz.A05, userSession, 36318763146025427L)) {
                    i = 2131966317;
                } else {
                    if (activity != null) {
                        A0I = AbstractC31171DnF.A0H(activity);
                    } else {
                        A0I = AbstractC31171DnF.A0I(context);
                    }
                    A0I.A05 = AbstractC31178DnM.A0c(context, user, 2131966321);
                    AbstractC31176DnK.A1W(A0I);
                    A01 = AbstractC12220kQ.A01(null, userSession);
                    str2 = "impression";
                    str3 = "cant_mention_alert";
                }
                String A0c = AbstractC31178DnM.A0c(context, user, i);
                C14360o3.A07(A0c);
                C41451vu c41451vu = C41451vu.A01;
                C146106i8 A0X = AbstractC31173DnH.A0X(A0c);
                A0X.A06();
                A0X.A02 = context.getResources().getDimensionPixelOffset(R.dimen.canvas_colour_wheel_offset_y);
                A0X.A0R = true;
                AbstractC31178DnM.A1N(c41451vu, A0X);
                return;
            }
        }
        FDR.A00(A01, userSession, user, str, str2, str3);
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession) {
        C66277U6x A01 = C66277U6x.A01("com.instagram.bullying.privacy.mentions_options", AbstractC166987dD.A1G());
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        AbstractC31171DnF.A10(fragmentActivity, A0C, 2131966313);
        A0C.A0i = true;
        AbstractC31177DnL.A0n(fragmentActivity, W6d.A00(A0C, A01), userSession, ModalActivity.class, "bloks");
    }

    public static final void A05(FragmentActivity fragmentActivity, UserSession userSession, String str) {
        FDR.A00(AbstractC12220kQ.A01(null, userSession), userSession, null, str, "click", "cant_mention_alert_manage_blocked_accounts");
        EJX CsH = AbstractC31412DrH.A01().CsH(userSession);
        if (fragmentActivity != null) {
            AbstractC31178DnM.A0t(null, CsH, fragmentActivity, userSession);
        }
    }

    public static final C193328hC A01(Context context, User user, boolean z) {
        String str;
        int i = z ? 2131966316 : 2131966317;
        if (user != null) {
            str = user.getUsername();
        } else {
            str = null;
        }
        String A0b = AbstractC31177DnL.A0b(context, str, i);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        A0I.A0A(2131966319);
        A0I.A0r(A0b);
        return A0I;
    }

    public static final void A03(Context context, UserSession userSession, User user, InterfaceC168627fw interfaceC168627fw, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        AbstractC167017dG.A1P(userSession, user);
        A02(null, context, userSession, user, interfaceC168627fw, str, interfaceC16820sZ, interfaceC16820sZ2);
    }
}
