package X;

import android.content.Context;
import android.view.WindowManager;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0KH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0KH {
    public static C0KH A01;
    public static final long A02 = TimeUnit.SECONDS.toNanos(1);
    public long A00 = 0;

    public final long A00(Context context) {
        double d;
        long j = this.A00;
        if (j <= 0) {
            double refreshRate = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
            if (refreshRate < 0.0d) {
                d = 60.0d;
            } else {
                d = 30.0d;
                if (refreshRate >= 30.0d) {
                    d = 240.0d;
                    if (refreshRate <= 240.0d) {
                        d = refreshRate;
                    }
                }
            }
            long round = Math.round(A02 / d);
            this.A00 = round;
            return round;
        }
        return j;
    }
}
