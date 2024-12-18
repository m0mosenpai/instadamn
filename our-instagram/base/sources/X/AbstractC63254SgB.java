package X;

/* renamed from: X.SgB, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63254SgB {
    public static boolean A00;

    public static void A00(String str, String str2, Throwable th, Object... objArr) {
        if (A00) {
            if (objArr.length != 0) {
                str2 = AbstractC58318PtA.A0k(str2, objArr);
            }
            android.util.Log.e(str, str2, th);
        }
    }

    public static void A01(String str, String str2, Object... objArr) {
        if (SM7.A04) {
            SM7 sm7 = SM7.A03;
            if (sm7 == null) {
                sm7 = new SM7();
                SM7.A03 = sm7;
            }
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = AbstractC58318PtA.A0k(str2, objArr);
            }
            sm7.A00(AnonymousClass001.A0g(str, ": ", str3));
        }
        if (A00 && objArr.length != 0) {
            String.format(null, str2, objArr);
        }
    }

    public static void A02(String str, String str2, Object... objArr) {
        if (SM7.A04) {
            SM7 sm7 = SM7.A03;
            if (sm7 == null) {
                sm7 = new SM7();
                SM7.A03 = sm7;
            }
            String str3 = str2;
            if (objArr.length != 0) {
                str3 = AbstractC58318PtA.A0k(str2, objArr);
            }
            sm7.A00(AnonymousClass001.A0g(str, ": ", str3));
        }
        if (A00) {
            if (objArr.length != 0) {
                str2 = AbstractC58318PtA.A0k(str2, objArr);
            }
            android.util.Log.e(str, str2);
        }
    }

    public static void A03(String str, Object[] objArr) {
        if (A00) {
            String.format(null, str, objArr);
        }
    }
}
