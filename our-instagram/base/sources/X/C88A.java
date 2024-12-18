package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.88A, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C88A {
    public static final boolean A00(boolean z) {
        if (Build.VERSION.SDK_INT == 28 && z) {
            String str = Build.MODEL;
            C14360o3.A08(str);
            String upperCase = str.toUpperCase(Locale.ROOT);
            C14360o3.A07(upperCase);
            if (upperCase.equals("CPH1923") || upperCase.equals("RMX1941")) {
                return false;
            }
        }
        return true;
    }
}
