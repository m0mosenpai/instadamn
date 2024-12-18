package X;

/* renamed from: X.2TZ, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2TZ implements C2MA {
    public final AbstractC29571bY A00;
    public final C1YP A01;
    public final AbstractC29601bb A02;
    public final AbstractC29601bb A03;

    @Override // X.C2MA
    public final void AOZ(final String workSpecId) {
        C1YP c1yp = this.A01;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = this.A03;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        acquire.ADp(1, workSpecId);
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
        } finally {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
        }
    }

    public C2TZ(final C1YP __db) {
        this.A01 = __db;
        this.A00 = new AbstractC29571bY(__db) { // from class: X.2Ta
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }

            @Override // X.AbstractC29571bY
            public final /* bridge */ /* synthetic */ void bind(InterfaceC37561ot stmt, Object value) {
                SD1 sd1 = (SD1) value;
                stmt.ADp(1, sd1.A01);
                byte[] A01 = C48532Kv.A01(sd1.A00);
                if (A01 == null) {
                    stmt.ADj(2);
                } else {
                    stmt.ADc(2, A01);
                }
            }
        };
        this.A03 = new AbstractC29601bb(__db) { // from class: X.2Tb
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.A02 = new AbstractC29601bb(__db) { // from class: X.2Tc
            @Override // X.AbstractC29601bb
            public final String createQuery() {
                return "DELETE FROM WorkProgress";
            }
        };
    }
}
