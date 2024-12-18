package X;

import java.util.Locale;

/* renamed from: X.0gN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC10100gN {
    public static boolean A01(int i) {
        String str;
        if (i >= 0) {
            return true;
        }
        if (i != -2) {
            if (i == -1) {
                str = "MODULE_NAME_ROOT";
            } else {
                str = "MODULE_NAME_ERROR";
            }
        } else {
            str = "MODULE_NAME_NON_MODULAR_BUILD";
        }
        C0K8.A0E("AppModuleIndexUtil", String.format(Locale.US, "Checking index for %s (%d)", str, Integer.valueOf(i)));
        return false;
    }

    public static int A00(String str) {
        if (str == null) {
            return -1;
        }
        int A00 = AbstractC09930fu.A00(str);
        if (A00 >= 0) {
            return A00;
        }
        return -3;
    }
}
