package X;

import android.R;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.95Z, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C95Z {
    public final Map A00;

    public C95Z(C95S c95s) {
        HashMap hashMap = new HashMap();
        this.A00 = hashMap;
        if (c95s != null) {
            String str = c95s.A01;
            if (!str.equals("-1")) {
                ArrayList arrayList = new ArrayList();
                String[] split = str.split(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
                for (String str2 : split) {
                    try {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
                    } catch (NumberFormatException unused) {
                        arrayList.clear();
                    }
                }
                if (arrayList.contains(31784979)) {
                    hashMap.put(31784979, new Object());
                }
                if (arrayList.contains(31784974)) {
                    hashMap.put(31784974, new Object());
                }
                if (arrayList.contains(31784962)) {
                    hashMap.put(31784962, new Object());
                }
                Integer valueOf = Integer.valueOf(R.drawable.alert_light_frame);
                if (arrayList.contains(valueOf)) {
                    hashMap.put(valueOf, new Object());
                }
                if (c95s.A04) {
                    hashMap.put(31784971, new Object());
                }
                if (c95s.A09) {
                    hashMap.put(31784972, new Object());
                }
            }
        }
    }
}
