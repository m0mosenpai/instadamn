package X;

/* renamed from: X.GLu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class RunnableC36847GLu implements Runnable {
    public final /* synthetic */ C32995Egi A00;

    public RunnableC36847GLu(C32995Egi c32995Egi) {
        this.A00 = c32995Egi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6WQ c6wq = this.A00.A00.A05;
        if (c6wq != null) {
            if (c6wq.getOwnerActivity() == null || !c6wq.getOwnerActivity().isDestroyed()) {
                c6wq.cancel();
            }
        }
    }
}
