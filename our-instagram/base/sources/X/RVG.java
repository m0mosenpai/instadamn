package X;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes10.dex */
public final class RVG extends SK5 {
    public static final Class A00 = AbstractC58320PtC.A0k();

    public static List A00(Object message, int offset, long additionalCapacity) {
        AbstractList c60801RTm;
        List list = (List) PxF.A00(message, additionalCapacity);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC65686Ts8) {
                InterfaceC65686Ts8 interfaceC65686Ts8 = C60801RTm.A01;
                list = new C60801RTm(AbstractC25225BEi.A17(offset));
            } else {
                list = AbstractC25225BEi.A17(offset);
            }
            C58546PxE.A05(message, additionalCapacity, list);
        } else {
            if (AbstractC58321PtD.A1W(A00, list)) {
                c60801RTm = AbstractC58322PtE.A0w(list, offset);
            } else if (list instanceof TZ7) {
                InterfaceC65686Ts8 interfaceC65686Ts82 = C60801RTm.A01;
                c60801RTm = new C60801RTm(AbstractC58322PtE.A0w(list, offset));
            }
            c60801RTm.addAll(list);
            C58546PxE.A05(message, additionalCapacity, c60801RTm);
            return c60801RTm;
        }
        return list;
    }
}
