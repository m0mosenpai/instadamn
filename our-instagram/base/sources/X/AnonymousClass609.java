package X;

/* renamed from: X.609, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass609 implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public boolean A01;
    public final InterfaceC42071wx A02;
    public final InterfaceC42111x1 A03;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A01) {
            try {
                if (!this.A03.test(obj)) {
                    this.A01 = true;
                    this.A00.dispose();
                    InterfaceC42071wx interfaceC42071wx = this.A02;
                    interfaceC42071wx.DVo(false);
                    interfaceC42071wx.onComplete();
                }
            } catch (Throwable th) {
                AbstractC62281S5a.A00(th);
                this.A00.dispose();
                onError(th);
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A00, interfaceC41801wU)) {
            this.A00 = interfaceC41801wU;
            this.A02.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A01) {
            this.A01 = true;
            InterfaceC42071wx interfaceC42071wx = this.A02;
            interfaceC42071wx.DVo(true);
            interfaceC42071wx.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A01) {
            AbstractC142886co.A02(th);
        } else {
            this.A01 = true;
            this.A02.onError(th);
        }
    }

    public AnonymousClass609(InterfaceC42071wx interfaceC42071wx, InterfaceC42111x1 interfaceC42111x1) {
        this.A02 = interfaceC42071wx;
        this.A03 = interfaceC42111x1;
    }
}
