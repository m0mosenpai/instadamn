package X;

/* renamed from: X.L7t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47771L7t {
    public String A00;
    public final long A01;
    public final C07X A02;
    public final KZO A03;
    public final C05A A04;
    public final C0UO A05;

    public C47771L7t(C07X c07x, KZO kzo, long j) {
        C14360o3.A0B(kzo, 2);
        this.A01 = j;
        this.A03 = kzo;
        this.A02 = c07x;
        C008002u A00 = C10E.A00(C48765LhY.A00);
        this.A04 = A00;
        this.A05 = AbstractC208910l.A02(A00);
    }

    public final void A00() {
        Object k2p;
        C05A c05a = this.A04;
        Object value = c05a.getValue();
        if (value instanceof K2P) {
            k2p = C48765LhY.A00;
        } else {
            if (!(value instanceof C48765LhY)) {
                return;
            }
            String str = this.A00;
            if (str != null) {
                k2p = new K2P(str);
            } else {
                MCO.A04(this, C07Y.A00(this.A02), 13);
                return;
            }
        }
        c05a.Egh(k2p);
    }
}
