package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hjz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39729Hjz {
    public static Map A00(InterfaceC106354qp interfaceC106354qp) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC106354qp.Anp() != null) {
            A1I.put(AbstractC111324zv.A00(4090), interfaceC106354qp.Anp());
        }
        if (interfaceC106354qp.Anq() != null) {
            A1I.put(AbstractC111324zv.A00(4091), interfaceC106354qp.Anq());
        }
        if (interfaceC106354qp.B1v() != null) {
            A1I.put("end_message", interfaceC106354qp.B1v());
        }
        if (interfaceC106354qp.B1w() != null) {
            A1I.put(AbstractC111324zv.A00(4375), interfaceC106354qp.B1w());
        }
        if (interfaceC106354qp.getText() != null) {
            AbstractC37300Gc1.A15(interfaceC106354qp.getText(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
