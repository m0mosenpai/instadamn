package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0K8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0K8 {
    public static volatile C0I3 A01 = C10890hy.A00;
    public static final List A00 = new ArrayList();

    static {
        A01.setMinimumLoggingLevel(5);
        C0I2.A00 = A01;
    }

    public static synchronized void A00(int i) {
        synchronized (C0K8.class) {
            A01.setMinimumLoggingLevel(i);
            Iterator it = A00.iterator();
            while (it.hasNext()) {
                ((C0K9) it.next()).DQL(i);
            }
        }
    }

    public static void A01(int i, String str, String str2) {
        if (A01.isLoggable(i)) {
            A01.log(i, str, str2);
        }
    }

    public static void A02(Class cls, String str) {
        if (A01.isLoggable(6)) {
            A01.e(cls.getSimpleName(), str);
        }
    }

    public static void A03(Class cls, String str) {
        if (A01.isLoggable(5)) {
            A01.w(cls.getSimpleName(), str);
        }
    }

    public static void A04(Class cls, String str) {
        if (A01.isLoggable(6)) {
            A01.wtf(cls.getSimpleName(), str);
        }
    }

    public static void A05(Class cls, String str, Throwable th) {
        if (A01.isLoggable(6)) {
            A01.e(cls.getSimpleName(), str, th);
        }
    }

    public static void A06(Class cls, String str, Throwable th) {
        if (A01.isLoggable(5)) {
            A01.w(cls.getSimpleName(), str, th);
        }
    }

    public static void A07(Class cls, String str, Throwable th, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0F(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(str, objArr), th);
        }
    }

    public static void A08(Class cls, String str, Throwable th, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0J(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(str, objArr), th);
        }
    }

    public static void A09(Class cls, String str, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0C(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    public static void A0A(Class cls, String str, Object... objArr) {
        if (A01.isLoggable(5)) {
            A0D(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    public static void A0B(Class cls, String str, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0E(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    public static void A0C(String str, String str2) {
        if (A01.isLoggable(6)) {
            A01.e(str, str2);
        }
    }

    public static void A0D(String str, String str2) {
        if (A01.isLoggable(5)) {
            A01.w(str, str2);
        }
    }

    public static void A0E(String str, String str2) {
        if (A01.isLoggable(6)) {
            A01.wtf(str, str2);
        }
    }

    public static void A0F(String str, String str2, Throwable th) {
        if (A01.isLoggable(6)) {
            A01.e(str, str2, th);
        }
    }

    public static void A0G(String str, String str2, Throwable th) {
        if (A01.isLoggable(6)) {
            A01.e(str, str2, th);
        }
    }

    public static void A0H(String str, String str2, Throwable th) {
        if (A01.isLoggable(5)) {
            A01.w(str, str2, th);
        }
    }

    public static void A0I(String str, String str2, Throwable th) {
        if (A01.isLoggable(5)) {
            A01.w(str, str2, th);
        }
    }

    public static void A0J(String str, String str2, Throwable th) {
        if (A01.isLoggable(6)) {
            A01.wtf(str, str2, th);
        }
    }

    public static void A0K(String str, String str2, Throwable th) {
        if (A01.isLoggable(6)) {
            A01.wtf(str, str2, th);
        }
    }

    public static void A0L(String str, String str2, Throwable th, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0F(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0M(String str, String str2, Throwable th, Object... objArr) {
        if (A01.isLoggable(5)) {
            A0H(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0N(String str, String str2, Throwable th, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0J(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr), th);
        }
    }

    public static void A0O(String str, String str2, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0C(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0P(String str, String str2, Object... objArr) {
        if (A01.isLoggable(5)) {
            A0D(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }

    public static void A0Q(String str, String str2, Object... objArr) {
        if (A01.isLoggable(6)) {
            A0E(str, StringFormatUtil.formatStrLocaleSafe(str2, objArr));
        }
    }
}
