package X;

/* renamed from: X.YHm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC73522YHm implements Runnable {
    public final Throwable A00;
    public final /* synthetic */ C72061XMe A01;

    public RunnableC73522YHm(C72061XMe c72061XMe, Throwable th) {
        this.A01 = c72061XMe;
        this.A00 = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C72061XMe c72061XMe = this.A01;
            c72061XMe.A02.onError(this.A00);
            c72061XMe.A03.dispose();
        } catch (Throwable th) {
            this.A01.A03.dispose();
            throw th;
        }
    }
}
