package X;

/* renamed from: X.0d7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC09030d7 {
    public static void A00(String str) {
        android.util.Log.e("SysUtil", str);
    }

    public static void A02(Throwable th) {
        android.util.Log.e("SysUtil", "Cannot call getLdLibraryPath", th);
    }

    public static void A01(String str, String str2, Throwable th) {
        android.util.Log.w(str, str2, th);
    }
}
