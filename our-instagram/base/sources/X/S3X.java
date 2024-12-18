package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public abstract class S3X {
    public static void A00(List list) {
        java.util.Set<C62550SGb> set;
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63180Sef c63180Sef = (C63180Sef) it.next();
            C62550SGb c62550SGb = new C62550SGb(c63180Sef);
            for (Class cls : c63180Sef.A04) {
                SNh sNh = new SNh(cls, !AbstractC167007dF.A1N(c63180Sef.A01));
                if (!hashMap.containsKey(sNh)) {
                    hashMap.put(sNh, AbstractC166987dD.A1H());
                }
                java.util.Set set2 = (java.util.Set) hashMap.get(sNh);
                if (!set2.isEmpty() && !sNh.A00) {
                    throw AbstractC58319PtB.A0j("Multiple components provide %s.", new Object[]{cls});
                }
                set2.add(c62550SGb);
            }
        }
        Iterator A0k = AbstractC167007dF.A0k(hashMap);
        while (A0k.hasNext()) {
            for (C62550SGb c62550SGb2 : (java.util.Set) A0k.next()) {
                for (C62995SaJ c62995SaJ : c62550SGb2.A00.A03) {
                    if (c62995SaJ.A00 == 0 && (set = (java.util.Set) hashMap.get(new SNh(c62995SaJ.A02, AbstractC167007dF.A1P(c62995SaJ.A01, 2)))) != null) {
                        for (C62550SGb c62550SGb3 : set) {
                            c62550SGb2.A01.add(c62550SGb3);
                            c62550SGb3.A02.add(c62550SGb2);
                        }
                    }
                }
            }
        }
        HashSet A1H = AbstractC166987dD.A1H();
        Iterator A0k2 = AbstractC167007dF.A0k(hashMap);
        while (A0k2.hasNext()) {
            A1H.addAll((Collection) A0k2.next());
        }
        HashSet A1H2 = AbstractC166987dD.A1H();
        Iterator it2 = A1H.iterator();
        while (it2.hasNext()) {
            C62550SGb c62550SGb4 = (C62550SGb) it2.next();
            if (c62550SGb4.A02.isEmpty()) {
                A1H2.add(c62550SGb4);
            }
        }
        int i = 0;
        while (!A1H2.isEmpty()) {
            C62550SGb c62550SGb5 = (C62550SGb) A1H2.iterator().next();
            A1H2.remove(c62550SGb5);
            i++;
            for (C62550SGb c62550SGb6 : c62550SGb5.A01) {
                java.util.Set set3 = c62550SGb6.A02;
                set3.remove(c62550SGb5);
                if (set3.isEmpty()) {
                    A1H2.add(c62550SGb6);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it3 = A1H.iterator();
        while (it3.hasNext()) {
            C62550SGb c62550SGb7 = (C62550SGb) it3.next();
            if (!c62550SGb7.A02.isEmpty() && !c62550SGb7.A01.isEmpty()) {
                A1E.add(c62550SGb7.A00);
            }
        }
        throw new RVR(A1E);
    }
}
