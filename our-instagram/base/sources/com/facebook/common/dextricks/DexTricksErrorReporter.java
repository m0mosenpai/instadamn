package com.facebook.common.dextricks;

import X.AnonymousClass001;
import X.C0LA;
import X.C0MP;
import X.C0NG;
import android.os.Process;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public class DexTricksErrorReporter {
    public static final int ALWAYS_REPORT = 1;
    public static final int DEFAULT_SOFT_ERROR_REPORTING_FREQUENCY = 1000;
    public static final int I_WANT_MORE_SOFT_ERRORS_FREQUENCY = 100;
    public static final Random RANDOM = new Random();

    public static String formatCategorySampling(String str, int i) {
        if (i != 1) {
            return AnonymousClass001.A06(i, str, " [freq=", "]");
        }
        return str;
    }

    public static boolean randomSamplingCoinflip(int i) {
        return i == 1 || RANDOM.nextInt(i) == 0;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Exception, X.0NG] */
    public static void reportSampledSoftError(final String str, final String str2, final int i, Throwable th) {
        Mlog.e(th, "SOFT ERROR %s: %s", str, str2);
        if (randomSamplingCoinflip(i)) {
            final ?? exc = new Exception(AnonymousClass001.A0g(str, " | ", str2), th);
            new Thread(new Runnable() { // from class: com.facebook.common.dextricks.DexTricksErrorReporter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Process.setThreadPriority(10);
                        HashMap hashMap = new HashMap();
                        hashMap.put("stack_trace", C0LA.A01(C0NG.this));
                        String formatCategorySampling = DexTricksErrorReporter.formatCategorySampling(str, i);
                        String str3 = str2;
                        HashMap hashMap2 = new HashMap();
                        hashMap2.putAll(hashMap);
                        C0MP.A03(null, null, null, null, hashMap2);
                        C0MP.A04(formatCategorySampling, hashMap2, str3);
                        C0MP.A00().A05("android_large_soft_error", hashMap2);
                    } catch (Throwable th2) {
                        Mlog.w(th2, "Unable to report soft error", new Object[0]);
                    }
                }
            }, "dexTrickError").start();
        }
    }

    public static void reportSampledSoftError(String str, String str2, Throwable th) {
        reportSampledSoftError(str, str2, 1000, th);
    }
}
