package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.util.SparseBooleanArray;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2SS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2SS {
    public static C2SS A01;
    public final SparseBooleanArray A00 = new SparseBooleanArray();

    public static synchronized C2SS A00(Context context) {
        C2SS c2ss;
        synchronized (C2SS.class) {
            c2ss = A01;
            if (c2ss == null) {
                c2ss = new C2SS(context.getApplicationContext());
                A01 = c2ss;
            }
        }
        return c2ss;
    }

    public C2SS(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> allPendingJobs = jobScheduler.getAllPendingJobs();
            if (allPendingJobs != null) {
                Iterator<JobInfo> it = allPendingJobs.iterator();
                while (it.hasNext()) {
                    this.A00.put(it.next().getId(), true);
                }
                return;
            }
            return;
        }
        C0K8.A0E("LollipopJobTracker", "jobScheduler was null");
    }
}
