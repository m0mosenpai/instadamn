package X;

import android.text.TextUtils;

/* renamed from: X.Sic, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63371Sic {
    public final C63335Shm A00;

    public static final void A09(AbstractC63371Sic abstractC63371Sic, String str, int i) {
        A08(abstractC63371Sic, null, null, null, str, i);
    }

    public final void A0C(Object obj, Object obj2, String str) {
        A08(this, obj, obj2, null, str, 5);
    }

    public final void A0D(String str, Object obj) {
        A08(this, obj, null, null, str, 2);
    }

    public final void A0E(String str, Object obj) {
        A08(this, obj, null, null, str, 3);
    }

    public final void A0F(String str, Object obj) {
        A08(this, obj, null, null, str, 5);
    }

    public final void A0G(String str, Object obj) {
        A08(this, obj, null, null, str, 6);
    }

    public static String A06(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Boolean) {
            if (obj == Boolean.TRUE) {
                return "true";
            }
            return "false";
        }
        return obj.toString();
    }

    public static String A07(String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String A06 = A06(obj);
        String A062 = A06(obj2);
        String A063 = A06(obj3);
        StringBuilder A1C = AbstractC166987dD.A1C();
        if (!TextUtils.isEmpty(str)) {
            A1C.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(A06)) {
            A1C.append(str2);
            A1C.append(A06);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(A062)) {
            A1C.append(str2);
            A1C.append(A062);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(A063)) {
            A1C.append(str3);
            A1C.append(A063);
        }
        return A1C.toString();
    }

    public static final void A08(AbstractC63371Sic abstractC63371Sic, Object obj, Object obj2, Object obj3, String str, int i) {
        C60687RMf c60687RMf;
        C63335Shm c63335Shm = abstractC63371Sic.A00;
        if (c63335Shm != null && (c60687RMf = c63335Shm.A0C) != null) {
            A0B(obj, obj2, obj3, str, i);
            if (i >= 5) {
                c60687RMf.A0K(obj, obj2, obj3, str, i);
                return;
            }
            return;
        }
        A0B(obj, obj2, obj3, str, i);
    }

    public static void A0A(C63335Shm c63335Shm) {
        C60683RMb c60683RMb = c63335Shm.A06;
        C63335Shm.A02(c60683RMb);
        SX6.A00();
        C60692RMk c60692RMk = c60683RMb.A00;
        SX6.A00();
        c60692RMk.A00 = System.currentTimeMillis();
    }

    public static void A0B(Object obj, Object obj2, Object obj3, String str, int i) {
        String str2 = (String) SVM.A0D.A00;
        if (android.util.Log.isLoggable(str2, i)) {
            android.util.Log.println(i, str2, A07(str, obj, obj2, obj3));
        }
    }

    public AbstractC63371Sic(C63335Shm c63335Shm) {
        C3U5.A02(c63335Shm);
        this.A00 = c63335Shm;
    }
}
