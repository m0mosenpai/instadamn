package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hob, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39994Hob {
    public static Map A00(JKI jki) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jki.AeM() != null) {
            A1I.put("availabilityConditions", jki.AeM());
        }
        if (jki.CQL() != null) {
            A1I.put("isAvailable", jki.CQL());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
