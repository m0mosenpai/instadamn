package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class A1S {
    public static final C115595Kt A00(C47v c47v, List list, List list2, Map map) {
        C5JH c5jh;
        C9BW c9bw;
        C190178bb c190178bb;
        C14360o3.A0B(list, 0);
        C01L A1I = C0eM.A1I();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                C115585Ks c115585Ks = (C115585Ks) it.next();
                if (!(c115585Ks instanceof C219779nP) || ((c190178bb = ((C219779nP) c115585Ks).A00) != null && c190178bb.A00 > 0.0d)) {
                    A1I.add(c115585Ks);
                }
            }
        }
        C01L A1J = C0eM.A1J(A1I);
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A0i.add(new C9BH((AbstractC115485Ki) it2.next()));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A0i);
        C14360o3.A07(copyOf);
        if (c47v != null) {
            c5jh = c47v.A00(C5JI.A04);
        } else {
            c5jh = null;
        }
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            if (obj instanceof C115475Kh) {
                A1E.add(obj);
            }
        }
        if (map != null) {
            java.util.Set keySet = map.keySet();
            ArrayList A0i2 = AbstractC167007dF.A0i(keySet);
            Iterator it3 = keySet.iterator();
            while (it3.hasNext()) {
                AbstractC166997dE.A1W(A0i2, A1E.indexOf(it3.next()));
            }
            Collection values = map.values();
            ArrayList A0i3 = AbstractC167007dF.A0i(values);
            Iterator it4 = values.iterator();
            while (it4.hasNext()) {
                A0i3.add(new C9BH((List) it4.next(), 6));
            }
            c9bw = new C9BW(A0i2, A0i3, 9);
        } else {
            c9bw = null;
        }
        return new C115595Kt(c9bw, c5jh, c47v, copyOf, A1J);
    }
}
