package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC85703rz {
    public static final Map A00(Map map) {
        C14360o3.A0B(map, 0);
        if (map.containsKey("realtime_signal_ids")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.remove("realtime_signal_ids");
            return linkedHashMap;
        }
        return map;
    }

    public static final java.util.Set A01(Map map) {
        C14360o3.A0B(map, 0);
        String str = (String) map.get("realtime_signal_ids");
        if (str != null) {
            return AbstractC001800i.A0k(AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0));
        }
        return null;
    }
}
