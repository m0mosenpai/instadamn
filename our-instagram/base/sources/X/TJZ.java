package X;

/* loaded from: classes10.dex */
public final class TJZ implements Runnable {
    public final /* synthetic */ RunnableC64731TRn A00;

    public TJZ(RunnableC64731TRn runnableC64731TRn) {
        this.A00 = runnableC64731TRn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A01 = Thread.currentThread();
    }
}
