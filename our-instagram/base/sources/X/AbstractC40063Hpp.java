package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Hpp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40063Hpp {
    public static Map A00(InterfaceC74423Vy interfaceC74423Vy) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (interfaceC74423Vy.Boc() != null) {
            List<InterfaceC74403Vw> Boc = interfaceC74423Vy.Boc();
            ArrayList arrayList = null;
            if (Boc != null) {
                arrayList = AbstractC166987dD.A1E();
                for (InterfaceC74403Vw interfaceC74403Vw : Boc) {
                    if (interfaceC74403Vw != null) {
                        arrayList.add(interfaceC74403Vw.F7o());
                    }
                }
            }
            A1I.put("resources", arrayList);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
