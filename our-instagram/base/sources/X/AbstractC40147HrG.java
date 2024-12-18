package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HrG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40147HrG {
    public static Map A00(JL1 jl1) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jl1.getId() != null) {
            AbstractC37300Gc1.A12(jl1.getId(), A1I);
        }
        if (jl1.C5D() != null) {
            List<JL2> C5D = jl1.C5D();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JL2 jl2 : C5D) {
                if (jl2 != null) {
                    A1E.add(jl2.F7o());
                }
            }
            A1I.put("tallies", A1E);
        }
        if (jl1.getText() != null) {
            AbstractC37300Gc1.A15(jl1.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
