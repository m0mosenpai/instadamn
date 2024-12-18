package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HuT, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40323HuT {
    public static Map A00(JMN jmn) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmn.BME() != null) {
            A1I.put(AbstractC111324zv.A00(1076), jmn.BME());
        }
        if (jmn.BPp() != null) {
            A1I.put("max_id", jmn.BPp());
        }
        if (jmn.BUs() != null) {
            A1I.put("more_available", jmn.BUs());
        }
        if (jmn.getSliderId() != null) {
            A1I.put("slider_id", jmn.getSliderId());
        }
        if (jmn.CH6() != null) {
            List<InterfaceC43550JLk> CH6 = jmn.CH6();
            ArrayList arrayList = null;
            if (CH6 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC43550JLk interfaceC43550JLk : CH6) {
                    if (interfaceC43550JLk != null) {
                        arrayList.add(interfaceC43550JLk.F7o());
                    }
                }
            }
            A1I.put("voters", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
