package X;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class TP7 implements Runnable {
    public final /* synthetic */ Exception A00;
    public final /* synthetic */ java.util.Set A01;

    public TP7(Exception exc, java.util.Set set) {
        this.A01 = set;
        this.A00 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC65352Tig) it.next()).handleException(this.A00);
        }
    }
}
