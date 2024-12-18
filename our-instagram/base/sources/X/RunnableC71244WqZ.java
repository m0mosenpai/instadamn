package X;

/* renamed from: X.WqZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71244WqZ implements Runnable {
    public final /* synthetic */ C66306U8e A00;

    public RunnableC71244WqZ(C66306U8e c66306U8e) {
        this.A00 = c66306U8e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66306U8e c66306U8e = this.A00;
        c66306U8e.unscheduleSelf(this);
        c66306U8e.invalidateSelf();
    }
}
