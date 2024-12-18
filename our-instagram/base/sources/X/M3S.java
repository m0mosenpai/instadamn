package X;

/* loaded from: classes8.dex */
public final class M3S implements Runnable {
    public final /* synthetic */ InterfaceC50449MPd A00;
    public final /* synthetic */ Exception A01;

    public M3S(InterfaceC50449MPd interfaceC50449MPd, Exception exc) {
        this.A00 = interfaceC50449MPd;
        this.A01 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onFailure(this.A01);
    }
}
