package com.facebook.common.jit.common;

import X.C0B4;
import android.app.Application;
import android.content.pm.PackageManager;
import android.text.SpannedString;
import com.facebook.common.dextricks.Constants;

/* loaded from: classes.dex */
public final class JitDisabledChecker {
    public static final boolean sIsJitDisabled;

    public static boolean testCompileMethod(int i) {
        if (new SpannedString("Test").length() <= i) {
            return false;
        }
        return true;
    }

    static {
        Application A00 = C0B4.A00();
        boolean z = false;
        try {
            if (A00.getPackageManager() != null) {
                if ((A00.getPackageManager().getApplicationInfo(A00.getPackageName(), 0).flags & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
                    z = true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        sIsJitDisabled = z;
    }
}
