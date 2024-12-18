package X;

import com.facebook.errorreporting.lacrima.common.check.DirectReports;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.0P2, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0P2 {
    public static java.util.Set A00;
    public static boolean A01;

    public static void A00(String str, String str2, Throwable th) {
        if (A00 == null) {
            synchronized (C0P2.class) {
                if (A00 == null) {
                    try {
                        Object obj = new Object();
                        HashSet hashSet = new HashSet();
                        for (Field field : C03350Gg.class.getDeclaredFields()) {
                            if (Modifier.isPublic(field.getModifiers()) && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                                hashSet.add(field.get(obj));
                            }
                        }
                        A00 = hashSet;
                    } catch (Exception e) {
                        C0PC.A00().DEh("DirectSoftErrorAllowList", e, null);
                        A00 = new HashSet();
                    }
                }
            }
        }
        java.util.Set set = A00;
        if ((set != null && set.contains(str)) || str.startsWith("[Native] ")) {
            if (th == null) {
                HashMap hashMap = new HashMap();
                C0MP.A03(null, null, null, null, hashMap);
                C0MP.A04(str, hashMap, str2);
                C0MP.A00().A05("android_large_soft_error", hashMap);
                return;
            }
            DirectReports.A01(null, null, null, null, str, str2, th, null);
        }
    }
}
