package X;

/* loaded from: classes8.dex */
public final class M4L implements Runnable {
    public final /* synthetic */ LQ2 A00;
    public final /* synthetic */ InterfaceC16820sZ A01;

    public M4L(LQ2 lq2, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = lq2;
        this.A01 = interfaceC16820sZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.A03.compareAndSet(true, false)) {
            this.A01.invoke();
        }
    }
}
