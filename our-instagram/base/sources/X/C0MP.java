package X;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.facebook.common.build.BuildConstants;
import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: X.0MP, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0MP {
    public static String A03 = "0";
    public static String A04 = "0";
    public static String A05 = "0";
    public static Application A06;
    public static C0MP A07;
    public static File A08;
    public static Callable A09;
    public static Callable A0A;
    public static Callable A0B;
    public static boolean A0C;
    public static final Object A0D = new Object();
    public C0MK A00;
    public String A01;
    public Executor A02;

    public final synchronized void A05(final String str, final Map map) {
        Executor executor;
        int i = C0M4.A00;
        if (i == 7) {
            if ("android_large_soft_error".equals(str)) {
                executor = C04590Mb.A01();
                executor.execute(new AbstractRunnableC04600Mc() { // from class: X.011
                    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, X.0N7, X.09r] */
                    @Override // java.lang.Runnable
                    public final void run() {
                        String A00;
                        try {
                            C0MP c0mp = C0MP.this;
                            if (c0mp.A00 == null) {
                                List list = C0MK.A03;
                                android.net.Uri A032 = AbstractC08820cl.A03(c0mp.A01);
                                ?? obj = new Object();
                                obj.A00 = 0L;
                                c0mp.A00 = new C0MK(A032, obj, null);
                            }
                            Application application = C0MP.A06;
                            if (application != null && !C0PZ.A00(application)) {
                                return;
                            }
                            String str2 = str;
                            Map map2 = map;
                            Properties properties = new Properties();
                            properties.putAll(map2);
                            properties.put(C0LK.A6w.A00, str2);
                            C0MP.A01();
                            try {
                                File file = C0MP.A08;
                                HashMap A02 = C0LB.A02();
                                if (A02.containsKey("ig.ig_server_rev_hash")) {
                                    properties.put(C0LK.A62.A00, A02.get("ig.ig_server_rev_hash"));
                                }
                                if (A02.containsKey("fb.report_source")) {
                                    properties.put(C0LK.A98.A00, A02.get("fb.report_source"));
                                    if (A02.containsKey("fb.testing.build_target")) {
                                        properties.put(C0LK.A7I.A00, A02.get("fb.testing.build_target"));
                                    }
                                    if (file != null && (A00 = C0LB.A00(file)) != null) {
                                        properties.put(C0LK.A9A.A00, A00);
                                    }
                                }
                            } catch (IOException e) {
                                C0PC.A00().DEh("DirectReportSource", e, null);
                                C0K8.A0I("lacrima", "Failed to read report source ref", e);
                            }
                            HashMap hashMap = new HashMap();
                            c0mp.A00.A00(new C04540Lw(properties), hashMap, 1);
                            Iterator it = hashMap.values().iterator();
                            while (it.hasNext()) {
                                ((C024609u) it.next()).A01.close();
                            }
                        } catch (Exception e2) {
                            C0PC.A00().DEh("DirectSend", e2, null);
                            C0K8.A0F("lacrima", "Failed to send direct report", e2);
                        }
                    }

                    @Override // X.AbstractRunnableC04600Mc
                    public final HashMap A00() {
                        HashMap hashMap = new HashMap();
                        hashMap.put("task", "sendInternalReport");
                        String str2 = str;
                        hashMap.put("logType", str2);
                        if (str2.equals("android_large_soft_error")) {
                            Map map2 = map;
                            String str3 = C0LK.A9U.A00;
                            hashMap.put(str3, map2.get(str3));
                            String str4 = C0LK.A9V.A00;
                            hashMap.put(str4, map2.get(str4));
                        }
                        return hashMap;
                    }
                });
            }
        } else if (i == 4 && "android_large_soft_error".equals(str)) {
        }
        executor = this.A02;
        if (executor == null) {
            executor = C04590Mb.A00();
            this.A02 = executor;
        }
        executor.execute(new AbstractRunnableC04600Mc() { // from class: X.011
            /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, X.0N7, X.09r] */
            @Override // java.lang.Runnable
            public final void run() {
                String A00;
                try {
                    C0MP c0mp = C0MP.this;
                    if (c0mp.A00 == null) {
                        List list = C0MK.A03;
                        android.net.Uri A032 = AbstractC08820cl.A03(c0mp.A01);
                        ?? obj = new Object();
                        obj.A00 = 0L;
                        c0mp.A00 = new C0MK(A032, obj, null);
                    }
                    Application application = C0MP.A06;
                    if (application != null && !C0PZ.A00(application)) {
                        return;
                    }
                    String str2 = str;
                    Map map2 = map;
                    Properties properties = new Properties();
                    properties.putAll(map2);
                    properties.put(C0LK.A6w.A00, str2);
                    C0MP.A01();
                    try {
                        File file = C0MP.A08;
                        HashMap A02 = C0LB.A02();
                        if (A02.containsKey("ig.ig_server_rev_hash")) {
                            properties.put(C0LK.A62.A00, A02.get("ig.ig_server_rev_hash"));
                        }
                        if (A02.containsKey("fb.report_source")) {
                            properties.put(C0LK.A98.A00, A02.get("fb.report_source"));
                            if (A02.containsKey("fb.testing.build_target")) {
                                properties.put(C0LK.A7I.A00, A02.get("fb.testing.build_target"));
                            }
                            if (file != null && (A00 = C0LB.A00(file)) != null) {
                                properties.put(C0LK.A9A.A00, A00);
                            }
                        }
                    } catch (IOException e) {
                        C0PC.A00().DEh("DirectReportSource", e, null);
                        C0K8.A0I("lacrima", "Failed to read report source ref", e);
                    }
                    HashMap hashMap = new HashMap();
                    c0mp.A00.A00(new C04540Lw(properties), hashMap, 1);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        ((C024609u) it.next()).A01.close();
                    }
                } catch (Exception e2) {
                    C0PC.A00().DEh("DirectSend", e2, null);
                    C0K8.A0F("lacrima", "Failed to send direct report", e2);
                }
            }

            @Override // X.AbstractRunnableC04600Mc
            public final HashMap A00() {
                HashMap hashMap = new HashMap();
                hashMap.put("task", "sendInternalReport");
                String str2 = str;
                hashMap.put("logType", str2);
                if (str2.equals("android_large_soft_error")) {
                    Map map2 = map;
                    String str3 = C0LK.A9U.A00;
                    hashMap.put(str3, map2.get(str3));
                    String str4 = C0LK.A9V.A00;
                    hashMap.put(str4, map2.get(str4));
                }
                return hashMap;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0MP, java.lang.Object] */
    public static C0MP A00() {
        C0MP c0mp;
        synchronized (A0D) {
            C0MP c0mp2 = A07;
            c0mp = c0mp2;
            if (c0mp2 == null) {
                String obj = AbstractC05120Pc.A00("mobile", "reliability_event_log_upload").toString();
                ?? obj2 = new Object();
                obj2.A01 = obj;
                obj2.A00 = null;
                A07 = obj2;
                c0mp = obj2;
            }
        }
        return c0mp;
    }

    public static void A01() {
        synchronized (A0D) {
            if (!A0C) {
                try {
                    Callable callable = A09;
                    if (callable != null) {
                        String str = (String) callable.call();
                        if (str == null) {
                            str = A04;
                        }
                        A04 = str;
                    }
                    Callable callable2 = A0B;
                    if (callable2 != null) {
                        String str2 = (String) callable2.call();
                        if (str2 == null) {
                            str2 = A05;
                        }
                        A05 = str2;
                    }
                    Callable callable3 = A0A;
                    if (callable3 != null) {
                        A08 = (File) callable3.call();
                    }
                } catch (Exception e) {
                    C0PC.A00().DEh("DirectInitSelf", e, null);
                    C0K8.A0F("lacrima", "Error lazy initializing DirectReportInternal", e);
                }
                A0C = true;
            }
        }
    }

    public static void A02(C0LE c0le, String str, Map map) {
        synchronized (A0D) {
            if (TextUtils.isEmpty(str)) {
                map.remove(c0le.A00);
            } else {
                String str2 = c0le.A00;
                if (TextUtils.isEmpty((CharSequence) map.get(str2))) {
                    map.put(str2, str);
                }
            }
        }
    }

    public static void A04(String str, Map map, String str2) {
        A02(C0LK.A4x, "soft_error", map);
        A02(C0LK.A4Q, "i", map);
        A02(C0LK.A9U, str, map);
        A02(C0LK.A9V, str2, map);
        synchronized (A0D) {
            if (TextUtils.isEmpty((CharSequence) map.get("cause"))) {
                A02(C0LK.A4y, C0LA.A01(new RuntimeException(AnonymousClass001.A0g(str, " | ", str2), null)), map);
            }
        }
    }

    public static void A03(String str, String str2, String str3, String str4, Map map) {
        C10850hu c10850hu;
        String num;
        A01();
        if (C0PD.A03) {
            A02(C0LK.A0C, Boolean.toString(true), map);
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        C10860hv c10860hv = C0LK.A3E;
        String l = Long.toString(currentTimeMillis);
        A02(c10860hv, l, map);
        A02(C0LK.A1X, l, map);
        if (!DirectReports.A00 ? str != null : !TextUtils.isEmpty(str)) {
            A02(C0LK.AA0, str, map);
        } else {
            C0K8.A0D("lacrima", "User Id missing. Direct reports use 0 as user id.");
            A02(C0LK.AA0, "0", map);
        }
        if (str2 != null) {
            c10850hu = C0LK.A3b;
        } else {
            C0K8.A0D("lacrima", "ACTOR_ID missing. Direct reports use 0 as id.");
            c10850hu = C0LK.A3b;
            str2 = "-6";
        }
        A02(c10850hu, str2, map);
        if (str3 != null) {
            A02(C0LK.A3X, str3, map);
        } else {
            C0K8.A0D("lacrima", "ACTING_ACCOUNT_ID missing. Direct reports use 0 as id.");
            A02(C0LK.A3X, "0", map);
        }
        A02(C0LK.A5Z, "lacrima_direct_report", map);
        A02(C0LK.A4Z, "lacrima_direct_report", map);
        A02(C0LK.A9E, "lacrima_direct_report", map);
        A02(C0LK.A3M, Long.toString(C0M1.A01()), map);
        A02(C0LK.A1k, Long.toString(C0M1.A00()), map);
        A02(C0LK.A4O, "r", map);
        A02(C0LK.A2q, Long.toString(BuildConstants.A01()), map);
        synchronized (A0D) {
            A02(C0LK.A4B, A03, map);
            if (DirectReports.A00 && "".equals(A04)) {
                A04 = "0";
            }
            A02(C0LK.A5M, A04, map);
            A02(C0LK.A4V, A05, map);
            Application application = A06;
            if (application != null) {
                String packageName = application.getPackageName();
                if (str4 == null) {
                    str4 = "";
                }
                C10850hu c10850hu2 = C0LK.A4G;
                String str5 = "";
                if (!"".equals(str4)) {
                    str5 = AnonymousClass001.A0R(":", str4);
                }
                A02(c10850hu2, AnonymousClass001.A0R(packageName, str5), map);
                C10850hu c10850hu3 = C0LK.A9o;
                ApplicationInfo applicationInfo = A06.getApplicationInfo();
                if (applicationInfo == null) {
                    num = "n/a";
                } else {
                    num = Integer.toString(applicationInfo.targetSdkVersion);
                }
                A02(c10850hu3, num, map);
            }
        }
        A02(C0LK.A0E, Boolean.toString(BuildConstants.A02()), map);
        A02(C0LK.A2Z, Long.toString(Process.myPid()), map);
        A02(C0LK.A0Q, Boolean.toString(BuildConstants.A03()), map);
        A02(C0LK.A5O, Build.MODEL, map);
        A02(C0LK.A5P, Build.DEVICE, map);
        A02(C0LK.A5K, Build.BRAND, map);
        A02(C0LK.A5R, Build.VERSION.RELEASE, map);
        A02(C0LK.A5U, "true", map);
        if (Build.VERSION.SDK_INT >= 30) {
            JSONObject A00 = C0M8.A00();
            if (A00.length() > 0) {
                A02(C0LK.A9M, A00.toString(), map);
            }
        }
        C10850hu c10850hu4 = C0LK.A95;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.random());
        sb.append("-");
        sb.append(System.currentTimeMillis());
        A02(c10850hu4, sb.toString(), map);
        long A01 = BuildConstants.A01();
        C10860hv c10860hv2 = C0LK.A1U;
        String l2 = Long.toString(A01);
        A02(c10860hv2, l2, map);
        A02(C0LK.A2J, l2, map);
        A02(C0LK.A7H, "353.2.0.49.90", map);
        A02(C0LK.A09, Boolean.toString(true), map);
    }
}
