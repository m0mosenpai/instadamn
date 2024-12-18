package X;

/* renamed from: X.0XI, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XI extends AbstractC02970Bv {
    public final C005001p A00;

    @Override // X.AbstractC02970Bv
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C0XO A03() {
        C0XO c0xo = new C0XO();
        C005001p c005001p = this.A00;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            Object A05 = c005001p.A05(i);
            c0xo.A00.put(A05, ((AbstractC02970Bv) c005001p.A06(i)).A03());
            c0xo.A01.put(A05, Boolean.FALSE);
        }
        return c0xo;
    }

    public C0XI(C005001p c005001p) {
        C005001p c005001p2 = new C005001p(0);
        this.A00 = c005001p2;
        c005001p2.A09(c005001p);
    }

    @Override // X.AbstractC02970Bv
    /* renamed from: A06, reason: merged with bridge method [inline-methods] */
    public final boolean A04(C0XO c0xo) {
        boolean z;
        AbstractC03000By.A00(c0xo);
        C005001p c005001p = c0xo.A00;
        int size = c005001p.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            Class cls = (Class) c005001p.A05(i);
            AbstractC02970Bv abstractC02970Bv = (AbstractC02970Bv) this.A00.get(cls);
            if (abstractC02970Bv != null) {
                z = abstractC02970Bv.A04(c0xo.A04(cls));
            } else {
                z = false;
            }
            c0xo.A07(cls, z);
            z2 |= z;
        }
        return z2;
    }
}
