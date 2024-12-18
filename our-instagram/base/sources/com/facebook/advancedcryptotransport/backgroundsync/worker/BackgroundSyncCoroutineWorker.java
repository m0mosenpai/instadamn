package com.facebook.advancedcryptotransport.backgroundsync.worker;

import X.AbstractC167017dG;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.multiprocess.RemoteCoroutineWorker;

/* loaded from: classes10.dex */
public final class BackgroundSyncCoroutineWorker extends RemoteCoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackgroundSyncCoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
