package X;

/* renamed from: X.Wwq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71594Wwq implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ WDD A02;
    public final /* synthetic */ short A03;

    public RunnableC71594Wwq(WDD wdd, int i, long j, short s) {
        this.A02 = wdd;
        this.A00 = i;
        this.A03 = s;
        this.A01 = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WDD.A00(this.A02, this.A00, this.A01, this.A03);
    }
}
