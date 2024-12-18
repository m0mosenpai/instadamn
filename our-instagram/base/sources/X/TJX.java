package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TJX implements Runnable {
    public final /* synthetic */ C62698SMm A00;

    public TJX(C62698SMm c62698SMm) {
        this.A00 = c62698SMm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00.A06;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onUrlChanged");
            }
        }
    }
}
