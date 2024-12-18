package X;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class LEJ {
    public final List A00 = AbstractC166987dD.A1E();
    public final List A01;

    public static final void A00(Context context, C41761wQ c41761wQ, LEJ lej, Integer num, Integer num2, InterfaceC16660sJ interfaceC16660sJ, int i, boolean z) {
        String str;
        Object kpv;
        List list = lej.A01;
        if (i >= list.size()) {
            List list2 = lej.A00;
            if (AbstractC166987dD.A1b(list2)) {
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (it.next() instanceof KPX) {
                            kpv = KPX.A00;
                            break;
                        }
                    }
                }
                kpv = AbstractC001800i.A0K(list2);
            } else {
                if (list.isEmpty()) {
                    str = "No seamless handlers";
                } else {
                    str = "Null handler result";
                }
                kpv = new KPV(str);
            }
            interfaceC16660sJ.invoke(kpv);
            return;
        }
        ((InterfaceC50454MPi) list.get(i)).E4D(context, c41761wQ, num, num2, new C50271MIa(context, c41761wQ, lej, num, num2, interfaceC16660sJ, i, z), z);
    }

    public LEJ(List list) {
        this.A01 = list;
    }
}
