package X;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* loaded from: classes8.dex */
public abstract class LD9 {
    public static final ThreadLocal A00 = new ThreadLocal();

    public static void A00(Paint paint, Integer num) {
        PorterDuff.Mode A002;
        PorterDuffXfermode porterDuffXfermode = null;
        Object obj = null;
        porterDuffXfermode = null;
        if (Build.VERSION.SDK_INT >= 29) {
            if (num != null) {
                obj = VKU.A00(num);
            }
            AbstractC46531KiW.A00(paint, obj);
        } else {
            if (num != null && (A002 = VKV.A00(num)) != null) {
                porterDuffXfermode = new PorterDuffXfermode(A002);
            }
            paint.setXfermode(porterDuffXfermode);
        }
    }
}
