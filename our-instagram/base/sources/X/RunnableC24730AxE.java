package X;

/* renamed from: X.AxE, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24730AxE implements Runnable {
    public final /* synthetic */ A9I A00;
    public final /* synthetic */ Object A01;
    public final /* synthetic */ Runnable A02;

    public RunnableC24730AxE(A9I a9i, Object obj, Runnable runnable) {
        this.A00 = a9i;
        this.A01 = obj;
        this.A02 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        A9I a9i = this.A00;
        Object obj = this.A01;
        synchronized (a9i) {
            a9i.A02.remove(obj);
        }
        this.A02.run();
    }
}
