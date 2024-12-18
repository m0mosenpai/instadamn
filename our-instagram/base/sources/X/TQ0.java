package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.facebook.R;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class TQ0 implements Runnable {
    public final /* synthetic */ C58621Pyp A00;
    public final /* synthetic */ C1RU A01;
    public final /* synthetic */ List A02;

    public TQ0(C58621Pyp c58621Pyp, C1RU c1ru, List list) {
        this.A01 = c1ru;
        this.A00 = c58621Pyp;
        this.A02 = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1RU c1ru = this.A01;
        List list = this.A02;
        if (c1ru.A00 != null) {
            if (!c1ru.A06.getAndSet(true)) {
                try {
                    c1ru.A00.A04(new C64095SzC(c1ru));
                } catch (SecurityException e) {
                    C0K8.A0G("FacebookVoltronDownloader", "Unable to register listener", e);
                } catch (Throwable th) {
                    C0K8.A0F("FacebookVoltronDownloader", "Oxygen request failed", th);
                }
            }
            try {
                if (c1ru.A07) {
                    Context context = c1ru.A01;
                    C1UI A00 = C1U4.A00(c1ru.A04.A00);
                    C14360o3.A0B(context, 0);
                    C14360o3.A0B(list, 1);
                    long A002 = C63057Sbe.A00(0);
                    Long valueOf = Long.valueOf(A002);
                    long A003 = C63057Sbe.A00(6);
                    Long valueOf2 = Long.valueOf(A003);
                    if (!list.isEmpty()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        C1ZT AR9 = A00.A00("AppModules::ScheduledInstallRequestTimestamp").AR9();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            AR9.A08(AbstractC166987dD.A1B(it), currentTimeMillis);
                        }
                        AR9.A03();
                        JobInfo.Builder persisted = new JobInfo.Builder(R.id.oxygen_scheduled_installer_job_id, new ComponentName(context, (Class<?>) OxygenScheduledInstallerJobService.class)).setRequiredNetworkType(2).setRequiresDeviceIdle(true).setRequiresCharging(true).setPersisted(true);
                        if (valueOf != null) {
                            persisted.setMinimumLatency(A002);
                        }
                        if (valueOf2 != null) {
                            persisted.setOverrideDeadline(A003);
                        }
                        Object systemService = context.getSystemService("jobscheduler");
                        C14360o3.A0C(systemService, MSV.A00(1434));
                        ((JobScheduler) systemService).schedule(persisted.build());
                        return;
                    }
                    return;
                }
                c1ru.A00.A03(list);
            } catch (Throwable th2) {
                C0K8.A0H("FacebookVoltronDownloader", "Oxygen install request failure on deferred install", th2);
            }
        }
    }
}
