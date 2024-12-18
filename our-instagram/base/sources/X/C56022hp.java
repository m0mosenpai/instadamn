package X;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashSet;

/* renamed from: X.2hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C56022hp {
    public final C02Q A01 = new C18140uy(10);
    public final C005001p A00 = new C005001p(0);
    public final ArrayList A02 = new ArrayList();
    public final HashSet A03 = new HashSet();

    public static void A00(C56022hp c56022hp, Object obj, ArrayList arrayList, HashSet hashSet) {
        if (!arrayList.contains(obj)) {
            if (!hashSet.contains(obj)) {
                hashSet.add(obj);
                AbstractList abstractList = (AbstractList) c56022hp.A00.get(obj);
                if (abstractList != null) {
                    int size = abstractList.size();
                    for (int i = 0; i < size; i++) {
                        A00(c56022hp, abstractList.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(obj);
                arrayList.add(obj);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
