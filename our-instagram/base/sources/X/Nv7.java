package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes9.dex */
public abstract class Nv7 {
    public static C51847Mvp A00(InterfaceC58258Ps2 interfaceC58258Ps2, String str, List list) {
        AbstractC167017dG.A0x();
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(it.next());
        }
        return new C51847Mvp((C51851Mvt) interfaceC58258Ps2, str, A0q);
    }
}
