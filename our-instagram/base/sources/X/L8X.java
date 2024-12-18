package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class L8X {
    public final ConcurrentHashMap A00 = new ConcurrentHashMap();
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();

    public final boolean A01() {
        ConcurrentHashMap concurrentHashMap = this.A00;
        if (!concurrentHashMap.isEmpty()) {
            Iterator A14 = AbstractC166997dE.A14(concurrentHashMap);
            while (A14.hasNext()) {
                Iterable iterable = (Iterable) AbstractC31176DnK.A0j(A14);
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        if (C14360o3.A0K(((C148286ly) ((C25547BRj) it.next()).A01).A0U, "avatar_sticker")) {
                            return true;
                        }
                    }
                }
            }
        }
        ConcurrentHashMap concurrentHashMap2 = this.A01;
        if (!concurrentHashMap2.isEmpty()) {
            Iterator A142 = AbstractC166997dE.A14(concurrentHashMap2);
            while (A142.hasNext()) {
                Iterable iterable2 = (Iterable) AbstractC31176DnK.A0j(A142);
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it2 = iterable2.iterator();
                    while (it2.hasNext()) {
                        if (C14360o3.A0K(((C148286ly) ((C25547BRj) it2.next()).A01).A0U, "avatar_sticker")) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final List A00(List list, String str) {
        ArrayList A0i;
        AbstractC167017dG.A1N(list, str);
        List list2 = (List) this.A01.get(str);
        if (list2 != null) {
            A0i = AbstractC167007dF.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0i.add(((C25547BRj) it.next()).A01);
            }
        } else {
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object obj = this.A00.get(it2.next());
                if (obj != null) {
                    A1E.add(obj);
                }
            }
            List A0g = AbstractC001800i.A0g(AbstractC06950Ym.A1F(A1E), new BJT(0));
            HashSet A1H = AbstractC166987dD.A1H();
            ArrayList A1E2 = AbstractC166987dD.A1E();
            for (Object obj2 : A0g) {
                AbstractC25231BEo.A1F(((C148286ly) ((C25547BRj) obj2).A01).A0S, obj2, A1H, A1E2);
            }
            A0i = AbstractC167007dF.A0i(A1E2);
            Iterator it3 = A1E2.iterator();
            while (it3.hasNext()) {
                A0i.add(((C25547BRj) it3.next()).A01);
            }
        }
        return A0i;
    }
}
