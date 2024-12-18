package com.facebook.papaya.client.platform;

import X.AbstractC58318PtA;
import X.C09170dP;
import X.C1M8;
import X.C25191Kx;
import X.C2OD;
import X.C62478SDf;
import X.C62854SUb;
import X.SBE;
import X.T8G;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class Platform {
    public static final Class TAG;

    static {
        C09170dP.A0C("papaya");
        TAG = Platform.class;
    }

    public static void cancelExecution(Context context) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to cancel the execution: context is null!", AbstractC58318PtA.A1b());
            return;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = C62854SUb.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            platformRichJobSchedulingGuard.A03.clear();
        }
        C2OD.A03(new T8G(platformRichJobSchedulingGuard, 2), C25191Kx.A01, C1M8.A01);
    }

    public static synchronized void onRunFinished() {
        synchronized (Platform.class) {
            PlatformLog.A02(Platform.class, "Finished Papaya execution", AbstractC58318PtA.A1b());
            C62854SUb.A01.A01();
        }
    }

    public static synchronized void onRunStarted() {
        synchronized (Platform.class) {
            PlatformLog.A02(Platform.class, "Performing Papaya execution", AbstractC58318PtA.A1b());
            C62854SUb.A01.A00();
        }
    }

    public static synchronized void onSchedulingFinished() {
        synchronized (Platform.class) {
            C62854SUb.A01.A01();
        }
    }

    public static synchronized void onSchedulingStarted() {
        synchronized (Platform.class) {
            C62854SUb.A01.A00();
        }
    }

    public static boolean scheduleExecution(Context context, ComponentName componentName, boolean z, boolean z2, boolean z3, long j) {
        if (context == null) {
            PlatformLog.A01(Platform.class, "Fail to schedule execution: context is null!", new Object[0]);
            return false;
        }
        PlatformRichJobSchedulingGuard platformRichJobSchedulingGuard = C62854SUb.A01;
        platformRichJobSchedulingGuard.A00();
        synchronized (platformRichJobSchedulingGuard) {
            if (platformRichJobSchedulingGuard.A00 == null) {
                platformRichJobSchedulingGuard.A00 = (JobScheduler) context.getSystemService("jobscheduler");
            }
            if (platformRichJobSchedulingGuard.A01 == null) {
                platformRichJobSchedulingGuard.A01 = componentName;
            }
            int i = 771751936;
            if (z) {
                i = 771751937;
            }
            int i2 = i & (-5);
            if (z2) {
                i2 = i | 4;
            }
            int i3 = i2 & (-3);
            if (z3) {
                i3 = i2 | 2;
            }
            SBE sbe = new SBE(i3);
            Map map = platformRichJobSchedulingGuard.A03;
            Integer valueOf = Integer.valueOf(sbe.A00);
            if (map.containsKey(valueOf)) {
                j = Math.min(j, ((C62478SDf) map.get(valueOf)).A00);
            }
            map.put(valueOf, new C62478SDf(sbe, j));
        }
        C2OD.A03(new T8G(platformRichJobSchedulingGuard, 2), C25191Kx.A01, C1M8.A01);
        return true;
    }
}
