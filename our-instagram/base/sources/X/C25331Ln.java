package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1Ln, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25331Ln {
    public HashMap A00 = new HashMap();

    public static String A00(HashMap hashMap) {
        try {
            StringWriter stringWriter = new StringWriter();
            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
            A0A.A0d();
            for (Map.Entry entry : hashMap.entrySet()) {
                A0A.A0R((String) entry.getKey(), ((Number) entry.getValue()).longValue());
            }
            A0A.A0a();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            C0K8.A0G("PendingReelTraySeenState", "Failed to serialize reel tray seen state to json", e);
            return null;
        }
    }

    public final C1ON A01(UserSession userSession) {
        C25621Ms c25621Ms = new C25621Ms(userSession);
        c25621Ms.A05();
        c25621Ms.A0B("feed/record_reels_tray_seen_state/");
        String A00 = A00(this.A00);
        if (A00 != null) {
            c25621Ms.A9s("reel_tray_impressions", A00);
        }
        c25621Ms.A0V = true;
        c25621Ms.A0S(C40781ul.class, C55702hA.class);
        c25621Ms.A0R = true;
        return c25621Ms.A0N();
    }
}
