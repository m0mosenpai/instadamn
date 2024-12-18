package com.facebook.systrace;

import X.AbstractC02650Ap;
import X.C09270dc;
import X.C0ev;
import X.C0f0;
import X.C0f1;
import X.C0f4;
import X.InterfaceC09280dd;
import android.os.Process;
import android.util.Log;
import com.facebook.common.util.TriState;
import java.io.FileOutputStream;

/* loaded from: classes.dex */
public class TraceDirect {
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sForceJavaImpl = "true".equals(AbstractC02650Ap.A03("debug.fbsystrace.force_java"));
    public static final boolean sTraceLoad = "true".equals(AbstractC02650Ap.A03("debug.fbsystrace.trace_load"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        int i;
        InterfaceC09280dd interfaceC09280dd;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                sNativeAvailable = TriState.NO;
            } else {
                if (C09270dc.A02()) {
                    synchronized (C09270dc.class) {
                        interfaceC09280dd = C09270dc.A00;
                        if (interfaceC09280dd == null) {
                            throw new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = interfaceC09280dd.ByG();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    String.format("Attempting to load fbsystrace.so [%d|%d].", Integer.valueOf(sPrevSoLoaderSourcesVersion), Integer.valueOf(i));
                    try {
                        C09270dc.A03("fbsystrace");
                        C0f4 c0f4 = C0ev.A01;
                        nativeSetEnabledTags(AbstractC02650Ap.A01("debug.fbsystrace.tags"));
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable == TriState.YES) {
            return true;
        }
        return false;
    }

    public static void asyncTraceBegin(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceBegin(str, i, j);
            return;
        }
        FileOutputStream fileOutputStream = C0f1.A00;
        C0f0 c0f0 = new C0f0('S');
        c0f0.A00(Process.myPid());
        c0f0.A02(str);
        c0f0.A01("<0>");
        if (j != 0) {
            c0f0.A01("<T");
            c0f0.A01(Long.toString(j));
            c0f0.A01(">");
        }
        c0f0.A00(i);
        C0f1.A00(c0f0.toString());
    }

    public static void asyncTraceEnd(String str, int i, long j) {
        if (checkNative()) {
            nativeAsyncTraceEnd(str, i, j);
            return;
        }
        FileOutputStream fileOutputStream = C0f1.A00;
        C0f0 c0f0 = new C0f0('F');
        c0f0.A00(Process.myPid());
        c0f0.A02(str);
        if (j != 0) {
            c0f0.A01("<T");
            c0f0.A01(Long.toString(j));
            c0f0.A01(">");
        }
        c0f0.A00(i);
        C0f1.A00(c0f0.toString());
    }
}
