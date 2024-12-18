package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gcv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC37353Gcv {
    public static Map A00(InterfaceC39001rZ interfaceC39001rZ) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (interfaceC39001rZ.CIr() != null) {
            List<InterfaceC43556JLq> CIr = interfaceC39001rZ.CIr();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC43556JLq interfaceC43556JLq : CIr) {
                if (interfaceC43556JLq != null) {
                    arrayList.add(interfaceC43556JLq.F7o());
                }
            }
            linkedHashMap.put("in", arrayList);
        }
        return AbstractC06930Yk.A0B(linkedHashMap);
    }
}
