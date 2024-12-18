package X;

/* renamed from: X.TOl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class RunnableC64654TOl implements Runnable {
    public final /* synthetic */ InterfaceC216113n A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ RunnableC64654TOl(InterfaceC216113n interfaceC216113n, Runnable runnable) {
        this.A00 = interfaceC216113n;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        InterfaceC216113n interfaceC216113n = this.A00;
        Runnable runnable = this.A01;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        try {
            currentThread.setName((String) interfaceC216113n.get());
            z = true;
        } catch (SecurityException unused) {
            z = false;
        }
        try {
            runnable.run();
            if (z) {
                try {
                    currentThread.setName(name);
                } catch (SecurityException unused2) {
                }
            }
        } catch (Throwable th) {
            if (z) {
                try {
                    currentThread.setName(name);
                } catch (SecurityException unused3) {
                }
            }
            throw th;
        }
    }
}
