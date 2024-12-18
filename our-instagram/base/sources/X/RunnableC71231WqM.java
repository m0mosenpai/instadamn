package X;

/* renamed from: X.WqM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71231WqM implements Runnable {
    public final /* synthetic */ C69265VkZ A00;

    public RunnableC71231WqM(C69265VkZ c69265VkZ) {
        this.A00 = c69265VkZ;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6FC c6fc = this.A00.A01;
        if (c6fc != null) {
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c6fc.A02;
            ViewOnTouchListenerC60632pm.A00(viewOnTouchListenerC60632pm, -viewOnTouchListenerC60632pm.A01);
        }
    }
}
