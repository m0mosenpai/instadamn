package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.YFp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73486YFp implements InterfaceC42071wx {
    public final InterfaceC42071wx A00;
    public final AtomicReference A01;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A00.DVo(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A00(interfaceC41801wU, this.A01);
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        this.A00.onComplete();
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        this.A00.onError(th);
    }

    public C73486YFp(InterfaceC42071wx interfaceC42071wx, AtomicReference atomicReference) {
        this.A00 = interfaceC42071wx;
        this.A01 = atomicReference;
    }
}
