package X;

/* renamed from: X.0XO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0XO extends AbstractC02960Bu {
    public final C005001p A00 = new C005001p(0);
    public final C005001p A01 = new C005001p(0);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C0XO c0xo = (C0XO) obj;
            if (!AbstractC03000By.A01(this.A01, c0xo.A01) || !AbstractC03000By.A01(this.A00, c0xo.A00)) {
                return false;
            }
        }
        return true;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A01(AbstractC02960Bu abstractC02960Bu) {
        A05((C0XO) abstractC02960Bu);
        return this;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A02(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        C0XO c0xo = (C0XO) abstractC02960Bu2;
        A06((C0XO) abstractC02960Bu, c0xo);
        return c0xo;
    }

    @Override // X.AbstractC02960Bu
    public final /* bridge */ /* synthetic */ AbstractC02960Bu A03(AbstractC02960Bu abstractC02960Bu, AbstractC02960Bu abstractC02960Bu2) {
        boolean z;
        AbstractC02960Bu A04;
        AbstractC02960Bu A042;
        C0XO c0xo = (C0XO) abstractC02960Bu;
        C0XO c0xo2 = (C0XO) abstractC02960Bu2;
        if (c0xo2 != null) {
            if (c0xo == null) {
                c0xo2.A05(this);
            } else {
                C005001p c005001p = this.A00;
                int size = c005001p.size();
                for (int i = 0; i < size; i++) {
                    Class cls = (Class) c005001p.A05(i);
                    if (A08(cls) && c0xo.A08(cls)) {
                        AbstractC02960Bu A043 = c0xo2.A04(cls);
                        if (A043 != null) {
                            A04(cls).A03(c0xo.A04(cls), A043);
                        }
                    } else {
                        if (A08(cls)) {
                            A04 = c0xo2.A04(cls);
                            A042 = A04(cls);
                        } else if (c0xo.A08(cls)) {
                            A04 = c0xo2.A04(cls);
                            A042 = c0xo.A04(cls);
                        } else {
                            z = false;
                            c0xo2.A07(cls, z);
                        }
                        A04.A01(A042);
                    }
                    z = true;
                    c0xo2.A07(cls, z);
                }
            }
            return c0xo2;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public final AbstractC02960Bu A04(Class cls) {
        return (AbstractC02960Bu) cls.cast(this.A00.get(cls));
    }

    public final void A05(C0XO c0xo) {
        C005001p c005001p = this.A00;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) c005001p.A05(i);
            AbstractC02960Bu A04 = c0xo.A04(cls);
            if (A04 != null) {
                A04(cls).A01(A04);
                A07(cls, c0xo.A08(cls));
            } else {
                A07(cls, false);
            }
        }
    }

    public final void A06(C0XO c0xo, C0XO c0xo2) {
        boolean z;
        if (c0xo2 != null) {
            if (c0xo == null) {
                c0xo2.A05(this);
                return;
            }
            C005001p c005001p = this.A00;
            int size = c005001p.size();
            for (int i = 0; i < size; i++) {
                Class cls = (Class) c005001p.A05(i);
                if (A08(cls) && c0xo.A08(cls)) {
                    z = true;
                    AbstractC02960Bu A04 = c0xo2.A04(cls);
                    if (A04 != null) {
                        A04(cls).A02(c0xo.A04(cls), A04);
                    }
                } else {
                    z = false;
                }
                c0xo2.A07(cls, z);
            }
            return;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public final void A07(Class cls, boolean z) {
        Boolean bool;
        C005001p c005001p = this.A01;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        c005001p.put(cls, bool);
    }

    public final boolean A08(Class cls) {
        Boolean bool = (Boolean) this.A01.get(cls);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Composite Metrics{\n");
        C005001p c005001p = this.A00;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            sb.append(c005001p.A06(i));
            if (A08((Class) c005001p.A05(i))) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            sb.append(str);
            sb.append('\n');
        }
        sb.append("}");
        return sb.toString();
    }
}
