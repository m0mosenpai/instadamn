package X;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* renamed from: X.TtR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC65752TtR {
    public static final void A00(int i, Paint paint) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC65753TtS.A00(i, paint);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C5YY.A01(i)));
        }
    }
}
