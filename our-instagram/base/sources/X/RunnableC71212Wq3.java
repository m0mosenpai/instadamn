package X;

/* renamed from: X.Wq3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71212Wq3 implements Runnable {
    public final /* synthetic */ WPW A00;

    public RunnableC71212Wq3(WPW wpw) {
        this.A00 = wpw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66360UCh c66360UCh = this.A00.A0A;
        if (c66360UCh != null) {
            c66360UCh.A07 = true;
            c66360UCh.requestLayout();
        }
    }
}
