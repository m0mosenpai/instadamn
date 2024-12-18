package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.RMe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60686RMe extends AbstractC60694RMm {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final AlarmManager A03;

    public final void A0J() {
        this.A02 = false;
        AlarmManager alarmManager = this.A03;
        Context context = ((AbstractC63371Sic) this).A00.A00;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, AbstractC58318PtA.A0E("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Integer num = this.A00;
        if (num == null) {
            num = Integer.valueOf(AbstractC58321PtD.A0v("analytics", context.getPackageName()).hashCode());
            this.A00 = num;
        }
        int intValue = num.intValue();
        A0D("Cancelling job. JobID", Integer.valueOf(intValue));
        jobScheduler.cancel(intValue);
    }

    public C60686RMe(C63335Shm c63335Shm) {
        super(c63335Shm);
        this.A03 = (AlarmManager) ((AbstractC63371Sic) this).A00.A00.getSystemService("alarm");
    }
}
