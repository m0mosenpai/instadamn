package X;

/* renamed from: X.6KR, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6KR implements InterfaceC42071wx, InterfaceC135996De {
    public int A00;
    public InterfaceC135996De A01;
    public InterfaceC41801wU A02;
    public boolean A03;
    public final InterfaceC42071wx A04;

    @Override // X.InterfaceC42071wx
    public final void Dpc(InterfaceC41801wU interfaceC41801wU) {
        if (C6KP.A02(this.A02, interfaceC41801wU)) {
            this.A02 = interfaceC41801wU;
            if (interfaceC41801wU instanceof InterfaceC135996De) {
                this.A01 = (InterfaceC135996De) interfaceC41801wU;
            }
            this.A04.Dpc(this);
        }
    }

    @Override // X.InterfaceC136016Dg
    public final void clear() {
        this.A01.clear();
    }

    @Override // X.InterfaceC41801wU
    public final void dispose() {
        this.A02.dispose();
    }

    @Override // X.InterfaceC136016Dg
    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    @Override // X.InterfaceC136016Dg
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // X.InterfaceC42071wx
    public final void onComplete() {
        if (!this.A03) {
            this.A03 = true;
            this.A04.onComplete();
        }
    }

    @Override // X.InterfaceC42071wx
    public final void onError(Throwable th) {
        if (this.A03) {
            AbstractC142886co.A02(th);
        } else {
            this.A03 = true;
            this.A04.onError(th);
        }
    }

    public C6KR(InterfaceC42071wx interfaceC42071wx) {
        this.A04 = interfaceC42071wx;
    }

    public final void A00(Throwable th) {
        AbstractC62281S5a.A00(th);
        this.A02.dispose();
        onError(th);
    }
}
