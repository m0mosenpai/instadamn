package com.facebook.common.threadutils;

import X.AbstractC220015a;
import X.C09170dP;
import X.C0K8;
import X.C15Y;
import X.C15Z;
import java.io.File;

/* loaded from: classes.dex */
public final class ThreadUtils {
    public static final C15Y Companion = new Object();
    public static final ThreadUtils instance = new ThreadUtils();
    public final int maxAffinityMask;

    public static final native void nativeSetThreadAffinityMask(int i, int i2);

    /* JADX WARN: Type inference failed for: r0v0, types: [X.15Y, java.lang.Object] */
    static {
        C09170dP.A0C("threadutils-jni");
    }

    public ThreadUtils() {
        int i;
        C15Z c15z = C15Z.A02;
        synchronized (c15z) {
            i = c15z.A00;
            if (i == 0) {
                int i2 = -1;
                try {
                    try {
                        int A00 = AbstractC220015a.A00("/sys/devices/system/cpu/possible");
                        A00 = A00 == -1 ? AbstractC220015a.A00("/sys/devices/system/cpu/present") : A00;
                        if (A00 == -1) {
                            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(AbstractC220015a.A00);
                            listFiles.getClass();
                            A00 = listFiles.length;
                        }
                        i2 = A00;
                    } catch (Exception e) {
                        C0K8.A0H("ProcessorInfoUtil", "Unable to get reliable CPU Core count", e);
                    }
                } catch (NullPointerException | SecurityException unused) {
                }
                c15z.A00 = i2;
                i = c15z.A00;
            }
        }
        if (i == -1 && (i = c15z.A01) == 0) {
            i = Math.max(Runtime.getRuntime().availableProcessors(), 1);
            c15z.A01 = i;
        }
        this.maxAffinityMask = (1 << i) - 1;
    }
}
