package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class VRG {
    public static final ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C69281Vkp c69281Vkp = (C69281Vkp) it.next();
            float f = 0.0f;
            Iterator it2 = c69281Vkp.A04.iterator();
            while (it2.hasNext()) {
                f += ((C69551VrG) it2.next()).A00;
            }
            double d = f;
            if (0.0d <= d && d <= 1.0d) {
                arrayList.add(c69281Vkp);
            }
        }
        return arrayList;
    }
}
