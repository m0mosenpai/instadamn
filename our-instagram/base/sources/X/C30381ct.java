package X;

/* renamed from: X.1ct, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C30381ct {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;

    public final void A00(String str) {
        C1YP c1yp = this.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A02;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, str);
        try {
            c1yp.beginTransaction();
            try {
                acquire.ATb();
                c1yp.setTransactionSuccessful();
            } finally {
                c1yp.endTransaction();
            }
        } finally {
            abstractC29601bb.release(acquire);
        }
    }

    public C30381ct(final C1YP c1yp) {
        this.A01 = c1yp;
        this.A00 = new AbstractC29571bY(c1yp) { // from class: X.1d0
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `sponsored_pool_items` (`surface`,`data`) VALUES (?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot interfaceC37561ot, Object obj) {
                C37611oy c37611oy = (C37611oy) obj;
                interfaceC37561ot.ADp(1, c37611oy.A00);
                interfaceC37561ot.ADc(2, c37611oy.A01);
            }
        };
        this.A02 = new AbstractC29601bb(c1yp) { // from class: X.1d5
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "\n        DELETE\n        FROM sponsored_pool_items\n        WHERE surface = ?\n      ";
            }
        };
    }

    public C30381ct() {
    }
}
