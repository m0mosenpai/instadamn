package X;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.acra.anr.multisignal.MultiSignalANRDetector;
import com.facebook.acra.anr.sigquit.SigquitDetectorLacrima;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0SM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0SM implements C0OO {
    public static MultiSignalANRDetector A0B;
    public static C05980Tm A0C;
    public static volatile boolean A0D;
    public int A00 = 0;
    public boolean A01;
    public final C06420Vj A02;
    public final int A03;
    public final C0LV A04;
    public final C0LW A05;
    public final C05720Ry A06;
    public final C0Pe A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;

    public static synchronized void A01(C0SM c0sm, EnumC07670ah enumC07670ah) {
        C0MI c0mi;
        int i;
        File file;
        synchronized (c0sm) {
            C0Pe c0Pe = c0sm.A07;
            C003801d c003801d = c0Pe.A03;
            C02R.A03(c003801d, "Did you call SessionManager.init()?");
            C0ME c0me = new C0ME(c003801d.A01.A01);
            char A05 = c0me.A05();
            boolean A01 = C0MG.A01(A05);
            String name = enumC07670ah.name();
            EnumC07670ah enumC07670ah2 = EnumC07670ah.A03;
            if (enumC07670ah != enumC07670ah2 && enumC07670ah != EnumC07670ah.A07 && enumC07670ah != EnumC07670ah.A08 && enumC07670ah != EnumC07670ah.A09 && enumC07670ah != EnumC07670ah.A0A && enumC07670ah != EnumC07670ah.A0B && enumC07670ah != EnumC07670ah.A05 && enumC07670ah != EnumC07670ah.A06 && enumC07670ah != EnumC07670ah.A02) {
                if (enumC07670ah == EnumC07670ah.A04) {
                    A0D = false;
                    c0sm.A04.DWC(C0M6.LARGE_REPORT, c0sm);
                    c003801d.A0B(C0MI.A0D);
                    c0sm.A01 = false;
                } else {
                    C0K8.A0P("lacrima", "Ignored anr state: %s", name);
                }
            } else {
                switch (enumC07670ah.ordinal()) {
                    case 1:
                    case 4:
                        c0mi = C0MI.A04;
                        break;
                    case 2:
                    case 5:
                    default:
                        c0mi = C0MI.A09;
                        break;
                    case 3:
                        c0mi = C0MI.A0A;
                        break;
                    case 6:
                        c0mi = C0MI.A08;
                        break;
                    case 7:
                        c0mi = C0MI.A07;
                        break;
                    case 8:
                        c0mi = C0MI.A05;
                        break;
                    case 9:
                        c0mi = C0MI.A06;
                        break;
                }
                c003801d.A0B(c0mi);
                if (enumC07670ah == enumC07670ah2 || enumC07670ah == EnumC07670ah.A0A || enumC07670ah == EnumC07670ah.A05) {
                    A0D = true;
                    int i2 = c0sm.A00 + 1;
                    c0sm.A00 = i2;
                    C06420Vj c06420Vj = c0sm.A02;
                    c06420Vj.A02 = i2;
                    File file2 = c06420Vj.A0U.A05;
                    C02R.A03(file2, "Did you call SessionManager.init()?");
                    c06420Vj.A0C = new File(file2, AnonymousClass001.A0c("anr_report_", ".dmp", c06420Vj.A02));
                    c0sm.A01 = A01;
                    if (!C0PD.A03 && !A01) {
                        if (!c0sm.A0A) {
                            i = c0sm.A03;
                            if (i <= 0) {
                                i = 0;
                            }
                        }
                    } else {
                        i = 1;
                    }
                    C024209q c024209q = new C024209q(null);
                    if (i > 0) {
                        try {
                            c024209q.A01(C0LK.A16, i);
                        } catch (Throwable th) {
                            C0PC.A00().DEh("AnrDetectStateChange", th, null);
                            c024209q.A03(C0LK.A67, th.getMessage());
                        }
                    }
                    c024209q.A02(C0LK.A1X, Long.valueOf(System.currentTimeMillis() / 1000));
                    c024209q.A00(C0LK.A01, c0sm.A01);
                    c024209q.A02(C0LK.A2c, Long.valueOf(SystemClock.uptimeMillis() - c0Pe.A01));
                    c024209q.A03(C0LK.A3z, String.valueOf(c0mi.A01));
                    c024209q.A03(C0LK.A5h, Character.toString(A05));
                    c024209q.A03(C0LK.A5g, c0me.A0H());
                    C0LW c0lw = c0sm.A05;
                    C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                    c0lw.A0E(c0m6, c0sm);
                    c0lw.A08(c024209q, c0m6, c0sm);
                    c0lw.A0D(c0m6, c0sm);
                    if (c0sm.A09 && ((c0sm.A01 || !c0sm.A0A) && (file = c06420Vj.A0C) != null)) {
                        C0LP c0lp = C0LP.A02;
                        C0M6 c0m62 = C0M6.LARGE_REPORT;
                        c024209q.A04(c0lp, c0m62, file);
                        c0lw.A0E(c0m62, c0sm);
                        c0lw.A0A(c024209q, c0m62, c0sm, null, null, c0sm.A00);
                        c0lw.A0D(c0m62, c0sm);
                    }
                }
            }
        }
    }

    @Override // X.C0OO
    public final /* synthetic */ C0Z0 BNJ() {
        return null;
    }

    public static void A00(C0LR c0lr, C0LW c0lw, C0M6 c0m6) {
        C0OO A05 = c0lw.A05(C0SM.class);
        if (A05 == null) {
            HashMap hashMap = new HashMap();
            hashMap.put("CollectorName", C0LX.A00(c0lr.BW4()));
            hashMap.put("ReportCategory", c0m6.A00);
            C0PC.A00().DEh("AnrDetector.addExtraCollector", new RuntimeException("Unable to add extra collector to AnrDetector"), hashMap);
            C0K8.A0D("lacrima", "Cannot find registered detector");
            return;
        }
        c0lw.A07(c0lr, c0m6, A05);
    }

    @Override // X.C0OO
    public final C0OP BW2() {
        return C0OP.A04;
    }

    @Override // X.C0OO
    public final void start() {
        C09S c09s;
        C0PB.A00("AnrDetector");
        C05980Tm c05980Tm = new C05980Tm(this);
        A0C = c05980Tm;
        C05720Ry c05720Ry = this.A06;
        String str = this.A08;
        C06420Vj c06420Vj = this.A02;
        Application application = c05720Ry.A00;
        C0M9 c0m9 = new C0M9(application, new Handler(Looper.getMainLooper()), c06420Vj, c05980Tm, str, application.getDir("traces", 0).getPath(), c05720Ry.A02);
        InterfaceC04550Lx interfaceC04550Lx = c05720Ry.A01;
        Map map = MultiSignalANRDetector.A0f;
        final MultiSignalANRDetector multiSignalANRDetector = (MultiSignalANRDetector) map.get(c0m9);
        if (multiSignalANRDetector == null) {
            multiSignalANRDetector = new MultiSignalANRDetector(interfaceC04550Lx, c0m9);
            map.put(c0m9, multiSignalANRDetector);
        }
        multiSignalANRDetector.A0E = AnonymousClass001.A0R("MultiSignalANRDetector", "Lacrima");
        multiSignalANRDetector.A0C = new C0SL(c05720Ry);
        new Thread(new Runnable() { // from class: X.0OU
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                MultiSignalANRDetector multiSignalANRDetector2 = MultiSignalANRDetector.this;
                try {
                    synchronized (C05720Ry.A04) {
                        C09170dP.A0C("sigquit");
                    }
                    C09X c09x = multiSignalANRDetector2.A0V;
                    C0M9 c0m92 = multiSignalANRDetector2.A0X;
                    C0SL c0sl = multiSignalANRDetector2.A0C;
                    if (c0sl != null) {
                        z = c0sl.A00.A03;
                    } else {
                        z = true;
                    }
                    c09x.init(c0m92, z);
                    final Handler handler = multiSignalANRDetector2.A0S;
                    final SigquitDetectorLacrima sigquitDetectorLacrima = (SigquitDetectorLacrima) c09x;
                    final Runnable runnable = new Runnable() { // from class: X.09a
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean nativeHookMethods = SigquitDetectorLacrima.nativeHookMethods();
                            synchronized (SigquitDetectorLacrima.this.mListener.A0Y) {
                            }
                            if (nativeHookMethods) {
                                SigquitDetectorLacrima.nativeStartDetector();
                            }
                        }
                    };
                    if (sigquitDetectorLacrima.mNotifyJavaOnSigquit) {
                        new Thread() { // from class: X.09b
                            {
                                super("LacrimaSigquitNotifier");
                            }

                            @Override // java.lang.Thread, java.lang.Runnable
                            public final void run() {
                                SigquitDetectorLacrima.nativeWaitForSignal();
                            }
                        }.start();
                    }
                    sigquitDetectorLacrima.mMainThreadHandler.post(new Runnable() { // from class: X.09c
                        @Override // java.lang.Runnable
                        public final void run() {
                            SigquitDetectorLacrima.nativeAddSignalHandler();
                            handler.post(runnable);
                        }
                    });
                    multiSignalANRDetector2.A0a.set(true);
                    multiSignalANRDetector2.A0R.open();
                } catch (UnsatisfiedLinkError e) {
                    C0K8.A0I("lacrima", "Failed to load sigquit", e);
                    C0PC.A00().DEh("LoadSigQuit", e, null);
                }
            }
        }).start();
        A0B = multiSignalANRDetector;
        C0K8.A0P("lacrima", "Start AnrDetector... %s", multiSignalANRDetector.getClass().getName());
        final MultiSignalANRDetector multiSignalANRDetector2 = A0B;
        synchronized (multiSignalANRDetector2.A0Y) {
            if (!multiSignalANRDetector2.A0M) {
                C0K8.A0D(multiSignalANRDetector2.A0E, "Starting");
                multiSignalANRDetector2.A0M = true;
                multiSignalANRDetector2.A02 = SystemClock.uptimeMillis();
                C09V c09v = multiSignalANRDetector2.A0B;
                C11240ig c11240ig = multiSignalANRDetector2.A0T;
                C0K8.A0P("ProcessAnrErrorMonitor", "startMonitoring with delay: %d", 0L);
                ActivityManager activityManager = (ActivityManager) c09v.A04.getSystemService("activity");
                synchronized (c09v) {
                    C09S c09s2 = c09v.A01;
                    if (c09s2 != null && c09s2.A07 == null) {
                        if (c11240ig != null) {
                            C09S c09s3 = c09v.A01;
                            Object obj = c09s3.A05;
                            synchronized (obj) {
                                try {
                                    c09s3.A07 = c11240ig;
                                    obj.notifyAll();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("Listener cannot be null");
                        }
                    } else {
                        Integer num = c09v.A02;
                        Integer num2 = C05F.A00;
                        if (num != num2 && (c09s = c09v.A01) != null) {
                            Object obj2 = c09s.A05;
                            synchronized (obj2) {
                                try {
                                    c09s.A02 = true;
                                    obj2.notifyAll();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                        long j = c09v.A00 + 1;
                        c09v.A00 = j;
                        C09S c09s4 = new C09S(activityManager, c11240ig, c09v, j);
                        c09v.A01 = c09s4;
                        if (c11240ig != null) {
                            num2 = C05F.A01;
                        }
                        c09v.A02 = num2;
                        c09s4.start();
                    }
                }
                final C05980Tm c05980Tm2 = multiSignalANRDetector2.A0X.A00;
                multiSignalANRDetector2.A0S.post(new Runnable() { // from class: X.09F
                    @Override // java.lang.Runnable
                    public final void run() {
                        C05980Tm c05980Tm3 = c05980Tm2;
                        if (!C0L6.A07() && (C0L6.A04 == null || !C0L6.A04.A05)) {
                            MultiSignalANRDetector.this.A0K = true;
                        }
                        C08140bc c08140bc = MultiSignalANRDetector.this.A0U;
                        List list = c05980Tm3.A00;
                        synchronized (list) {
                            list.add(c08140bc);
                        }
                    }
                });
            }
        }
        C03400Gs.A03(new InterfaceC03430Gv() { // from class: X.0Uh
            @Override // X.InterfaceC03430Gv
            public final int handleUncaughtException(Thread thread, Throwable th3, C0Gl c0Gl) {
                MultiSignalANRDetector multiSignalANRDetector3 = C0SM.A0B;
                if (multiSignalANRDetector3 != null) {
                    multiSignalANRDetector3.A0e = true;
                    multiSignalANRDetector3.A0B.A00();
                    SigquitDetectorLacrima.nativeStopDetector();
                    return 0;
                }
                return 0;
            }
        }, 100);
    }

    public C0SM(C0LV c0lv, C0LW c0lw, C05720Ry c05720Ry, C0Pe c0Pe, String str, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, int i, boolean z, boolean z2) {
        this.A07 = c0Pe;
        this.A05 = c0lw;
        this.A06 = c05720Ry;
        this.A08 = str;
        this.A0A = z;
        this.A03 = i;
        this.A09 = z2;
        this.A04 = c0lv;
        this.A02 = new C06420Vj(c0Pe, interfaceC08830cm, interfaceC08830cm2, interfaceC08830cm3);
    }

    @Override // X.C0OO
    public final /* synthetic */ int BDP() {
        return 100000;
    }
}
