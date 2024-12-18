package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hk1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39731Hk1 {
    public static Map A00(InterfaceC106374qr interfaceC106374qr) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC106374qr.Ac6() != null) {
            List<InterfaceC106354qp> Ac6 = interfaceC106374qr.Ac6();
            ArrayList A1E = AbstractC166987dD.A1E();
            for (InterfaceC106354qp interfaceC106354qp : Ac6) {
                if (interfaceC106354qp != null) {
                    A1E.add(interfaceC106354qp.F7o());
                }
            }
            A1I.put("answers", A1E);
        }
        if (interfaceC106374qr.BjV() != null) {
            A1I.put("question_id", interfaceC106374qr.BjV());
        }
        if (interfaceC106374qr.C3E() != null) {
            A1I.put(AbstractC111324zv.A00(3184), interfaceC106374qr.C3E());
        }
        if (interfaceC106374qr.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC106374qr.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
