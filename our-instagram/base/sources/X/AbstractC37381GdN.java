package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.GdN, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37381GdN {
    public static Map A00(InterfaceC88353wq interfaceC88353wq) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC88353wq.AYx() != null) {
            A1I.put("actor_id", interfaceC88353wq.AYx());
        }
        if (interfaceC88353wq.B3H() != null) {
            A1I.put("explanation", interfaceC88353wq.B3H());
        }
        if (interfaceC88353wq.B3M() != null) {
            A1I.put(AbstractC111324zv.A00(2330), interfaceC88353wq.B3M());
        }
        if (interfaceC88353wq.BIx() != null) {
            A1I.put("interest", interfaceC88353wq.BIx());
        }
        if (interfaceC88353wq.BIy() != null) {
            A1I.put("interest_id", interfaceC88353wq.BIy());
        }
        if (interfaceC88353wq.CU3() != null) {
            A1I.put("is_explanation_clickable", interfaceC88353wq.CU3());
        }
        if (interfaceC88353wq.Byt() != null) {
            A1I.put("source_token", interfaceC88353wq.Byt());
        }
        if (interfaceC88353wq.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC88353wq.getTitle(), A1I);
        }
        if (interfaceC88353wq.C8y() != null) {
            A1I.put("title_id", interfaceC88353wq.C8y());
        }
        if (interfaceC88353wq.C9b() != null) {
            A1I.put("topic", interfaceC88353wq.C9b());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
