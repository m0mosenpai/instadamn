package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.PLm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56867PLm implements Runnable {
    public final /* synthetic */ List A00;

    public RunnableC56867PLm(List list) {
        this.A00 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC197218ns) it.next()).AP5();
        }
    }
}
