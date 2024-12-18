package X;

/* renamed from: X.M6y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50035M6y implements Runnable {
    public final /* synthetic */ AnonymousClass441 A00;
    public final /* synthetic */ C163107Rv A01;
    public final /* synthetic */ C43740JVz A02;
    public final /* synthetic */ C2056398n A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public RunnableC50035M6y(AnonymousClass441 anonymousClass441, C163107Rv c163107Rv, C43740JVz c43740JVz, C2056398n c2056398n, Long l, String str) {
        this.A02 = c43740JVz;
        this.A01 = c163107Rv;
        this.A00 = anonymousClass441;
        this.A04 = l;
        this.A05 = str;
        this.A03 = c2056398n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2056398n c2056398n;
        C43740JVz c43740JVz = this.A02;
        C163107Rv c163107Rv = this.A01;
        AnonymousClass441 anonymousClass441 = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        C7ZX c7zx = c43740JVz.A0B;
        if (c7zx != null) {
            c7zx.EnH(c43740JVz.A0A, c163107Rv.A09, anonymousClass441.A02);
        }
        Long l = this.A04;
        if (l == null) {
            anonymousClass441.A05 = true;
            return;
        }
        String str = this.A05;
        if (str == null || (c2056398n = this.A03) == null) {
            return;
        }
        long longValue = l.longValue();
        InterfaceC19610xo ARD = c2056398n.A00.ARD();
        ARD.E7G(AnonymousClass001.A0R(AbstractC111324zv.A00(2274), str), longValue);
        ARD.apply();
    }
}
