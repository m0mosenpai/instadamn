package X;

/* renamed from: X.RbT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60914RbT extends RcZ {
    public final /* synthetic */ C1QW A00;
    public final /* synthetic */ C1QY A01;
    public final /* synthetic */ TFX A02;
    public final /* synthetic */ C62563SGo A03;
    public final /* synthetic */ C18240vB A04;

    public C60914RbT(C1QW c1qw, C1QY c1qy, TFX tfx, C62563SGo c62563SGo, C18240vB c18240vB) {
        this.A03 = c62563SGo;
        this.A00 = c1qw;
        this.A01 = c1qy;
        this.A02 = tfx;
        this.A04 = c18240vB;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC65453TkP interfaceC65453TkP = this.A03.A00;
        C1QW c1qw = this.A00;
        C1QY c1qy = this.A01;
        TFX tfx = this.A02;
        tfx.A00 = interfaceC65453TkP.Enq(c1qw, c1qy, tfx, this.A04);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LigerExecutorDispatcher: ");
        return AbstractC166997dE.A0v(this.A00.A09, A1C);
    }
}
