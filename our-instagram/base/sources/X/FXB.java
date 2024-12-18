package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public abstract class FXB {
    public static C1ON A00(UserSession userSession, String str) {
        C25621Ms A0N = AbstractC31173DnH.A0N(userSession);
        A0N.A0B("notifications/get_notification_settings/");
        A0N.A9s(TraceFieldType.ContentType, str);
        return AbstractC31172DnG.A0S(A0N, EDO.class, FX8.class);
    }

    public static C1ON A01(UserSession userSession, String str, String str2) {
        C25621Ms A0M = AbstractC31173DnH.A0M(userSession);
        A0M.A0B("notifications/change_notification_settings/");
        A0M.A9s(TraceFieldType.ContentType, str);
        A0M.A9s("setting_value", str2);
        return AbstractC31178DnM.A0I(A0M, C40781ul.class, C55702hA.class);
    }
}
