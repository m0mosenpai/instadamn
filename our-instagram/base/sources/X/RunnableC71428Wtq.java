package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.Wtq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71428Wtq implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ List A01;

    public RunnableC71428Wtq(C4RW c4rw, List list) {
        this.A00 = c4rw;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DtM(this.A01);
        }
    }
}
