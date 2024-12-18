package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class L7J {
    public final Map A01 = AbstractC166987dD.A1I();
    public final Map A00 = AbstractC166987dD.A1I();
    public final Map A02 = AbstractC166987dD.A1I();

    public final synchronized ArrayList A00(List list) {
        ArrayList A1E;
        A1E = AbstractC166987dD.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C09530e4 A17 = AbstractC43592JPx.A17(it);
            LinkedHashSet A0l = AbstractC31171DnF.A0l();
            java.util.Set set = (java.util.Set) this.A01.get(A17.A00);
            if (set != null) {
                A0l.addAll(set);
            }
            java.util.Set set2 = (java.util.Set) this.A00.get(A17.A01);
            if (set2 != null) {
                A0l.addAll(set2);
            }
            A1E.add(A0l);
        }
        return A1E;
    }
}
