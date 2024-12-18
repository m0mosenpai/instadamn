package X;

/* renamed from: X.9AO, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AO implements InterfaceC42071wx, InterfaceC41801wU {
    public long A00;
    public InterfaceC41801wU A01;
    public final InterfaceC42071wx A02;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        long j = this.A00;
        if (j != 0) {
            this.A00 = j - 1;
        } else {
            this.A02.DVo(obj);
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A01, interfaceC41801wU)) {
            this.A01 = interfaceC41801wU;
            this.A02.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A01.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A02.onComplete();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A02.onError(th);
    }

    public C9AO(InterfaceC42071wx interfaceC42071wx, long j) {
        this.A02 = interfaceC42071wx;
        this.A00 = j;
    }
}
