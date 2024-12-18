package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.66n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1346366n extends AtomicReference implements InterfaceC42071wx, InterfaceC41801wU {
    public final InterfaceC42071wx A00;
    public final AtomicReference A01 = new AtomicReference();

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A00.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A01);
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        C6KP.A01(this.A01);
        C6KP.A01(this);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A00.onComplete();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    public C1346366n(InterfaceC42071wx interfaceC42071wx) {
        this.A00 = interfaceC42071wx;
    }
}
