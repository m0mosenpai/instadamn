package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.I5f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40777I5f {
    public static Map A00(InterfaceC43526JKm interfaceC43526JKm) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43526JKm.C5l() != null) {
            List<JM1> C5l = interfaceC43526JKm.C5l();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (JM1 jm1 : C5l) {
                if (jm1 != null) {
                    A1E.add(jm1.F7o());
                }
            }
            A1I.put("templates", A1E);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
