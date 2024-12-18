package com.facebook.systrace;

import X.AbstractC02670Ar;
import X.AbstractC05810Sj;
import X.AbstractC09620ed;
import X.AbstractC09740es;
import X.C0eu;
import X.C0ev;
import X.C0f0;
import X.C0f1;
import X.C0f4;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class Systrace {
    public static long A00;
    public static final ThreadLocal A01;
    public static final AtomicInteger A02;
    public static final String[][] A03;

    static {
        C0f4 c0f4 = C0ev.A01;
        if (AbstractC02670Ar.A03) {
            Method method = AbstractC02670Ar.A02;
            AbstractC05810Sj.A00(method);
            AbstractC02670Ar.A00(method, true);
        }
        C0ev.A02(false, false);
        AbstractC09740es abstractC09740es = AbstractC09740es.$redex_init_class;
        A02 = new AtomicInteger();
        A01 = new ThreadLocal() { // from class: X.0ef
            @Override // java.lang.ThreadLocal
            public final /* bridge */ /* synthetic */ Object initialValue() {
                return new Object();
            }
        };
        A03 = new String[][]{new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};
    }

    public static void A00(int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(4L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceRename(str, str2, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('F');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A01("<M>");
            c0f0.A00(i);
            c0f0.A02(str2);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A01(int i, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(64L)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceMetadata(str, str2, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('M');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A00(i);
            c0f0.A02(str2);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A02(long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndSection();
            } else {
                C0f1.A00("E");
            }
        }
    }

    public static void A03(long j, String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeBeginSection(str);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('B');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A04(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            TraceDirect.asyncTraceBegin(str, i, 0L);
        }
    }

    public static void A05(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndAsyncFlow(str, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('f');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A00(i);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A06(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            TraceDirect.asyncTraceEnd(str, i, 0L);
        }
    }

    public static void A07(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeStartAsyncFlow(str, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('s');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A00(i);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A08(long j, String str, int i) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeTraceCounter(str, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('C');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A00(i);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A09(String str, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            TraceDirect.asyncTraceBegin(str, i, AbstractC09620ed.A00(j2));
        }
    }

    public static void A0A(String str, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            TraceDirect.asyncTraceEnd(str, i, AbstractC09620ed.A00(j2));
        }
    }

    public static void A0B(String str, String str2, int i, long j, long j2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            long A002 = AbstractC09620ed.A00(j2);
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeAsyncTraceStageBegin(str, i, A002, str2);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('T');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            if (A002 != 0) {
                c0f0.A01("<T");
                c0f0.A01(Long.toString(A002));
                c0f0.A01(">");
            }
            c0f0.A00(i);
            c0f0.A02(str2);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A0C(String str, String[] strArr, int i, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeBeginSectionWithArgs(str, strArr, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('B');
            c0f0.A00(Process.myPid());
            c0f0.A02(str);
            c0f0.A03(strArr, i);
            C0f1.A00(c0f0.toString());
        }
    }

    public static void A0D(String[] strArr, int i, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            C0eu.A00();
        }
        if (A0E(j)) {
            if (TraceDirect.checkNative()) {
                TraceDirect.nativeEndSectionWithArgs(strArr, i);
                return;
            }
            FileOutputStream fileOutputStream = C0f1.A00;
            C0f0 c0f0 = new C0f0('E');
            StringBuilder sb = c0f0.A00;
            sb.append('|');
            sb.append('|');
            c0f0.A03(strArr, i);
            C0f1.A00(c0f0.toString());
        }
    }

    public static boolean A0E(long j) {
        if ((j & C0ev.A02) == 0 && (A00 & j) == 0) {
            if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                if (j == 4 || j == 274877906944L) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
