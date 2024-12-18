package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Huk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40340Huk {
    public static Map A00(InterfaceC43513JJz interfaceC43513JJz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43513JJz.AdQ() != null) {
            List<JL9> AdQ = interfaceC43513JJz.AdQ();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JL9 jl9 : AdQ) {
                if (jl9 != null) {
                    A1E.add(jl9.F7o());
                }
            }
            A1I.put("attributions", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
