package X;

import java.lang.ref.ReferenceQueue;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class SM9 {
    public C63182Seh A00;
    public final ReferenceQueue A01;
    public final Map A02;
    public final Executor A03;

    public SM9() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new TV6(0));
        this.A02 = AbstractC166987dD.A1G();
        this.A01 = new ReferenceQueue();
        this.A03 = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new TJW(this));
    }

    public final synchronized void A00(InterfaceC65617To8 interfaceC65617To8, C63789Stj c63789Stj) {
        C64881TYh c64881TYh = (C64881TYh) this.A02.put(interfaceC65617To8, new C64881TYh(interfaceC65617To8, c63789Stj, this.A01));
        if (c64881TYh != null) {
            c64881TYh.clear();
        }
    }
}
