package X;

/* renamed from: X.XMc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72060XMc implements InterfaceC42071wx {
    public final C72058XMa A00;
    public final /* synthetic */ C72104XNy A01;

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
    }

    public C72060XMc(C72058XMa c72058XMa, C72104XNy c72104XNy) {
        this.A01 = c72104XNy;
        this.A00 = c72058XMa;
    }

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        this.A00.lazySet(obj);
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        C6KP.A03(interfaceC41801wU, this.A00.A02);
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        C72058XMa c72058XMa = this.A00;
        C6KP.A01(c72058XMa.A03);
        c72058XMa.A01.onError(th);
    }
}
