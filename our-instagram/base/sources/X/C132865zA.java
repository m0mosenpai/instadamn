package X;

/* renamed from: X.5zA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132865zA implements InterfaceC42071wx, InterfaceC41801wU {
    public long A00;
    public InterfaceC41801wU A01;
    public boolean A02;
    public final InterfaceC42071wx A03;

    @Override // X.InterfaceC42071wx
    public final void DVo(Object obj) {
        if (!this.A02) {
            long j = this.A00;
            long j2 = j - 1;
            this.A00 = j2;
            if (j > 0) {
                boolean z = false;
                if (j2 == 0) {
                    z = true;
                }
                this.A03.DVo(obj);
                if (z) {
                    onComplete();
                }
            }
        }
    }

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A01, interfaceC41801wU)) {
            this.A01 = interfaceC41801wU;
            if (this.A00 == 0) {
                this.A02 = true;
                interfaceC41801wU.dispose();
                InterfaceC42071wx interfaceC42071wx = this.A03;
                interfaceC42071wx.Dpc(EnumC137086Im.INSTANCE);
                interfaceC42071wx.onComplete();
                return;
            }
            this.A03.Dpc(this);
        }
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A01.dispose();
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A02) {
            this.A02 = true;
            this.A01.dispose();
            this.A03.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A02) {
            AbstractC142886co.A02(th);
            return;
        }
        this.A02 = true;
        this.A01.dispose();
        this.A03.onError(th);
    }

    public C132865zA(InterfaceC42071wx interfaceC42071wx, long j) {
        this.A03 = interfaceC42071wx;
        this.A00 = j;
    }
}
