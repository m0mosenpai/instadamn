package X;

import android.content.Context;
import android.net.Network;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.2Kc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC48352Kc {
    public Context mAppContext;
    public volatile int mStopReason = -256;
    public boolean mUsed;
    public WorkerParameters mWorkerParams;

    public void onStopped() {
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ListenableFuture startWork();

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.A0A;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nt] */
    public ListenableFuture getForegroundInfoAsync() {
        ?? obj = new Object();
        obj.A08(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return obj;
    }

    public final UUID getId() {
        return this.mWorkerParams.A09;
    }

    public final C48532Kv getInputData() {
        return this.mWorkerParams.A02;
    }

    public final Network getNetwork() {
        return this.mWorkerParams.A06.A00;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.A01;
    }

    public final int getStopReason() {
        return this.mStopReason;
    }

    public final java.util.Set getTags() {
        return this.mWorkerParams.A08;
    }

    public C2LC getTaskExecutor() {
        return this.mWorkerParams.A07;
    }

    public final List getTriggeredContentAuthorities() {
        return this.mWorkerParams.A06.A01;
    }

    public final List getTriggeredContentUris() {
        return this.mWorkerParams.A06.A02;
    }

    public C2L7 getWorkerFactory() {
        return this.mWorkerParams.A05;
    }

    public final boolean isStopped() {
        if (this.mStopReason == -256) {
            return false;
        }
        return true;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public final ListenableFuture setForegroundAsync(Q0Z foregroundInfo) {
        WorkerParameters workerParameters = this.mWorkerParams;
        return workerParameters.A03.EUm(this.mAppContext, foregroundInfo, workerParameters.A09);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, X.2Nr] */
    public ListenableFuture setProgressAsync(C48532Kv data) {
        WorkerParameters workerParameters = this.mWorkerParams;
        InterfaceC1114850m interfaceC1114850m = workerParameters.A04;
        UUID uuid = workerParameters.A09;
        C1114750l c1114750l = (C1114750l) interfaceC1114850m;
        ?? obj = new Object();
        c1114750l.A01.ATa(new TQR(data, c1114750l, obj, uuid));
        return obj;
    }

    public final void stop(int reason) {
        this.mStopReason = reason;
        onStopped();
    }

    public AbstractC48352Kc(Context appContext, WorkerParameters workerParams) {
        if (appContext != null) {
            if (workerParams != null) {
                this.mAppContext = appContext;
                this.mWorkerParams = workerParams;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }
}
