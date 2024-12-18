package X;

/* renamed from: X.2PX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2PX {
    public final C1YP A00;
    public final AbstractC29601bb A01;
    public final AbstractC29571bY A02;

    public final void A00(OA7 oa7) {
        C1YP c1yp = this.A00;
        c1yp.assertNotSuspendingTransaction();
        c1yp.beginTransaction();
        try {
            this.A02.insert(oa7);
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
        }
    }

    public C2PX(C1YP c1yp) {
        this.A00 = c1yp;
        this.A02 = new C51385Mmq(c1yp, this);
        this.A01 = new C51387Mms(c1yp, this);
    }

    public C2PX() {
    }
}
