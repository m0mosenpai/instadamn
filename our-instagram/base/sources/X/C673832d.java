package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.32d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C673832d {
    public final UserSession A00;

    public static final String A00(C673832d c673832d, List list) {
        StringBuilder sb = new StringBuilder();
        List A0h = AbstractC001800i.A0h(list, 25);
        if (list.size() > A0h.size()) {
            sb.append("...");
        }
        Iterator it = A0h.iterator();
        while (it.hasNext()) {
            C38321qM A02 = C3XH.A02(((C3XG) it.next()).A05);
            if (A02 != null) {
                UserSession userSession = c673832d.A00;
                C38801rC c38801rC = C38321qM.A0h;
                String A3E = A02.A3E(userSession, false);
                if (A3E != null) {
                    sb.append(A3E);
                    sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                }
            }
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        String obj = sb.toString();
        C14360o3.A07(obj);
        return obj;
    }

    public C673832d(UserSession userSession) {
        this.A00 = userSession;
    }
}
