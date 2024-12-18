package X;

import android.os.StrictMode;
import java.lang.reflect.Method;

/* renamed from: X.0GV, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0GV {
    public static Method A00;
    public static final boolean A01;

    static {
        boolean z;
        try {
            A00 = StrictMode.VmPolicy.Builder.class.getMethod("permitNonSdkApiUsage", new Class[0]);
            z = true;
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            z = false;
        }
        A01 = z;
    }
}
