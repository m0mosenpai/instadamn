package X;

import android.content.Context;
import com.google.gson.Gson;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.List;

/* renamed from: X.FfU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35177FfU {
    public static C1ON A00(Context context, C07270a1 c07270a1, String str, String str2, String str3, String str4, List list, boolean z) {
        String str5;
        C25621Ms A0c = AbstractC167017dG.A0c(c07270a1);
        A0c.A0B("accounts/two_factor_login/");
        AbstractC31175DnJ.A1J(A0c);
        A0c.A9s(AbstractC31182DnR.A01(), str);
        A0c.A0H("verification_method", str4);
        A0c.A9s(AbstractC31178DnM.A0a(), str2);
        AbstractC31177DnL.A0t(context, A0c);
        AbstractC31178DnM.A0n(context, A0c, "phone_id", AbstractC31172DnG.A0P(c07270a1).A02(C19T.A1D));
        A0c.A0H(AbstractC31182DnR.A05(808, 17, 46), str3);
        if (z) {
            str5 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
        } else {
            str5 = "0";
        }
        AbstractC31178DnM.A1K(A0c, "trust_this_device", str5);
        if (list != null && !list.isEmpty()) {
            A0c.A9s("trusted_notification_polling_nonces", new Gson().A0B(list));
        }
        return AbstractC31176DnK.A0P(A0c);
    }

    public static C1ON A01(Context context, UserSession userSession) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/account_security_info/");
        A0M.A0S(EDU.class, C34799FVb.class);
        AbstractC31177DnL.A0t(context, A0M);
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A02(Context context, UserSession userSession, String str) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/send_two_factor_enable_sms/");
        A0M.A0S(EfT.class, C34812FVo.class);
        AbstractC31179DnN.A0j(context, A0M, AbstractC31182DnR.A03(), str);
        return AbstractC31176DnK.A0P(A0M);
    }

    public static C1ON A03(Context context, UserSession userSession, String str, String str2) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("accounts/enable_sms_two_factor/");
        A0M.A0S(EfW.class, C34817FVt.class);
        AbstractC31179DnN.A0j(context, A0M, AbstractC31182DnR.A03(), str);
        A0M.A9s(AbstractC31182DnR.A05(808, 17, 46), str2);
        return AbstractC31176DnK.A0P(A0M);
    }
}
