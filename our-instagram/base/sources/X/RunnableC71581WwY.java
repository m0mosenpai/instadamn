package X;

/* renamed from: X.WwY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71581WwY implements Runnable {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C71160Wov A02;

    public RunnableC71581WwY(C71160Wov c71160Wov, double d, long j) {
        this.A02 = c71160Wov;
        this.A01 = j;
        this.A00 = d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.A04.E1s(this.A01, this.A00);
    }
}
