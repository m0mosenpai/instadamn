package X;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.Iterator;

/* renamed from: X.40Y, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C40Y {
    public static C40Y A00;

    public static synchronized C40Y A00(Context context, AbstractC12990ll abstractC12990ll) {
        C40Y c40y;
        synchronized (C40Y.class) {
            c40y = A00;
            if (c40y == null) {
                if (abstractC12990ll == null || !C18U.A06(C06090Tz.A05, abstractC12990ll, 36321125378040987L)) {
                    c40y = new C40a(context);
                } else {
                    c40y = new C40Z(context);
                }
                A00 = c40y;
            }
        }
        return c40y;
    }

    public final C902040d A01() {
        if (this instanceof C40Z) {
            try {
                return ((C40Z) this).A00.A01();
            } catch (Exception e) {
                C0w9.A02(EnumC12410kj.A09, "NonThrowingNativeJobSchedulerWrapper", "Getting pending job has failed.", e);
                return null;
            }
        }
        Object systemService = ((C40a) this).A00.getSystemService("jobscheduler");
        if (systemService != null) {
            JobInfo pendingJob = ((JobScheduler) systemService).getPendingJob(R.id.background_sync_scheduler_job_id);
            if (pendingJob == null) {
                return null;
            }
            int id = pendingJob.getId();
            String className = pendingJob.getService().getClassName();
            C14360o3.A07(className);
            try {
                Class<? extends U> asSubclass = Class.forName(className).asSubclass(Service.class);
                C14360o3.A0A(asSubclass);
                C901940c c901940c = new C901940c(asSubclass, id);
                c901940c.A00 = pendingJob.getNetworkType();
                c901940c.A05 = pendingJob.isPersisted();
                c901940c.A08 = pendingJob.isRequireCharging();
                c901940c.A09 = pendingJob.isRequireDeviceIdle();
                c901940c.A04 = pendingJob.getExtras();
                c901940c.A07 = pendingJob.isRequireBatteryNotLow();
                c901940c.A0A = pendingJob.isRequireStorageNotLow();
                if (pendingJob.getMaxExecutionDelayMillis() > 0) {
                    c901940c.A01 = pendingJob.getMaxExecutionDelayMillis();
                }
                if (pendingJob.getMinLatencyMillis() > 0) {
                    c901940c.A01 = pendingJob.getMinLatencyMillis();
                }
                if (pendingJob.getIntervalMillis() > 0) {
                    c901940c.A03 = pendingJob.getIntervalMillis();
                }
                return new C902040d(c901940c);
            } catch (ClassCastException | ClassNotFoundException e2) {
                C0w9.A02(EnumC12410kj.A09, "NativeJobSchedulerWrapper", "Service class exception while converting to JobInfo", e2);
                return null;
            }
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(int i) {
        if (this instanceof C40a) {
            Object systemService = ((C40a) this).A00.getSystemService("jobscheduler");
            if (systemService != null) {
                ((JobScheduler) systemService).cancel(i);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        try {
            ((C40Z) this).A00.A02(R.id.background_sync_scheduler_job_id);
        } catch (Exception e) {
            C0w9.A02(EnumC12410kj.A09, "NonThrowingNativeJobSchedulerWrapper", "Canceling of the job failed.", e);
        }
    }

    public final void A04(C902040d c902040d) {
        if (this instanceof C40a) {
            A02(c902040d.A00);
            return;
        }
        try {
            ((C40Z) this).A00.A04(c902040d);
        } catch (Exception e) {
            C0w9.A02(EnumC12410kj.A09, "NonThrowingNativeJobSchedulerWrapper", "Canceling of the job failed.", e);
        }
    }

    public final void A05(C902040d c902040d, Class cls) {
        if (this instanceof C40Z) {
            try {
                ((C40Z) this).A00.A05(c902040d, cls);
                return;
            } catch (Exception e) {
                C0w9.A02(EnumC12410kj.A09, "NonThrowingNativeJobSchedulerWrapper", "Scheduling of the job failed.", e);
                return;
            }
        }
        Context context = ((C40a) this).A00;
        Object systemService = context.getSystemService("jobscheduler");
        if (systemService != null) {
            JobScheduler jobScheduler = (JobScheduler) systemService;
            JobInfo.Builder builder = new JobInfo.Builder(c902040d.A00, new ComponentName(context, (Class<?>) cls));
            builder.setRequiredNetworkType(c902040d.A01);
            builder.setPersisted(c902040d.A07);
            builder.setRequiresCharging(c902040d.A0A);
            builder.setRequiresDeviceIdle(c902040d.A0B);
            builder.setRequiresBatteryNotLow(c902040d.A09);
            builder.setRequiresStorageNotLow(c902040d.A0C);
            long j = c902040d.A02;
            if (j > 0) {
                builder.setOverrideDeadline(j);
            }
            long j2 = c902040d.A03;
            if (j2 > 0) {
                builder.setMinimumLatency(j2);
            }
            long j3 = c902040d.A04;
            if (j3 > 0) {
                builder.setPeriodic(j3);
            }
            builder.setPrefetch(c902040d.A08);
            PersistableBundle persistableBundle = c902040d.A05;
            if (persistableBundle != null) {
                builder.setExtras(persistableBundle);
            }
            JobInfo build = builder.build();
            C14360o3.A07(build);
            jobScheduler.schedule(build);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A03(Context context, UserSession userSession, C902040d c902040d) {
        C107224sT A002 = C2JW.A00(context, userSession);
        if (A002 != null) {
            Class cls = c902040d.A06;
            Iterator it = A002.A05.iterator();
            while (it.hasNext()) {
                if (C14360o3.A0K(((C107244sV) it.next()).A01, cls)) {
                    return;
                }
            }
        }
        A05(c902040d, c902040d.A06);
    }
}
