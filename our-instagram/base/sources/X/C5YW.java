package X;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* renamed from: X.5YW, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5YW {
    public static final ColorFilter A00(int i, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C5YX.A00(i, j);
        }
        return new PorterDuffColorFilter(C5AC.A00(j), C5YY.A01(i));
    }
}
