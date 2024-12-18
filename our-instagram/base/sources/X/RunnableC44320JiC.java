package X;

/* renamed from: X.JiC, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44320JiC implements Runnable {
    public final /* synthetic */ AbstractC43828JZr A00;
    public final /* synthetic */ Runnable A01;
    public final /* synthetic */ boolean A02;

    public RunnableC44320JiC(AbstractC43828JZr abstractC43828JZr, Runnable runnable, boolean z) {
        this.A01 = runnable;
        this.A00 = abstractC43828JZr;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.run();
        this.A00.A0N(this.A02);
    }
}
