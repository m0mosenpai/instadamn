package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import java.util.List;

/* renamed from: X.0Kf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04130Kf {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public final String A0A() {
        return null;
    }

    public static C04130Kf A00(Context context, int i) {
        ApplicationExitInfo applicationExitInfo;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (i == -1) {
            i = 0;
        }
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(packageName, i, 1);
        if (historicalProcessExitReasons == null || historicalProcessExitReasons.isEmpty() || (applicationExitInfo = historicalProcessExitReasons.get(0)) == null) {
            return null;
        }
        return new C04130Kf(applicationExitInfo, ActivityManager.isLowMemoryKillReportSupported());
    }

    public final int A01() {
        return this.A00;
    }

    public final int A02() {
        return this.A01;
    }

    public final int A03() {
        return this.A02;
    }

    public final int A04() {
        return this.A03;
    }

    public final long A05() {
        return this.A04;
    }

    public final long A06() {
        return this.A05;
    }

    public final long A07() {
        return this.A06;
    }

    public final String A08() {
        return this.A07;
    }

    public final String A09() {
        return this.A08;
    }

    public final boolean A0B() {
        return this.A09;
    }

    public C04130Kf(ApplicationExitInfo applicationExitInfo, boolean z) {
        String obj;
        int indexOf;
        int indexOf2;
        this.A01 = applicationExitInfo.getPid();
        this.A07 = applicationExitInfo.getDescription();
        this.A02 = applicationExitInfo.getReason();
        this.A03 = applicationExitInfo.getStatus();
        this.A00 = applicationExitInfo.getImportance();
        this.A06 = applicationExitInfo.getTimestamp();
        this.A09 = z;
        this.A04 = applicationExitInfo.getPss();
        this.A05 = applicationExitInfo.getRss();
        String str = null;
        if (Build.VERSION.SDK_INT != 30 && (indexOf = (obj = applicationExitInfo.toString()).indexOf("subreason=")) != -1) {
            int indexOf3 = obj.indexOf(" status=", indexOf);
            int i = indexOf + 10;
            if (indexOf3 == -1) {
                str = obj.substring(i);
            } else {
                str = obj.substring(i, indexOf3);
            }
            int indexOf4 = str.indexOf(40);
            if (indexOf4 != -1 && (indexOf2 = str.indexOf(41, indexOf4)) != -1) {
                str = str.substring(indexOf4 + 1, indexOf2);
            }
        }
        this.A08 = str;
    }
}
