package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import com.facebook.R;
import com.instagram.app.InstagramAppShell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.2L1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2L1 {
    public static C2L1 A0A;
    public static C2L1 A0B;
    public static final Object A0C;
    public BroadcastReceiver.PendingResult A00;
    public Context A01;
    public C2L2 A02;
    public C2MX A03;
    public WorkDatabase A04;
    public C2NO A05;
    public C2LC A06;
    public List A07;
    public boolean A08;
    public final C2ME A09;

    public final InterfaceC49162No A03(List requests) {
        if (!requests.isEmpty()) {
            return new C1120453t(this, C05F.A01, null, requests, null).A02();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final C49142Nl A05(String uniqueWorkName) {
        C129125sY c129125sY = new C129125sY(this, uniqueWorkName, true);
        this.A06.ATa(c129125sY);
        return ((AbstractRunnableC129135sZ) c129125sY).A00;
    }

    static {
        C48442Kl.A01("WorkManagerImpl");
        A0C = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C2L1 A00(Context context) {
        C2L1 c2l1;
        synchronized (A0C) {
            try {
                c2l1 = A0B;
                if (c2l1 == null) {
                    c2l1 = A0A;
                }
                if (c2l1 == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext instanceof C08x) {
                        String str = ((InstagramAppShell) ((C08x) applicationContext)).A00.A01;
                        str.getClass();
                        A01(applicationContext, new C2L2(str));
                        c2l1 = A00(applicationContext);
                    } else {
                        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2l1;
    }

    public static void A01(Context context, C2L2 configuration) {
        C1Ye A00;
        synchronized (A0C) {
            if (A0B != null) {
                if (A0A != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            } else {
                Context applicationContext = context.getApplicationContext();
                C2L1 c2l1 = A0A;
                if (c2l1 == null) {
                    C14360o3.A0B(applicationContext, 0);
                    C2LB c2lb = new C2LB(configuration.A06);
                    final Context applicationContext2 = applicationContext.getApplicationContext();
                    C14360o3.A07(applicationContext2);
                    C2LE c2le = c2lb.A01;
                    C14360o3.A07(c2le);
                    final C2L5 c2l5 = configuration.A00;
                    boolean z = applicationContext.getResources().getBoolean(R.bool.enable_system_alarm_service_default);
                    final int i = 2;
                    C14360o3.A0B(c2l5, 2);
                    if (z) {
                        A00 = new C1Ye(applicationContext2, WorkDatabase.class, null);
                        A00.A04 = true;
                    } else {
                        A00 = C1Yc.A00(applicationContext2, WorkDatabase.class, "androidx.work.workdb");
                        A00.A00 = new InterfaceC28351Yw() { // from class: X.2LI
                            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.1Yu] */
                            @Override // X.InterfaceC28351Yw
                            public final InterfaceC29101an AL5(C29051ai c29051ai) {
                                Context context2 = applicationContext2;
                                String str = c29051ai.A02;
                                return new Object().AL5(AbstractC28981ab.A00(context2, c29051ai.A01, str, true, true));
                            }
                        };
                    }
                    A00.A01 = c2le;
                    A00.A09.add(new C2LL(c2l5) { // from class: X.2LJ
                        public final C2L5 A00;

                        @Override // X.C2LL
                        public final void A02(InterfaceC37481ol interfaceC37481ol) {
                            C14360o3.A0B(interfaceC37481ol, 0);
                            interfaceC37481ol.ADS();
                            try {
                                interfaceC37481ol.ATG(AnonymousClass001.A0e("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ", " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))", System.currentTimeMillis() - AbstractC50182Sh.A00));
                                ((C37471ok) interfaceC37481ol).A00.setTransactionSuccessful();
                            } finally {
                                interfaceC37481ol.ASe();
                            }
                        }

                        {
                            this.A00 = c2l5;
                        }
                    });
                    A00.A03(C2LM.A00);
                    final int i2 = 3;
                    A00.A03(new C1Ym(applicationContext2, i, i2) { // from class: X.2LO
                        public final Context A00;

                        @Override // X.C1Ym
                        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
                            C14360o3.A0B(interfaceC37481ol, 0);
                            if (this.endVersion >= 10) {
                                interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                            } else {
                                this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                            }
                        }

                        {
                            super(i, i2);
                            this.A00 = applicationContext2;
                        }
                    });
                    A00.A03(C2LQ.A00);
                    A00.A03(C2LS.A00);
                    final int i3 = 5;
                    final int i4 = 6;
                    A00.A03(new C1Ym(applicationContext2, i3, i4) { // from class: X.2LO
                        public final Context A00;

                        @Override // X.C1Ym
                        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
                            C14360o3.A0B(interfaceC37481ol, 0);
                            if (this.endVersion >= 10) {
                                interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                            } else {
                                this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                            }
                        }

                        {
                            super(i3, i4);
                            this.A00 = applicationContext2;
                        }
                    });
                    A00.A03(C2LT.A00);
                    A00.A03(C2LV.A00);
                    A00.A03(C2LX.A00);
                    A00.A03(new C1Ym(applicationContext2) { // from class: X.2LZ
                        public final Context A00;

                        @Override // X.C1Ym
                        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
                            C14360o3.A0B(interfaceC37481ol, 0);
                            interfaceC37481ol.ATG("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                            Context context2 = this.A00;
                            SharedPreferences sharedPreferences = context2.getSharedPreferences("androidx.work.util.preferences", 0);
                            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                                long j = 0;
                                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                                    j = 1;
                                }
                                interfaceC37481ol.ADS();
                                try {
                                    interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                                    interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                                    sharedPreferences.edit().clear().apply();
                                    ((C37471ok) interfaceC37481ol).A00.setTransactionSuccessful();
                                } finally {
                                    interfaceC37481ol.ASe();
                                }
                            }
                            SharedPreferences sharedPreferences2 = context2.getSharedPreferences("androidx.work.util.id", 0);
                            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                                int i5 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                                int i6 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                                interfaceC37481ol.ADS();
                                interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i5)});
                                interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i6)});
                                sharedPreferences2.edit().clear().apply();
                                ((C37471ok) interfaceC37481ol).A00.setTransactionSuccessful();
                            }
                        }

                        {
                            super(9, 10);
                            this.A00 = applicationContext2;
                        }
                    });
                    final int i5 = 10;
                    final int i6 = 11;
                    A00.A03(new C1Ym(applicationContext2, i5, i6) { // from class: X.2LO
                        public final Context A00;

                        @Override // X.C1Ym
                        public final void migrate(InterfaceC37481ol interfaceC37481ol) {
                            C14360o3.A0B(interfaceC37481ol, 0);
                            if (this.endVersion >= 10) {
                                interfaceC37481ol.ATH("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                            } else {
                                this.A00.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                            }
                        }

                        {
                            super(i5, i6);
                            this.A00 = applicationContext2;
                        }
                    });
                    A00.A03(C48592Lb.A00);
                    A00.A03(C48602Lc.A00);
                    A00.A03(C48622Le.A00);
                    A00.A03(C48632Lf.A00);
                    A00.A01();
                    WorkDatabase workDatabase = (WorkDatabase) A00.A00();
                    Context applicationContext3 = applicationContext.getApplicationContext();
                    C14360o3.A07(applicationContext3);
                    C2ME c2me = new C2ME(applicationContext3, c2lb);
                    C2MX c2mx = new C2MX(applicationContext.getApplicationContext(), configuration, workDatabase, c2lb);
                    C48832Mb c48832Mb = C48832Mb.A00;
                    C14360o3.A0B(workDatabase, 3);
                    C14360o3.A0B(c48832Mb, 6);
                    c2l1 = new C2L1(applicationContext.getApplicationContext(), configuration, c2mx, workDatabase, c2me, c2lb, (List) c48832Mb.invoke(applicationContext, configuration, c2lb, workDatabase, c2me, c2mx));
                    A0A = c2l1;
                }
                A0B = c2l1;
            }
        }
    }

    public final C49142Nl A04(final String tag) {
        QAJ qaj = new QAJ(this, tag);
        this.A06.ATa(qaj);
        return ((AbstractRunnableC129135sZ) qaj).A00;
    }

    public final void A06() {
        synchronized (A0C) {
            this.A08 = true;
            BroadcastReceiver.PendingResult pendingResult = this.A00;
            if (pendingResult != null) {
                pendingResult.finish();
                this.A00 = null;
            }
        }
    }

    public final void A07() {
        ArrayList A00;
        Context context = this.A01;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (A00 = C48872Mf.A00(jobScheduler, context)) != null && !A00.isEmpty()) {
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                C48872Mf.A01(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.A04;
        C2TF c2tf = (C2TF) workDatabase.A05();
        C1YP c1yp = c2tf.A02;
        c1yp.assertNotSuspendingTransaction();
        AbstractC29601bb abstractC29601bb = c2tf.A05;
        InterfaceC37561ot acquire = abstractC29601bb.acquire();
        c1yp.beginTransaction();
        try {
            acquire.ATb();
            c1yp.setTransactionSuccessful();
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
            C2VU.A00(workDatabase, this.A07);
        } catch (Throwable th) {
            c1yp.endTransaction();
            abstractC29601bb.release(acquire);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.2Kl, java.lang.Object] */
    public C2L1(Context context, final C2L2 configuration, C2MX workTaskExecutor, final WorkDatabase workDatabase, C2ME schedulers, C2LC processor, final List trackers) {
        this.A08 = false;
        Context applicationContext = context.getApplicationContext();
        if (!applicationContext.isDeviceProtectedStorage()) {
            ?? obj = new Object();
            synchronized (C48442Kl.A00) {
                C48442Kl.A01 = obj;
            }
            this.A01 = applicationContext;
            this.A06 = processor;
            this.A04 = workDatabase;
            this.A03 = workTaskExecutor;
            this.A09 = schedulers;
            this.A02 = configuration;
            this.A07 = trackers;
            this.A05 = new C2NO(workDatabase);
            final C2LE c2le = ((C2LB) processor).A01;
            workTaskExecutor.A02(new InterfaceC48932Mm() { // from class: X.2NQ
                @Override // X.InterfaceC48932Mm
                public final void DEk(final C2WP c2wp, boolean z) {
                    Executor executor = c2le;
                    final List list = trackers;
                    final C2L2 c2l2 = configuration;
                    final WorkDatabase workDatabase2 = workDatabase;
                    executor.execute(new Runnable() { // from class: X.51N
                        @Override // java.lang.Runnable
                        public final void run() {
                            List list2 = list;
                            C2WP c2wp2 = c2wp;
                            WorkDatabase workDatabase3 = workDatabase2;
                            Iterator it = list2.iterator();
                            while (it.hasNext()) {
                                ((InterfaceC48882Mg) it.next()).AGG(c2wp2.A01);
                            }
                            C2VU.A00(workDatabase3, list2);
                        }
                    });
                }
            });
            this.A06.ATa(new C2NR(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public final InterfaceC49162No A02(QA7 uniqueWorkName, Integer existingWorkPolicy, String work) {
        return new C1120453t(this, existingWorkPolicy, work, Collections.singletonList(uniqueWorkName), null).A02();
    }

    public C2L1() {
    }
}
