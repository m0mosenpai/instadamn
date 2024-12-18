package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HrH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40148HrH {
    public static Map A00(JL2 jl2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jl2.getCount();
        A1I.put("count", Integer.valueOf(jl2.getCount()));
        jl2.B7f();
        A1I.put("font_size", AbstractC166997dE.A0e(jl2.B7f()));
        if (jl2.getText() != null) {
            AbstractC37300Gc1.A15(jl2.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
