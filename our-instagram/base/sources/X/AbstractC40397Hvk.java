package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hvk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40397Hvk {
    public static Map A00(InterfaceC99414dE interfaceC99414dE) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC99414dE.B8X() != null) {
            List<JMW> B8X = interfaceC99414dE.B8X();
            ArrayList arrayList = null;
            if (B8X != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMW jmw : B8X) {
                    if (jmw != null) {
                        arrayList.add(jmw.F7o());
                    }
                }
            }
            A1I.put("fragments", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
