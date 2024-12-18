package X;

import java.util.Iterator;

/* loaded from: classes7.dex */
public final class J48 implements Runnable {
    public final /* synthetic */ C37560GgG A00;

    public J48(C37560GgG c37560GgG) {
        this.A00 = c37560GgG;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A0I.iterator();
        while (it.hasNext()) {
            ((JIH) it.next()).E1V();
        }
    }
}
