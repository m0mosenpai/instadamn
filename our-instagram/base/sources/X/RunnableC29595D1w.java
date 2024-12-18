package X;

/* renamed from: X.D1w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29595D1w implements Runnable {
    public final /* synthetic */ C75113Zb A00;
    public final /* synthetic */ C25402BLt A01;

    public RunnableC29595D1w(C75113Zb c75113Zb, C25402BLt c25402BLt) {
        this.A01 = c25402BLt;
        this.A00 = c75113Zb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C25402BLt c25402BLt = this.A01;
        AbstractC25227BEk.A1F(c25402BLt.A03, false);
        C75113Zb c75113Zb = this.A00;
        if (c75113Zb.A2E) {
            c75113Zb.A2E = false;
            C75113Zb.A00(c75113Zb, 60);
        }
        AbstractC25227BEk.A1F(c25402BLt.A02, c75113Zb.A2D);
    }
}
