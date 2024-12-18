package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FVZ {
    public static final Integer A00(FOC foc) {
        C14360o3.A0B(foc, 0);
        if (foc.A00 != null) {
            return C05F.A00;
        }
        if (foc.A02 != null) {
            return C05F.A01;
        }
        if (foc.A08 != null) {
            return C05F.A0C;
        }
        return null;
    }

    public static final List A01(List list) {
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC132775z0 interfaceC132775z0 = (InterfaceC132775z0) it.next();
            C14360o3.A0B(interfaceC132775z0, 0);
            A0q.add(new FOC(interfaceC132775z0));
        }
        return A0q;
    }
}
