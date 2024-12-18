package X;

/* renamed from: X.D1g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29579D1g implements Runnable {
    public final /* synthetic */ BP3 A00;
    public final /* synthetic */ C75113Zb A01;

    public RunnableC29579D1g(BP3 bp3, C75113Zb c75113Zb) {
        this.A01 = c75113Zb;
        this.A00 = bp3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C75113Zb c75113Zb = this.A01;
        c75113Zb.A0j(false);
        c75113Zb.A1K = "cta_mid_scene_delay";
        this.A00.A02.remove(AbstractC25228BEl.A12(c75113Zb));
    }
}
