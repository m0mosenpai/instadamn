package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;

/* renamed from: X.3EO, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3EO {
    public static final void A00(StringBuilder sb, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList(i);
            int i2 = 0;
            do {
                arrayList.add("?");
                i2++;
            } while (i2 < i);
            sb.append(AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", arrayList, null));
        }
    }
}
