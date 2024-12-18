package X;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TN8 implements Runnable {
    public final /* synthetic */ R7U A00;
    public final /* synthetic */ C62698SMm A01;

    public TN8(R7U r7u, C62698SMm c62698SMm) {
        this.A01 = c62698SMm;
        this.A00 = r7u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A01.A04;
        synchronized (list) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AbstractC166987dD.A15("onPageStartedLoading");
            }
        }
    }
}
