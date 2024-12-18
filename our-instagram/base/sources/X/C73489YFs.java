package X;

/* renamed from: X.YFs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C73489YFs implements InterfaceC42071wx, InterfaceC41801wU {
    public InterfaceC41801wU A00;
    public Object A01;
    public boolean A02;
    public final C72091XNl A03;
    public final InterfaceC42071wx A04;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A02) {
            try {
                Object apply = this.A03.A00.apply(this.A01, obj);
                AbstractC42141x4.A01(apply, "The accumulator returned a null value");
                this.A01 = apply;
                this.A04.DVo(apply);
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
            InterfaceC42071wx interfaceC42071wx = this.A04;
            interfaceC42071wx.Dpc(this);
            interfaceC42071wx.DVo(this.A01);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A00.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A02) {
            this.A02 = true;
            this.A04.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A02) {
            AbstractC142886co.A02(th);
        } else {
            this.A02 = true;
            this.A04.onError(th);
        }
    }

    public C73489YFs(C72091XNl c72091XNl, InterfaceC42071wx interfaceC42071wx, Object obj) {
        this.A04 = interfaceC42071wx;
        this.A03 = c72091XNl;
        this.A01 = obj;
    }
}
