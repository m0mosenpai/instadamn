package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6PF, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6PF {
    public static volatile C6PF A03;
    public final C1QT A00;
    public final UserSession A01;
    public final Map A02 = new LinkedHashMap();

    public static final void A00(C6PF c6pf, Integer num, long j) {
        String str;
        C1QT c1qt = c6pf.A00;
        boolean z = false;
        if (num != null) {
            z = true;
        }
        c1qt.flowAnnotate(j, "is_forced_muted", z);
        if (num == null) {
            return;
        }
        switch (num.intValue()) {
            case 1:
                str = "roll_call";
                break;
            case 2:
                str = "media_overlaY";
                break;
            default:
                str = "audio_unavailable";
                break;
        }
        c1qt.flowAnnotate(j, "force_muted_reason", str);
    }

    public C6PF(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = C1QS.A00(userSession);
    }
}
