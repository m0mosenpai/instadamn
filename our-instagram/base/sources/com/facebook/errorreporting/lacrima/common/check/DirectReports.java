package com.facebook.errorreporting.lacrima.common.check;

import X.C0LA;
import X.C0LK;
import X.C0MP;
import X.C10850hu;
import X.C15320pm;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class DirectReports {
    public static boolean A00;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static String A00(String str) {
        if (A00) {
            switch (str.hashCode()) {
                case -650531544:
                    if (str.equals("android_large_anr_app_death")) {
                        return "android_large_anr";
                    }
                    break;
                case 1288731213:
                    if (str.equals("android_large_java_app_death")) {
                        return "android_large_java";
                    }
                    break;
                case 1964439497:
                    if (str.equals("android_critical_java_app_death")) {
                        return "android_critical_java";
                    }
                    break;
                case 2142212140:
                    if (str.equals("android_critical_anr_app_death")) {
                        return "android_critical_anr";
                    }
                    break;
            }
        }
        return str;
    }

    public static void A01(String str, String str2, String str3, String str4, String str5, String str6, Throwable th, Map map) {
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        C0MP.A02(C0LK.A4y, C0LA.A01(th), hashMap);
        C0MP.A03(str, str2, str3, str4, hashMap);
        C0MP.A04(str5, hashMap, str6);
        C0MP.A00().A05("android_large_soft_error", hashMap);
    }

    public static void A02(String str, String str2, String str3, String str4, Throwable th, Map map) {
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        C0MP.A03(str, str2, str3, str4, hashMap);
        C0MP.A02(C0LK.A4Q, "j", hashMap);
        if (th != null) {
            C0MP.A02(C0LK.A6L, C0LA.A01(th), hashMap);
        }
        C0MP.A00().A05("android_critical_java", hashMap);
        C10850hu c10850hu = C0LK.A6r;
        C15320pm c15320pm = new C15320pm(0);
        synchronized (C0MP.A0D) {
            C0MP.A02(c10850hu, (String) c15320pm.get(), hashMap);
        }
        C0MP.A00().A05("android_large_java", hashMap);
    }
}
