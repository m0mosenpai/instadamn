package X;

import java.util.Iterator;

/* renamed from: X.Wtu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71432Wtu implements Runnable {
    public final /* synthetic */ C4RW A00;
    public final /* synthetic */ C68692VaS A01;

    public RunnableC71432Wtu(C4RW c4rw, C68692VaS c68692VaS) {
        this.A00 = c4rw;
        this.A01 = c68692VaS;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A00.iterator();
        while (it.hasNext()) {
            ((C4RS) it.next()).DPS(this.A01);
        }
    }
}
