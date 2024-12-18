package X;

/* renamed from: X.5wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC131535wp implements Runnable {
    public final /* synthetic */ C95334Qt A00;
    public final /* synthetic */ Runnable A01;

    public /* synthetic */ RunnableC131535wp(C95334Qt c95334Qt, Runnable runnable) {
        this.A00 = c95334Qt;
        this.A01 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C95334Qt c95334Qt = this.A00;
        Runnable runnable = this.A01;
        C95334Qt.A02(c95334Qt);
        c95334Qt.A0g.post(runnable);
    }
}
