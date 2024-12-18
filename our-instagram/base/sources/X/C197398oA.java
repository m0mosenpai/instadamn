package X;

/* renamed from: X.8oA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C197398oA implements InterfaceC179087xK {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public final InterfaceC197408oB A03;
    public final /* synthetic */ C197368o7 A04;

    @Override // X.InterfaceC179087xK
    public final void CNk(C178907x2 c178907x2) {
    }

    public C197398oA(InterfaceC197408oB interfaceC197408oB, C197368o7 c197368o7) {
        this.A04 = c197368o7;
        this.A03 = interfaceC197408oB;
    }

    @Override // X.InterfaceC179087xK
    public final void ACv(InterfaceC180227zC interfaceC180227zC) {
        if (!this.A00) {
            this.A00 = true;
        }
    }

    @Override // X.InterfaceC179087xK
    public final void detach() {
        if (this.A00) {
            this.A00 = false;
            if (this.A03 != null && this.A01) {
                this.A01 = false;
            }
        }
    }

    @Override // X.InterfaceC179087xK
    public final void release() {
        if (this.A03 != null && this.A02) {
            this.A02 = false;
        }
    }
}
