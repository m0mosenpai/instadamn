package X;

/* loaded from: classes8.dex */
public final class LSU implements InterfaceC73600YNc {
    public Throwable A00;
    public boolean A01;
    public boolean A02;

    public final synchronized void A00() {
        this.A01 = true;
    }

    @Override // X.InterfaceC73600YNc
    public final synchronized void targetDestructed() {
        Throwable th;
        if (!this.A01 && (th = this.A00) != null) {
            throw new RuntimeException("Unhandled exception in thread pool", th);
        }
    }
}
