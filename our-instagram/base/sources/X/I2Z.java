package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I2Z {
    public static Map A00(InterfaceC43565JLz interfaceC43565JLz) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC43565JLz.Ac6() != null) {
            List<InterfaceC43541JLb> Ac6 = interfaceC43565JLz.Ac6();
            ArrayList arrayList = null;
            if (Ac6 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43541JLb interfaceC43541JLb : Ac6) {
                    if (interfaceC43541JLb != null) {
                        arrayList.add(interfaceC43541JLb.F7o());
                    }
                }
            }
            A1I.put("answers", arrayList);
        }
        if (interfaceC43565JLz.BjI() != null) {
            A1I.put("qid", interfaceC43565JLz.BjI());
        }
        if (interfaceC43565JLz.getTitle() != null) {
            AbstractC37300Gc1.A17(interfaceC43565JLz.getTitle(), A1I);
        }
        if (interfaceC43565JLz.C9w() != null) {
            A1I.put("total_responders", interfaceC43565JLz.C9w());
        }
        if (interfaceC43565JLz.CBn() != null) {
            AbstractC37300Gc1.A16(interfaceC43565JLz.CBn(), A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
