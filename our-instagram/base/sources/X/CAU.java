package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CAU {
    public final boolean A00() {
        if (this instanceof C27339C4u) {
            List list = ((C27339C4u) this).A04;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C29528Czg) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
