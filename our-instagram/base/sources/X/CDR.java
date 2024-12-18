package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDR {
    public static Map A00(InterfaceC101464h8 interfaceC101464h8) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC101464h8.Caa() != null) {
            A1I.put("is_possible_impersonator", interfaceC101464h8.Caa().F7o());
        }
        if (interfaceC101464h8.Cab() != null) {
            A1I.put("is_possible_impersonator_threads", interfaceC101464h8.Cab().F7o());
        }
        interfaceC101464h8.Cad();
        A1I.put(AbstractC111324zv.A00(4768), Boolean.valueOf(interfaceC101464h8.Cad()));
        return AbstractC06930Yk.A0B(A1I);
    }
}
