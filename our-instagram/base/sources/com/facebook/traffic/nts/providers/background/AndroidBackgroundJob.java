package com.facebook.traffic.nts.providers.background;

import X.AbstractC1114350h;
import X.AbstractC167017dG;
import X.C51A;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AndroidBackgroundJob extends Worker {
    public static final Companion Companion = new Object();
    public static final String TAG = "TNTSBackgroundV2Job";

    /* loaded from: classes10.dex */
    public final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    @Override // androidx.work.Worker
    public AbstractC1114350h doWork() {
        BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion.executeReadyTasksAndReschedule();
        return new C51A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidBackgroundJob(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
