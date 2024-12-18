package X;

/* renamed from: X.TLf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64594TLf implements Runnable {
    public final /* synthetic */ InterfaceC65636Tpx A00;

    public RunnableC64594TLf(InterfaceC65636Tpx interfaceC65636Tpx) {
        this.A00 = interfaceC65636Tpx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onError(new Throwable("Location sharing session creation request failed"));
    }
}
