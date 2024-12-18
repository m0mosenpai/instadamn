package X;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Kqu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47037Kqu {
    public static final EnumC46181KcJ A00(List list) {
        Object next;
        EnumC46181KcJ enumC46181KcJ;
        int i;
        C14360o3.A0B(list, 0);
        list.size();
        ArrayList<C194878jo> A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C194878jo c194878jo = AbstractC166987dD.A0l(it).A0F;
            if (c194878jo != null) {
                A1E.add(c194878jo);
            }
        }
        ArrayList A0q = AbstractC167017dG.A0q(A1E);
        for (C194878jo c194878jo2 : A1E) {
            TreeMap treeMap = new TreeMap();
            treeMap.put(EnumC46181KcJ.A06, Float.valueOf(c194878jo2.A08));
            treeMap.put(EnumC46181KcJ.A07, Float.valueOf(c194878jo2.A09));
            treeMap.put(EnumC46181KcJ.A08, Float.valueOf(c194878jo2.A05));
            treeMap.put(EnumC46181KcJ.A03, Float.valueOf(c194878jo2.A04));
            treeMap.put(EnumC46181KcJ.A02, Float.valueOf(c194878jo2.A03));
            treeMap.put(EnumC46181KcJ.A05, Float.valueOf(c194878jo2.A07));
            A0q.add(treeMap);
        }
        TreeMap treeMap2 = new TreeMap();
        Iterator it2 = A0q.iterator();
        while (it2.hasNext()) {
            Iterator A14 = AbstractC166997dE.A14((AbstractMap) it2.next());
            while (A14.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A14);
                EnumC46181KcJ enumC46181KcJ2 = (EnumC46181KcJ) A1K.getKey();
                float A09 = AbstractC166987dD.A09(A1K.getValue());
                switch (enumC46181KcJ2.ordinal()) {
                    case 1:
                    case 3:
                        i = (A09 > 0.8f ? 1 : (A09 == 0.8f ? 0 : -1));
                        break;
                    case 2:
                    case 4:
                        i = (A09 > 0.35f ? 1 : (A09 == 0.35f ? 0 : -1));
                        break;
                    case 5:
                    case 6:
                        i = (A09 > 0.3f ? 1 : (A09 == 0.3f ? 0 : -1));
                        break;
                }
                if (i > 0) {
                    AbstractC166997dE.A1U(enumC46181KcJ2, treeMap2, AbstractC166987dD.A0H(treeMap2.getOrDefault(enumC46181KcJ2, 0)) + 1);
                }
            }
        }
        Iterator A142 = AbstractC166997dE.A14(treeMap2);
        if (!A142.hasNext()) {
            next = null;
        } else {
            next = A142.next();
            if (A142.hasNext()) {
                int A04 = AbstractC43593JPy.A04((Map.Entry) next);
                do {
                    Object next2 = A142.next();
                    int A042 = AbstractC43593JPy.A04((Map.Entry) next2);
                    if (A04 < A042) {
                        next = next2;
                        A04 = A042;
                    }
                } while (A142.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (enumC46181KcJ = (EnumC46181KcJ) entry.getKey()) == null) {
            return EnumC46181KcJ.A04;
        }
        return enumC46181KcJ;
    }
}
