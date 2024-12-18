package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import com.facebook.R;
import com.facebook.common.build.BuildConstants;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.3UM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3UM implements C3UN {
    public final Context A00;
    public final C50232Sp A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;

    @Override // X.C3UN
    public final /* synthetic */ PushChannelType B4M() {
        throw C00O.createAndThrow();
    }

    @Override // X.C3UN
    public final void DQQ() {
    }

    @Override // X.C3UN
    public final PushChannelType BjD() {
        return PushChannelType.A06;
    }

    @Override // X.C3UN
    public final void CNt(C1WZ c1wz, String str, boolean z) {
        this.A01.A00 = c1wz;
    }

    @Override // X.C3UN
    public final void Ctp(C62450SCd c62450SCd, Integer num) {
        C50232Sp c50232Sp = this.A01;
        C14360o3.A0B(num, 0);
        C1WZ c1wz = c50232Sp.A00;
        if (c1wz != null) {
            c1wz.A02(c50232Sp.A01, PushChannelType.A06, num, 0);
        }
        Object value = c50232Sp.A04.getValue();
        C14360o3.A07(value);
        if (((Boolean) value).booleanValue()) {
            InterfaceC09390do interfaceC09390do = ((SYT) SYT.A02.getValue()).A01;
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) interfaceC09390do.getValue();
            if (quickPerformanceLogger != null) {
                quickPerformanceLogger.markerStart(875307100);
            }
            QuickPerformanceLogger quickPerformanceLogger2 = (QuickPerformanceLogger) interfaceC09390do.getValue();
            if (quickPerformanceLogger2 != null) {
                quickPerformanceLogger2.markerPoint(875307100, R2O.A00.A00);
            }
        }
        C14120nc.A00().ATO(new RcO(this, c62450SCd, num));
    }

    @Override // X.C3UN
    public final void ED2(Integer num) {
        if (AbstractC15820qc.A0E(this.A00)) {
            Ctp(null, num);
        }
        C50232Sp c50232Sp = this.A01;
        C14360o3.A0B(num, 0);
        C2S5 c2s5 = (C2S5) c50232Sp.A03.getValue();
        if (c2s5 != null) {
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("trigger", F13.A00(num));
            long j = C50232Sp.A05;
            long j2 = j + (j / 2);
            persistableBundle.putInt("__VERSION_CODE", BuildConstants.A01());
            if (j >= 0) {
                if (j2 < 0) {
                    throw new IllegalArgumentException("You must call setSoftMaximumLatencyMs(long) or setHardMaximumLatencyMs(long)");
                }
                if (j2 <= j) {
                    throw new IllegalArgumentException("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
                }
            }
            if (j2 >= 0 && j < 0) {
                throw new IllegalArgumentException("setSoftMaximumLatencyMs(long) <= setMinimumLatencyMs(long)");
            }
            try {
                Class A00 = C2S5.A00(c2s5, R.id.fcm_refresh_push_token_job_service_id);
                if (A00 != null) {
                    Context context = c2s5.A03;
                    C2SS A002 = C2SS.A00(context);
                    synchronized (A002) {
                        ComponentName componentName = new ComponentName(context, (Class<?>) A00);
                        try {
                            JobScheduler jobScheduler = c2s5.A01;
                            JobInfo.Builder builder = new JobInfo.Builder(R.id.fcm_refresh_push_token_job_service_id, componentName);
                            if (j > -1) {
                                builder.setMinimumLatency(j);
                            }
                            builder.setRequiredNetworkType(1);
                            builder.setExtras(persistableBundle);
                            if (jobScheduler.schedule(builder.build()) > 0) {
                                A002.A00.put(R.id.fcm_refresh_push_token_job_service_id, true);
                            }
                        } catch (IllegalArgumentException e) {
                            AbstractC61760RtF.A00(componentName, context, e);
                        } catch (NullPointerException e2) {
                            if (!Build.MANUFACTURER.equalsIgnoreCase("OPPO") && !Build.BRAND.equalsIgnoreCase("OPPO")) {
                                throw e2;
                            }
                        }
                    }
                }
            } catch (IllegalArgumentException e3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Service not found exception: ");
                sb.append(e3);
                C0w9.A03("FCMTokenJobService", sb.toString());
            }
        }
    }

    public C3UM(Context context, C50232Sp c50232Sp, InterfaceC09390do interfaceC09390do, InterfaceC09390do interfaceC09390do2) {
        this.A00 = context;
        this.A01 = c50232Sp;
        this.A03 = interfaceC09390do;
        this.A02 = interfaceC09390do2;
    }
}
