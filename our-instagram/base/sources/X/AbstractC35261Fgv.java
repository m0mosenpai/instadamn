package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.simplewebview.SimpleWebViewConfig;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

/* renamed from: X.Fgv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35261Fgv {
    public static final C32259EIt A00(UserSession userSession, User user, InterfaceC37186GZx interfaceC37186GZx, String str) {
        C14360o3.A0B(userSession, 0);
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        A05.putString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID", user.getId());
        A05.putString("MuteSettingsFragment.ARG_SELECTED_FROM", str);
        C32259EIt c32259EIt = new C32259EIt();
        c32259EIt.setArguments(A05);
        c32259EIt.A01 = interfaceC37186GZx;
        return c32259EIt;
    }

    public static final void A05(Context context, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, InterfaceC103384lE interfaceC103384lE2, UserSession userSession, C189478aR c189478aR, User user, EnumC33371Ep4 enumC33371Ep4, String str) {
        boolean A1b = AbstractC25233BEq.A1b(userSession, context, user);
        C14360o3.A0B(str, 7);
        C18920wW A01 = AbstractC12220kQ.A01(new C35997Fuv(str), userSession);
        C28151Xt c28151Xt = C28151Xt.A02;
        if (c28151Xt != null) {
            c28151Xt.A00();
            GJK gjk = new GJK(c6fq, interfaceC103384lE, c189478aR);
            GJG gjg = new GJG(0, c6fq, interfaceC103384lE2, interfaceC103384lE);
            C189448aO A0X = AbstractC31177DnL.A0X(userSession, A1b);
            A0X.A0x = A1b;
            A0X.A1G = A1b;
            A0X.A03 = 0.7f;
            C35188Ffg.A01(context, null, null, A01, userSession, c189478aR, A0X, user, gjg, enumC33371Ep4, gjk, str, null, null, A1b);
        }
    }

    public static final void A06(Context context, UserSession userSession, C189478aR c189478aR, User user, InterfaceC37186GZx interfaceC37186GZx, String str) {
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0w(1, context, str, interfaceC37186GZx);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0d = AbstractC31178DnM.A0c(context, user, 2131973265);
        if (c189478aR == null) {
            A0y.A00().A03(context, A00(userSession, user, interfaceC37186GZx, str));
            return;
        }
        AbstractC25225BEi.A1Q(A0y, true);
        A0y.A0x = true;
        A0y.A03 = 0.7f;
        c189478aR.A0F(A00(userSession, user, interfaceC37186GZx, str), A0y);
    }

    public static final void A07(Context context, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 1);
        if (str != null) {
            SXK A0R = AbstractC31171DnF.A0R(str);
            if (str2 != null && str2.length() != 0) {
                A0R.A02 = str2;
            }
            SimpleWebViewActivity.A02.A02(context, userSession, new SimpleWebViewConfig(A0R));
        }
    }

    public static final boolean A08(UserSession userSession, DirectShareTarget directShareTarget, User user, boolean z) {
        C14360o3.A0B(userSession, 0);
        if (directShareTarget != null && directShareTarget.A0L()) {
            return true;
        }
        if (user != null && 1 == user.BJ8()) {
            return true;
        }
        if (!z || C18U.A06(C06090Tz.A06, userSession, 36310297765478408L)) {
            return false;
        }
        return true;
    }

    public static final void A01(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.addFlags(16);
        }
    }

    public static final void A02(Activity activity) {
        Window window;
        if (activity != null && (window = activity.getWindow()) != null) {
            window.clearFlags(16);
        }
    }

    public static final void A03(Activity activity) {
        C3DN A0r;
        if (activity != null && (A0r = AbstractC31172DnG.A0r(activity)) != null) {
            A0r.A0B();
        }
    }

    public static final void A04(Activity activity, UserSession userSession, InterfaceC77483dY interfaceC77483dY, User user, String str, String str2, JSONObject jSONObject, boolean z) {
        AbstractC167017dG.A1N(activity, userSession);
        C14360o3.A0B(str2, 5);
        DialogInterfaceOnClickListenerC35377Fis dialogInterfaceOnClickListenerC35377Fis = new DialogInterfaceOnClickListenerC35377Fis(activity, userSession, interfaceC77483dY, user, jSONObject, str, str2, 1, z);
        if (user.A0M() == C05F.A01) {
            AbstractC35271Fh6.A07(activity, null, null, userSession, null, null, null, null, interfaceC77483dY, null, user, null, null, null, str, null, str2, null, null, null, null, jSONObject);
            int i = 2131976071;
            if (user.B7L() == FollowStatus.A05) {
                i = 2131962685;
            }
            C9GR.A09(activity, activity.getString(i));
            if (!z) {
                A03(activity);
                return;
            }
            return;
        }
        interfaceC77483dY.DHs(user);
        C193328hC A0I = AbstractC31171DnF.A0I(activity);
        A0I.A05 = AbstractC31178DnM.A0c(activity, user, 2131976078);
        AbstractC31173DnH.A16(activity, A0I, 2131976072);
        A0I.A0J(dialogInterfaceOnClickListenerC35377Fis, 2131976069);
        A0I.A06();
        A0I.A0g(new DialogInterfaceOnDismissListenerC35459FkG(3, user, interfaceC77483dY));
        AbstractC31178DnM.A1R(A0I, true);
    }
}
