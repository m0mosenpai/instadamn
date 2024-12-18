package X;

/* renamed from: X.TPg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64675TPg implements Runnable {
    public final /* synthetic */ C07X A00;
    public final /* synthetic */ C2GT A01;
    public final /* synthetic */ C58883QEt A02;

    public RunnableC64675TPg(C07X c07x, C2GT c2gt, C58883QEt c58883QEt) {
        this.A02 = c58883QEt;
        this.A01 = c2gt;
        this.A00 = c07x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C58883QEt c58883QEt = this.A02;
        InterfaceC58362lv interfaceC58362lv = c58883QEt.A02;
        if (interfaceC58362lv != null) {
            C2GT c2gt = this.A01;
            c2gt.A08(interfaceC58362lv);
            c2gt.A06(this.A00, c58883QEt.A02);
        }
    }
}
