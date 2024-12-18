package X;

import android.os.Looper;
import android.os.SystemClock;
import com.facebook.breakpad.BreakpadManager;
import com.facebook.endtoend.EndToEnd;
import com.facebook.errorreporting.lacrima.common.asl.aslnative.AppStateLoggerNative;
import java.io.File;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: X.0YN, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0YN implements C0NC {
    public final int A00;
    public final Object A01;

    public C0YN(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.C0NC
    public final Integer BW5() {
        switch (this.A00) {
            case 0:
                return C05F.A1F;
            case 1:
                return C05F.A0a;
            default:
                return C05F.A0V;
        }
    }

    @Override // X.C0NC
    public final Integer CHb() {
        if (2 - this.A00 != 0) {
            return C05F.A01;
        }
        return C05F.A0N;
    }

    @Override // X.C0NC
    public final void CNh(final C0NK c0nk) {
        boolean z;
        int i;
        int i2;
        final String str;
        switch (this.A00) {
            case 0:
                C0OP c0op = C0Pe.A09;
                if (c0op == C0OP.A06) {
                    str = "anr";
                } else if (c0op == C0OP.A0O) {
                    str = "native_crash";
                } else if (c0op != C0OP.A0X) {
                    return;
                } else {
                    str = "ufad";
                }
                ExecutorService A02 = C04590Mb.A02();
                final C02S c02s = (C02S) this.A01;
                A02.execute(new Runnable() { // from class: X.0Nv
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC04970Nw.A00(C0NK.this, str);
                    }
                });
                return;
            case 1:
                if (!BreakpadManager.isActive()) {
                    C0K8.A0D("lacrima", "Breakpad was not active when NativeAslConfig.libInit called.");
                }
                AbstractC09780fb.A01("AppStateLoggerNative.initializeNativeCrashReporting", 1803144814);
                try {
                    C0Pe A05 = c0nk.A05();
                    synchronized (C0O4.class) {
                        File file = A05.A05;
                        C02R.A03(file, "Did you call SessionManager.init()?");
                        if (C0O4.A00) {
                            z = C0O4.A01;
                        } else {
                            z = false;
                        }
                        boolean z2 = false;
                        if (c0nk.A0A()) {
                            z2 = true;
                        }
                        if (!AppStateLoggerNative.sAppStateLoggerNativeInited) {
                            String path = new File(file, "native_state.txt").getPath();
                            String path2 = new File(file, "anr_state.txt").getPath();
                            String path3 = new File(file, "dump_state.txt").getPath();
                            C09170dP.A0C("appstatelogger2");
                            AbstractC09780fb.A01("registerWithNativeCrashHandler", 1201023782);
                            try {
                                AppStateLoggerNative.registerWithNativeCrashHandler(path, path2, path3, "", false);
                                AbstractC09780fb.A00(-1614600094);
                                AbstractC09780fb.A01("registerStreamWithBreakpad", -899159286);
                                try {
                                    AppStateLoggerNative.registerStreamWithBreakpad();
                                    AbstractC09780fb.A00(1338176473);
                                    AbstractC09780fb.A01("registerOomHandler", -1905257659);
                                    try {
                                        AppStateLoggerNative.registerOomHandler();
                                        AbstractC09780fb.A00(-2147142813);
                                        if (z2) {
                                            AbstractC09780fb.A01("registerSelfSigkill", 125594497);
                                            try {
                                                AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked = AppStateLoggerNative.registerSelfSigkillHandlers();
                                                if (C03400Gs.A01() != null) {
                                                    Runnable runnable = new Runnable() { // from class: X.0MN
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            AppStateLoggerNative.selfSigkillWithoutUpdatingAppStateLogStatus();
                                                        }
                                                    };
                                                    C03400Gs.A04 = runnable;
                                                    synchronized (C03850Ja.class) {
                                                        C03850Ja.A00 = runnable;
                                                    }
                                                    C03400Gs.A03(new InterfaceC03430Gv() { // from class: X.012
                                                        @Override // X.InterfaceC03430Gv
                                                        public final int handleUncaughtException(Thread thread, Throwable th, C0Gl c0Gl) {
                                                            AppStateLoggerNative.disableSelfSigkillHandlers();
                                                            return 0;
                                                        }
                                                    }, 100);
                                                }
                                                if (C0L6.A04 != null) {
                                                    C10850hu c10850hu = C0LK.A9O;
                                                    synchronized (AppStateLoggerNative.class) {
                                                        i2 = AppStateLoggerNative.sSelfSignalFunctionsSuccessfullyHooked;
                                                    }
                                                    C04770Mv.A00.A02(c10850hu, C0M6.CRITICAL_REPORT, Integer.toString(i2));
                                                }
                                                AbstractC09780fb.A00(513980915);
                                            } catch (Throwable th) {
                                                th = th;
                                                i = -672223899;
                                                AbstractC09780fb.A00(i);
                                                throw th;
                                            }
                                        }
                                        synchronized (AppStateLoggerNative.class) {
                                            try {
                                                AppStateLoggerNative.appInForeground(z, z);
                                                AppStateLoggerNative.sAppStateLoggerNativeInited = true;
                                            } catch (Throwable th2) {
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i = 568220524;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    i = 2046067049;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                i = 424821497;
                            }
                        }
                    }
                    AbstractC09780fb.A00(1552781847);
                    return;
                } catch (Throwable th6) {
                    AbstractC09780fb.A00(-1055772912);
                    throw th6;
                }
            default:
                C14360o3.A0B(c0nk, 0);
                C0LW A04 = c0nk.A04();
                C14360o3.A07(A04);
                C0SM.A00(new C0LR() { // from class: X.1Ab
                    @Override // X.C0LR
                    public final Integer BW4() {
                        return C05F.A18;
                    }

                    @Override // X.C0LR
                    public final /* synthetic */ boolean CKv(Integer num) {
                        return false;
                    }

                    @Override // X.C0LR
                    public final void E4h(C024209q c024209q, C0M6 c0m6) {
                        boolean z3;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("mqd_collector_populated", SystemClock.uptimeMillis());
                            jSONObject.put("mqd_collector_created", AbstractC22971Ac.A02);
                            jSONObject.put("mqd_collector_looper_initialized", AbstractC22971Ac.A03);
                            jSONObject.put("mqd_interceptor_started", AbstractC22971Ac.A05);
                            jSONObject.put("mqd_processor_started", AbstractC22971Ac.A06);
                            jSONObject.put("mqd_initializer_started", AbstractC22971Ac.A04);
                            jSONObject.put("mqd_disabled", AbstractC22971Ac.A07);
                            jSONObject.put("should_enable_anr_looper_history", AbstractC22971Ac.A08);
                            jSONObject.put("anr_looper_history_created", AbstractC22971Ac.A01);
                            jSONObject.put("mqd_observer_count", AbstractC22971Ac.A00);
                        } catch (Throwable unused) {
                        }
                        long uptimeMillis = SystemClock.uptimeMillis();
                        try {
                            long j = C0SM.A0B.A09;
                            C88043wC c88043wC = (C88043wC) C88043wC.A08.get(Looper.getMainLooper());
                            if (c88043wC != null) {
                                InterfaceC100264eo[] interfaceC100264eoArr = c88043wC.A03;
                                int length = interfaceC100264eoArr.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    }
                                    InterfaceC100264eo interfaceC100264eo = interfaceC100264eoArr[i3];
                                    if ((interfaceC100264eo instanceof InterfaceC100254en) && interfaceC100264eo.getName().equals("anr_looper_history")) {
                                        InterfaceC100254en interfaceC100254en = (InterfaceC100254en) interfaceC100264eo;
                                        if (interfaceC100254en != null) {
                                            String C05 = interfaceC100254en.C05(j);
                                            c024209q.A03(C0LK.A3n, C05);
                                            if (EndToEnd.isRunningEndToEndTest()) {
                                                C0K8.A0O("JestE2E", "ANR Detected from MessageQueueDoctor, tracking data: \n%s", C05);
                                            }
                                            z3 = false;
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                            z3 = true;
                            jSONObject.put("missing_anr_looper_history", z3);
                            jSONObject.put("mqd_collector_finished_duration", SystemClock.uptimeMillis() - uptimeMillis);
                        } catch (Throwable unused2) {
                        }
                        c024209q.A03(C0LK.A7N, jSONObject.toString());
                    }

                    {
                        AbstractC22971Ac.A02 = SystemClock.uptimeMillis();
                    }
                }, A04, C0M6.LARGE_REPORT);
                return;
        }
    }
}
