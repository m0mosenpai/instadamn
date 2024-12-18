package X;

/* loaded from: classes4.dex */
public final class AYJ implements BCX {
    public final C9IB A00;
    public final C003701c A01 = new C003701c() { // from class: X.9Tl
        {
            super(10);
        }

        @Override // X.C003701c
        public final /* bridge */ /* synthetic */ void A06(boolean z, Object obj, Object obj2, Object obj3) {
            C124005jE c124005jE = (C124005jE) obj2;
            if (z) {
                C9IB c9ib = AYJ.this.A00;
                C170937jk c170937jk = c9ib.A00;
                if (c170937jk.A05) {
                    if (C2XV.A01()) {
                        c124005jE.A04();
                    } else {
                        c170937jk.A04.post(new RunnableC24551Au8(c124005jE, c9ib));
                    }
                }
            }
        }
    };

    @Override // X.BCX
    public final void E71(C124005jE c124005jE, String str) {
        this.A01.A05(str, c124005jE);
    }

    @Override // X.BCX
    public final C124005jE EEg(String str) {
        return (C124005jE) this.A01.A03(str);
    }

    public AYJ(C9IB c9ib) {
        this.A00 = c9ib;
    }
}
