package X;

import android.os.Looper;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.0J8, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0J8 {
    public static void A03(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new NullPointerException(str);
        }
    }

    public static void A04(Object obj, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(StringFormatUtil.formatStrLocaleSafe(str, obj));
        }
    }

    public static void A05(Object obj, String str, Object... objArr) {
        if (obj != null) {
        } else {
            throw new NullPointerException(StringFormatUtil.formatStrLocaleSafe(str, objArr));
        }
    }

    public static void A06(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A07(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A08(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }

    public static void A09(boolean z, String str) {
        if (z) {
        } else {
            throw new IllegalStateException(str);
        }
    }

    public static void A01() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw new IllegalStateException("Must be called on main thread");
        }
    }

    public static void A02(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        if (comparable.compareTo(comparable2) >= 0) {
            if (comparable.compareTo(comparable3) <= 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a value smaller than max (");
            sb.append(comparable3);
            sb.append(") but got ");
            sb.append(comparable);
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected a value larger than min (");
        sb2.append(comparable2);
        sb2.append(") but got ");
        sb2.append(comparable);
        throw new IllegalStateException(sb2.toString());
    }

    public static Object A00(Object obj) {
        obj.getClass();
        return obj;
    }
}
