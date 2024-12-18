package X;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public abstract class Q05 {
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, X.Q06] */
    public static Q06 A00(InterfaceC102764kD interfaceC102764kD) {
        ?? obj = new Object();
        if (interfaceC102764kD.E3x() != C05F.A0C) {
            interfaceC102764kD.EmB();
            return null;
        }
        while (interfaceC102764kD.Csy() != C05F.A0N) {
            String E3u = interfaceC102764kD.E3u();
            boolean z = false;
            if (AbstractC102804kH.A00(E3u) >= 32) {
                z = true;
            }
            interfaceC102764kD.Csy();
            if (!z && "components".equals(E3u)) {
                ArrayList arrayList = null;
                if (interfaceC102764kD.E3x() == C05F.A00) {
                    arrayList = new ArrayList();
                    while (interfaceC102764kD.Csy() != C05F.A01) {
                        C62516SEs A00 = AbstractC58671Pzj.A00(null, interfaceC102764kD, null);
                        if (A00 != null) {
                            arrayList.add(A00);
                        }
                    }
                }
                obj.A00 = arrayList;
            }
            interfaceC102764kD.EmB();
        }
        return obj;
    }
}
