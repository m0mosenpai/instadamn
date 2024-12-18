package X;

/* loaded from: classes8.dex */
public final class M51 implements Runnable {
    public final /* synthetic */ KCN A00;
    public final /* synthetic */ C5SW A01;
    public final /* synthetic */ C23031Ai A02;

    public M51(KCN kcn, C5SW c5sw, C23031Ai c23031Ai) {
        this.A02 = c23031Ai;
        this.A01 = c5sw;
        this.A00 = kcn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC19610xo A0w = AbstractC166987dD.A0w(this.A02);
        A0w.E77("has_seen_promote_lead_gen_add_new_form_tooltip", true);
        A0w.apply();
        this.A01.A07(this.A00.getSession());
    }
}
