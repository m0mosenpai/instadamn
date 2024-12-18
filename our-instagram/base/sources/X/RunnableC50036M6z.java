package X;

/* renamed from: X.M6z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC50036M6z implements Runnable {
    public final /* synthetic */ AnonymousClass441 A00;
    public final /* synthetic */ C7AS A01;
    public final /* synthetic */ C7S1 A02;
    public final /* synthetic */ C2056398n A03;
    public final /* synthetic */ Long A04;
    public final /* synthetic */ String A05;

    public RunnableC50036M6z(AnonymousClass441 anonymousClass441, C7AS c7as, C7S1 c7s1, C2056398n c2056398n, Long l, String str) {
        this.A02 = c7s1;
        this.A01 = c7as;
        this.A00 = anonymousClass441;
        this.A04 = l;
        this.A05 = str;
        this.A03 = c2056398n;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2056398n c2056398n;
        C7S1 c7s1 = this.A02;
        C7AS c7as = this.A01;
        AnonymousClass441 anonymousClass441 = this.A00;
        c7s1.A04(anonymousClass441, c7as);
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
