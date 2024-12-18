package X;

/* loaded from: classes7.dex */
public final class HJH extends AbstractRunnableC14200nk {
    public final /* synthetic */ C77413dR A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HJH(C77413dR c77413dR) {
        super(1957781489, 3, false, false);
        this.A00 = c77413dR;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C77413dR c77413dR = this.A00;
        InterfaceC19610xo ARD = C1AT.A01(c77413dR.A02).A03(C1AV.A2A).ARD();
        ARD.E7G("lastHeadLoadTimeMs", c77413dR.A01);
        ARD.apply();
    }
}
