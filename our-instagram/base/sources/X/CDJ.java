package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class CDJ {
    public static Map A00(InterfaceC104904o2 interfaceC104904o2) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC104904o2.AyF() != null) {
            List<InterfaceC105994qD> AyF = interfaceC104904o2.AyF();
            ArrayList arrayList = null;
            if (AyF != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC105994qD interfaceC105994qD : AyF) {
                    if (interfaceC105994qD != null) {
                        arrayList.add(interfaceC105994qD.F7o());
                    }
                }
            }
            A1I.put("disclaimers", arrayList);
        }
        if (interfaceC104904o2.B9b() != null) {
            A1I.put(AbstractC111324zv.A00(2426), interfaceC104904o2.B9b());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
