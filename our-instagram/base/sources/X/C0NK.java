package X;

import android.app.Application;
import android.content.Context;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: X.0NK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NK {
    public static C0NK A0k;
    public static final String A0l = AbstractC05120Pc.A00("mobile", "reliability_event_log_upload").toString();
    public C0LW A00;
    public C0Pe A01;
    public InterfaceC08830cm A03;
    public InterfaceC08830cm A04;
    public InterfaceC08830cm A07;
    public InterfaceC08830cm A08;
    public InterfaceC08830cm A09;
    public InterfaceC08830cm A0B;
    public InterfaceC08830cm A0C;
    public final int A0E;
    public final int A0F;
    public final long A0G;
    public final long A0H;
    public final long A0I;
    public final Application A0J;
    public final String A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;
    public final InterfaceC08830cm A0O;
    public final InterfaceC08830cm A0P;
    public final InterfaceC08830cm A0Q;
    public final InterfaceC08830cm A0R;
    public final InterfaceC08830cm A0S;
    public final InterfaceC08830cm A0T;
    public final InterfaceC08830cm A0U;
    public final InterfaceC08830cm A0X;
    public final InterfaceC08830cm A0Y;
    public final InterfaceC08830cm A0a;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0g;
    public final C17470ti A0h;
    public final List A0i;
    public final boolean A0j;
    public Integer A02 = null;
    public final InterfaceC08830cm A0Z = new C15310pl(this, 7);
    public final InterfaceC08830cm A0W = new C15310pl(this, 8);
    public InterfaceC08830cm A05 = null;
    public InterfaceC08830cm A0A = null;
    public final InterfaceC08830cm A0V = new C15320pm(1);
    public InterfaceC08830cm A06 = null;
    public final boolean A0f = true;
    public final boolean A0b = true;
    public final int A0D = 3;

    public C0NK(Application application, C17470ti c17470ti, String str, List list, List list2, List list3, List list4, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5, InterfaceC08830cm interfaceC08830cm6, InterfaceC08830cm interfaceC08830cm7, InterfaceC08830cm interfaceC08830cm8, InterfaceC08830cm interfaceC08830cm9, InterfaceC08830cm interfaceC08830cm10, int i, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A0J = application;
        this.A0R = interfaceC08830cm2;
        this.A0a = interfaceC08830cm3;
        this.A0P = interfaceC08830cm4;
        this.A0O = interfaceC08830cm5;
        this.A0T = interfaceC08830cm6;
        this.A0i = list;
        this.A0L = list2;
        this.A0M = list3;
        this.A0N = list4;
        this.A0Y = interfaceC08830cm7;
        this.A0S = interfaceC08830cm8;
        this.A0H = j2;
        this.A0X = interfaceC08830cm;
        this.A0Q = interfaceC08830cm9;
        this.A0U = interfaceC08830cm10;
        this.A0I = j3;
        this.A0G = j;
        this.A0F = i;
        this.A0j = z;
        this.A0h = c17470ti;
        this.A0c = z2;
        this.A0e = z3;
        this.A0E = i2;
        this.A0g = z4;
        A0k = this;
        C0PC.A00().EP7((String) interfaceC08830cm.get());
        this.A0K = str;
        this.A0d = z5;
    }

    public static void A00(C0NK c0nk) {
        for (C0NC c0nc : c0nk.A0i) {
            int DYA = C0PC.A00().DYA("earlyJavaInit");
            Integer BW5 = c0nc.BW5();
            c0nk.A02 = BW5;
            c0nc.CNh(c0nk);
            if (DYA != -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("ConfigName", C0ND.A00(BW5));
                C0PC.A00().DY9(DYA, hashMap);
            }
        }
    }

    public final C0LW A04() {
        C02R.A03(this.A00, "Did you call earlyInit()?");
        return this.A00;
    }

    public final C0Pe A05() {
        C02R.A03(this.A01, "Did you call earlyInit()?");
        return this.A01;
    }

    public final InterfaceC08830cm A06() {
        InterfaceC08830cm interfaceC08830cm = this.A0C;
        if (interfaceC08830cm == null) {
            C15310pl c15310pl = new C15310pl(this, 11);
            this.A0C = c15310pl;
            return c15310pl;
        }
        return interfaceC08830cm;
    }

    public final void A07() {
        AbstractC09780fb.A01("FixedLengthFiles.init", -1318890884);
        try {
            C04610Md A00 = C04610Md.A00("collector");
            Application application = this.A0J;
            A00.A03(application, 8, 15000);
            C04610Md.A00("reports").A03(application, 6, 60000);
            AbstractC09780fb.A00(149659373);
        } catch (Throwable th) {
            AbstractC09780fb.A00(-1127841538);
            throw th;
        }
    }

    public final void A08() {
        ExecutorService A02;
        if (C0M4.A00 == 2) {
            A02 = C04590Mb.A04;
        } else {
            A02 = C04590Mb.A02();
        }
        A02.execute(new Runnable() { // from class: X.0NI
            @Override // java.lang.Runnable
            public final void run() {
                C0NK.A03(C0NK.this, false);
            }
        });
    }

    public final boolean A0A() {
        C17470ti c17470ti = this.A0h;
        if (c17470ti != null) {
            Object obj = c17470ti.A00.get();
            if (!"".equals(obj) && !"browser".equals(obj)) {
                return false;
            }
        }
        return true;
    }

    public static void A01(C0NK c0nk, String str, Throwable th) {
        AbstractC09780fb.A01("maybeReportSoftError", -690615394);
        try {
            if (Math.random() < 0.001d) {
                DirectReports.A01((String) c0nk.A0a.get(), (String) c0nk.A0P.get(), (String) c0nk.A0O.get(), (String) c0nk.A0Y.get(), "lacrima", str, th, null);
            }
            AbstractC09780fb.A00(-565048285);
        } catch (Throwable th2) {
            AbstractC09780fb.A00(-629597592);
            throw th2;
        }
    }

    public static void A02(C0NK c0nk, boolean z) {
        AbstractC09780fb.A01("sendPendingReports", -1286667353);
        try {
            int length = c0nk.A05().A04("").length;
            if ((!c0nk.A0j || length <= 6) && !z) {
                c0nk.A09();
            } else {
                C0K8.A0D("lacrima", "Send pending reports blocking");
                A03(c0nk, true);
                if (Math.random() < 0.001d) {
                    String str = (String) c0nk.A0a.get();
                    String str2 = (String) c0nk.A0P.get();
                    String str3 = (String) c0nk.A0O.get();
                    String str4 = (String) c0nk.A0Y.get();
                    HashMap hashMap = new HashMap();
                    C0MP.A03(str, str2, str3, str4, hashMap);
                    C0MP.A04("lacrima", hashMap, "Send reports blocking");
                    C0MP.A00().A05("android_large_soft_error", hashMap);
                }
            }
            AbstractC09780fb.A00(312004908);
        } catch (Throwable th) {
            AbstractC09780fb.A00(-1228190880);
            throw th;
        }
    }

    public static void A03(C0NK c0nk, boolean z) {
        Map map;
        int length;
        File file;
        AbstractC09780fb.A01("recoverOldSessions", 650604390);
        try {
            C0PI c0pi = (C0PI) c0nk.A06().get();
            HashSet A03 = c0nk.A05().A03();
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                C0BJ.A00(AnonymousClass001.A0R("processOldSessions.", str));
                try {
                    synchronized (C0PI.A05) {
                        try {
                            File[] A04 = c0pi.A00.A04(str);
                            int i = 0;
                            while (true) {
                                length = A04.length - 1;
                                File file2 = null;
                                if (i >= length) {
                                    break;
                                }
                                File file3 = A04[i];
                                if (i > 0) {
                                    file2 = A04[i - 1];
                                }
                                C0PI.A00(C0M6.CRITICAL_REPORT, c0pi, file3, file2, "");
                                i++;
                            }
                            for (int i2 = 0; i2 < length; i2++) {
                                File file4 = A04[i2];
                                if (i2 > 0) {
                                    file = A04[i2 - 1];
                                } else {
                                    file = null;
                                }
                                C0PI.A00(C0M6.LARGE_REPORT, c0pi, file4, file, "");
                            }
                        } finally {
                        }
                    }
                    C0BI.A00();
                } catch (Throwable th) {
                    C0BI.A00();
                    throw th;
                }
            }
            C0PR c0pr = (C0PR) c0nk.A0W.get();
            c0pr.A03(C0M6.CRITICAL_REPORT, z);
            c0pr.A03(C0M6.LARGE_REPORT, z);
            c0nk.A07();
            Iterator it2 = A03.iterator();
            loop3: while (it2.hasNext()) {
                String str2 = (String) it2.next();
                C0Pe A05 = c0nk.A05();
                int i3 = A05.A02;
                C0BJ.A00(AnonymousClass001.A0R("cleanupOldSessions.", str2));
                try {
                    A05.A04.A02();
                } catch (IOException e) {
                    C0PC.A00().DEh("SessMgrCleanupOldSess", e, null);
                }
                synchronized (C0Pe.A0C) {
                    try {
                        File[] A042 = A05.A04(str2);
                        for (int i4 = 0; i4 < A042.length - i3; i4++) {
                            File file5 = A042[i4];
                            file5.getName();
                            try {
                                C0MV c0mv = A05.A04;
                                synchronized (C0MV.class) {
                                    C0BJ.A00("deleteSessionDir");
                                    try {
                                        Iterator it3 = C0MV.A05.iterator();
                                        if (it3.hasNext()) {
                                            it3.next();
                                            throw new NullPointerException("onDeleteSession");
                                            break loop3;
                                        } else {
                                            c0mv.A04(file5, "collector");
                                            C0BI.A00();
                                        }
                                    } catch (Throwable th2) {
                                        C0BI.A00();
                                        throw th2;
                                        break loop3;
                                    }
                                }
                            } catch (IOException e2) {
                                C0K8.A0H("lacrima", "Failed to delete session dir", e2);
                                C0PC.A00().DEh("SessMgrDeleteSessDir", e2, null);
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                C0BI.A00();
            }
            c0pr.A04(z);
            C0MV c0mv2 = c0nk.A05().A04;
            long currentTimeMillis = System.currentTimeMillis();
            Context context = c0mv2.A00;
            File file6 = new File(context.getApplicationInfo().dataDir, "core");
            Object obj = c0mv2.A01;
            synchronized (obj) {
                try {
                    File file7 = new File(file6.getPath());
                    map = c0mv2.A02;
                    if ((map.get(file6.getPath()) == null || file7.lastModified() < currentTimeMillis - 259200000) && (!file7.getPath().startsWith("/system/"))) {
                        file7.delete();
                    }
                } finally {
                }
            }
            File[] listFiles = context.getDir("minidumps", 0).listFiles(new C14920p6(1));
            if (listFiles != null) {
                final HashMap hashMap = new HashMap();
                int length2 = listFiles.length;
                for (File file8 : listFiles) {
                    hashMap.put(file8, Long.valueOf(file8.lastModified()));
                }
                Arrays.sort(listFiles, new Comparator() { // from class: X.0MU
                    @Override // java.util.Comparator
                    public final int compare(Object obj2, Object obj3) {
                        Map map2 = hashMap;
                        List list = C0MV.A05;
                        return (int) (((Number) map2.get(obj2)).longValue() - ((Number) map2.get(obj3)).longValue());
                    }
                });
                for (int i5 = 0; i5 < length2 - 3; i5++) {
                    File file9 = listFiles[i5];
                    if (file9.lastModified() == ((Long) hashMap.get(file9)).longValue()) {
                        synchronized (obj) {
                            try {
                                if ((file9.lastModified() < currentTimeMillis - 259200000 || map.get(file9.getPath()) == null) && (!file9.getPath().startsWith("/system/"))) {
                                    file9.delete();
                                }
                            } finally {
                            }
                        }
                    }
                }
            }
            C0MV.A00(c0mv2, "large_", 12, 259200000L);
            C0MV.A00(c0mv2, "critical_", 8, 604800000L);
            AbstractC09780fb.A00(-886578242);
        } catch (Throwable th4) {
            AbstractC09780fb.A00(-970938008);
            throw th4;
        }
    }

    public final void A09() {
        C0K8.A0D("lacrima", "Sending pending reports");
        C0PR c0pr = (C0PR) this.A0W.get();
        c0pr.A03(C0M6.CRITICAL_REPORT, false);
        c0pr.A03(C0M6.LARGE_REPORT, false);
        c0pr.A04(false);
    }
}
