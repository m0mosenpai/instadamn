package X;

/* renamed from: X.1tT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40021tT extends AbstractC40011tS {
    public static AbstractC40011tS A00;

    public static synchronized AbstractC40011tS A01() {
        AbstractC40011tS abstractC40011tS;
        synchronized (C40021tT.class) {
            abstractC40011tS = A00;
            if (abstractC40011tS == null) {
                abstractC40011tS = new AbstractC40011tS();
                A00 = abstractC40011tS;
            }
        }
        return abstractC40011tS;
    }

    @Override // X.AbstractC40011tS
    public final AbstractC40721uf A03(final Object obj) {
        return new AbstractC40721uf(obj) { // from class: X.1uj
            public boolean A00 = false;

            @Override // X.AbstractC40721uf
            public final String A01() {
                return "InProcessBatchLock";
            }

            @Override // X.AbstractC40721uf
            public final void A04() {
            }

            @Override // X.AbstractC40721uf
            public final synchronized void A05() {
                this.A00 = true;
            }

            @Override // X.AbstractC40721uf
            public final void A06() {
            }

            @Override // X.AbstractC40721uf
            public final synchronized boolean A09() {
                return this.A00;
            }

            @Override // X.AbstractC40721uf
            public final boolean A0A() {
                return true;
            }
        };
    }
}
