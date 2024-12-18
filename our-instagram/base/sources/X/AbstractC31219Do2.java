package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Do2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31219Do2 {
    public static Map A00(InterfaceC81773kp interfaceC81773kp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC81773kp.B2G() != null) {
            List<InterfaceC81933lD> B2G = interfaceC81773kp.B2G();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC81933lD interfaceC81933lD : B2G) {
                if (interfaceC81933lD != null) {
                    A1E.add(interfaceC81933lD.F7o());
                }
            }
            A1I.put("entities", A1E);
        }
        if (interfaceC81773kp.BkX() != null) {
            A1I.put("raw_text", interfaceC81773kp.BkX());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
