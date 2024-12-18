package com.facebook.common.dextricks.classtracing.logger;

import X.C0ev;
import X.C0f2;
import com.facebook.common.dextricks.classid.ClassId;
import com.facebook.common.dextricks.classtracing.logger.ClassTracingLoggerLite;
import com.facebook.systrace.Systrace;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public class ClassTracingLoggerLite {
    public static final ConcurrentLinkedQueue A00 = new ConcurrentLinkedQueue();
    public static volatile boolean A01;
    public static volatile boolean A02;

    static {
        C0f2 c0f2 = new C0f2() { // from class: X.0NU
            @Override // X.C0f2
            public final void DuR() {
                if (Systrace.A0E(34359738368L)) {
                    Systrace.A04(34359738368L, "CLASS_LOAD_TRACE", 0);
                    ClassTracingLoggerLite.A02 = true;
                    boolean z = false;
                    if (ClassTracingLoggerLite.A02) {
                        z = true;
                    }
                    ClassTracingLoggerLite.A01 = z;
                }
            }

            @Override // X.C0f2
            public final void DuT() {
                if (Systrace.A0E(34359738368L)) {
                    ClassTracingLoggerLite.A02 = false;
                    boolean z = false;
                    if (ClassTracingLoggerLite.A02) {
                        z = true;
                    }
                    ClassTracingLoggerLite.A01 = z;
                    Systrace.A06(34359738368L, "CLASS_LOAD_TRACE", 0);
                }
            }
        };
        String[][] strArr = Systrace.A03;
        C0ev.A01(c0f2);
    }

    public static void beginClassLoad(String str) {
        if (A01) {
            boolean z = ClassId.sInitialized;
        }
    }

    public static void classLoaded(Class cls) {
        if (A01 && ClassId.sInitialized) {
            A00.add(Long.valueOf(ClassId.getClassId(cls)));
        }
    }

    public static void classNotFound() {
        if (A01 && ClassId.sInitialized) {
            A00.add(-1L);
        }
    }
}
