package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* loaded from: classes9.dex */
public abstract class OY7 {
    public static final void A01(UserSession userSession, FragmentActivity fragmentActivity) {
        int i = 2131974199;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 2342163202583961727L)) {
            i = 2131974198;
        }
        String A0p = AbstractC166997dE.A0p(fragmentActivity, i);
        C66277U6x A01 = C66277U6x.A01("com.instagram.portable_settings.settings", A00(userSession));
        IgBloksScreenConfig A0C = AbstractC31171DnF.A0C(userSession);
        A0C.A0U = A0p;
        A0C.A0l = true;
        A01.A04(fragmentActivity, A0C);
    }

    public static final void A02(UserSession userSession, FragmentActivity fragmentActivity) {
        C14360o3.A0B(userSession, 0);
        AbstractC35091Fd2.A01(null, userSession, "settings", "bloks_settings_entrypoint_impression", null);
        AbstractC191798eb.A04(fragmentActivity, new C191778eZ(userSession), "com.instagram.portable_settings.settings", A00(userSession), C36J.A06(C36G.A09, C36H.A03(C36G.A04, 24)));
    }

    public static final HashMap A00(UserSession userSession) {
        Integer num;
        String str;
        HashMap A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L(AbstractC111324zv.A00(2616), String.valueOf(C2TN.A00(userSession))));
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36320193370136702L)) {
            num = C05F.A00;
        } else {
            C14360o3.A0B(userSession, 0);
            if (C18U.A06(c06090Tz, userSession, 2342163202583961727L)) {
                num = C05F.A01;
            }
            return A02;
        }
        if (num.intValue() != 0) {
            str = "REMOVED_MENU";
        } else {
            str = "SIMPLIFIED_MENU";
        }
        A02.put("ig_profile_menu_variant", str);
        return A02;
    }
}
