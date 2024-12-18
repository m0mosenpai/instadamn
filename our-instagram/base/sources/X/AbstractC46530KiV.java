package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.KiV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46530KiV {
    public static ColorFilter A00(Integer num, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object A00 = VKU.A00(num);
            if (A00 == null) {
                return null;
            }
            return AbstractC46529KiU.A00(A00, i);
        }
        PorterDuff.Mode A002 = VKV.A00(num);
        if (A002 == null) {
            return null;
        }
        return new PorterDuffColorFilter(i, A002);
    }
}
