package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.GdH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37375GdH {
    public static Map A00(InterfaceC81733ki interfaceC81733ki) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC81733ki.B9F() != null) {
            List<InterfaceC43571JMf> B9F = interfaceC81733ki.B9F();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC43571JMf interfaceC43571JMf : B9F) {
                if (interfaceC43571JMf != null) {
                    A1E.add(interfaceC43571JMf.F7o());
                }
            }
            A1I.put("fundraisers", A1E);
        }
        interfaceC81733ki.C9n();
        return AbstractC37301Gc2.A0r("total_count", Integer.valueOf(interfaceC81733ki.C9n()), A1I);
    }
}
