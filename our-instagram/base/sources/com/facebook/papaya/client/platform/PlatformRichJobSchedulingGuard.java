package com.facebook.papaya.client.platform;

import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C18C;
import X.C62478SDf;
import X.C62854SUb;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes10.dex */
public final class PlatformRichJobSchedulingGuard {
    public JobScheduler A00;
    public ComponentName A01;
    public int A02 = 0;
    public final Map A03 = AbstractC58318PtA.A14();

    public final synchronized void A00() {
        this.A02++;
    }

    public final synchronized void A01() {
        ComponentName componentName;
        String str;
        String str2;
        String str3;
        int i = this.A02;
        C18C.A0F(AbstractC167007dF.A1O(i));
        int i2 = i - 1;
        this.A02 = i2;
        if (i2 == 0) {
            JobScheduler jobScheduler = this.A00;
            if (jobScheduler != null) {
                HashMap A1G = AbstractC166987dD.A1G();
                for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
                    AbstractC58319PtB.A1H(jobInfo, A1G, jobInfo.getId());
                }
                int i3 = 771751936;
                do {
                    Map map = this.A03;
                    if (map.containsKey(Integer.valueOf(i3))) {
                        C62478SDf c62478SDf = (C62478SDf) AbstractC166997dE.A0m(map, i3);
                        if (this.A00 != null && (componentName = this.A01) != null) {
                            int i4 = c62478SDf.A01.A00;
                            JobInfo.Builder builder = new JobInfo.Builder(i4, componentName);
                            PersistableBundle persistableBundle = new PersistableBundle();
                            long j = c62478SDf.A00;
                            long max = Math.max(C62854SUb.A00, j);
                            boolean A1P = AbstractC167007dF.A1P(2, i4 & 2);
                            builder.setRequiresCharging(A1P);
                            boolean A1P2 = AbstractC167007dF.A1P(4, i4 & 4);
                            if (A1P2) {
                                builder.setRequiredNetworkType(2);
                            } else {
                                builder.setRequiredNetworkType(1);
                            }
                            boolean z = true;
                            if (1 != (i4 & 1)) {
                                z = false;
                            } else {
                                builder.setRequiresDeviceIdle(true);
                            }
                            builder.setExtras(persistableBundle);
                            builder.setMinimumLatency(max);
                            try {
                                this.A00.schedule(builder.build());
                                Integer valueOf = Integer.valueOf(i4);
                                if (z) {
                                    str = "y";
                                } else {
                                    str = "n";
                                }
                                if (A1P2) {
                                    str2 = "y";
                                } else {
                                    str2 = "n";
                                }
                                if (!A1P) {
                                    str3 = "n";
                                } else {
                                    str3 = "y";
                                }
                                PlatformLog.A02(C62854SUb.class, String.format("Scheduled execution with job scheduler, id=0x%08X, idle=%s, WiFi=%s, external power=%s, delay=%d", valueOf, str, str2, str3, Long.valueOf(j)), new Object[0]);
                            } catch (Exception e) {
                                PlatformLog.A01(C62854SUb.class, e.toString(), new Object[0]);
                            }
                        }
                        i3++;
                    } else {
                        if (this.A00 != null) {
                            Integer valueOf2 = Integer.valueOf(i3);
                            if (A1G.containsKey(valueOf2)) {
                                try {
                                    this.A00.cancel(i3);
                                    PlatformLog.A02(C62854SUb.class, String.format("Cancelled execution with job scheduler, id=0x%08X", valueOf2), new Object[0]);
                                } catch (Exception e2) {
                                    PlatformLog.A01(C62854SUb.class, e2.toString(), new Object[0]);
                                }
                            }
                        }
                        i3++;
                    }
                } while (i3 < 771752191);
            }
            this.A00 = null;
            this.A01 = null;
        }
    }
}
