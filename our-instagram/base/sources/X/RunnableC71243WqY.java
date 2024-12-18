package X;

/* renamed from: X.WqY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71243WqY implements Runnable {
    public final /* synthetic */ C66308U8h A00;

    public RunnableC71243WqY(C66308U8h c66308U8h) {
        this.A00 = c66308U8h;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C66308U8h c66308U8h = this.A00;
        c66308U8h.unscheduleSelf(c66308U8h.A0B);
        c66308U8h.invalidateSelf();
    }
}
