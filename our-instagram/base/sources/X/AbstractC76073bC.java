package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.3bC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC76073bC {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.AbstractCollection] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0sJ] */
    public static final void A00(String str, InterfaceC16660sJ interfaceC16660sJ, int i) {
        long currentTimeMillis = System.currentTimeMillis();
        if (EnumC50702Ur.A02.compareTo(AbstractC50692Uq.A00()) >= 0) {
            java.util.Set set = AbstractC50692Uq.A00;
            if (!set.isEmpty()) {
                ?? r0 = 0;
                for (Object obj : set) {
                    String[] strArr = ((AbstractC50682Uo) obj).A00;
                    if (AbstractC009903n.A0O(str, strArr) || AbstractC009903n.A0O("*", strArr)) {
                        if (r0 == 0) {
                            r0 = new ArrayList();
                        }
                        r0.add(obj);
                    }
                }
                if (r0 == 0) {
                    r0 = C16930sl.A00;
                }
                if (!r0.isEmpty()) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    interfaceC16660sJ.invoke(linkedHashMap);
                    C58571Pxp c58571Pxp = new C58571Pxp(currentTimeMillis, str, String.valueOf(i), linkedHashMap);
                    Iterator it = r0.iterator();
                    while (it.hasNext()) {
                        ((AbstractC50682Uo) it.next()).A00(c58571Pxp);
                    }
                }
            }
        }
    }
}
