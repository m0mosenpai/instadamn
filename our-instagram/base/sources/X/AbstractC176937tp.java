package X;

import android.os.Build;
import java.util.HashSet;

/* renamed from: X.7tp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC176937tp {
    public static HashSet A00(Object... objArr) {
        HashSet hashSet = new HashSet();
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
        return hashSet;
    }

    public static boolean A01(char c, char c2, char c3) {
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.FINGERPRINT;
        int indexOf = str.indexOf(":user/");
        if (indexOf == -1) {
            indexOf = str.indexOf(":userdebug/");
        }
        if (indexOf == -1) {
            indexOf = str.indexOf(":eng/");
        }
        if (indexOf < 3) {
            return false;
        }
        char charAt = str.charAt(indexOf - 3);
        char charAt2 = str.charAt(indexOf - 2);
        char charAt3 = str.charAt(indexOf - 1);
        if (charAt <= c) {
            if (charAt != c) {
                return false;
            }
            if (charAt2 <= c2) {
                if (charAt2 != c2 || charAt3 < c3) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean A02(java.util.Set set) {
        if (!set.contains(C176927to.A03) && !set.contains(C176927to.A04)) {
            return false;
        }
        return true;
    }
}
