package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C198708qO implements InterfaceC198698qK {
    public final ArrayList A00 = new ArrayList();

    @Override // X.InterfaceC198698qK
    public final void FAd(Long l) {
        long j;
        Iterator it = this.A00.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C14360o3.A07(next);
            C22899A7t c22899A7t = (C22899A7t) next;
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            List list = c22899A7t.A02;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Number) obj).longValue() <= j) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = list.iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (((Number) it2.next()).longValue() == ((Number) AbstractC001800i.A0K(arrayList)).longValue()) {
                        if (i >= 0) {
                            List list2 = c22899A7t.A01;
                            if (i < list2.size()) {
                                AbstractC199788sU.A01(c22899A7t.A00, (float[]) list2.get(i));
                            }
                        }
                    } else {
                        i++;
                    }
                }
            }
        }
    }
}
