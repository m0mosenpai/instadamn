package X;

/* renamed from: X.Vra, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69571Vra {
    public long A00 = Long.MIN_VALUE;
    public W2Y A01 = null;
    public final /* synthetic */ C5J3 A02;

    public C69571Vra(C5J3 c5j3) {
        this.A02 = c5j3;
    }

    public final void A00() {
        W2Y w2y = this.A01;
        if (w2y != null) {
            synchronized (w2y) {
                Object obj = w2y.A00;
                if (obj != null) {
                    w2y.A03.A02.A04.A00(obj);
                    w2y.A00 = null;
                }
            }
            this.A01 = null;
        }
    }
}
