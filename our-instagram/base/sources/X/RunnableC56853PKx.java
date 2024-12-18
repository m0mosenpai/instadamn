package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.PKx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56853PKx implements Runnable {
    public final /* synthetic */ List A00;

    public RunnableC56853PKx(List list) {
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            C4G9.A05(AbstractC166987dD.A11(AbstractC166987dD.A1B(it)));
        }
    }
}
