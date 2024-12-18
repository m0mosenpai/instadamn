package X;

/* loaded from: classes7.dex */
public final class J4K implements Runnable {
    public final /* synthetic */ C37734Gj9 A00;
    public final /* synthetic */ C75113Zb A01;

    public J4K(C37734Gj9 c37734Gj9, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = c37734Gj9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        if (!c75113Zb.A29) {
            C37734Gj9 c37734Gj9 = this.A00;
            c37734Gj9.A02 = true;
            c75113Zb.A29 = true;
            C75113Zb.A00(c75113Zb, 49);
            c75113Zb.A1K = "ad_feedback_interface";
            c37734Gj9.A05.remove(Integer.valueOf(c75113Zb.hashCode()));
            c37734Gj9.A00.Ck6();
        }
    }
}
