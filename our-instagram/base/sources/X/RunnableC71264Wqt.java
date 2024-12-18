package X;

import java.util.Iterator;

/* renamed from: X.Wqt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71264Wqt implements Runnable {
    public final /* synthetic */ C4RW A00;

    public RunnableC71264Wqt(C4RW c4rw) {
        this.A00 = c4rw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).Dzs();
        }
    }
}
