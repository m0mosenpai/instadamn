package X;

import java.util.Iterator;

/* renamed from: X.Wtt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71431Wtt implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ Object A01;

    public RunnableC71431Wtt(C4RW c4rw, Object obj) {
        this.A00 = c4rw;
        this.A01 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DTa(this.A01);
        }
    }
}
