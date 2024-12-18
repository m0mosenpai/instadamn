package X;

import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3dK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC77343dK {
    public static final String A01(List list) {
        int ordinal;
        String str;
        if (list.isEmpty()) {
            return "None";
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            EnumC73363Qm enumC73363Qm = (EnumC73363Qm) it.next();
            if (enumC73363Qm != null && (ordinal = enumC73363Qm.ordinal()) != -1) {
                if (ordinal != 2) {
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            str = "Cached";
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        str = MSV.A00(354);
                    }
                } else {
                    str = "Local";
                }
                arrayList.add(str);
            }
        }
        return AbstractC001800i.A0P(", ", "", "", arrayList, null);
    }

    public static final String A00(List list) {
        if (list != null && !list.isEmpty()) {
            return AbstractC001800i.A0P(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, "", "", AbstractC001800i.A0X(new ArrayList(list)), null);
        }
        return null;
    }
}
