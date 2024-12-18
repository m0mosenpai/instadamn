package X;

/* renamed from: X.D1z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC29598D1z implements Runnable {
    public final /* synthetic */ C75113Zb A00;
    public final /* synthetic */ boolean A01;

    public RunnableC29598D1z(C75113Zb c75113Zb, boolean z) {
        this.A01 = z;
        this.A00 = c75113Zb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.A01;
        C75113Zb c75113Zb = this.A00;
        if (z) {
            c75113Zb.A2f = false;
        } else {
            c75113Zb.A2g = false;
        }
    }
}
