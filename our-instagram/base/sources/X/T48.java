package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.database.Cursor;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.location.platform.api.Location;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.zip.Adler32;

/* loaded from: classes10.dex */
public final class T48 implements InterfaceC65399TjW {
    public final Context A00;
    public final AbstractC61583Rq7 A01;
    public final InterfaceC65676Tr6 A02;

    @Override // X.InterfaceC65399TjW
    public final void EM2(AbstractC61582Rq6 abstractC61582Rq6, int i, boolean z) {
        long j;
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)));
        C60639REy c60639REy = (C60639REy) abstractC61582Rq6;
        String str = c60639REy.A01;
        adler32.update(str.getBytes(Charset.forName(ReactWebViewManager.HTML_ENCODING)));
        ByteBuffer allocate = ByteBuffer.allocate(4);
        EnumC61103RfI enumC61103RfI = c60639REy.A00;
        allocate.putInt(AbstractC62859SUg.A00(enumC61103RfI));
        adler32.update(allocate.array());
        byte[] bArr = c60639REy.A02;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        String.format("Upload for context %s is already scheduled. Returning...", abstractC61582Rq6);
                        return;
                    }
                }
            }
        }
        Cursor rawQuery = ((T49) this.A02).A03().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str, String.valueOf(AbstractC62859SUg.A00(enumC61103RfI))});
        try {
            if (rawQuery.moveToNext()) {
                j = rawQuery.getLong(0);
            } else {
                j = 0;
            }
            Long valueOf = Long.valueOf(j);
            rawQuery.close();
            long longValue = valueOf.longValue();
            AbstractC61583Rq7 abstractC61583Rq7 = this.A01;
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(abstractC61583Rq7.A00(enumC61103RfI, i, longValue));
            java.util.Set set = ((RF0) ((AbstractC61293RlD) ((RF1) abstractC61583Rq7).A01.get(enumC61103RfI))).A02;
            if (set.contains(EnumC61104RfJ.NETWORK_UNMETERED)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(EnumC61104RfJ.DEVICE_CHARGING)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(EnumC61104RfJ.DEVICE_IDLE)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i);
            persistableBundle.putString("backendName", str);
            persistableBundle.putInt("priority", AbstractC62859SUg.A00(enumC61103RfI));
            if (bArr != null) {
                persistableBundle.putString(Location.EXTRAS, Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", abstractC61582Rq6, Integer.valueOf(value), Long.valueOf(abstractC61583Rq7.A00(enumC61103RfI, i, longValue)), valueOf, Integer.valueOf(i));
            jobScheduler.schedule(builder.build());
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    public T48(Context context, AbstractC61583Rq7 abstractC61583Rq7, InterfaceC65676Tr6 interfaceC65676Tr6) {
        this.A00 = context;
        this.A02 = interfaceC65676Tr6;
        this.A01 = abstractC61583Rq7;
    }
}
