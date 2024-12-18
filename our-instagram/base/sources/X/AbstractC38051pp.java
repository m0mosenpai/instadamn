package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;

/* renamed from: X.1pp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC38051pp {
    public static String A00 = "";

    public static final void A00(String... strArr) {
        StringBuilder sb = new StringBuilder();
        String str = A00;
        boolean z = false;
        if (str.length() > 0) {
            z = true;
        }
        if (z) {
            sb.append(str);
            sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
        }
        for (String str2 : strArr) {
            if (str2 != null && str2.length() != 0) {
                sb.append(str2);
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        A00 = sb.toString();
    }
}
