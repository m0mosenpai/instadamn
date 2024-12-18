package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hq7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40081Hq7 {
    public static Map A00(JL0 jl0) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jl0.AcQ() != null) {
            A1I.put("application_type", jl0.AcQ());
        }
        if (jl0.AyH() != null) {
            A1I.put("discount_id", jl0.AyH());
        }
        if (jl0.getTitle() != null) {
            AbstractC37300Gc1.A17(jl0.getTitle(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
