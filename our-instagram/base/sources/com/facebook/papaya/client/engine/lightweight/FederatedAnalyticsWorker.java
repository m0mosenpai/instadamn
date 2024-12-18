package com.facebook.papaya.client.engine.lightweight;

import X.AbstractC1114350h;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC31172DnG;
import X.AbstractC31177DnL;
import X.C0K8;
import X.C1114250g;
import X.C14250np;
import X.C14360o3;
import X.C2L1;
import X.C51A;
import X.C53718Np7;
import X.C53719Np8;
import X.EnumC53219NgH;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import X.MSZ;
import X.OT6;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.instagram.lightweight.IgPapayaFederatedAnalyticsWorker;
import com.facebook.papaya.log.Log;
import com.facebook.papaya.log.LogSink;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes9.dex */
public abstract class FederatedAnalyticsWorker extends Worker {
    public static final long DEFAULT_FREQUENCY_IN_HOURS = 0;
    public static final String FEDERATED_ANALYTICS_JOB_FREQUENCY_KEY = "background_job_frequency";
    public static final String FEDERATED_ANALYTICS_JOB_SCHEDULED_KEY = "background_job_scheduled";
    public static final String TAG = "FederatedAnalyticsWorker";
    public static final String WORK_NAME = "federated_analytics_background_work";
    public static final C53719Np8 Companion = new Object();
    public static final Object LOCK = new Object();

    public abstract ImmutableSet getClientTags();

    public abstract ImmutableMap getExecutorFactories();

    public abstract String getLocalDataDirectoryPath();

    public abstract ImmutableMap getLogSinks();

    public abstract IModelLoader getModelLoader();

    public abstract String getPopulationName();

    public abstract ScheduledExecutorService getScheduledExecutorService();

    public abstract String getSharedDataDirectoryPath();

    public abstract OT6 getSharedPreferences();

    public abstract ITransport getTransport();

    public abstract boolean isFederatedAnalyticsEnabled();

    public abstract void onWorkComplete(boolean z, Throwable th);

    public abstract void onWorkStart();

    private final void addLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(it);
                String A17 = AbstractC31172DnG.A17(A1K);
                EnumC53219NgH enumC53219NgH = EnumC53219NgH.VERBOSE;
                Log.nativeAddLogSink(A17, enumC53219NgH.A00, (LogSink) A1K.getValue());
            }
        }
    }

    private final void cancelWork() {
        synchronized (LOCK) {
            C2L1.A00(this.mAppContext).A05(WORK_NAME);
            InterfaceC19630xq interfaceC19630xq = OT6.A01.A00;
            AbstractC31177DnL.A1N(interfaceC19630xq, FEDERATED_ANALYTICS_JOB_SCHEDULED_KEY, false);
            InterfaceC19610xo ARD = interfaceC19630xq.ARD();
            ARD.E7G(FEDERATED_ANALYTICS_JOB_FREQUENCY_KEY, 0L);
            ARD.apply();
        }
    }

    private final void removeLogSinks(ImmutableMap immutableMap) {
        if (immutableMap != null) {
            Iterator it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Log.nativeRemoveLogSink((String) MSZ.A0m(it));
            }
        }
    }

    @Override // androidx.work.Worker
    public AbstractC1114350h doWork() {
        onWorkStart();
        IgPapayaFederatedAnalyticsWorker igPapayaFederatedAnalyticsWorker = (IgPapayaFederatedAnalyticsWorker) this;
        if (!igPapayaFederatedAnalyticsWorker.A02) {
            cancelWork();
        } else {
            try {
                C53718Np7 c53718Np7 = Engine.Companion;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
                C14360o3.A07(scheduledThreadPoolExecutor);
                ImmutableMap executorFactories = getExecutorFactories();
                ITransport transport = getTransport();
                Context context = this.mAppContext;
                C14360o3.A07(context);
                new Engine(scheduledThreadPoolExecutor, "ig4a", executorFactories, transport, context, igPapayaFederatedAnalyticsWorker.A00, igPapayaFederatedAnalyticsWorker.A01, null, getClientTags()).run().get();
            } catch (Exception e) {
                C0K8.A0F(TAG, "Failed to run Federated Analytics background worker", e);
                return new C1114250g();
            }
        }
        return new C51A();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
    }
}
