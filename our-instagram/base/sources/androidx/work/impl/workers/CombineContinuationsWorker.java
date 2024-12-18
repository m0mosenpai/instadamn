package androidx.work.impl.workers;

import X.AbstractC1114350h;
import X.AbstractC167017dG;
import X.C51A;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes10.dex */
public final class CombineContinuationsWorker extends Worker {
    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        return new C51A(this.mWorkerParams.A02);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineContinuationsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
