package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hld, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39829Hld {
    public static Map A00(C5J2 c5j2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        c5j2.getDurationInMs();
        A1I.put("duration_in_ms", Long.valueOf(c5j2.getDurationInMs()));
        if (c5j2.BHQ() != null) {
            A1I.put("index", c5j2.BHQ());
        }
        if (c5j2.getName() != null) {
            AbstractC37300Gc1.A14(c5j2.getName(), A1I);
        }
        c5j2.getStartTimeInMs();
        return AbstractC37301Gc2.A0r("start_time_in_ms", Long.valueOf(c5j2.getStartTimeInMs()), A1I);
    }
}
