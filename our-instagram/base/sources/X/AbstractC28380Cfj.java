package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Cfj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28380Cfj {
    public static final ArrayList A00(String str, List list) {
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (str != null && str.length() != 0 && str.equals(null)) {
                A1E.add(obj);
            }
        }
        return A1E;
    }

    public static final void A01(String str, StringBuilder sb, List list) {
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append(":\n\n");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append("\n");
            }
            sb.append("\n");
        }
    }

    public static final void A02(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27954CTs c27954CTs = (C27954CTs) it.next();
            if (sb.length() > 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(c27954CTs.A01);
        }
    }

    public static final void A03(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C27954CTs c27954CTs = (C27954CTs) it.next();
            if (sb.length() > 0) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            sb.append(c27954CTs.A02);
        }
    }
}
