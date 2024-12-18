package X;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final class PKy implements Runnable {
    public final /* synthetic */ C53614NnL A00;

    public PKy(C53614NnL c53614NnL) {
        this.A00 = c53614NnL;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.A00.A02.iterator();
        while (it.hasNext()) {
            C4G9.A05(AbstractC166987dD.A11(AbstractC166987dD.A1B(it)));
        }
    }
}
