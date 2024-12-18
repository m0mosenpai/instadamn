package X;

import android.os.Build;
import com.facebook.common.dextricks.DexStore;
import java.util.Locale;

/* renamed from: X.33l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC677133l {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC677233m.A00(30);
            AbstractC677233m.A00(31);
            AbstractC677233m.A00(33);
            AbstractC677233m.A00(DexStore.MS_IN_NS);
        }
    }

    public static final boolean A00() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            C14360o3.A08(str);
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                C14360o3.A07(upperCase);
                String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                C14360o3.A07(upperCase2);
                if (upperCase.compareTo(upperCase2) >= 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
