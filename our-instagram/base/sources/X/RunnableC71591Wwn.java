package X;

import java.util.Iterator;

/* renamed from: X.Wwn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71591Wwn implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C4RW A02;
    public final /* synthetic */ C4RU A03;

    public RunnableC71591Wwn(C4RW c4rw, C4RU c4ru, float f, long j) {
        this.A02 = c4rw;
        this.A00 = f;
        this.A01 = j;
        this.A03 = c4ru;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A02.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DZA(this.A03, this.A00, this.A01);
        }
    }
}
