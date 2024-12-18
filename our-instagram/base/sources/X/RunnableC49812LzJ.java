package X;

/* renamed from: X.LzJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49812LzJ implements Runnable {
    public final /* synthetic */ LJd A00;

    public RunnableC49812LzJ(LJd lJd) {
        this.A00 = lJd;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LJd lJd = this.A00;
        Runnable runnable = lJd.A05;
        if (runnable != null) {
            LJd.A01(lJd, runnable, "Timeout");
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
