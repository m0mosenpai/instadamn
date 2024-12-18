package X;

import java.util.Iterator;

/* renamed from: X.TvP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC65862TvP implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;

    public RunnableC65862TvP(C4RW c4rw, long j) {
        this.A01 = c4rw;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).onSeeking(this.A00);
        }
    }
}
