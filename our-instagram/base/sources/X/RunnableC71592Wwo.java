package X;

import java.util.Iterator;

/* renamed from: X.Wwo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71592Wwo implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C4RW A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ byte[] A03;

    public RunnableC71592Wwo(C4RW c4rw, String str, byte[] bArr, long j) {
        this.A01 = c4rw;
        this.A03 = bArr;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DLl(this.A02, this.A03, this.A00);
        }
    }
}
