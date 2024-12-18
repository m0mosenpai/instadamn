package com.facebook.papaya.fb.instagram.lightweight;

import X.AbstractC12290kX;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC54326Nzk;
import X.C06090Tz;
import X.C0K8;
import X.C14250np;
import X.C14360o3;
import X.C18U;
import X.C53721NpA;
import X.EnumC53210Ng8;
import X.MSW;
import X.OK1;
import X.OT6;
import android.content.Context;
import android.os.Bundle;
import androidx.work.WorkerParameters;
import com.facebook.jni.HybridData;
import com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.fb.instagram.executors.mldwfalco.IgAnalyticsMldwFalcoExecutorFactory;
import com.facebook.papaya.fb.instagram.transport.IgPapayaTransport;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes9.dex */
public final class IgPapayaFederatedAnalyticsWorker extends FederatedAnalyticsWorker {
    public String A00;
    public String A01;
    public boolean A02;
    public long A03;
    public final HashSet A04;

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final ImmutableMap getLogSinks() {
        return null;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final IModelLoader getModelLoader() {
        return null;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final String getPopulationName() {
        return "ig4a";
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final ImmutableSet getClientTags() {
        ImmutableSet A03 = ImmutableSet.A03(this.A04);
        C14360o3.A07(A03);
        return A03;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final ImmutableMap getExecutorFactories() {
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putBoolean("enforce_secure_aggregation", false);
        C53721NpA c53721NpA = IgAnalyticsMldwFalcoExecutorFactory.Companion;
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        builder.put("batch_mldw_falco_executor", new IgAnalyticsMldwFalcoExecutorFactory(context, A0b));
        ImmutableMap buildOrThrow = builder.buildOrThrow();
        C14360o3.A07(buildOrThrow);
        return buildOrThrow;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final String getLocalDataDirectoryPath() {
        return this.A00;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final String getSharedDataDirectoryPath() {
        return this.A01;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final OT6 getSharedPreferences() {
        return OT6.A01;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final boolean isFederatedAnalyticsEnabled() {
        return this.A02;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final void onWorkStart() {
        long j = this.A03;
        if (j <= 0) {
            return;
        }
        try {
            Thread.sleep(j * 1000);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IgPapayaFederatedAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AbstractC167017dG.A1P(context, workerParameters);
        this.A00 = "";
        this.A01 = "";
        HashSet A1H = AbstractC166987dD.A1H();
        this.A04 = A1H;
        try {
            UserSession A0Q = MSW.A0Q(this);
            C06090Tz c06090Tz = C06090Tz.A05;
            this.A02 = C18U.A06(c06090Tz, A0Q, 36315559102516636L);
            OK1 ok1 = AbstractC54326Nzk.A00;
            this.A00 = ok1.A00(A0Q).getCanonicalPath();
            this.A01 = ok1.A01(A0Q).getCanonicalPath();
            this.A03 = C18U.A01(c06090Tz, A0Q, 36597034079423202L);
            String A04 = C18U.A04(c06090Tz, A0Q, 36878509056065729L);
            if (A04.length() != 0) {
                A1H.add(A04);
            }
            String A042 = C18U.A04(c06090Tz, A0Q, 36893288036959200L);
            if (A042.length() != 0) {
                A1H.add(A042);
            }
            String A043 = C18U.A04(c06090Tz, A0Q, 36893288036893663L);
            if (A043.length() != 0) {
                A1H.add(A043);
            }
        } catch (Exception e) {
            this.A02 = false;
            C0K8.A0F("IgPapayaFederatedAnalyticsWorker", "Failed to initialize FederatedAnalyticsWorker", e);
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final ScheduledExecutorService getScheduledExecutorService() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
        C14360o3.A07(scheduledThreadPoolExecutor);
        return scheduledThreadPoolExecutor;
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final ITransport getTransport() {
        EnumC53210Ng8 enumC53210Ng8;
        try {
            UserSession A0Q = MSW.A0Q(this);
            HybridData hybridData = HybridData.$redex_init_class;
            Context context = AbstractC12290kX.A00;
            C14360o3.A07(context);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C14250np.A00().A00;
            C14360o3.A07(scheduledThreadPoolExecutor);
            String str = this.A01;
            C06090Tz c06090Tz = C06090Tz.A05;
            boolean A06 = C18U.A06(c06090Tz, A0Q, 36315559101795737L);
            boolean A062 = C18U.A06(c06090Tz, A0Q, 2342158568315555226L);
            if (A06) {
                if (A062) {
                    enumC53210Ng8 = EnumC53210Ng8.A04;
                } else {
                    enumC53210Ng8 = EnumC53210Ng8.A05;
                }
            } else {
                enumC53210Ng8 = EnumC53210Ng8.A03;
            }
            return new IgPapayaTransport(context, A0Q, scheduledThreadPoolExecutor, str, enumC53210Ng8);
        } catch (IllegalStateException e) {
            C0K8.A0F("IgPapayaFederatedAnalyticsWorker", "Failed to create papaya transport due to invalid user session", e);
            throw new RuntimeException("Failed to create papaya transport due to invalid user session", e);
        }
    }

    @Override // com.facebook.papaya.client.engine.lightweight.FederatedAnalyticsWorker
    public final void onWorkComplete(boolean z, Throwable th) {
    }
}
