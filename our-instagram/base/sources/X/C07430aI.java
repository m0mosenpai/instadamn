package X;

import android.app.Application;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.facebook.aborthooks.AbortHooks;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.breakpad.UnwindstackStreamManager;
import com.facebook.common.dextricks.DalvikInternals;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.errorreporting.lacrima.detector.broadcast.SecureShutdownBootBroadcastReceiver;
import com.facebook.systrace.Systrace;
import com.instagram.debug.logdelegate.IgLogImpl;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.0aI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C07430aI implements C0NC {
    public final int A00;

    public C07430aI(int i) {
        this.A00 = i;
    }

    @Override // X.C0NC
    public final Integer BW5() {
        switch (this.A00) {
            case 0:
                return C05F.A00;
            case 1:
                return C05F.A06;
            case 2:
                return C05F.A08;
            case 3:
                return C05F.A09;
            case 4:
                return C05F.A07;
            case 5:
                return C05F.A0A;
            case 6:
                return C05F.A0F;
            case 7:
                return C05F.A05;
            case 8:
                return C05F.A02;
            case 9:
                return C05F.A0c;
            case 10:
                return C05F.A0e;
            case 11:
                return C05F.A0w;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C05F.A0o;
            default:
                return C05F.A0H;
        }
    }

    @Override // X.C0NC
    public final Integer CHb() {
        switch (this.A00) {
            case 11:
                return C05F.A01;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return C05F.A0N;
            default:
                return C05F.A0C;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v52, types: [java.lang.Object, X.0OV] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.0OR, java.lang.Object] */
    @Override // X.C0NC
    public final void CNh(C0NK c0nk) {
        int i;
        int i2;
        Application application;
        switch (this.A00) {
            case 0:
                AbstractC09780fb.A01("AbortHooks.init", 1977171003);
                try {
                    if (!AbortHooks.sInstalled) {
                        synchronized (AbortHooks.class) {
                            if (!AbortHooks.sInstalled) {
                                AbortHooks.sInstalled = true;
                                AbortHooks.install();
                                AbortHooks.hookAbort();
                                AbortHooks.hookAndroidLogAssert();
                                AbortHooks.setGlogFatalHandler();
                                AbortHooks.hookAndroidSetAbortMessage();
                            }
                        }
                    }
                    i2 = 1336127813;
                } catch (Throwable th) {
                    try {
                        C0K8.A0H("lacrima", "Unable to install abort hooks", th);
                        C0PC.A00().DEh(C0ND.A00(C05F.A00), th, null);
                        i2 = -1212103041;
                    } catch (Throwable th2) {
                        th = th2;
                        i = -985673631;
                        AbstractC09780fb.A00(i);
                        throw th;
                    }
                }
                AbstractC09780fb.A00(i2);
                return;
            case 1:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("ActivityThreadMessageListenerConfig.start", -1426659495);
                    final C005801x c005801x = (C005801x) c0nk.A04().A05(C005801x.class);
                    if (c005801x != null) {
                        try {
                            if (C0OR.A00 == null) {
                                final ?? obj = new Object();
                                final HashSet hashSet = new HashSet();
                                hashSet.add(113);
                                hashSet.add(114);
                                hashSet.add(115);
                                hashSet.add(116);
                                hashSet.add(121);
                                hashSet.add(122);
                                hashSet.add(146);
                                hashSet.add(159);
                                hashSet.add(160);
                                C0HU.A03(new AbstractC04410Lh() { // from class: X.0hS
                                    @Override // X.AbstractC04410Lh, X.C0HV
                                    public final boolean DSx(Message message, C0HT c0ht, String str) {
                                        if (hashSet.contains(Integer.valueOf(message.what))) {
                                            C005801x c005801x2 = c005801x;
                                            int i3 = message.what;
                                            C07960bG c07960bG = c005801x2.A0F;
                                            if (c07960bG != null) {
                                                synchronized (c07960bG) {
                                                    if (i3 > 255) {
                                                        i3 = 255;
                                                    }
                                                    C07960bG.A02(c07960bG, C05F.A0G, (byte) i3);
                                                }
                                                return false;
                                            }
                                            return false;
                                        }
                                        return false;
                                    }
                                });
                                if (C0HQ.A00 == null) {
                                    try {
                                        C0HQ.A00 = new C0HT(C0BK.A00());
                                    } catch (Exception unused) {
                                    }
                                }
                                C0OR.A00 = obj;
                            }
                        } catch (Throwable th3) {
                            try {
                                C0K8.A0I("lacrima", "Unable to install ActivityThread message detector", th3);
                                C0PC.A00().DEh(C0ND.A00(C05F.A06), th3, null);
                                i2 = 880801217;
                            } catch (Throwable th4) {
                                th = th4;
                                i = 397373246;
                                AbstractC09780fb.A00(i);
                                throw th;
                            }
                        }
                    }
                    i2 = 161421229;
                    AbstractC09780fb.A00(i2);
                    return;
                }
                return;
            case 2:
                SecureShutdownBootBroadcastReceiver secureShutdownBootBroadcastReceiver = new SecureShutdownBootBroadcastReceiver();
                Application application2 = c0nk.A0J;
                C0Pe A05 = c0nk.A05();
                try {
                    C0NN.A00(application2).A02("last_device_shutdown_s", Long.toString(0L));
                    File file = A05.A05;
                    C02R.A03(file, "Did you call SessionManager.init()?");
                    SecureShutdownBootBroadcastReceiver.A00 = file;
                    if (C0b3.A00() == null) {
                        C0K8.A0D("lacrima", "SecureContextHelper is null");
                        return;
                    } else {
                        C0b3.A02(application2, secureShutdownBootBroadcastReceiver);
                        return;
                    }
                } catch (Throwable th5) {
                    C0PC.A00().DEh("SecureShutdownBootBroadcastReceiverStart", th5, null);
                    C0K8.A0J("lacrima", "SecureShutdownBootBroadcastReceiver failed", th5);
                    return;
                }
            case 3:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("SecureBroadcastReceiver.start", -1525674695);
                    try {
                        HandlerThread handlerThread = new HandlerThread("LacrimaBroadcastReceiver");
                        AbstractC09770fa.A00(handlerThread);
                        handlerThread.start();
                        Looper looper = handlerThread.getLooper();
                        if (looper != null) {
                            Handler handler = new Handler(looper);
                            handler.post(new Runnable() { // from class: X.0Ny
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Process.setThreadPriority(-4);
                                }
                            });
                            synchronized (C0Nz.class) {
                                application = c0nk.A0J;
                                C0Nz.A01 = new C04270Kt(application, handler);
                            }
                            C04X c04x = new C04X(handler);
                            try {
                                C04X.A01 = c0nk.A04();
                                C0DJ.A01(c04x, application, (IntentFilter) ((AbstractC07590aY) c04x).A00.get(0), c04x.A00);
                            } catch (Throwable th6) {
                                C0PC.A00().DEh("BatteryChangeReceiver", th6, null);
                                C0K8.A0J("lacrima", "BatteryChangedBroadcastReceiver failed", th6);
                            }
                        }
                        i2 = 630328466;
                        AbstractC09780fb.A00(i2);
                        return;
                    } catch (Throwable th7) {
                        th = th7;
                        i = -660938243;
                        AbstractC09780fb.A00(i);
                        throw th;
                    }
                }
                return;
            case 4:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("SystemBinderDiedDetector.start", -1234298290);
                    try {
                        C0Pe A052 = c0nk.A05();
                        if (C0OY.A01 == null) {
                            C0OY.A01 = new C0OY(A052);
                        }
                        i2 = -890202028;
                    } catch (Throwable th8) {
                        try {
                            C0K8.A0I("lacrima", "Unable to install system binder died detector", th8);
                            C0PC.A00().DEh(C0ND.A00(C05F.A07), th8, null);
                            i2 = -1564860395;
                        } catch (Throwable th9) {
                            th = th9;
                            i = 2037560976;
                            AbstractC09780fb.A00(i);
                            throw th;
                        }
                    }
                    AbstractC09780fb.A00(i2);
                    return;
                }
                return;
            case 5:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("ContentProviderDiedDetector.start", -61665159);
                    try {
                        Application application3 = c0nk.A0J;
                        C0Pe A053 = c0nk.A05();
                        if (C0OX.A04 == null) {
                            C0OX.A04 = new C0OX(application3, A053);
                        }
                        i2 = 76220347;
                    } catch (Throwable th10) {
                        try {
                            C0K8.A0I("lacrima", "Unable to install content provider died detector", th10);
                            C0PC.A00().DEh(C0ND.A00(C05F.A0A), th10, null);
                            i2 = 1126381980;
                        } catch (Throwable th11) {
                            th = th11;
                            i = 1839861800;
                            AbstractC09780fb.A00(i);
                            throw th;
                        }
                    }
                    AbstractC09780fb.A00(i2);
                    return;
                }
                return;
            case 6:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("ApplicationThreadDataConfig.start", -148106752);
                    C005801x c005801x2 = (C005801x) c0nk.A04().A05(C005801x.class);
                    try {
                        C0Pe A054 = c0nk.A05();
                        if (C0XV.A03 == null) {
                            C0XV.A03 = new C0XV(c005801x2, A054);
                        }
                        i2 = -1214019094;
                        AbstractC09780fb.A00(i2);
                        return;
                    } catch (Throwable th12) {
                        th = th12;
                        i = 1662623364;
                        AbstractC09780fb.A00(i);
                        throw th;
                    }
                }
                return;
            case 7:
                if (((String) c0nk.A0Y.get()).equals("")) {
                    AbstractC09780fb.A01("ActivityManagerRequestConfig.start", 1624018974);
                    final C005801x c005801x3 = (C005801x) c0nk.A04().A05(C005801x.class);
                    if (c005801x3 != null) {
                        try {
                            if (C0OV.A00 == null) {
                                final ?? obj2 = new Object();
                                C0HU.A03(new AbstractC04410Lh() { // from class: X.0hR
                                    @Override // X.AbstractC04410Lh, X.C0HV
                                    public final C0HW Ajg(C0HX c0hx, String str, Method method, Object[] objArr) {
                                        C07960bG c07960bG;
                                        if (str.equals("activity") || str.equals("activity_task")) {
                                            String name = method.getName();
                                            if (name.startsWith("startActivity")) {
                                                Class<?>[] parameterTypes = method.getParameterTypes();
                                                int length = parameterTypes.length;
                                                int i3 = 0;
                                                int i4 = 0;
                                                while (true) {
                                                    if (i3 >= length) {
                                                        break;
                                                    }
                                                    if (parameterTypes[i3] == Intent.class) {
                                                        if (i4 != -1 && (c07960bG = c005801x3.A0F) != null) {
                                                            synchronized (c07960bG) {
                                                                C07960bG.A02(c07960bG, C05F.A0E, new byte[0]);
                                                            }
                                                        }
                                                    } else {
                                                        i4++;
                                                        i3++;
                                                    }
                                                }
                                                return null;
                                            }
                                            if (name.startsWith("finishActivity")) {
                                                Class<?>[] parameterTypes2 = method.getParameterTypes();
                                                int length2 = parameterTypes2.length;
                                                int i5 = 0;
                                                int i6 = 0;
                                                while (true) {
                                                    if (i5 >= length2) {
                                                        break;
                                                    }
                                                    if (parameterTypes2[i5] == Intent.class) {
                                                        if (i6 != -1 && (c07960bG = c005801x3.A0F) != null) {
                                                            synchronized (c07960bG) {
                                                                C07960bG.A02(c07960bG, C05F.A0F, new byte[0]);
                                                            }
                                                        }
                                                    } else {
                                                        i6++;
                                                        i5++;
                                                    }
                                                }
                                            }
                                        }
                                        return null;
                                    }
                                });
                                C0HU.A05("activity");
                                C0HU.A05("activity_task");
                                C0OV.A00 = obj2;
                            }
                        } catch (Throwable th13) {
                            try {
                                C0K8.A0I("lacrima", "Unable to install ActivityManager request detector", th13);
                                C0PC.A00().DEh(C0ND.A00(C05F.A05), th13, null);
                                i2 = 1882017464;
                            } catch (Throwable th14) {
                                th = th14;
                                i = 2122729954;
                                AbstractC09780fb.A00(i);
                                throw th;
                            }
                        }
                    }
                    i2 = 753670059;
                    AbstractC09780fb.A00(i2);
                    return;
                }
                return;
            case 8:
                C03400Gs.A00();
                return;
            case 9:
                AbstractC09780fb.A01("UnwindstackStreamManager.register", 1218832210);
                try {
                    UnwindstackStreamManager.register();
                    BreakpadManager.ensureLoadLibrary();
                    long nativeGetMinidumpFlags = BreakpadManager.nativeGetMinidumpFlags() | OdexSchemeArtXdex.STATE_DEX2OAT_CLASSPATH_SET;
                    BreakpadManager.ensureLoadLibrary();
                    BreakpadManager.nativeSetMinidumpFlags(nativeGetMinidumpFlags);
                    i2 = -2031520395;
                    AbstractC09780fb.A00(i2);
                    return;
                } catch (Throwable th15) {
                    th = th15;
                    i = 2139534134;
                    AbstractC09780fb.A00(i);
                    throw th;
                }
            case 10:
                AbstractC09780fb.A01("NativeJvmStreamConfig.jvmStreamEnabled", 41172878);
                try {
                    try {
                        BreakpadManager.setJvmStreamEnabled(true);
                        i2 = 145825200;
                    } catch (Exception | UnsatisfiedLinkError e) {
                        C0K8.A0H("lacrima", "Error enabling jvm stream", e);
                        C0PC.A00().DEh(C0ND.A00(C05F.A0e), e, null);
                        i2 = 251195631;
                    }
                    AbstractC09780fb.A00(i2);
                    return;
                } catch (Throwable th16) {
                    th = th16;
                    i = 1254664743;
                    AbstractC09780fb.A00(i);
                    throw th;
                }
            case 11:
                if (C04770Mv.A00 == C04770Mv.A03) {
                    File file2 = c0nk.A05().A05;
                    C02R.A03(file2, "Did you call SessionManager.init()?");
                    C0Mq A00 = C0OD.A00(file2);
                    if (A00 != null) {
                        C04770Mv.A00(A00);
                        return;
                    }
                    return;
                }
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                C0P2.A01 = true;
                return;
            default:
                Application application4 = c0nk.A0J;
                if (C20150ym.A07(AbstractC20100yh.A00(2342153783720542491L))) {
                    if (Systrace.A0E(1L)) {
                        C0fO.A01("integrateWithCrashLog", 494503610);
                    }
                    try {
                        int A01 = (int) C20150ym.A01(AbstractC20100yh.A00(36592249483690369L));
                        File file3 = new File(application4.getApplicationInfo().dataDir, "crash_log");
                        try {
                            file3.createNewFile();
                            file3.setReadable(true);
                            file3.setWritable(true);
                        } catch (IOException unused2) {
                        }
                        String path = file3.getPath();
                        File file4 = new File(application4.getApplicationInfo().dataDir, "insta_crash_log");
                        try {
                            file4.createNewFile();
                            file4.setReadable(true);
                            file4.setWritable(true);
                        } catch (IOException unused3) {
                        }
                        DalvikInternals.integrateWithCrashLog(path, file4.getPath(), new DalvikInternals.CrashLogParameters(A01));
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-292232831);
                        }
                    } catch (Throwable th17) {
                        if (Systrace.A0E(1L)) {
                            C0fO.A00(-29329934);
                        }
                        throw th17;
                    }
                }
                C0BZ c0bz = IgLogImpl.sInstance;
                List list = C0K8.A00;
                synchronized (C0K8.class) {
                    if (c0bz == null) {
                        c0bz = C10890hy.A00;
                    }
                    c0bz.mMinimumLoggingLevel = C0K8.A01.getMinimumLoggingLevel();
                    C0K8.A01 = c0bz;
                    C0I2.A00 = C0K8.A01;
                }
                return;
        }
    }
}
