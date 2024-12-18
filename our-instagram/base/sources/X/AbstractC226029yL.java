package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;

/* renamed from: X.9yL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC226029yL {
    public static final String A00(C55U c55u, java.util.Set set) {
        AbstractC167017dG.A1N(c55u, set);
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("destination:");
        A1C.append(c55u);
        A1C.append(" tools:");
        if (set.isEmpty()) {
            A1C.append(NetInfoModule.CONNECTION_TYPE_NONE);
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                A1C.append(it.next().toString());
                A1C.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        return AbstractC166987dD.A19(A1C);
    }
}
