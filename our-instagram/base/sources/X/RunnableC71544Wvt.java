package X;

import java.util.Iterator;

/* renamed from: X.Wvt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71544Wvt implements Runnable {
    public final /* synthetic */ InterfaceC138736Qd A00;
    public final /* synthetic */ C5M1 A01;
    public final /* synthetic */ java.util.Set A02;

    public RunnableC71544Wvt(InterfaceC138736Qd interfaceC138736Qd, C5M1 c5m1, java.util.Set set) {
        this.A02 = set;
        this.A01 = c5m1;
        this.A00 = interfaceC138736Qd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            try {
                this.A01.AV8(this.A00, (C6PT) it.next(), null, false);
            } catch (C902840n unused) {
            }
        }
    }
}
