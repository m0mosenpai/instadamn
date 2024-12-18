package X;

import android.os.Build;
import com.facebook.systrace.Systrace;

/* renamed from: X.0lv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13090lv {
    public static boolean A00;
    public static final C18580vl A01 = new Object();

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, X.0lu] */
    public static C13080lu A00(String str) {
        if (!Systrace.A0E(1L)) {
            return A01;
        }
        ?? obj = new Object();
        C0fO.A01(str, 901906419);
        return obj;
    }

    public static void A01() {
        if (Systrace.A0E(1L)) {
            C0fY.A00(1L, -2116443936);
        }
    }

    public static void A02(String str) {
        if (Systrace.A0E(1L)) {
            C0fY.A01(1L, str, -370761908);
        }
    }

    public static void A03(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Systrace.A04(1L, str, i);
        }
    }

    public static void A04(String str, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            Systrace.A06(1L, str, i);
        }
    }
}
