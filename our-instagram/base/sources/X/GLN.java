package X;

/* loaded from: classes6.dex */
public final class GLN implements Runnable {
    public final /* synthetic */ C31634Dv0 A00;

    public GLN(C31634Dv0 c31634Dv0) {
        this.A00 = c31634Dv0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JR2 jr2 = this.A00.A00.A00;
        ((C147036jf) jr2.A1k.getValue()).A03(null, jr2.A1L.getModuleName(), false);
        C43626JRj A0q = jr2.A0q();
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(A0q.A0B);
        AbstractC167017dG.A0g(A0x, "num_times_dismissed_ci_direct_follow_list").apply();
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC19610xo ARD = A0x.ARD();
        ARD.E7G("last_time_dismissed_ci_direct_follow_list", currentTimeMillis);
        ARD.apply();
        A0q.A0E.A06 = null;
        C43626JRj.A03(A0q);
    }
}
