package X;

import java.util.Iterator;

/* renamed from: X.Wvv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71546Wvv implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;
    public final /* synthetic */ String A02;

    public RunnableC71546Wvv(C4RW c4rw, String str, long j) {
        this.A01 = c4rw;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DIJ(this.A02, this.A00);
        }
    }
}
