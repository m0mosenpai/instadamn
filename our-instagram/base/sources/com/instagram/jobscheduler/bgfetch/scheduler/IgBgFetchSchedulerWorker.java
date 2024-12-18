package com.instagram.jobscheduler.bgfetch.scheduler;

import X.AbstractC1114350h;
import X.AbstractC167017dG;
import X.C023409i;
import X.C51A;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

/* loaded from: classes8.dex */
public final class IgBgFetchSchedulerWorker extends Worker {
    public final WorkerParameters A00;

    @Override // androidx.work.Worker
    public final AbstractC1114350h doWork() {
        C023409i.A0A.A08(this);
        this.A00.A02.A02("job_id_key", -1);
        return new C51A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgBgFetchSchedulerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A00 = workerParameters;
    }
}
