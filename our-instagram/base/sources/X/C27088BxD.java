package X;

/* renamed from: X.BxD, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27088BxD extends AbstractRunnableC14200nk {
    public final /* synthetic */ C46912Df A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27088BxD(C46912Df c46912Df) {
        super(299650754, 4, false, false);
        this.A00 = c46912Df;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C46912Df c46912Df = this.A00;
        if (c46912Df.saveConfigToDatabase()) {
            InterfaceC19610xo ARD = c46912Df.A01.ARD();
            ARD.E77(c46912Df.A02, true);
            ARD.apply();
        }
    }
}
