package X;

/* loaded from: classes11.dex */
public final class UMA extends C1VO {
    public UMA(C1VV c1vv, C1VS c1vs, Object obj) {
        super(c1vv, c1vs, obj, true);
    }

    @Override // X.C1VO
    public final C1VO A02() {
        return this;
    }

    @Override // X.C1VO, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    public final void finalize() {
        String A0h;
        synchronized (this) {
            if (this.A00) {
                return;
            }
            C3QG c3qg = this.A02;
            Object A01 = c3qg.A01();
            String A00 = AbstractC111324zv.A00(1632);
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            Integer valueOf2 = Integer.valueOf(System.identityHashCode(c3qg));
            if (A01 == null) {
                A0h = null;
            } else {
                A0h = MSY.A0h(A01);
            }
            C0I2.A09("FinalizerCloseableReference", A00, valueOf, valueOf2, A0h);
            c3qg.A02();
        }
    }

    @Override // X.C1VO
    public final /* bridge */ /* synthetic */ Object clone() {
        return this;
    }
}
