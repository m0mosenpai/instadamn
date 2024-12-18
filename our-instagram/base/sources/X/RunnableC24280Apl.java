package X;

import java.util.Iterator;

/* renamed from: X.Apl, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24280Apl implements Runnable {
    public final /* synthetic */ C176347sr A00;

    public RunnableC24280Apl(C176347sr c176347sr) {
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
