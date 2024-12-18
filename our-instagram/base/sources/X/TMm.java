package X;

import androidx.work.multiprocess.IListenableWorkerImpl;

/* loaded from: classes10.dex */
public final class TMm implements Runnable {
    public final /* synthetic */ IListenableWorkerImpl A00;
    public final /* synthetic */ TQS A01;

    public TMm(IListenableWorkerImpl iListenableWorkerImpl, TQS tqs) {
        this.A01 = tqs;
        this.A00 = iListenableWorkerImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            TQS tqs = this.A01;
            tqs.A02.ATT(tqs.A01, this.A00);
        } catch (Throwable th) {
            C48442Kl.A00();
            android.util.Log.e(C62951SYt.A04, "Unable to execute", th);
            RunnableC64729TRl.A00(this.A01.A01, th);
        }
    }
}
