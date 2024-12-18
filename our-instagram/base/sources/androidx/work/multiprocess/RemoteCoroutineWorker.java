package androidx.work.multiprocess;

import X.AbstractC167017dG;
import X.AnonymousClass197;
import X.C2LB;
import X.C49182Nr;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteCoroutineWorker;

/* loaded from: classes10.dex */
public abstract class RemoteCoroutineWorker extends RemoteListenableWorker {
    public final C49182Nr A00;
    public final AnonymousClass197 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.2Nr, X.2Nt] */
    public RemoteCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A01 = new AnonymousClass197(null);
        ?? obj = new Object();
        this.A00 = obj;
        obj.addListener(new Runnable() { // from class: X.TJO
            @Override // java.lang.Runnable
            public final void run() {
                RemoteCoroutineWorker remoteCoroutineWorker = RemoteCoroutineWorker.this;
                if (remoteCoroutineWorker.A00.isCancelled()) {
                    remoteCoroutineWorker.A01.AGH(null);
                }
            }
        }, ((C2LB) this.mWorkerParams.A07).A01);
    }

    @Override // androidx.work.multiprocess.RemoteListenableWorker, X.AbstractC48352Kc
    public final void onStopped() {
        super.onStopped();
        this.A00.cancel(true);
    }
}
