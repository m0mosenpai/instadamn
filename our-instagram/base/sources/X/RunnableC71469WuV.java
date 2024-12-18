package X;

import java.util.Iterator;

/* renamed from: X.WuV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71469WuV implements Runnable {
    public final /* synthetic */ UtW A00;
    public final /* synthetic */ C106744rW A01;

    public RunnableC71469WuV(UtW utW, C106744rW c106744rW) {
        this.A01 = c106744rW;
        this.A00 = utW;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            this.A01.A03((C106724rU) it.next());
        }
    }
}
