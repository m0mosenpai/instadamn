package X;

/* loaded from: classes10.dex */
public final class TMj implements Runnable {
    public final /* synthetic */ RunnableC1115150q A00;
    public final /* synthetic */ C49182Nr A01;

    public TMj(final RunnableC1115150q this$0, final C49182Nr val$foregroundFuture) {
        this.A00 = this$0;
        this.A01 = val$foregroundFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC1115150q runnableC1115150q = this.A00;
        C49182Nr c49182Nr = runnableC1115150q.A04;
        if (!c49182Nr.isCancelled()) {
            try {
                Q0Z q0z = (Q0Z) this.A01.get();
                if (q0z != null) {
                    C48442Kl.A00();
                    c49182Nr.A06(runnableC1115150q.A01.EUm(runnableC1115150q.A00, q0z, runnableC1115150q.A02.mWorkerParams.A09));
                    return;
                }
                throw AbstractC58319PtB.A0k("Worker was marked important (", runnableC1115150q.A03.A0I, ") but did not provide ForegroundInfo");
            } catch (Throwable th) {
                c49182Nr.A08(th);
            }
        }
    }
}
