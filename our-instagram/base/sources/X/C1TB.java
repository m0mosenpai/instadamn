package X;

import com.facebook.common.hiddenapis2.ApiExemption;
import dalvik.system.VMDebug;

/* renamed from: X.1TB, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1TB {
    public static boolean A00 = true;

    static {
        ApiExemption.enableUnsafeExemption();
        A00 = ApiExemption.removeRestriction_DO_NOT_USE();
    }

    public static long[] A00(Class[] clsArr) {
        Runtime.getRuntime().gc();
        return VMDebug.countInstancesOfClasses(clsArr, true);
    }
}
