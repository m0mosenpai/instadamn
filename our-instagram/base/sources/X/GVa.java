package X;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GVa extends C0YY implements InterfaceC16660sJ {
    public static final GVa A00 = new GVa();

    public GVa() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        java.util.Set set = (java.util.Set) obj;
        C14360o3.A0B(set, 0);
        java.util.Set set2 = AbstractC34380FDw.A00;
        boolean z = false;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (set2.contains(it.next())) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
