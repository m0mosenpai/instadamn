package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VRK {
    public static final void A00(C69356Vm2 c69356Vm2, String str) {
        C68791Vc8 c68791Vc8;
        C68790Vc7 c68790Vc7;
        List list;
        if (c69356Vm2 != null && (c68791Vc8 = c69356Vm2.A04) != null && (c68790Vc7 = c68791Vc8.A00) != null && (list = c68790Vc7.A00) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C68988VfQ c68988VfQ = ((C68789Vc6) it.next()).A00;
                if (c68988VfQ != null) {
                    arrayList.add(c68988VfQ);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && !C14360o3.A0K(((C68988VfQ) it2.next()).A01, str)) {
            }
        }
    }
}
