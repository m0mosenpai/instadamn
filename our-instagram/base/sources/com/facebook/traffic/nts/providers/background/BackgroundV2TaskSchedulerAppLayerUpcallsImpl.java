package com.facebook.traffic.nts.providers.background;

import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167027dH;
import X.AbstractC48382Kf;
import X.C05F;
import X.C09530e4;
import X.C0K8;
import X.C14360o3;
import X.C2L1;
import X.C2LB;
import X.C3EH;
import X.C48362Kd;
import X.C48532Kv;
import X.C48552Kx;
import X.C48562Ky;
import X.C49142Nl;
import X.C49182Nr;
import X.C51A;
import X.EnumC48482Kp;
import X.InterfaceC49162No;
import X.QA7;
import X.QAK;
import X.SPO;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class BackgroundV2TaskSchedulerAppLayerUpcallsImpl implements BackgroundV2TaskSchedulerAppLayerUpcalls {
    public static final String TAG = "TNTSBackgroundV2TaskSchedulerAppLayerUpcallsImpl";
    public static Context _appContext;
    public static BackgroundV2TaskSchedulerConfig _backgroundTaskSchedulerConfig;
    public static BackgroundV2TaskSchedulerAppLayer _backgroundTaskSchedulerImpl;
    public static final Companion Companion = new Object();
    public static final C49182Nr _backgroundTaskSchedulerImplFuture = new Object();

    /* loaded from: classes10.dex */
    public final class Companion {
        public static /* synthetic */ void getAppContext$annotations() {
        }

        public static /* synthetic */ void getBackgroundTaskSchedulerConfig$annotations() {
        }

        public static /* synthetic */ void getBackgroundTaskSchedulerImpl$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void scheduleJob(long j) {
            EnumC48482Kp enumC48482Kp;
            boolean z;
            Class cls;
            C48532Kv A00;
            Long l;
            Boolean bool;
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
            try {
                Context appContext = getAppContext();
                if (appContext != null) {
                    C2L1 A002 = C2L1.A00(appContext);
                    String str = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG;
                    QAK qak = new QAK(A002, str);
                    ((C2LB) A002.A06).A01.execute(qak);
                    C49182Nr c49182Nr = ((C3EH) qak).A00;
                    C14360o3.A07(c49182Nr);
                    Object obj = c49182Nr.get();
                    C14360o3.A07(obj);
                    Iterable<SPO> iterable = (Iterable) obj;
                    Boolean bool2 = null;
                    int i = 0;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        for (SPO spo : iterable) {
                            if (spo != null) {
                                enumC48482Kp = spo.A05;
                            } else {
                                enumC48482Kp = null;
                            }
                            if (enumC48482Kp == EnumC48482Kp.ENQUEUED) {
                                break;
                            }
                        }
                    }
                    C48362Kd c48362Kd = new C48362Kd();
                    c48362Kd.A02 = true;
                    Companion companion2 = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig = companion2.getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig != null) {
                        z = backgroundTaskSchedulerConfig.getExecuteIfIdleEnabled();
                    } else {
                        z = true;
                    }
                    c48362Kd.A04 = z;
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig2 = companion2.getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig2 != null && backgroundTaskSchedulerConfig2.getExecuteIfNetworkConnectedEnabled()) {
                        c48362Kd.A01(C05F.A01);
                    }
                    C48562Ky A003 = c48362Kd.A00();
                    BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig3 = getBackgroundTaskSchedulerConfig();
                    if (backgroundTaskSchedulerConfig3 != null && backgroundTaskSchedulerConfig3.getAsyncBackgroundJobEnabled()) {
                        cls = ConfigurableAsyncBackgroundJob.class;
                        BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig4 = getBackgroundTaskSchedulerConfig();
                        if (backgroundTaskSchedulerConfig4 != null) {
                            l = Long.valueOf(backgroundTaskSchedulerConfig4.getTimeoutAwaitSchedulerSeconds());
                        } else {
                            l = null;
                        }
                        C09530e4 A1L = AbstractC166987dD.A1L("timeoutAwaitSchedulerSeconds", l);
                        BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig5 = getBackgroundTaskSchedulerConfig();
                        if (backgroundTaskSchedulerConfig5 != null) {
                            bool = Boolean.valueOf(backgroundTaskSchedulerConfig5.getVerifyNtsManagerEnabled());
                        } else {
                            bool = null;
                        }
                        C09530e4 A1L2 = AbstractC166987dD.A1L("verifyNtsManagerEnabled", bool);
                        BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig6 = getBackgroundTaskSchedulerConfig();
                        if (backgroundTaskSchedulerConfig6 != null) {
                            bool2 = Boolean.valueOf(backgroundTaskSchedulerConfig6.getVerifyNtsSchedulerEnabled());
                        }
                        C09530e4[] A1b = AbstractC167007dF.A1b("verifyNtsSchedulerEnabled", bool2, A1L, A1L2);
                        C48552Kx c48552Kx = new C48552Kx();
                        do {
                            C09530e4 c09530e4 = A1b[i];
                            c48552Kx.A01(c09530e4.A01, (String) c09530e4.A00);
                            i++;
                        } while (i < 3);
                        A00 = c48552Kx.A00();
                    } else {
                        cls = AndroidBackgroundJob.class;
                        A00 = new C48552Kx().A00();
                    }
                    AbstractC48382Kf abstractC48382Kf = new AbstractC48382Kf(cls);
                    abstractC48382Kf.A02(j, TimeUnit.SECONDS);
                    abstractC48382Kf.A03(A003);
                    abstractC48382Kf.A05(str);
                    abstractC48382Kf.A00.A0C = A00;
                    QA7 qa7 = (QA7) abstractC48382Kf.A00();
                    Context appContext2 = getAppContext();
                    if (appContext2 != null) {
                        InterfaceC49162No A03 = C2L1.A00(appContext2).A03(Collections.singletonList(qa7));
                        C14360o3.A07(A03);
                        ((C49142Nl) A03).A00.get();
                    }
                }
            } catch (Exception e) {
                C0K8.A0F(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG, "Failed to schedule Traffic NTS background job", e);
            }
        }

        public final void executeReadyTasksAsyncAndReschedule(final C49182Nr c49182Nr, final long j) {
            C14360o3.A0B(c49182Nr, 0);
            new Thread(new Runnable() { // from class: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcallsImpl$Companion$executeReadyTasksAsyncAndReschedule$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        C49182Nr c49182Nr2 = BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImplFuture;
                        long j2 = j;
                        if (j2 <= 0) {
                            j2 = 0;
                        }
                        ((BackgroundV2TaskSchedulerAppLayer) c49182Nr2.get(j2, TimeUnit.SECONDS)).executeReadyTasksAndReschedule();
                        c49182Nr.A07(new C51A());
                    } catch (Exception unused) {
                        c49182Nr.A07(new C51A());
                    }
                }
            }).start();
        }

        public final synchronized Context getAppContext() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._appContext;
        }

        public final synchronized BackgroundV2TaskSchedulerConfig getBackgroundTaskSchedulerConfig() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerConfig;
        }

        public final synchronized BackgroundV2TaskSchedulerAppLayer getBackgroundTaskSchedulerImpl() {
            return BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl;
        }

        public final synchronized void setAppContext(Context context) {
            BackgroundV2TaskSchedulerAppLayerUpcallsImpl._appContext = context;
        }

        public final synchronized void setBackgroundTaskSchedulerConfig(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
            BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerConfig = backgroundV2TaskSchedulerConfig;
        }

        public final synchronized void setBackgroundTaskSchedulerImpl(BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer) {
            if (BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl == null && backgroundV2TaskSchedulerAppLayer != null) {
                BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImpl = backgroundV2TaskSchedulerAppLayer;
                BackgroundV2TaskSchedulerAppLayerUpcallsImpl._backgroundTaskSchedulerImplFuture.A07(backgroundV2TaskSchedulerAppLayer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void cancelAllJob() {
            Companion companion = BackgroundV2TaskSchedulerAppLayerUpcallsImpl.Companion;
            Context appContext = getAppContext();
            if (appContext != null) {
                C49142Nl A04 = C2L1.A00(appContext).A04(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG);
                C14360o3.A07(A04);
                A04.A00.get();
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final void executeReadyTasksAndReschedule() {
            if (getBackgroundTaskSchedulerImpl() == null) {
                C0K8.A0C(BackgroundV2TaskSchedulerAppLayerUpcallsImpl.TAG, "backgroundTaskSchedulerImpl is null");
                return;
            }
            BackgroundV2TaskSchedulerAppLayer backgroundTaskSchedulerImpl = getBackgroundTaskSchedulerImpl();
            if (backgroundTaskSchedulerImpl == null) {
                return;
            }
            backgroundTaskSchedulerImpl.executeReadyTasksAndReschedule();
        }

        public Companion() {
        }
    }

    public static final void cancelAllJob() {
        Companion.cancelAllJob();
    }

    public static final void executeReadyTasksAndReschedule() {
        Companion.executeReadyTasksAndReschedule();
    }

    public static final void executeReadyTasksAsyncAndReschedule(C49182Nr c49182Nr, long j) {
        Companion.executeReadyTasksAsyncAndReschedule(c49182Nr, j);
    }

    public static final synchronized Context getAppContext() {
        Context appContext;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            appContext = Companion.getAppContext();
        }
        return appContext;
    }

    public static final synchronized BackgroundV2TaskSchedulerConfig getBackgroundTaskSchedulerConfig() {
        BackgroundV2TaskSchedulerConfig backgroundTaskSchedulerConfig;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            backgroundTaskSchedulerConfig = Companion.getBackgroundTaskSchedulerConfig();
        }
        return backgroundTaskSchedulerConfig;
    }

    public static final synchronized BackgroundV2TaskSchedulerAppLayer getBackgroundTaskSchedulerImpl() {
        BackgroundV2TaskSchedulerAppLayer backgroundTaskSchedulerImpl;
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            backgroundTaskSchedulerImpl = Companion.getBackgroundTaskSchedulerImpl();
        }
        return backgroundTaskSchedulerImpl;
    }

    public static final synchronized void scheduleJob(long j) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.scheduleJob(j);
        }
    }

    public static final synchronized void setAppContext(Context context) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setAppContext(context);
        }
    }

    public static final synchronized void setBackgroundTaskSchedulerConfig(BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setBackgroundTaskSchedulerConfig(backgroundV2TaskSchedulerConfig);
        }
    }

    public static final synchronized void setBackgroundTaskSchedulerImpl(BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer) {
        synchronized (BackgroundV2TaskSchedulerAppLayerUpcallsImpl.class) {
            Companion.setBackgroundTaskSchedulerImpl(backgroundV2TaskSchedulerAppLayer);
        }
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public void cancel() {
        Companion.cancelAllJob();
    }

    @Override // com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerAppLayerUpcalls
    public void refresh(long j) {
        if (j > 0) {
            Companion.scheduleJob(j);
        }
    }

    public BackgroundV2TaskSchedulerAppLayerUpcallsImpl(Context context, BackgroundV2TaskSchedulerAppLayer backgroundV2TaskSchedulerAppLayer, BackgroundV2TaskSchedulerConfig backgroundV2TaskSchedulerConfig) {
        AbstractC167027dH.A13(context, backgroundV2TaskSchedulerAppLayer, backgroundV2TaskSchedulerConfig);
        Companion companion = Companion;
        companion.setAppContext(context);
        companion.setBackgroundTaskSchedulerImpl(backgroundV2TaskSchedulerAppLayer);
        companion.setBackgroundTaskSchedulerConfig(backgroundV2TaskSchedulerConfig);
    }
}
