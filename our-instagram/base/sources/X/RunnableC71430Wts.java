package X;

import java.util.Iterator;

/* renamed from: X.Wts, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71430Wts implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ boolean A01;

    public RunnableC71430Wts(C4RW c4rw, boolean z) {
        this.A00 = c4rw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DPI(this.A01);
        }
    }
}
