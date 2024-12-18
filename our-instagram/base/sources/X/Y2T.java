package X;

import android.app.Notification;
import android.content.LocusId;
import android.os.Build;

/* loaded from: classes12.dex */
public abstract class Y2T {
    public static XND A00(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return XND.A01(Y2R.A00(notification));
        }
        return null;
    }

    public static Y20 A01(Notification notification) {
        LocusId A01;
        if (Build.VERSION.SDK_INT < 29 || (A01 = Y2R.A01(notification)) == null) {
            return null;
        }
        return Y20.A00(A01);
    }

    public static boolean A02(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Y2R.A02(notification);
        }
        return false;
    }
}
