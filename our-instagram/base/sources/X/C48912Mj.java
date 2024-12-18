package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;

/* renamed from: X.2Mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48912Mj {
    public final ComponentName A00;
    public final C2L5 A01;

    static {
        C48442Kl.A01("SystemJobInfoConverter");
    }

    public final JobInfo A00(C48412Ki c48412Ki, int i) {
        int i2;
        C48562Ky c48562Ky = c48412Ki.A0B;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", c48412Ki.A0M);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", c48412Ki.A0K);
        boolean z = false;
        if (c48412Ki.A06 != 0) {
            z = true;
        }
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", z);
        JobInfo.Builder requiresCharging = new JobInfo.Builder(i, this.A00).setRequiresCharging(c48562Ky.A05);
        boolean z2 = c48562Ky.A06;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        Integer num = c48562Ky.A02;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30 && num == C05F.A0j) {
            extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            int intValue = num.intValue();
            if (intValue != 0) {
                i2 = 2;
                if (intValue != 1) {
                    if (intValue != 2) {
                        i2 = 4;
                        if (intValue != 3) {
                            if (intValue != 4) {
                                C48442Kl.A00();
                            }
                        } else {
                            i2 = 3;
                        }
                    }
                }
                i2 = 1;
            } else {
                i2 = 0;
            }
            extras.setRequiredNetworkType(i2);
        }
        boolean z3 = false;
        if (!z2) {
            int i4 = 1;
            if (c48412Ki.A0F == C05F.A01) {
                i4 = 0;
            }
            extras.setBackoffCriteria(c48412Ki.A03, i4);
        }
        long max = Math.max(c48412Ki.A00() - System.currentTimeMillis(), 0L);
        if (i3 > 28 && max <= 0) {
            if (!c48412Ki.A0J) {
                extras.setImportantWhileForeground(true);
            }
        } else {
            extras.setMinimumLatency(max);
        }
        java.util.Set<SNU> set = c48562Ky.A03;
        if (!set.isEmpty()) {
            for (SNU snu : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(snu.A00, snu.A01 ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(c48562Ky.A01);
            extras.setTriggerContentMaxDelay(c48562Ky.A00);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(c48562Ky.A04);
        extras.setRequiresStorageNotLow(c48562Ky.A07);
        boolean z4 = false;
        if (c48412Ki.A02 > 0) {
            z4 = true;
        }
        if (max > 0) {
            z3 = true;
        }
        if (i3 >= 31 && c48412Ki.A0J && !z4 && !z3) {
            extras.setExpedited(true);
        }
        return extras.build();
    }

    public C48912Mj(Context context, C2L5 clock) {
        this.A01 = clock;
        this.A00 = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
