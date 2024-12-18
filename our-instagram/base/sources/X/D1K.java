package X;

/* loaded from: classes5.dex */
public final class D1K implements Runnable {
    public final /* synthetic */ C75113Zb A00;

    public D1K(C75113Zb c75113Zb) {
        this.A00 = c75113Zb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A00;
        if (AbstractC166987dD.A1a(c75113Zb.A3T.A00)) {
            c75113Zb.A0f(false);
            c75113Zb.A2K = true;
            c75113Zb.A1K = "hide_swipe_left_nudge_or_nux";
        }
    }
}
