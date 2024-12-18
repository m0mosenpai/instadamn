package X;

import java.util.AbstractList;
import java.util.List;

/* renamed from: X.PuO, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58384PuO extends AbstractC58385PuP {
    public static final Class A00 = AbstractC58320PtC.A0k();

    public static List A00(Object obj, int i, long j) {
        AbstractList q7k;
        List list = (List) AbstractC58403Puh.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC65684Ts6) {
                InterfaceC65684Ts6 interfaceC65684Ts6 = Q7K.A01;
                list = new Q7K(AbstractC25225BEi.A17(i));
            } else {
                list = AbstractC25225BEi.A17(i);
            }
            C58400Pue.A06(obj, j, list);
        } else {
            if (AbstractC58321PtD.A1W(A00, list)) {
                q7k = AbstractC58322PtE.A0w(list, i);
            } else if (list instanceof TZ2) {
                InterfaceC65684Ts6 interfaceC65684Ts62 = Q7K.A01;
                q7k = new Q7K(AbstractC58322PtE.A0w(list, i));
            }
            q7k.addAll(list);
            C58400Pue.A06(obj, j, q7k);
            return q7k;
        }
        return list;
    }
}
