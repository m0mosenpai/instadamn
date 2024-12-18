package X;

import java.util.Iterator;

/* renamed from: X.8po, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC198398po implements Runnable {
    public final /* synthetic */ C176347sr A00;

    public RunnableC198398po(C176347sr c176347sr) {
        this.A00 = c176347sr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }
}
