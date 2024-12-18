package X;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class TLB implements Runnable {
    public final /* synthetic */ Q1g A00;

    public TLB(Q1g q1g) {
        this.A00 = q1g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        QFS qfs = this.A00.A00;
        synchronized (qfs) {
            if (qfs.A04) {
                ArrayList A01 = qfs.A01.A01(false);
                qfs.A09.A00(A01);
                long j = qfs.A02.A01;
                C0JO c0jo = qfs.A07;
                ArrayList A00 = AbstractC62181S1c.A00(A01, j, c0jo.now());
                if (A00 == null) {
                    A00 = AbstractC166987dD.A1E();
                }
                ArrayList A012 = C63282Sgh.A01(qfs.A06, c0jo, A00);
                QFS.A00(qfs);
                qfs.A01(A012);
            }
        }
    }
}
