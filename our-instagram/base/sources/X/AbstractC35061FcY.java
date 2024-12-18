package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.FcY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35061FcY {
    public static final ArrayList A00(List list, List list2) {
        if (list != null) {
            ArrayList A1F = AbstractC166987dD.A1F(list);
            ArrayList A0q = AbstractC167017dG.A0q(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                AbstractC167017dG.A1V(A0q, it);
            }
            A1F.removeAll(A0q);
            return A1F;
        }
        return null;
    }

    public static final List A01(List list, List list2) {
        if (list2 != null) {
            ArrayList A1E = AbstractC166987dD.A1E();
            for (Object obj : list) {
                AbstractC25228BEl.A1Q(obj, A1E, list2.contains(AbstractC31171DnF.A0g(obj)) ? 1 : 0);
            }
            return A1E;
        }
        return list;
    }

    public static final List A02(List list, List list2) {
        java.util.Set A0l;
        if (list != null) {
            A0l = AbstractC001800i.A0j(list);
        } else {
            A0l = AbstractC31171DnF.A0l();
        }
        ArrayList A0q = AbstractC167017dG.A0q(list2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC167017dG.A1V(A0q, it);
        }
        A0l.addAll(A0q);
        return AbstractC001800i.A0a(A0l);
    }
}
