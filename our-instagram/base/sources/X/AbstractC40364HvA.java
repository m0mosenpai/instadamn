package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HvA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40364HvA {
    public static Map A00(InterfaceC38691r1 interfaceC38691r1) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC38691r1.BeB() != null) {
            A1I.put("pog_start_time", interfaceC38691r1.BeB());
        }
        if (interfaceC38691r1.C42() != null) {
            List<JMO> C42 = interfaceC38691r1.C42();
            ArrayList arrayList = null;
            if (C42 != null) {
                arrayList = AbstractC166987dD.A1E();
                for (JMO jmo : C42) {
                    if (jmo != null) {
                        arrayList.add(jmo.F7o());
                    }
                }
            }
            A1I.put("superlative_cards", arrayList);
        }
        if (interfaceC38691r1.C44() != null) {
            A1I.put("superlative_metadata_id", interfaceC38691r1.C44());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
