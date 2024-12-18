package X;

/* renamed from: X.Wqy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71269Wqy implements Runnable {
    public final /* synthetic */ C70193WFw A00;

    public RunnableC71269Wqy(C70193WFw c70193WFw) {
        this.A00 = c70193WFw;
    }

    @Override // java.lang.Runnable
    public final void run() {
        XEJ xej = this.A00.A05;
        if (xej != null) {
            xej.cancel();
        }
    }
}
