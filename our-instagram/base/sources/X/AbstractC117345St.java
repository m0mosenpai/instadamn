package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.5St, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC117345St {
    public static final java.util.Set A00 = AbstractC16830sb.A07(EnumC117355Su.A06, EnumC117355Su.A08, EnumC117355Su.A04, EnumC117355Su.A05, EnumC117355Su.A03);
    public static final java.util.Set A01 = AbstractC16830sb.A07("direct_v2_text", "direct_v2_reel_share", "direct_v2_delete_item");

    public static final UserSession A00(String str) {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
            return C023409i.A0A.A07(bundle);
        } catch (Exception e) {
            C0K8.A0Q("IGSyncPathNotification", "Failed to get intended user session: %s", e.getMessage());
            return null;
        }
    }

    public static final boolean A01(UserSession userSession) {
        C08730cb c08730cb = C17060sy.A01;
        if (!C2E7.A03(c08730cb.A01(userSession)) || !C18U.A06(C06090Tz.A05, userSession, 36314841840880486L)) {
            if (C2E7.A02(c08730cb.A01(userSession)) && C18U.A06(C06090Tz.A05, userSession, 36314841842125675L)) {
                return true;
            }
            return false;
        }
        return true;
    }
}
