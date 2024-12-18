package X;

import android.os.Build;
import java.lang.reflect.Method;

/* renamed from: X.0em, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09690em {
    public static boolean A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            return AbstractC09680el.A00();
        }
        long j = AbstractC02670Ar.A00;
        if (!AbstractC02670Ar.A03) {
            return false;
        }
        Method method = AbstractC02670Ar.A01;
        AbstractC05810Sj.A00(method);
        Boolean bool = (Boolean) AbstractC02670Ar.A00(method, Long.valueOf(j));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }
}
