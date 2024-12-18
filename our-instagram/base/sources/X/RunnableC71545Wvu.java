package X;

import java.util.Iterator;

/* renamed from: X.Wvu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71545Wvu implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;
    public final /* synthetic */ byte[] A02;

    public RunnableC71545Wvu(C4RW c4rw, byte[] bArr, long j) {
        this.A01 = c4rw;
        this.A02 = bArr;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DVN(this.A02, this.A00);
        }
    }
}
