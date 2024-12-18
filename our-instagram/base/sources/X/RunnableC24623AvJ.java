package X;

/* renamed from: X.AvJ, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24623AvJ implements Runnable {
    public final /* synthetic */ C184658Hg A00;
    public final /* synthetic */ Runnable A01;

    public RunnableC24623AvJ(C184658Hg c184658Hg, Runnable runnable) {
        this.A00 = c184658Hg;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A05 = false;
        this.A01.run();
    }
}
