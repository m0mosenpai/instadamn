package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7UM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7UM {
    public final UserSession A00;

    public C7UM(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final List A00() {
        String A04 = C18U.A04(C06090Tz.A05, this.A00, 36885518440596116L);
        C14360o3.A0A(A04);
        if (A04.length() > 0) {
            return AbstractC001900j.A0R(A04, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        }
        return C16930sl.A00;
    }
}
