package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3NS, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NS implements InterfaceC13050lr {
    public static final java.util.Set A04 = AbstractC16830sb.A07("profile", "self_profile");
    public Map A00;
    public final java.util.Set A01;
    public final boolean A02;
    public final UserSession A03;

    public C3NS(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = !C18U.A06(c06090Tz, userSession, 36323814027636343L);
        this.A00 = new LinkedHashMap();
        List A0R = AbstractC001900j.A0R(C18U.A04(c06090Tz, userSession, 36886763981112044L), new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(A0R, 10));
        Iterator it = A0R.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC001900j.A0B((String) it.next()).toString());
        }
        this.A01 = AbstractC001800i.A0k(arrayList);
    }

    @Override // X.InterfaceC13050lr
    public final void onUserSessionWillEnd(boolean z) {
        this.A00.clear();
    }
}
