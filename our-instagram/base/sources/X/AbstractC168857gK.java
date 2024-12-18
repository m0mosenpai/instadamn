package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7gK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC168857gK {
    public static final C84923qg A00(C1DV c1dv, InterfaceC38901rP interfaceC38901rP) {
        C14360o3.A0B(interfaceC38901rP, 0);
        C14360o3.A0B(c1dv, 1);
        return new C84923qg(interfaceC38901rP.F4V(c1dv));
    }

    public static final List A01(C1DV c1dv, List list) {
        C14360o3.A0B(c1dv, 1);
        ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(A00(c1dv, (InterfaceC38901rP) it.next()));
        }
        return arrayList;
    }
}
