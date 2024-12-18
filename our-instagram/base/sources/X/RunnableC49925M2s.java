package X;

/* renamed from: X.M2s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49925M2s implements Runnable {
    public final /* synthetic */ LK0 A00;
    public final /* synthetic */ C5KS A01;

    public RunnableC49925M2s(LK0 lk0, C5KS c5ks) {
        this.A01 = c5ks;
        this.A00 = lk0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object A0a;
        C5KS c5ks = this.A01;
        boolean A0F = c5ks.A0F();
        LK0 lk0 = this.A00;
        if (A0F) {
            A0a = c5ks.A06();
        } else {
            A0a = AbstractC166997dE.A0a();
        }
        lk0.A05(A0a);
    }
}
