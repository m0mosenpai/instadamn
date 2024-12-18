package X;

import android.app.usage.UsageStatsManager;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111314zu {
    public final int A00;
    public final long A01;
    public final C1QT A02;
    public final List A03;
    public final List A04;
    public final UserSession A05;

    public static final String A00(C111314zu c111314zu) {
        UsageStatsManager usageStatsManager = (UsageStatsManager) c111314zu.A05.deviceSession.A06().getSystemService(AbstractC111324zv.A00(3274));
        if (usageStatsManager == null) {
            return "UNKNOWN";
        }
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        if (appStandbyBucket != 10) {
            if (appStandbyBucket != 20) {
                if (appStandbyBucket != 30) {
                    if (appStandbyBucket != 40) {
                        return appStandbyBucket == 45 ? "STANDBY_BUCKET_RESTRICTED" : "UNKNOWN";
                    }
                    return "STANDBY_BUCKET_RARE";
                }
                return "STANDBY_BUCKET_FREQUENT";
            }
            return "STANDBY_BUCKET_WORKING_SET";
        }
        return "STANDBY_BUCKET_ACTIVE";
    }

    public static final boolean A01(C111314zu c111314zu) {
        return C18U.A06(C06090Tz.A05, c111314zu.A05, 36318672951712150L);
    }

    public C111314zu(UserSession userSession, int i) {
        this.A05 = userSession;
        this.A00 = i;
        C1QT A00 = C1QS.A00(userSession);
        this.A02 = A00;
        this.A01 = A00.generateNewFlowId(i);
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
    }

    public final void A02() {
        if (A01(this)) {
            synchronized (this) {
                C1QT c1qt = this.A02;
                List list = this.A03;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    c1qt.flowAnnotate(this.A01, AnonymousClass001.A0R(((AnonymousClass511) it.next()).A00, "_completed"), true);
                }
                list.clear();
            }
        }
    }

    public final void A03() {
        String str;
        if (A01(this)) {
            C1QT c1qt = this.A02;
            long j = this.A01;
            switch (this.A00) {
                case 276369690:
                    str = "TASK_STARTED";
                    break;
                case 276371140:
                    str = "TASK_STOPPED";
                    break;
                case 276374386:
                    str = "TASK_SCHEDULED";
                    break;
                case 276376302:
                    str = "TASK_EXECUTED";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            c1qt.flowStart(j, str, false);
        }
    }

    public final void A04(AnonymousClass511 anonymousClass511) {
        if (A01(this)) {
            synchronized (this) {
                this.A04.add(anonymousClass511);
            }
        }
    }

    public final void A05(String str, Integer num) {
        if (A01(this)) {
            C1QT c1qt = this.A02;
            long j = this.A01;
            c1qt.flowAnnotate(j, "job_class", str);
            c1qt.flowAnnotate(j, "standby_bucket", A00(this));
            c1qt.flowAnnotate(j, "is_backgrounded", C218914p.A08());
            if (num != null) {
                c1qt.flowAnnotate(j, "job_id", num.intValue());
            }
        }
    }
}
