package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TN7 implements Runnable {
    public final /* synthetic */ C58717Q4q A00;
    public final /* synthetic */ String A01;

    public TN7(C58717Q4q c58717Q4q, String str) {
        this.A00 = c58717Q4q;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A05;
        synchronized (list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC65337TiI) it.next()).DxX(this.A01);
            }
        }
    }
}
