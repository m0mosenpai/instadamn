package X;

/* renamed from: X.RbU, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60915RbU extends RcZ {
    public boolean A00;
    public final TFX A01;
    public final C1QW A02;
    public final C1QY A03;
    public final C18240vB A04;
    public final /* synthetic */ C62563SGo A05;

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (!this.A00) {
            InterfaceC65453TkP interfaceC65453TkP = this.A05.A00;
            C1QW c1qw = this.A02;
            C1QY c1qy = this.A03;
            TFX tfx = this.A01;
            tfx.A00 = interfaceC65453TkP.Enq(c1qw, c1qy, tfx, this.A04);
        }
    }

    public C60915RbU(C1QW c1qw, C1QY c1qy, TFX tfx, C62563SGo c62563SGo, C18240vB c18240vB) {
        this.A05 = c62563SGo;
        this.A02 = c1qw;
        this.A03 = c1qy;
        this.A01 = tfx;
        this.A04 = c18240vB;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("LigerExecutorDispatcher: ");
        return AbstractC166997dE.A0v(this.A02.A09, A1C);
    }
}
