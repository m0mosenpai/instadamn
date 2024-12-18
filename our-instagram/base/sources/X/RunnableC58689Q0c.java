package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Q0c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58689Q0c implements Runnable {
    public final /* synthetic */ C0TM A00;
    public final /* synthetic */ C2RK A01;

    public RunnableC58689Q0c(C0TM c0tm, C2RK c2rk) {
        this.A01 = c2rk;
        this.A00 = c0tm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2RK c2rk = this.A01;
        synchronized (c2rk) {
            if (!c2rk.A05) {
                return;
            }
            ArrayList A1E = AbstractC166987dD.A1E();
            java.util.Set set = c2rk.A0E;
            synchronized (set) {
                A1E.addAll(set);
            }
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                ((C0TT) it.next()).DES(this.A00);
            }
        }
    }
}
