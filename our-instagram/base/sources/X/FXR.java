package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.BitSet;
import java.util.HashMap;

/* loaded from: classes6.dex */
public abstract class FXR {
    public static final void A00(Context context, UserSession userSession, C40701ud c40701ud, String str, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2) {
        String fbidV2;
        C14360o3.A0B(userSession, 0);
        User A0Y = AbstractC166997dE.A0Y(userSession);
        InterfaceC223716s C45 = A0Y.A03.C45();
        if (C45 != null && AbstractC166997dE.A1Z(C45.Ce0(), true) && (fbidV2 = A0Y.A03.getFbidV2()) != null) {
            C2JM A0b = AbstractC25225BEi.A0b();
            C2JM A0b2 = AbstractC25225BEi.A0b();
            A0b.A04("supervised_user_id", fbidV2);
            A0b.A04(AbstractC43591JPw.A00(458), "PENDING");
            A0b.A04("setting_type", str);
            c40701ud.ATV(C35823Frz.A00, new C35833Fs9(context, c40701ud, fbidV2, str, interfaceC16660sJ, interfaceC16660sJ2), new PandoGraphQLRequest(AbstractC25225BEi.A0c(), "GetPendingSettingChangeRequest", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59671Qjp.class, false, null, 0, null, "xig_get_setting_change_requests", AbstractC166987dD.A1E()));
        }
    }

    public static final void A01(AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2, String str3, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(str2, 2);
        InterfaceC223716s C45 = AbstractC166997dE.A0Y(userSession).A03.C45();
        if (C45 != null && AbstractC166997dE.A1Z(C45.Ce0(), true)) {
            String A0g = AnonymousClass001.A0g("supervised_user_", str, "_change_permissions_required");
            C62862tP A03 = C62862tP.A03(abstractC59962oe, userSession, null);
            if (C18U.A06(C06090Tz.A05, userSession, 36320910629741554L)) {
                HashMap A1G = AbstractC166987dD.A1G();
                HashMap A1G2 = AbstractC166987dD.A1G();
                BitSet A0j = AbstractC31171DnF.A0j(4);
                A1G.put("new_setting_value", str3);
                A0j.set(0);
                A1G.put("previous_setting_value", str2);
                A0j.set(1);
                A1G.put("session_store_permissions_required_key", A0g);
                A0j.set(2);
                A1G.put("setting_type", str);
                A0j.set(3);
                FragmentActivity requireActivity = abstractC59962oe.requireActivity();
                C36030FvS c36030FvS = new C36030FvS(abstractC59962oe, userSession, A0g, interfaceC16820sZ2, interfaceC16820sZ);
                if (A0j.nextClearBit(0) >= 4) {
                    FTe.A00(c36030FvS, "com.bloks.www.ig.supervised_user_aware.update_setting.async", A1G, A1G2).A00(requireActivity, A03);
                    return;
                }
                throw AbstractC31173DnH.A0f();
            }
            AbstractC192798gL A02 = C192108fB.A02(null, userSession, "com.instagram.portable_settings.supervised_user_aware_update_settings_async_action", AbstractC31180DnO.A0r("new_setting_value", str3, AbstractC166987dD.A1L("session_store_permissions_required_key", A0g), AbstractC166987dD.A1L("setting_type", str), AbstractC166987dD.A1L("previous_setting_value", str2)));
            A02.A00(new C32391EOs(abstractC59962oe, A03, userSession, A0g, interfaceC16820sZ2, interfaceC16820sZ));
            abstractC59962oe.schedule(A02);
            return;
        }
        interfaceC16820sZ2.invoke();
    }
}
