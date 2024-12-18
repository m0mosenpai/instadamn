package X;

/* renamed from: X.YGn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73508YGn implements Runnable {
    public final /* synthetic */ C72061XMe A00;

    public RunnableC73508YGn(C72061XMe c72061XMe) {
        this.A00 = c72061XMe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C72061XMe c72061XMe = this.A00;
            c72061XMe.A02.onComplete();
            c72061XMe.A03.dispose();
        } catch (Throwable th) {
            this.A00.A03.dispose();
            throw th;
        }
    }
}
