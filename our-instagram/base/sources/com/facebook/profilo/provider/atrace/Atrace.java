package com.facebook.profilo.provider.atrace;

import X.C20230yv;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: classes.dex */
public final class Atrace {
    public static boolean sHasHook;
    public static boolean sHookFailed;

    public static native void enableSystraceNative(boolean z);

    public static native boolean installSystraceHook(MultiBufferLogger multiBufferLogger, int i, boolean z);

    public static native boolean isEnabled();

    public static native void restoreSystraceNative(boolean z);

    public static synchronized boolean hasHacks(MultiBufferLogger multiBufferLogger, boolean z) {
        boolean z2;
        synchronized (Atrace.class) {
            z2 = sHasHook;
            if (!z2 && !sHookFailed) {
                z2 = installSystraceHook(multiBufferLogger, C20230yv.A00, z);
                sHasHook = z2;
                boolean z3 = false;
                if (!z2) {
                    z3 = true;
                }
                sHookFailed = z3;
            }
        }
        return z2;
    }
}
