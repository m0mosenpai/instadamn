package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.List;

/* renamed from: X.52H, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C52H {
    public static final L7O A00(String str) {
        if (str.length() > 0) {
            List A0R = AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0);
            if (A0R.size() == 3) {
                String str2 = (String) AbstractC001800i.A0O(A0R, 0);
                String str3 = (String) AbstractC001800i.A0O(A0R, 1);
                String str4 = (String) AbstractC001800i.A0O(A0R, 2);
                if (str2 != null && str3 != null && str4 != null) {
                    return new L7O(str2, str3, str4);
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
