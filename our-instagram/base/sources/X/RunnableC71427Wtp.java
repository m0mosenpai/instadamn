package X;

import java.util.Iterator;

/* renamed from: X.Wtp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71427Wtp implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ C117275Sm A01;

    public RunnableC71427Wtp(C4RW c4rw, C117275Sm c117275Sm) {
        this.A00 = c4rw;
        this.A01 = c117275Sm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).E1j(this.A01);
        }
    }
}
