package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VRJ {
    public static final void A00(C69355Vm1 c69355Vm1, String str) {
        C68777Vbu c68777Vbu;
        C68776Vbt c68776Vbt;
        List list;
        if (c69355Vm1 != null && (c68777Vbu = c69355Vm1.A04) != null && (c68776Vbt = c68777Vbu.A00) != null && (list = c68776Vbt.A00) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C68985VfN c68985VfN = ((C68775Vbs) it.next()).A00;
                if (c68985VfN != null) {
                    arrayList.add(c68985VfN);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !C14360o3.A0K(((C68985VfN) it2.next()).A01, str)) {
            }
        }
    }
}
