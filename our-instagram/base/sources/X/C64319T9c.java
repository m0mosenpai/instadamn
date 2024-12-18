package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.T9c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C64319T9c implements InterfaceC65434Tk5 {
    public static final /* synthetic */ C64319T9c A00 = new Object();

    @Override // X.InterfaceC65434Tk5
    public final Object ALR(AbstractC61607RqW abstractC61607RqW) {
        C62508SEk c62508SEk = new C62508SEk();
        RunnableC64721TRc runnableC64721TRc = RunnableC64721TRc.A00;
        final ReferenceQueue referenceQueue = c62508SEk.A00;
        final java.util.Set set = c62508SEk.A01;
        set.add(new C64879TYf(c62508SEk, runnableC64721TRc, referenceQueue, set));
        Thread thread = new Thread(new Runnable() { // from class: X.TOr
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                java.util.Set set2 = set;
                while (!set2.isEmpty()) {
                    try {
                        C64879TYf c64879TYf = (C64879TYf) referenceQueue2.remove();
                        if (c64879TYf.A01.remove(c64879TYf)) {
                            c64879TYf.clear();
                            c64879TYf.A00.run();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c62508SEk;
    }
}
