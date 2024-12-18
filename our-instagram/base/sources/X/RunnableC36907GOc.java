package X;

/* renamed from: X.GOc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36907GOc implements Runnable {
    public final /* synthetic */ C0SG A00;
    public final /* synthetic */ ETU A01;

    public RunnableC36907GOc(C0SG c0sg, ETU etu) {
        this.A00 = c0sg;
        this.A01 = etu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A0B(this.A01.A00.getSupportFragmentManager(), "feedbackDialog");
    }
}
