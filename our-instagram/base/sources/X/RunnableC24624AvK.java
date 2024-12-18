package X;

/* renamed from: X.AvK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24624AvK implements Runnable {
    public final /* synthetic */ AnonymousClass834 A00;
    public final /* synthetic */ C5SU A01;

    public RunnableC24624AvK(AnonymousClass834 anonymousClass834, C5SU c5su) {
        this.A01 = c5su;
        this.A00 = anonymousClass834;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5SU c5su = this.A01;
        c5su.A03(this.A00.getView());
        AbstractC166997dE.A1P(c5su);
    }
}
