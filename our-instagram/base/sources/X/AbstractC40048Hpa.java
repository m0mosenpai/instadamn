package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40048Hpa {
    public static Map A00(InterfaceC43566JMa interfaceC43566JMa) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43566JMa.Ap3() != null) {
            A1I.put("collection_id", interfaceC43566JMa.Ap3());
        }
        if (interfaceC43566JMa.getEffectId() != null) {
            A1I.put("effect_id", interfaceC43566JMa.getEffectId());
        }
        if (interfaceC43566JMa.B0i() != null) {
            A1I.put("effect_type", interfaceC43566JMa.B0i());
        }
        if (interfaceC43566JMa.B42() != null) {
            A1I.put("facebook_places_id", interfaceC43566JMa.B42());
        }
        if (interfaceC43566JMa.CRT() != null) {
            A1I.put("is_collected", interfaceC43566JMa.CRT());
        }
        interfaceC43566JMa.BM7();
        A1I.put("lat", AbstractC166997dE.A0e(interfaceC43566JMa.BM7()));
        interfaceC43566JMa.BO8();
        A1I.put("lng", AbstractC166997dE.A0e(interfaceC43566JMa.BO8()));
        if (interfaceC43566JMa.getName() != null) {
            AbstractC37300Gc1.A14(interfaceC43566JMa.getName(), A1I);
        }
        if (interfaceC43566JMa.Bdf() != null) {
            A1I.put("placement_id", interfaceC43566JMa.Bdf());
        }
        if (interfaceC43566JMa.Bjy() != null) {
            A1I.put("radius", AbstractC166997dE.A0f(interfaceC43566JMa.Bjy()));
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
