package com.instagram.util.offline;

import X.AbstractC001800i;
import X.AbstractC12290kX;
import X.AbstractC18680vv;
import X.AbstractC225749xt;
import X.AbstractC23021Ah;
import X.AbstractC93164Fs;
import X.C01T;
import X.C023409i;
import X.C06090Tz;
import X.C0w9;
import X.C111314zu;
import X.C111334zw;
import X.C14360o3;
import X.C18U;
import X.C218914p;
import X.C23031Ai;
import X.C40Y;
import X.C901940c;
import X.C902040d;
import X.InterfaceC111304zt;
import X.L9P;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.util.offline.BackgroundPrefetchJobService;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class BackgroundPrefetchJobService extends JobService {
    public C111314zu A00;

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        UserSession userSession;
        Integer num;
        String str;
        AbstractC93164Fs.A01(jobParameters, this, true);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        if (A05 instanceof UserSession) {
            userSession = (UserSession) A05;
        } else {
            userSession = null;
        }
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        } else {
            num = null;
        }
        if (jobParameters != null && Build.VERSION.SDK_INT >= 31) {
            switch (jobParameters.getStopReason()) {
                case 0:
                    str = "STOP_REASON_UNDEFINED";
                    break;
                case 1:
                    str = "STOP_REASON_CANCELLED_BY_APP";
                    break;
                case 2:
                    str = "STOP_REASON_PREEMPT";
                    break;
                case 3:
                    str = "STOP_REASON_TIMEOUT";
                    break;
                case 4:
                    str = "STOP_REASON_DEVICE_STATE";
                    break;
                case 5:
                    str = "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW";
                    break;
                case 6:
                    str = "STOP_REASON_CONSTRAINT_CHARGING";
                    break;
                case 7:
                    str = "STOP_REASON_CONSTRAINT_CONNECTIVITY";
                    break;
                case 8:
                    str = "STOP_REASON_CONSTRAINT_DEVICE_IDLE";
                    break;
                case 9:
                    str = "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW";
                    break;
                case 10:
                    str = "STOP_REASON_QUOTA";
                    break;
                case 11:
                    str = "STOP_REASON_BACKGROUND_RESTRICTION";
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                    str = "STOP_REASON_APP_STANDBY";
                    break;
                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                    str = "STOP_REASON_USER";
                    break;
                case 14:
                    str = "STOP_REASON_SYSTEM_PROCESSING";
                    break;
                case Process.SIGTERM /* 15 */:
                    str = "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
        } else {
            str = null;
        }
        if (userSession != null) {
            A01(userSession, this, num, str, 276371140);
        }
        C0w9.A01.EmN("BackgroundPrefetchJobService", "onStopJob");
        C111314zu c111314zu = this.A00;
        if (c111314zu != null) {
            c111314zu.A02();
            if (C111314zu.A01(c111314zu)) {
                c111314zu.A02.flowEndCancel(c111314zu.A01, str);
                return false;
            }
            return false;
        }
        return false;
    }

    public static void A01(UserSession userSession, BackgroundPrefetchJobService backgroundPrefetchJobService, Integer num, String str, int i) {
        String str2;
        C111314zu c111314zu = new C111314zu(userSession, i);
        c111314zu.A03();
        if (backgroundPrefetchJobService instanceof MainFeedBackgroundPrefetchJobService) {
            str2 = "MainFeedBackgroundPrefetchJobService";
        } else if (backgroundPrefetchJobService instanceof StoryBackgroundPrefetchJobService) {
            str2 = "StoryBackgroundPrefetchJobService";
        } else {
            str2 = "BackgroundPrefetchJobService";
        }
        c111314zu.A05(str2, num);
        if (str != null && C111314zu.A01(c111314zu)) {
            c111314zu.A02.flowAnnotate(c111314zu.A01, "reason", str);
        }
        if (C111314zu.A01(c111314zu)) {
            c111314zu.A02.flowEndSuccess(c111314zu.A01);
        }
    }

    public final boolean A02() {
        UserSession A08;
        long longValue;
        int i;
        Long A01;
        if (this instanceof MainFeedBackgroundPrefetchJobService) {
            A08 = C023409i.A0A.A08(this);
            Long l = 0L;
            if (C218914p.A08() && C18U.A06(C06090Tz.A05, A08, 36315288518921352L) && (A01 = new L9P(AbstractC23021Ah.A00(A08)).A01()) != null) {
                l = Long.valueOf((A01.longValue() * 1000) - System.currentTimeMillis());
            }
            longValue = l.longValue();
            if (longValue > 0) {
                i = R.id.feed_background_prefetch_job_scheduler_id;
            } else {
                return false;
            }
        } else if (this instanceof StoryBackgroundPrefetchJobService) {
            A08 = C023409i.A0A.A08(this);
            Long l2 = 0L;
            if (C218914p.A08() && C18U.A06(C06090Tz.A05, A08, 36316203346497653L)) {
                C23031Ai A00 = AbstractC23021Ah.A00(A08);
                C14360o3.A0B(A00, 1);
                long currentTimeMillis = System.currentTimeMillis();
                ArrayList A0U = AbstractC001800i.A0U(AbstractC225749xt.A00(A00));
                C01T.A1C(A0U);
                Iterator it = A0U.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue2 = ((Number) it.next()).longValue();
                    if (longValue2 > currentTimeMillis / 1000) {
                        if (Long.valueOf(longValue2) != null) {
                            l2 = Long.valueOf((longValue2 * 1000) - System.currentTimeMillis());
                        }
                    }
                }
            }
            longValue = l2.longValue();
            if (longValue > 0) {
                i = R.id.story_background_prefetch_job_scheduler_id;
            } else {
                return false;
            }
        } else {
            return false;
        }
        C901940c c901940c = new C901940c(getClass(), i);
        c901940c.A05 = true;
        c901940c.A00 = 1;
        c901940c.A02 = longValue;
        C40Y.A00(AbstractC12290kX.A00, A08).A03(AbstractC12290kX.A00, A08, new C902040d(c901940c));
        return true;
    }

    public static void A00(final Context context, final UserSession userSession, final InterfaceC111304zt interfaceC111304zt, final BackgroundPrefetchJobService backgroundPrefetchJobService, final Integer num) {
        String str;
        C111334zw c111334zw;
        String str2;
        A01(userSession, backgroundPrefetchJobService, num, null, 276369690);
        C111314zu c111314zu = new C111314zu(userSession, 276374592);
        backgroundPrefetchJobService.A00 = c111314zu;
        c111314zu.A03();
        final Class<?> cls = backgroundPrefetchJobService.getClass();
        C111314zu c111314zu2 = backgroundPrefetchJobService.A00;
        boolean z = backgroundPrefetchJobService instanceof MainFeedBackgroundPrefetchJobService;
        if (z) {
            str = "MainFeedBackgroundPrefetchJobService";
        } else if (backgroundPrefetchJobService instanceof StoryBackgroundPrefetchJobService) {
            str = "StoryBackgroundPrefetchJobService";
        } else {
            str = "BackgroundPrefetchJobService";
        }
        c111314zu2.A05(str, num);
        C111314zu c111314zu3 = backgroundPrefetchJobService.A00;
        synchronized (C111334zw.class) {
            c111334zw = new C111334zw(context, userSession, c111314zu3);
            userSession.A04(C111334zw.class, c111334zw);
        }
        InterfaceC111304zt interfaceC111304zt2 = new InterfaceC111304zt() { // from class: X.508
            @Override // X.InterfaceC111304zt
            public final void DHJ(Integer num2, boolean z2) {
                String A00 = AbstractC114545Ez.A00(num2);
                BackgroundPrefetchJobService backgroundPrefetchJobService2 = backgroundPrefetchJobService;
                UserSession userSession2 = userSession;
                Integer num3 = num;
                BackgroundPrefetchJobService.A01(userSession2, backgroundPrefetchJobService2, num3, A00, 276376302);
                synchronized (C111334zw.class) {
                    userSession2.A03(C111334zw.class);
                }
                if (num3 != null && C18U.A06(C06090Tz.A05, userSession2, 36319433160924589L)) {
                    C40Y.A00(context, userSession2).A04(new C902040d(new C901940c(cls, num3.intValue())));
                } else if (z2 && backgroundPrefetchJobService2.A02()) {
                    BackgroundPrefetchJobService.A01(userSession2, backgroundPrefetchJobService2, num3, "rescheduled", 276374386);
                }
                C111314zu c111314zu4 = backgroundPrefetchJobService2.A00;
                if (c111314zu4 != null) {
                    c111314zu4.A02();
                    if (num2 != C05F.A0Y && num2 != C05F.A0C && num2 != C05F.A0N && num2 != C05F.A00) {
                        C111314zu c111314zu5 = backgroundPrefetchJobService2.A00;
                        if (C111314zu.A01(c111314zu5)) {
                            c111314zu5.A02.flowEndSuccess(c111314zu5.A01);
                        }
                    } else {
                        C111314zu c111314zu6 = backgroundPrefetchJobService2.A00;
                        String A002 = AbstractC114545Ez.A00(num2);
                        if (C111314zu.A01(c111314zu6)) {
                            c111314zu6.A02.flowEndCancel(c111314zu6.A01, A002);
                        }
                    }
                }
                interfaceC111304zt.DHJ(num2, z2);
            }
        };
        if (z) {
            str2 = "FEED";
        } else if (backgroundPrefetchJobService instanceof StoryBackgroundPrefetchJobService) {
            str2 = "STORY";
        } else {
            str2 = "ALL";
        }
        c111334zw.A02(interfaceC111304zt2, str2);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        UserSession userSession;
        Integer num;
        int i;
        AbstractC93164Fs.A00(jobParameters, this);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        if (A05 instanceof UserSession) {
            userSession = (UserSession) A05;
        } else {
            userSession = null;
        }
        if (jobParameters != null) {
            num = Integer.valueOf(jobParameters.getJobId());
        } else {
            num = null;
        }
        if (userSession != null) {
            InterfaceC111304zt interfaceC111304zt = new InterfaceC111304zt() { // from class: X.4zs
                @Override // X.InterfaceC111304zt
                public final void DHJ(Integer num2, boolean z) {
                    JobParameters jobParameters2 = jobParameters;
                    if (jobParameters2 != null) {
                        C0fN.A02(jobParameters2, this, false);
                    }
                }
            };
            if (num != null) {
                i = num.intValue();
            } else {
                i = -1;
            }
            A00(getApplicationContext(), userSession, interfaceC111304zt, this, Integer.valueOf(i));
            return true;
        }
        return false;
    }
}
