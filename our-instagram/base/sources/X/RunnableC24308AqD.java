package X;

/* renamed from: X.AqD, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24308AqD implements Runnable {
    public final /* synthetic */ C9SR A00;

    public RunnableC24308AqD(C9SR c9sr) {
        this.A00 = c9sr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.invalidateSelf();
    }
}
