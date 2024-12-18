package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.0v0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0v0 extends AnonymousClass027 {
    public final JobInfo A00;
    public final JobScheduler A01;

    public C0v0(ComponentName componentName, Context context, int i) {
        super(componentName);
        A00(i);
        this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0L).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
