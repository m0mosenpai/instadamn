package X;

/* renamed from: X.4tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107964tf extends C1VO {
    public C107964tf(C1VV c1vv, C1VS c1vs, Object obj) {
        super(c1vv, c1vs, obj, true);
    }

    public final void finalize() {
        String name;
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
                name = null;
            } else {
                name = A01.getClass().getName();
            }
            C0I2.A09("DefaultCloseableReference", A00, valueOf, valueOf2, name);
            C1VV c1vv = this.A01;
            if (c1vv != null) {
                c1vv.EHn(c3qg, this.A03);
            }
            close();
        }
    }

    @Override // X.C1VO
    public final C1VO A02() {
        Throwable th;
        C0Hf.A01(A05());
        C3QG c3qg = this.A02;
        C1VV c1vv = this.A01;
        if (this.A03 != null) {
            th = new Throwable();
        } else {
            th = null;
        }
        return new C107964tf(c1vv, c3qg, th);
    }

    @Override // X.C1VO
    public final /* bridge */ /* synthetic */ Object clone() {
        return A02();
    }

    public C107964tf(C1VV c1vv, C3QG c3qg, Throwable th) {
        super(c1vv, c3qg, th);
    }
}
