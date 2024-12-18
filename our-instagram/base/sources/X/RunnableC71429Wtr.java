package X;

import java.util.Iterator;

/* renamed from: X.Wtr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71429Wtr implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ boolean A01;

    public RunnableC71429Wtr(C4RW c4rw, boolean z) {
        this.A00 = c4rw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DpT(this.A01);
        }
    }
}
