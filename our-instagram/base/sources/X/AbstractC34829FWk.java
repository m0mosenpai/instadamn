package X;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FWk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34829FWk {
    public static final void A00(Activity activity, AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, User user, String str, String str2, boolean z) {
        AbstractC167017dG.A1R(user, userSession);
        C14360o3.A0B(abstractC59962oe, 4);
        if (user.A03.Aah() != null) {
            C37211oK A00 = AbstractC31265Don.A00();
            int intValue = AbstractC31266Doo.A00(userSession).A00().intValue();
            if (intValue != 0) {
                if (intValue != 1 && intValue != 2) {
                    new AiAgentThreadLauncher(userSession).A08(activity, interfaceC11380iw, user.getId(), null, null, null, true);
                    return;
                } else {
                    A00.A00(activity, EnumC33519Ers.A02, userSession);
                    return;
                }
            }
            C193328hC A0I = AbstractC31171DnF.A0I(activity);
            A0I.A09(2131952589);
            A0I.A0J(null, 2131952590);
            AbstractC31178DnM.A1R(A0I, true);
            return;
        }
        List A0j = AbstractC31177DnL.A0j(user);
        C122145g6 c122145g6 = new C122145g6(A0j);
        if (C18U.A06(C06090Tz.A05, userSession, 2342156051466094224L)) {
            C7YF.A00(userSession).A02(c122145g6, A0j, new X5B(activity, userSession, abstractC59962oe, str, str2, 4, z), true);
        } else {
            A01(activity, abstractC59962oe, userSession, c122145g6, str, str2, z);
        }
    }

    public static final void A01(Activity activity, AbstractC59962oe abstractC59962oe, UserSession userSession, InterfaceC83713oG interfaceC83713oG, String str, String str2, boolean z) {
        C36881nl A01 = C36881nl.A01(activity, abstractC59962oe, userSession, str);
        A01.A0B = interfaceC83713oG;
        A01.A0n = true;
        A01.A01 = abstractC59962oe;
        A01.A0v = false;
        A01.A0q = z;
        if (str2 != null) {
            A01.A0f = str2;
        }
        if (C14360o3.A0K(str, "follow_button")) {
            FragmentActivity activity2 = abstractC59962oe.getActivity();
            if (activity2 != null) {
                A01.A08(activity2, interfaceC83713oG, -1.0f);
                return;
            }
            return;
        }
        A01.A06();
    }
}
