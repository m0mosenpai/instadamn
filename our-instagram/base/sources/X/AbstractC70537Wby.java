package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wby, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70537Wby implements InterfaceC71907X9r {
    public static final ArrayList A00(List list) {
        int i;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C4BF c4bf = (C4BF) it.next();
            if (c4bf != null && c4bf.A01 == 2) {
                hashSet.add(Integer.toString(c4bf.A00));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C4BF c4bf2 = (C4BF) it2.next();
            if (c4bf2 != null && (i = c4bf2.A01) == 2) {
                ArrayList arrayList2 = new ArrayList();
                for (C92164Aw c92164Aw : c4bf2.A08) {
                    if (c92164Aw != null && hashSet.contains(c92164Aw.A02)) {
                        arrayList2.add(c92164Aw);
                    }
                }
                arrayList.add(new C4BF(c4bf2.A03, c4bf2.A04, c4bf2.A02, c4bf2.A07, c4bf2.A05, c4bf2.A06, arrayList2, c4bf2.A00, i, c4bf2.A09, c4bf2.A0A));
            } else {
                arrayList.add(c4bf2);
            }
        }
        return arrayList;
    }
}
