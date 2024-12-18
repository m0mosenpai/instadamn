package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: X.2Mf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48872Mf implements InterfaceC48882Mg {
    public static final String A05 = C48442Kl.A01("SystemJobScheduler");
    public final JobScheduler A00;
    public final Context A01;
    public final C2L2 A02;
    public final WorkDatabase A03;
    public final C48912Mj A04;

    public static ArrayList A00(JobScheduler context, Context jobScheduler) {
        List<JobInfo> list;
        ArrayList arrayList = null;
        try {
            list = context.getAllPendingJobs();
        } catch (Throwable th) {
            C48442Kl.A00();
            android.util.Log.e(A05, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list != null) {
            arrayList = new ArrayList(list.size());
            ComponentName componentName = new ComponentName(jobScheduler, (Class<?>) SystemJobService.class);
            for (JobInfo jobInfo : list) {
                if (componentName.equals(jobInfo.getService())) {
                    arrayList.add(jobInfo);
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC48882Mg
    public final boolean CL9() {
        return true;
    }

    public final void A02(C48412Ki workSpec, int jobId) {
        int i;
        JobInfo A00 = this.A04.A00(workSpec, jobId);
        C48442Kl.A00();
        String str = A05;
        String str2 = workSpec.A0M;
        try {
            if (this.A00.schedule(A00) == 0) {
                C48442Kl.A00();
                android.util.Log.w(str, AnonymousClass001.A0R("Unable to schedule work ID ", str2));
                if (workSpec.A0J && workSpec.A0G == C05F.A00) {
                    workSpec.A0J = false;
                    String.format("Scheduling a non-expedited job (work ID %s)", str2);
                    C48442Kl.A00();
                    A02(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList A002 = A00(this.A00, this.A01);
            if (A002 != null) {
                i = A002.size();
            } else {
                i = 0;
            }
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(i), Integer.valueOf(this.A03.A05().BqY().size()), 20);
            C48442Kl.A00();
            android.util.Log.e(str, format);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C48442Kl.A00();
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to schedule ");
            sb.append(workSpec);
            android.util.Log.e(str, sb.toString(), th);
        }
    }

    @Override // X.InterfaceC48882Mg
    public final void AGG(String workSpecId) {
        Context context = this.A01;
        JobScheduler jobScheduler = this.A00;
        ArrayList A00 = A00(jobScheduler, context);
        if (A00 != null) {
            ArrayList arrayList = new ArrayList(2);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                JobInfo jobInfo = (JobInfo) it.next();
                PersistableBundle extras = jobInfo.getExtras();
                if (extras != null) {
                    try {
                        if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                            extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0);
                            String string = extras.getString("EXTRA_WORK_SPEC_ID");
                            C14360o3.A0B(string, 1);
                            if (workSpecId.equals(string)) {
                                arrayList.add(Integer.valueOf(jobInfo.getId()));
                            }
                        }
                    } catch (NullPointerException unused) {
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    A01(jobScheduler, ((Number) it2.next()).intValue());
                }
                C2PR c2pr = (C2PR) this.A03.A02();
                C1YP c1yp = c2pr.A00;
                c1yp.assertNotSuspendingTransaction();
                AbstractC29601bb abstractC29601bb = c2pr.A02;
                InterfaceC37561ot acquire = abstractC29601bb.acquire();
                if (workSpecId == null) {
                    acquire.ADj(1);
                } else {
                    acquire.ADp(1, workSpecId);
                }
                c1yp.beginTransaction();
                try {
                    acquire.ATb();
                    c1yp.setTransactionSuccessful();
                } finally {
                    c1yp.endTransaction();
                    abstractC29601bb.release(acquire);
                }
            }
        }
    }

    @Override // X.InterfaceC48882Mg
    public final void EM3(C48412Ki... workSpecs) {
        int intValue;
        WorkDatabase workDatabase = this.A03;
        final C51032Vz c51032Vz = new C51032Vz(workDatabase);
        for (C48412Ki c48412Ki : workSpecs) {
            workDatabase.beginTransaction();
            try {
                C2M2 A052 = workDatabase.A05();
                String str = c48412Ki.A0M;
                C48412Ki CHq = A052.CHq(str);
                if (CHq != null) {
                    if (CHq.A0E != EnumC48482Kp.ENQUEUED) {
                        C48442Kl.A00();
                        android.util.Log.w(A05, AnonymousClass001.A0g("Skipping scheduling ", str, " because it is no longer enqueued"));
                    } else {
                        C2WP A00 = C2WN.A00(c48412Ki);
                        C2WT C4j = workDatabase.A02().C4j(A00);
                        if (C4j != null) {
                            intValue = C4j.A01;
                        } else {
                            Object runInTransaction = c51032Vz.A00.runInTransaction(new Callable() { // from class: X.2bF
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    C51032Vz c51032Vz2 = C51032Vz.this;
                                    int i = 0;
                                    C14360o3.A0B(c51032Vz2, 0);
                                    WorkDatabase workDatabase2 = c51032Vz2.A00;
                                    int A002 = AbstractC52762bI.A00(workDatabase2, "next_job_scheduler_id");
                                    if (0 <= A002) {
                                        i = A002;
                                    } else {
                                        workDatabase2.A01().COf(new C2YH("next_job_scheduler_id", 1L));
                                    }
                                    return Integer.valueOf(i);
                                }
                            });
                            C14360o3.A07(runInTransaction);
                            intValue = ((Number) runInTransaction).intValue();
                            workDatabase.A02().COh(new C2WT(A00.A01, A00.A00, intValue));
                        }
                        A02(c48412Ki, intValue);
                    }
                } else {
                    C48442Kl.A00();
                    android.util.Log.w(A05, AnonymousClass001.A0g("Skipping scheduling ", str, " because it's no longer in the DB"));
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    public C48872Mf(Context context, C2L2 workDatabase, WorkDatabase configuration) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C48912Mj c48912Mj = new C48912Mj(context, workDatabase.A00);
        this.A01 = context;
        this.A00 = jobScheduler;
        this.A04 = c48912Mj;
        this.A03 = configuration;
        this.A02 = workDatabase;
    }

    public static void A01(JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            C48442Kl.A00();
            android.util.Log.e(A05, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }
}
