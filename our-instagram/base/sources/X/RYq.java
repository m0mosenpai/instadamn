package X;

import com.google.protobuf.UnsafeUtil;
import java.util.AbstractList;
import java.util.List;

/* loaded from: classes10.dex */
public final class RYq extends SK6 {
    public static final Class A00 = AbstractC58320PtC.A0k();

    public static List A00(Object obj, int i, long j) {
        AbstractList rwe;
        List list = (List) AbstractC63034Sb9.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof InterfaceC65687Ts9) {
                InterfaceC65687Ts9 interfaceC65687Ts9 = RWE.A01;
                list = new RWE(AbstractC25225BEi.A17(i));
            } else if ((list instanceof InterfaceC65288ThL) && (list instanceof InterfaceC65691TsD)) {
                list = ((InterfaceC65691TsD) list).Cq5(i);
            } else {
                list = AbstractC25225BEi.A17(i);
            }
            UnsafeUtil.A06(obj, j, list);
        } else {
            if (AbstractC58321PtD.A1W(A00, list)) {
                rwe = AbstractC58322PtE.A0w(list, i);
            } else if (list instanceof TZ9) {
                InterfaceC65687Ts9 interfaceC65687Ts92 = RWE.A01;
                rwe = new RWE(AbstractC58322PtE.A0w(list, i));
            } else if ((list instanceof InterfaceC65288ThL) && (list instanceof InterfaceC65691TsD)) {
                InterfaceC65691TsD interfaceC65691TsD = (InterfaceC65691TsD) list;
                if (!((TZ8) interfaceC65691TsD).A00) {
                    InterfaceC65691TsD Cq5 = interfaceC65691TsD.Cq5(list.size() + i);
                    UnsafeUtil.A06(obj, j, Cq5);
                    return Cq5;
                }
            }
            rwe.addAll(list);
            UnsafeUtil.A06(obj, j, rwe);
            return rwe;
        }
        return list;
    }
}
