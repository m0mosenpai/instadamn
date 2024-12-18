package com.facebook.common.dextricks.classtracing.logger;

import X.C0ev;
import X.C0f2;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger;
import com.facebook.systrace.Systrace;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ClassTracingLogger {
    public static volatile boolean A00;
    public static volatile boolean A01;
    public static volatile boolean A02;
    public static volatile boolean A03;
    public static volatile boolean A04;

    static {
        C0f2 c0f2 = new C0f2() { // from class: X.0NX
            @Override // X.C0f2
            public final void DuR() {
                if (Systrace.A0E(34359738368L)) {
                    Systrace.A04(34359738368L, "CLASS_LOAD_TRACE", 0);
                    ClassTracingLogger.A03 = true;
                    ClassTracingLogger.A01();
                }
            }

            @Override // X.C0f2
            public final void DuT() {
                if (Systrace.A0E(34359738368L)) {
                    ClassTracingLogger.A03 = false;
                    ClassTracingLogger.A01();
                    Systrace.A06(34359738368L, "CLASS_LOAD_TRACE", 0);
                }
            }
        };
        String[][] strArr = Systrace.A03;
        C0ev.A01(c0f2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if (r2 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01() {
        /*
            boolean r2 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01
            r3 = 0
            r1 = 1
            if (r0 != 0) goto Lf
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03
            if (r0 != 0) goto Lf
            r0 = 0
            if (r2 == 0) goto L25
        Lf:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A04 = r1
            r0 = r2 ^ 1
            boolean r2 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01
            boolean r1 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A03
            if (r0 == 0) goto L21
            java.lang.String r0 = "classtracing"
            X.C09170dP.A0C(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L1f
            goto L21
        L1f:
            r0 = 0
            goto L25
        L21:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerNativeHolder.configureTracing(r2, r1)
            r0 = 1
        L25:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02 = r0
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A02
            if (r0 == 0) goto L30
            boolean r0 = com.facebook.common.dextricks.classid.ClassId.sInitialized
            if (r0 == 0) goto L30
            r3 = 1
        L30:
            com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00 = r3
            boolean r0 = com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A00
            X.C0GH.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.dextricks.classtracing.logger.ClassTracingLogger.A01():void");
    }

    public static void A02(int i) {
        if (A02) {
            ClassTracingLoggerNativeHolder.classLoadStarted(null);
            ClassTracingLoggerNativeHolder.classLoaded((i << 32) | 2425405050L);
        }
    }

    public static long[] A03() {
        if (!A04) {
            return new long[0];
        }
        long[] loadedClassIds = ClassTracingLoggerNativeHolder.loadedClassIds();
        HashMap hashMap = new HashMap();
        int i = 0;
        boolean z = false;
        for (long j : loadedClassIds) {
            if (j != -1) {
                int i2 = (int) (j & 4294967295L);
                if (i2 != 1505373456 && i2 != 1215735889) {
                    z = true;
                } else if (!hashMap.containsKey(Long.valueOf(j)) || z) {
                    z = false;
                }
                int i3 = i + 1;
                loadedClassIds[i] = j;
                if (i2 == 1505373456 || i2 == 1215735889) {
                    hashMap.put(Long.valueOf(j), true);
                }
                i = i3;
            }
        }
        return Arrays.copyOf(loadedClassIds, i);
    }

    public static void beginClassLoad(String str) {
        if (A00) {
            ClassTracingLoggerNativeHolder.classLoadStarted(str);
        }
    }

    public static void classLoaded(Class cls) {
        long classId;
        if (A00) {
            if (!ClassId.sInitialized) {
                classId = -1;
            } else {
                classId = ClassId.getClassId(cls);
                if (((-281474976710656L) & classId) == 0) {
                    Thread currentThread = Thread.currentThread();
                    if (currentThread != null) {
                        classId |= (currentThread.getId() & 65535) << 48;
                    }
                } else {
                    throw new UnsupportedOperationException();
                }
            }
            ClassTracingLoggerNativeHolder.classLoaded(classId);
        }
    }

    public static void classNotFound() {
        if (A00) {
            ClassTracingLoggerNativeHolder.classLoadCancelled();
        }
    }

    public static HashMap A00() {
        Thread[] threadArr = new Thread[Thread.activeCount() + 20];
        int enumerate = Thread.enumerate(threadArr);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < enumerate; i++) {
            hashMap.put(Long.valueOf(threadArr[i].getId()), threadArr[i].getName());
        }
        return hashMap;
    }
}
