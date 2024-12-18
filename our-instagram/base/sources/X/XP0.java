package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* loaded from: classes12.dex */
public final class XP0 implements YNm {
    public Runnable A00;
    public final List A01;
    public final C72065XMj A02;

    public XP0(C72065XMj c72065XMj) {
        C14360o3.A0B(c72065XMj, 1);
        this.A02 = c72065XMj;
        this.A01 = AbstractC166987dD.A1E();
    }

    @Override // X.YNm
    public final boolean cancel() {
        Runnable runnable = this.A00;
        if (runnable != null) {
            this.A02.A00.removeCallbacks(runnable, null);
        }
        List list = this.A01;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((Future) it.next()).cancel(true)) {
                    return false;
                }
            }
        }
        return true;
    }
}
