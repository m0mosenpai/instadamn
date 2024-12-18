package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.60J, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60J {
    public static final C132515ya A00(UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        return (C132515ya) userSession.A01(C132515ya.class, new C206919Dw(userSession, 3));
    }

    public static final String A01(String str) {
        String str2 = null;
        if (str != null) {
            try {
                android.net.Uri A03 = AbstractC08820cl.A03(str);
                C14360o3.A07(A03);
                str2 = A03.getQueryParameter("x");
                return str2;
            } catch (Exception e) {
                C0K8.A0Q("SecureMessageOverWAIGNotificationsE2ELogger", "message ID parsing exception: ", e.getMessage());
            }
        }
        return str2;
    }

    public static final boolean A03(C116155Nu c116155Nu) {
        String str = c116155Nu.A0g;
        if (str == null) {
            return false;
        }
        if (!c116155Nu.A05() && !c116155Nu.A1S && !AbstractC001900j.A0a(str, "ig_advanced_crypto_transport", false) && !AbstractC001900j.A0a(str, "is_vanish_mode", false)) {
            return false;
        }
        return true;
    }

    public static final String A02(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(15);
        }
        if (z2) {
            arrayList.add(23);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList, null);
    }
}
