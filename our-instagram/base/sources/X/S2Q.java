package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes10.dex */
public abstract class S2Q {
    public static void A00(StringBuilder sb, HashMap hashMap) {
        sb.append("{");
        Iterator A0l = AbstractC167007dF.A0l(hashMap);
        boolean z = true;
        while (A0l.hasNext()) {
            String A1B = AbstractC166987dD.A1B(A0l);
            if (!z) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            String A0h = AbstractC31171DnF.A0h(A1B, hashMap);
            String str = "\"";
            sb.append("\"");
            sb.append(A1B);
            sb.append("\":");
            if (A0h == null) {
                str = "null";
            } else {
                sb.append("\"");
                sb.append(A0h);
            }
            sb.append(str);
            z = false;
        }
        sb.append("}");
    }
}
