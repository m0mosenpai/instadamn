package X;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.TRk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64728TRk implements Runnable {
    public final Bundle A00;
    public final InterfaceC65341TiM A01;
    public final String A02;
    public final /* synthetic */ Q1F A03;

    public RunnableC64728TRk(Bundle bundle, Q1F q1f, InterfaceC65341TiM interfaceC65341TiM, String str) {
        this.A03 = q1f;
        this.A02 = str;
        this.A01 = interfaceC65341TiM;
        this.A00 = bundle;
    }

    private void A00(int i) {
        String str;
        Q1F q1f = this.A03;
        synchronized (q1f.A03) {
            try {
                try {
                    this.A01.CgT(i);
                    str = this.A02;
                } catch (RemoteException e) {
                    str = this.A02;
                    C0K8.A0O("GcmTaskService", "Error reporting result of operation to scheduler for %s", str, e);
                }
                Q1F.A02(q1f, str);
            } catch (Throwable th) {
                Q1F.A02(q1f, this.A02);
                throw th;
            }
        }
    }

    public final void A01() {
        ExecutorService executorService;
        try {
            Q1F q1f = this.A03;
            synchronized (q1f) {
                executorService = q1f.A01;
                if (executorService == null) {
                    executorService = Executors.newFixedThreadPool(2, new TV5());
                    q1f.A01 = executorService;
                }
            }
            executorService.execute(this);
        } catch (RejectedExecutionException e) {
            C0K8.A0F("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            A00(1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x01b8, code lost:
    
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC64728TRk.run():void");
    }
}
