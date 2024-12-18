package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class VAC extends C9QD {
    @Override // X.C9QD
    public final ArrayList A00(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC65924TwV abstractC65924TwV = (AbstractC65924TwV) it.next();
            if (abstractC65924TwV.A01 == 2) {
                arrayList.add(abstractC65924TwV);
            }
        }
        return arrayList;
    }
}
