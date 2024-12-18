package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class Nv8 {
    public static C51849Mvr A00(List list, boolean z) {
        AbstractC167017dG.A0x();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(it.next());
        }
        return new C51849Mvr(A0q, z);
    }
}
