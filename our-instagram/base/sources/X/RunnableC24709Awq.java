package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Awq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24709Awq implements Runnable {
    public final /* synthetic */ B0D A00;
    public final /* synthetic */ Exception A01;

    public RunnableC24709Awq(B0D b0d, Exception exc) {
        this.A00 = b0d;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CopyOnWriteArraySet copyOnWriteArraySet = this.A00.A00;
        Exception exc = this.A01;
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((BD5) it.next()).DKi(exc);
        }
    }
}
